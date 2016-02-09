package com.trustedbank.store;

import java.util.List;


public interface TokenStorage {
    void startup();
    
    public int getDbVersion();
    
    void addAccount(String username, String password) throws StorageException;
    
    boolean isAccount(String username);

    boolean authenticate(String username, String password);

    public void addTokenId(String username, String tokenId);
    public void addSMSId(String username, String phoneNo);
    public void addTMPId(String username, String tmpId, String type);
    public void addTXNId(String username, String txnId, String type);
    
    public void deleteTokenId(String username, String tokenId);
    public void deleteSMSId(String username, String phoneNo);
    public void deleteTMPId(String username, String tmpId, String type);
    public void deleteTXNId(String username, String txnId, String type);
    
    public void deleteUserAccount(String username);
    public void deleteCredentialUser(String username);
    public void deleteSMSCredentialUser(String username);
    public void deleteTmpCredentialUser(String username);
    public void deleteTxnCredentialUser(String username);
    
    public void addAuthzUser(String username, String role);
    public void deleteAuthzUser(String username, String role);
    public List getAuthzUsersFromRole(String role);
    public List getAuthzRolesFromUserId(String username);
    public List getElligibleUsersFromRole(String role);
       
    public List getTokenIdFromUserId(String username);
    public List getSMSIdFromUserId(String username);
    public List getTmpIdFromUserId(String username, String type);
    public List getTxnIdFromUserId(String username, String type);
   // List getUidFromTid(String tokenID);
    
    public List getAllUserIdWithTokenId();
	public List getAllUsers();
    
    boolean isUserId(String userId);
    
    boolean isUserIdAndCredentialId(String userId, String credId, String type);

    void shutdown();
}
