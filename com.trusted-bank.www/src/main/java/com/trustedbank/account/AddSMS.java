package com.trustedbank.account;

import wicket.markup.html.basic.Label;

import com.trustedbank.VIPClient;
import com.trustedbank.store.TokenStorage;

import com.trustedbank.BasePage;
import com.trustedbank.LoginSidebarPanel;

public class AddSMS extends BasePage {
    public AddSMS(){
        add(new LoginSidebarPanel("loginSidebarPanel"));
        add(new ProfileSidebarPanel("profileSidebarPanel"));
        
        if (!getTrustedBankSession().getRegSMS()) {
        	add(new RegisterSMSPanel("addSMSPanel"){
        		public boolean registerSMS(String phoneId){
        			VIPClient vipclient = VIPClient.getInstance();
            		try {
            			if(vipclient.RegisterPhone(phoneId)) {
            				getTrustedBankSession().setPhoneNo(phoneId);
            				getTrustedBankSession().setRegSMS();
            				return true;
            			}
                    } catch (Exception e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                        return false;
                    }
                    return false;
        		}
        	});
        } else {
        	add(new ActivateSMSPanel("addSMSPanel", getTrustedBankSession().getPhoneNo()){
        		public boolean activateToken(String phoneId, String oneTimePassword){
        			VIPClient vipclient = VIPClient.getInstance();
	                try {
	                    if (vipclient.ActivateToken(phoneId, oneTimePassword, null, "SMS")) {
	                        String username = getTrustedBankSession().getUser();
	                        TokenStorage store = getTokenStore();
	                        store.addSMSId(username, phoneId);
	                        getTrustedBankSession().strongAuthenticate();

	                        return true;
	                    }
	                } catch (Exception e) {
	                    // TODO Auto-generated catch block
	                    e.printStackTrace();
	                    return false;
	                }	
	                return false;
        		}
        	});
        } 
    }
}