package com.trustedbank;

import java.math.BigInteger;
import java.net.MalformedURLException;
import java.rmi.RemoteException;
import java.util.Properties;
import java.util.UUID;
import java.io.FileInputStream;

import javax.xml.rpc.ServiceException;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.symantec.schemas.vip._2011._04.vipuserservices.*;
import com.symantec.schemas.vip._2011._04.vipuserservices.mgmt.*;


public class VIPUserMgmtClient {
	private static final Log log = LogFactory.getLog(VIPUserMgmtClient.class); 
	private static Properties defaultProps = new Properties();
	
	private ManagementService mgmtService;
	private ManagementServicePort mgmtPort;
	
	private String m_url;
	private static String certFile; 
	private static String certPassword;
	
	private static VIPUserMgmtClient VIPUserMgmtClient = null;
	
	public static VIPUserMgmtClient getInstance() {
		try {
			FileInputStream in = new FileInputStream("/home/trustedbank/trustedBank.properties");
			defaultProps.load(in);
			in.close();
		} catch (Exception e) {
			log.error("VIPClient() Exception: " + e);
			return null;
		}

		String activeSystem = defaultProps.getProperty("com.verisign.active");
		
		String mgmtSvcUrl = defaultProps.getProperty("com.symantec.webservice.management."+activeSystem+".url");
		certFile = defaultProps.getProperty("com.verisign.webservice."+activeSystem+".cert.file");
		certPassword = defaultProps.getProperty("com.verisign.webservice."+activeSystem+".cert.password");
		
		if (VIPUserMgmtClient == null) {
			VIPUserMgmtClient = new VIPUserMgmtClient(mgmtSvcUrl);
		}		
		return VIPUserMgmtClient;
		
	}
	
	private VIPUserMgmtClient(String url) {
		mgmtService = new ManagementServiceLocator();
		m_url = url;
		System.setProperty("javax.net.ssl.keyStoreType", "pkcs12");
		System.setProperty("javax.net.ssl.keyStore", certFile);
		System.setProperty("javax.net.ssl.keyStorePassword", certPassword);
		try {
			mgmtPort = mgmtService.getManagementServicePort(new java.net.URL(m_url));
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			log.debug("getServerTime(), Exception : " + e);
		} catch (ServiceException e) {
			// TODO Auto-generated catch block
			log.debug("getServerTime(), Exception : " + e);
		}
	}
	
	public boolean addUser(String userId) {
		CreateUserRequestType reqT = new CreateUserRequestType();
		reqT.setRequestId(UUID.randomUUID().toString().replace("-",""));
		reqT.setUserId(userId);
		
		try {
			CreateUserResponseType respT = mgmtPort.createUser(reqT);
			BigInteger reason = new BigInteger(respT.getStatus());
			if (reason.intValue() != 0) {
				if(reason.intValue() == 24578) { // return true even if the user is already in the cloud
					log.info("VIPUserMgmtClient.addUser() Use exists. Continue!");
					return true;
				} else {
					log.debug("Reason Code = " + reason.toString(16));
					log.debug("Message = " + respT.getStatusMessage());
					log.debug("Error Detail = " + respT.getDetailMessage());
					return false;
				}
			} else {
				log.info("VIPUserMgmtClient.addUser() Success!");
				return true;
			}
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
	}
	
	public boolean addCredential(String userId, String credentialId, String oneTimePassword) {
		CredentialDetailType credDetail = new CredentialDetailType();
		credDetail.setCredentialId(credentialId);
		credDetail.setCredentialType(CredentialTypeEnum.STANDARD_OTP);
		credDetail.setFriendlyName("TrustedBank Credential");
		
		OtpAuthDataType otpData = new OtpAuthDataType();
		otpData.setOtp(oneTimePassword);
		
		AddCredentialRequestType reqT = new AddCredentialRequestType();
		reqT.setRequestId(UUID.randomUUID().toString().replace("-",""));
		reqT.setCredentialDetail(credDetail);
		reqT.setOtpAuthData(otpData);
		reqT.setUserId(userId);
		
		try {
			AddCredentialResponseType respT = mgmtPort.addCredential(reqT);
			BigInteger reason = new BigInteger(respT.getStatus());
			if (reason.intValue() != 0) {
				log.debug("Reason Code = " + reason.toString(16));
				log.debug("Message = " + respT.getStatusMessage());
				log.debug("Error Detail = " + respT.getDetailMessage());
				return false;
			} else {
				log.info("VIPUserMgmtClient.addCredential() Success!");
				return true;
			}
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}	
	}
}
