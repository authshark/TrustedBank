package com.trustedbank.store;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import java.io.FileInputStream;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;


public class TokenStorageEmbeddedDBImpl implements TokenStorage {

	private static final Log log = LogFactory.getLog(TokenStorageEmbeddedDBImpl.class); 
	private static Properties defaultProps = new Properties();

	public String framework = "embedded";
	public String driver = "org.apache.derby.jdbc.EmbeddedDriver";
	public String protocol = "jdbc:derby:";
	public String pathToDatabase = null;

	public String friendlyName = "Trusted Bank Database";

	private Connection conn = null;

	private boolean dbInitialized = false;
	private int currentVersion = 0;

	private Statement s = null;

	public void startup(){

		try {

			Class.forName(driver).newInstance();
			//System.out.println("Loaded the appropriate driver.");

			try {
				FileInputStream in = new FileInputStream("/home/trustedbank/trustedBank.properties");
				defaultProps.load(in);
				in.close();
			} catch (Exception e) {
				log.error("TokenStorageEmbeddedDBImpl() Exception: " + e);
			}

			//production code - comment out for preview or pilot
			String activeSystem = defaultProps.getProperty("com.verisign.active");
			
			//hard-code preview - comment out for production
			//String activeSystem = "preview";

			//hard-code pilot here - comment out for production
			// String activeSystem = "pilot";

			pathToDatabase = defaultProps.getProperty("com.verisign.webservice."+activeSystem+".db.path");

			Properties props = new Properties();

			try{
				conn = DriverManager.getConnection(protocol + pathToDatabase, props);
			} catch (SQLException e) {
				System.out.println(e.getMessage());
				System.out.println("Creating the database and force loading v.1 tables!");

				conn = DriverManager.getConnection(protocol + pathToDatabase + ";create=true", props);

				conn.setAutoCommit(false);
				s = conn.createStatement();

				System.out.println("Not initialized - creating v.1 token tables");

				s.execute("create table accounts(username varchar(48) NOT NULL CONSTRAINT ACCOUNT_PK PRIMARY KEY, password varchar(48))");
				System.out.println("Created table accounts");

				s.execute("create table account_tokens(username varchar(48), tokenid varchar(48))");
				System.out.println("Created table account_tokens");

				s.execute("create table initialized(init int, version int)");
				s.execute("insert into initialized values (1, 0)");
				System.out.println(friendlyName + " initialized with v.1 token tables.");

				dbInitialized = true;           	
			}

			System.out.println("Connected to " + friendlyName + ".");

			if (!dbInitialized){
				conn.setAutoCommit(false);
				s = conn.createStatement();
			}

			ResultSet rs = null;

			try {
				rs = s.executeQuery( "SELECT * FROM initialized");

				if (rs.next()){
					currentVersion = rs.getInt(2);
				} 

				if (currentVersion == 0) {
					System.out.println("We need to upgrade schema to v.2 to include the SMS, TMP and PREFS tables!");
					s.execute("create table account_SMS(username varchar(48), sms_id varchar(48))");
					System.out.println("Created table account_sms");

					try {
						s.execute("create table account_tmp(username varchar(48), tmp_id varchar(48), tmp_type varchar(48))");
						System.out.println("Created table account_tmp");	
					} catch (SQLException e) {
						System.out.println("Create TMP table failed with error:" + e.getMessage() + "...!");
					}

					try {
						s.execute("create table account_prefs(username varchar(48), tmp_type varchar(5))");
						System.out.println("Created table account_prefs");
					} catch   (SQLException e) {
						System.out.println("Create PREFS table failed with error:" + e.getMessage() + "...!");
					}          

					try {
						s.execute("update INITIALIZED set VERSION = 1 where INIT = 1");
						System.out.println("Updated version to v.2");
					} catch   (SQLException e) {
						System.out.println("Update INITIALIZED table failed with error:" + e.getMessage() + "...!");
					} 
					currentVersion++;
				}

				if (currentVersion == 1) {
					System.out.println("We need to upgrade schema to v.3 to include the AUTHZ table!");
					try {
						s.execute("create table account_authz(username varchar(48), role varchar(48))");
						System.out.println("Created table account_authz");	
					} catch (SQLException e) {
						System.out.println("Create AUTHZ table failed with error:" + e.getMessage() + "...!");
					}

					try {
						s.execute("insert into account_authz values ('amutu', 'superadmin')");
						System.out.println("Created the initial superadmin: amutu");
					} catch (SQLException e) {
						System.out.println("Create the initial superadmin failed with error:" + e.getMessage() + "...!");
					}

					try {
						s.execute("update initialized set VERSION = 2 where INIT = 1");
						System.out.println("Updated version to v.3");
					} catch   (SQLException e) {
						System.out.println("Update INITIALIZED table failed with error:" + e.getMessage() + "...!");
					}                   
					currentVersion++;
				}

				if (currentVersion == 2) {
					System.out.println("We need to upgrade schema to v.4 to include the TXN table!");
					try {
						s.execute("create table account_txn(username varchar(48), txn_id varchar(48), txn_type varchar(48))");
						System.out.println("Created table account_txn");	
					} catch (SQLException e) {
						System.out.println("Create TXN table failed with error:" + e.getMessage() + "...!");
					}                 
					try {
						s.execute("update initialized set VERSION = 3 where INIT = 1");
						System.out.println("Updated version to v.4");
					} catch   (SQLException e) {
						System.out.println("Update INITIALIZED table failed with error:" + e.getMessage() + "...!");
					}
					currentVersion++;
				}

				System.out.println(friendlyName + " database is initialized (version v." + String.valueOf(currentVersion+1) + ") !" );
			} catch (SQLException e) {
			} finally {
				s.close();
				conn.commit();
				//System.out.println("Closed result set and statement");
			}
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public int getDbVersion(){
		Statement s = null;
		int dbVer = 0;
		try {
			s = conn.createStatement();
			ResultSet rs = null;
			try {
				rs = s.executeQuery( "SELECT version FROM initialized");
				dbVer = rs.getInt(2);
				s.close();
				conn.commit();
			} catch (SQLException e) {
				//eat the exception for now
				//TODO - add an exception pattern
				System.out.println("Get version failed");
			}finally {
				s.close();
				conn.commit();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return dbVer;
	}

	private void updateVersion()throws StorageException {
		Statement s = null;
		try {
			s = conn.createStatement();
			try {
				s.execute("update initialized set version = " + String.valueOf(currentVersion));
				System.out.println("Updated version to v." + currentVersion);
				s.close();
				conn.commit();
			} catch (SQLException e) {
				//eat the exception for now
				//TODO - add an exception pattern
				System.out.println("Update version failed");
				throw new StorageException("Account creation failed",e);
			}finally {
				s.close();
				conn.commit();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void addAccount(String username, String password) throws StorageException {

		Statement s = null;
		try {
			s = conn.createStatement();

			try {
				if (this.isAccount(username))
					System.out.println("The account \"" + username + "\" already exists.");
				else {
					s.execute("insert into accounts values ('" + username + "', '" + password + "')");	
				}
				s.close();
				conn.commit();
			} catch (SQLException e) {
				//eat the exception for now
				//TODO - add an exception pattern
				System.out.println("Account creation failed");
				throw new StorageException("Account creation failed",e);
			}finally {
				s.close();
				conn.commit();
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public boolean authenticate(String uid, String password) {

		boolean authenticated = false;

		Statement s = null;
		try {
			s = conn.createStatement();

			try {
				ResultSet rs = s.executeQuery("SELECT password FROM accounts where username = '" + uid + "'");
				if (!rs.next()) return authenticated;
				String pw = rs.getString(1);
				if ( pw.equals(password)) authenticated = true;
				s.close();
				conn.commit();
			} catch (SQLException e) {
				//eat the exception for now
				//TODO - add an exception pattern
				e.printStackTrace();
			}finally {
				s.close();
				conn.commit();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return authenticated;
	}

	public void addTokenId(String username, String tokenId) {

		Statement s = null;
		try {

			s = conn.createStatement();

			try {

				if (this.isUserIdAndCredentialId(username, tokenId, "OTP"))
					System.out.println("User \"" + username + "\" with token \"" + tokenId + "\" already exists!");
				else {
					s.execute("insert into account_tokens values ('" + username + "', '" + tokenId  +"')");
				}
				s.close();
				conn.commit();

			} catch (SQLException e) {

				//TODO - add an exception pattern
				System.out.println("Token addition failed");
				e.printStackTrace();

			} finally {

				s.close();
				conn.commit();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void deleteTokenId(String username, String tokenId) {

		Statement s = null;
		try {

			s = conn.createStatement();

			try {
				if (this.isUserIdAndCredentialId(username, tokenId, "OTP"))
					s.execute("delete from account_tokens where username = '" + username + "' and tokenid = '" + tokenId + "'");
				else {
					System.out.println("User \"" + username + "\" with token \"" + tokenId + "\" does not exist!");   
				}
				s.close();
				conn.commit();

			} catch (SQLException e) {

				//TODO - add an exception pattern
				System.out.println("Token deletion failed");
				e.printStackTrace();

			} finally {

				s.close();
				conn.commit();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void deleteSMSId(String username, String phoneId) {
		Statement s = null;
		try {
			s = conn.createStatement();
			try {
				if (this.isUserIdAndCredentialId(username, phoneId, "SMS"))
					s.execute("delete from account_SMS where username = '" + username + "' and sms_id = '" + phoneId + "'");
				else {
					System.out.println("SMS: User \"" + username + "\" with phone number \"" + phoneId + "\" does not exist!");   
				}
				s.close();
				conn.commit();
			} catch (SQLException e) {
				//TODO - add an exception pattern
				System.out.println("deleteSMSId failed!");
				e.printStackTrace();
			} finally {
				s.close();
				conn.commit();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void deleteTMPId(String username, String tmpId, String type) {
		Statement s = null;
		try {
			s = conn.createStatement();
			String checkType = new String("TMP_");

			try {
				if (this.isUserIdAndCredentialId(username, tmpId, checkType.concat(type)))
					s.execute("delete from account_tmp where username = '" + username + "' and tmp_id = '" + tmpId + "' and tmp_type = '" + type + "'");
				else {
					System.out.println("TMP: User \"" + username + "\" with token \"" + tmpId + "\" and type \"" + type + "\" does not exist!");   
				}
				s.close();
				conn.commit();
			} catch (SQLException e) {
				//TODO - add an exception pattern
				System.out.println("deleteTMPId failed!");
				e.printStackTrace();
			} finally {
				s.close();
				conn.commit();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}   

	public void deleteTXNId(String username, String txnId, String type) {
		Statement s = null;
		try {
			s = conn.createStatement();
			String checkType = new String("TXN_");

			try {
				if (this.isUserIdAndCredentialId(username, txnId, checkType.concat(type)))
					s.execute("delete from account_txn where username = '" + username + "' and txn_id = '" + txnId + "' and txn_type = '" + type + "'");
				else {
					System.out.println("deleteTXNId: User \"" + username + "\" with deviceId \"" + txnId + "\" and type \"" + type + "\" does not exist!");   
				}
				s.close();
				conn.commit();
			} catch (SQLException e) {
				//TODO - add an exception pattern
				System.out.println("deleteTXNId failed!");
				e.printStackTrace();
			} finally {
				s.close();
				conn.commit();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void addSMSId(String username, String phoneNo) {

		Statement s = null;
		try {

			s = conn.createStatement();

			try {

				if (this.isUserIdAndCredentialId(username, phoneNo, "SMS"))
					System.out.println("SMS OTP: User \"" + username + "\" with phone number \"" + phoneNo + "\" already exists.!");
				else {
					s.execute("insert into account_sms values ('" + username + "', '" + phoneNo  +"')");   
				}
				s.close();
				conn.commit();

			} catch (SQLException e) {

				//TODO - add an exception pattern
				System.out.println("SMS phone addition failed");
				e.printStackTrace();

			} finally {

				s.close();
				conn.commit();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void addTMPId(String username, String tmpId, String type) {
		Statement s = null;
		try {
			s = conn.createStatement();
			String checkType = new String("TMP_");

			try {
				if (this.isUserIdAndCredentialId(username, tmpId, checkType.concat(type)))
					System.out.println("addTMPId: User \"" + username + "\" with temporary authentication deviceId \"" + tmpId + "\" of type \"" + type + "\" already exists.!");
				else {
					s.execute("insert into account_tmp values ('" + username + "', '" + tmpId  +"', '" + type  +"')");   
				}
				s.close();
				conn.commit();

			} catch (SQLException e) {
				//TODO - add an exception pattern
				System.out.println("addTMPId failed!");
				e.printStackTrace();
			} finally {
				s.close();
				conn.commit();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public void addTXNId(String username, String txnId, String type) {
		Statement s = null;
		try {
			s = conn.createStatement();
			String checkType = new String("TXN_");

			try {
				if (this.isUserIdAndCredentialId(username, txnId, checkType.concat(type)))
					System.out.println("addTXNId: User \"" + username + "\" with transaction deviceId \"" + txnId + "\" of type \"" + type + "\" already exists.!");
				else {
					s.execute("insert into account_txn values ('" + username + "', '" + txnId  +"', '" + type  +"')");   
				}
				s.close();
				conn.commit();

			} catch (SQLException e) {
				//TODO - add an exception pattern
				System.out.println("addTMPId failed!");
				e.printStackTrace();
			} finally {
				s.close();
				conn.commit();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public boolean isAuthzUserAndRole(String userId, String role){
		Statement s = null;
		try{
			s = conn.createStatement();
			ResultSet rs = null;
			try{
				rs = s.executeQuery("SELECT username, role from account_authz");
				while (rs.next()){
					String uid = rs.getString(1);
					String rid = rs.getString(2);
					if (uid.equals(userId) & rid.equals(role)) return true;
				}
				rs.close();
				s.close();
				conn.commit();
			}catch (SQLException e){
				//eat the exception for now
				//TODO - add an exception pattern
				e.printStackTrace();
			}finally {
				s.close();
				conn.commit();
			}
		}catch (SQLException e){
			e.printStackTrace();	
		}
		return false;
	}

	public void addAuthzUser(String username, String role) {

		Statement s = null;
		try {

			s = conn.createStatement();

			try {

				if (this.isAuthzUserAndRole(username, role))
					System.out.println("Add authorized user: User \"" + username + "\" with role \"" + role + "\" already exists.!");
				else {
					s.execute("insert into account_authz values ('" + username + "', '" + role  +"')");   
				}
				s.close();
				conn.commit();

			} catch (SQLException e) {

				//TODO - add an exception pattern
				System.out.println("SMS phone addition failed");
				e.printStackTrace();

			} finally {

				s.close();
				conn.commit();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void deleteUserAccount(String username) {
		Statement s = null;
		try {

			s = conn.createStatement();

			try {
				s.execute("delete from accounts where username = '" + username + "'");
				s.close();
				conn.commit();

			} catch (SQLException e) {

				//TODO - add an exception pattern
				System.out.println("User account deletion failed");
				e.printStackTrace();

			} finally {

				s.close();
				conn.commit();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void deleteCredentialUser(String username) {
		Statement s = null;
		try {

			s = conn.createStatement();

			try {
				s.execute("delete from account_tokens where username = '" + username + "'");
				s.close();
				conn.commit();

			} catch (SQLException e) {

				//TODO - add an exception pattern
				System.out.println("User with credential deletion failed");
				e.printStackTrace();

			} finally {

				s.close();
				conn.commit();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void deleteSMSCredentialUser(String username) {
		Statement s = null;
		try {

			s = conn.createStatement();

			try {
				s.execute("delete from account_sms where username = '" + username + "'");
				s.close();
				conn.commit();

			} catch (SQLException e) {

				//TODO - add an exception pattern
				System.out.println("User with SMS credential deletion failed");
				e.printStackTrace();

			} finally {

				s.close();
				conn.commit();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void deleteTmpCredentialUser(String username) {
		Statement s = null;
		try {

			s = conn.createStatement();

			try {
				s.execute("delete from account_tmp where username = '" + username + "'");
				s.close();
				conn.commit();

			} catch (SQLException e) {

				//TODO - add an exception pattern
				System.out.println("User with TMP credential deletion failed");
				e.printStackTrace();

			} finally {

				s.close();
				conn.commit();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void deleteTxnCredentialUser(String username) {
		Statement s = null;
		try {

			s = conn.createStatement();

			try {
				s.execute("delete from account_txn where username = '" + username + "'");
				s.close();
				conn.commit();

			} catch (SQLException e) {

				//TODO - add an exception pattern
				System.out.println("User with TXN credential deletion failed");
				e.printStackTrace();

			} finally {

				s.close();
				conn.commit();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	
	public void deleteAuthzUser(String username, String role) {

		Statement s = null;
		try {

			s = conn.createStatement();

			try {
				s.execute("delete from account_authz where username = '" + username + "' and role = '" + role + "'");
				s.close();
				conn.commit();

			} catch (SQLException e) {

				//TODO - add an exception pattern
				System.out.println("Authz user deletion failed");
				e.printStackTrace();

			} finally {

				s.close();
				conn.commit();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public List getAuthzRolesFromUserId(String username){

		List roles = new ArrayList();
		Statement s = null;
		try {
			s = conn.createStatement();

			try {

				ResultSet rs = s.executeQuery("SELECT * FROM account_authz where username = '" + username + "'");
				while (rs.next()){
					String role = rs.getString(2);
					roles.add(role);
				}
				rs.close();
				s.close();
				conn.commit();
			} catch (SQLException e) {
				//eat the exception for now
				//TODO - add an exception pattern
				e.printStackTrace();
			}finally {
				s.close();
				conn.commit();
			}   		
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return roles;
	}

	public List getAuthzUsersFromRole(String role){
		List userIds = new ArrayList();
		Statement s = null;
		try {
			s = conn.createStatement();
			try {

				ResultSet rs = s.executeQuery("SELECT * FROM account_authz where role = '" + role + "' or role = 'superadmin'");
				while (rs.next()){
					String userId = rs.getString(1);
					userIds.add(userId);
				}
				rs.close();
				s.close();
				conn.commit();
			} catch (SQLException e) {
				//eat the exception for now
				//TODO - add an exception pattern
				e.printStackTrace();
			}finally {
				s.close();
				conn.commit();
			}   		
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return userIds;
	}

	public List getElligibleUsersFromRole(String role){
		List userIds = new ArrayList();
		Statement s = null;
		try {
			s = conn.createStatement();
			try {

				ResultSet rs = s.executeQuery("select username from ACCOUNTS where" +
						"(ACCOUNTS.username not in (select username from ACCOUNT_AUTHZ where" +
						" ROLE='superadmin' or ROLE='" + role + "'))" +
						" and (ACCOUNTS.username in (select username from ACCOUNT_TOKENS))" +
				" and (ACCOUNTS.username in (select username from ACCOUNT_TMP))");
				while (rs.next()){
					String userId = rs.getString(1);
					userIds.add(userId);
				}
				rs.close();
				s.close();
				conn.commit();
			} catch (SQLException e) {
				//eat the exception for now
				//TODO - add an exception pattern
				e.printStackTrace();
			}finally {
				s.close();
				conn.commit();
			}   		
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return userIds;
	}

	public List getTokenIdFromUserId(String username){

		List tokenIds = new ArrayList();
		Statement s = null;
		try {
			s = conn.createStatement();

			try {

				ResultSet rs = s.executeQuery("SELECT * FROM account_tokens where username = '" + username + "'");
				while (rs.next()){
					String id = rs.getString(2);
					tokenIds.add(id);
				}
				rs.close();
				s.close();
				conn.commit();
			} catch (SQLException e) {
				//eat the exception for now
				//TODO - add an exception pattern
				e.printStackTrace();
			}finally {
				s.close();
				conn.commit();
			}   		
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return tokenIds;
	}

	public List getTmpIdFromUserId(String username, String type){
		List TmpIds = new ArrayList();
		Statement s = null;
		try {
			s = conn.createStatement();

			try {
				ResultSet rs = s.executeQuery("SELECT * FROM account_tmp where username = '" + username + "' and tmp_type = '" + type + "'");
				while (rs.next()){
					String id = rs.getString(2);
					TmpIds.add(id);
				}
				rs.close();
				s.close();
				conn.commit();
			} catch (SQLException e) {
				//eat the exception for now
				//TODO - add an exception pattern
				e.printStackTrace();
			}finally {
				s.close();
				conn.commit();
			}   		
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return TmpIds;
	}

	public List getTxnIdFromUserId(String username, String type){
		List TxnIds = new ArrayList();
		Statement s = null;
		try {
			s = conn.createStatement();

			try {
				ResultSet rs = s.executeQuery("SELECT * FROM account_txn where username = '" + username + "' and txn_type = '" + type + "'");
				while (rs.next()){
					String id = rs.getString(2);
					TxnIds.add(id);
				}
				rs.close();
				s.close();
				conn.commit();
			} catch (SQLException e) {
				//eat the exception for now
				//TODO - add an exception pattern
				e.printStackTrace();
			}finally {
				s.close();
				conn.commit();
			}   		
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return TxnIds;
	}
	
	public List getSMSIdFromUserId(String username){

		List smsIds = new ArrayList();
		Statement s = null;
		try {
			s = conn.createStatement();

			try {

				ResultSet rs = s.executeQuery("SELECT * FROM account_sms where username = '" + username + "'");
				while (rs.next()){
					String id = rs.getString(2);
					smsIds.add(id);
				}
				rs.close();
				s.close();
				conn.commit();
			} catch (SQLException e) {
				//eat the exception for now
				//TODO - add an exception pattern
				e.printStackTrace();
			}finally {
				s.close();
				conn.commit();
			}   		
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return smsIds;
	}    

	public List getAllUserIdWithTokenId(){
		List userIds = new ArrayList();
		Statement s = null;
		try{
			s = conn.createStatement();
			try{
				ResultSet rs = s.executeQuery("SELECT username from account_tokens");
				while (rs.next()){
					String id = rs.getString(1);
					if (!userIds.contains(id))
						userIds.add(id);
				}
				rs.close();
				s.close();
				conn.commit();
			}catch (SQLException e){
				//eat the exception for now
				//TODO - add an exception pattern
				e.printStackTrace();
			}finally {
				s.close();
				conn.commit();
			}
		}catch (SQLException e){
			e.printStackTrace();	
		}
		// System.out.println("This is the user list: \"" + userIds.toString() + "\".");
		return userIds;
	}

	public List getAllUsers(){
		List userIds = new ArrayList();
		Statement s = null;
		try{
			s = conn.createStatement();
			try{
				ResultSet rs = s.executeQuery("SELECT username from accounts");
				while (rs.next()){
						userIds.add(rs.getString(1));
				}
				rs.close();
				s.close();
				conn.commit();
			}catch (SQLException e){
				//eat the exception for now
				//TODO - add an exception pattern
				e.printStackTrace();
			}finally {
				s.close();
				conn.commit();
			}
		}catch (SQLException e){
			e.printStackTrace();	
		}
		return userIds;
	}
	
	public boolean isUserId(String userId){
		List userIds = new ArrayList();
		Statement s = null;
		try{
			s = conn.createStatement();
			try{
				ResultSet rs = s.executeQuery("SELECT username from account_tokens");
				while (rs.next()){
					String id = rs.getString(1);
					if (id.equals(userId)) return true;
				}
				rs.close();
				s.close();
				conn.commit();
			}catch (SQLException e){
				//eat the exception for now
				//TODO - add an exception pattern
				e.printStackTrace();
			}finally {
				s.close();
				conn.commit();
			}
		}catch (SQLException e){
			e.printStackTrace();	
		}

		return false;

	}

	public boolean isAccount(String userId){
		List userIds = new ArrayList();
		Statement s = null;
		try{
			s = conn.createStatement();
			try{
				ResultSet rs = s.executeQuery("SELECT username from accounts");
				while (rs.next()){
					String id = rs.getString(1);
					if (id.equals(userId)) return true;
				}
				rs.close();
				s.close();
				conn.commit();
			}catch (SQLException e){
				//eat the exception for now
				//TODO - add an exception pattern
				e.printStackTrace();
			}finally {
				s.close();
				conn.commit();
			}
		}catch (SQLException e){
			e.printStackTrace();	
		}

		return false;

	}

	public boolean isUserIdAndCredentialId(String userId, String credId, String type){
		List userIds = new ArrayList();
		Statement s = null;
		try{
			s = conn.createStatement();
			try{
				ResultSet rs = null;
				if (type.equals("OTP")){
					rs = s.executeQuery("SELECT username, tokenid from account_tokens");
				} else if (type.equals("SMS")) {
					rs = s.executeQuery("SELECT username, sms_id from account_sms");
				} else if (type.equals("TMP_SMS")) {
					rs = s.executeQuery("SELECT username, tmp_id from account_tmp where tmp_type='SMS'");
				} else if (type.equals("TMP_Voice")) {
					rs = s.executeQuery("SELECT username, tmp_id from account_tmp where tmp_type='Voice'");
				} else if (type.equals("TXN_SMS")) {
					rs = s.executeQuery("SELECT username, txn_id from account_txn where txn_type='SMS'");
				} else if (type.equals("TXN_Voice")) {
					rs = s.executeQuery("SELECT username, txn_id from account_txn where txn_type='Voice'");
				} else {
					return false;
				}
				
				while (rs.next()){
					String uid = rs.getString(1);
					String tid = rs.getString(2);
					if (uid.equals(userId) & tid.equals(credId)) return true;
				}
				rs.close();
				s.close();
				conn.commit();
			}catch (SQLException e){
				//eat the exception for now
				//TODO - add an exception pattern
				e.printStackTrace();
			}finally {
				s.close();
				conn.commit();
			}
		}catch (SQLException e){
			e.printStackTrace();	
		}

		return false;

	}

	public void shutdown() {

		try {
			conn.close();
			System.out.println(friendlyName + " shutdown.");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
