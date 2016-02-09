package com.trustedbank.authorization;

import java.math.BigInteger;
import java.util.List;

import com.trustedbank.BasePage;
import com.trustedbank.LoginSidebarPanel;
import com.trustedbank.VIPClient;
import com.trustedbank.account.ProfileSidebarPanel;
import com.trustedbank.store.TokenStorage;

public class RemoveUser extends BasePage {
    public RemoveUser() {
        add(new LoginSidebarPanel("loginSidebarPanel"));
        add(new ProfileSidebarPanel("profileSidebarPanel"));
        
        TokenStorage store = getTokenStore();
        //get ALL users
        List users = store.getAllUsers();
        
        add(new RemoveUserPanel("addAuthzUserPanel", users) {
            public boolean removeUserId(String username) {
            	TokenStorage store = getTokenStore();
            	//check for credentials and delete, then remove the account
            	if (!store.getTokenIdFromUserId(username).isEmpty()) {
            		try {
            			store.deleteCredentialUser(username);
                    } catch (Exception e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
            	}
            	
            	if(!store.getSMSIdFromUserId(username).isEmpty()) {
            		try {
            			store.deleteSMSCredentialUser(username);
                    } catch (Exception e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
            	}
            	
            	if(!store.getTmpIdFromUserId(username, "SMS").isEmpty() | 
            			!store.getTmpIdFromUserId(username, "Voice").isEmpty()) {
            		try {
            			store.deleteTmpCredentialUser(username);
                    } catch (Exception e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
            	}
            	
            	if(!store.getTxnIdFromUserId(username, "SMS").isEmpty() | 
            			!store.getTxnIdFromUserId(username, "Voice").isEmpty()) {
            		try {
            			store.deleteTxnCredentialUser(username);
                    } catch (Exception e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
            	}
            	
            	// time to remove the user account
            	try {
        			store.deleteUserAccount(username);
        			return true;
                } catch (Exception e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            	
            	// TO DO: if user exists in the cloud, remove it
                return false;
            }
        });
    }
}
