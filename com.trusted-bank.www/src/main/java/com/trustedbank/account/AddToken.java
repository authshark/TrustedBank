package com.trustedbank.account;

import com.trustedbank.BasePage;
import com.trustedbank.LoginSidebarPanel;
// import com.trustedbank.VIPClient;
import com.trustedbank.store.TokenStorage;
import com.trustedbank.VIPUserMgmtClient;

public class AddToken extends BasePage {
    public AddToken() {
        add(new LoginSidebarPanel("loginSidebarPanel"));
        add(new ProfileSidebarPanel("profileSidebarPanel"));
        add(new AddTokenPanel("addTokenPanel") {
            public boolean activateToken(String tokenId, String oneTimePassword) {
                //VIPClient vipclient = VIPClient.getInstance(); 
                VIPUserMgmtClient vipMgmtClient = VIPUserMgmtClient.getInstance();
                try {
                    //if (vipclient.ActivateToken(tokenId, oneTimePassword, null, "OTP")) { // old way using the credential API
                      if (vipMgmtClient.addCredential(getTrustedBankSession().getUser(), tokenId , oneTimePassword)) {
                		String username = getTrustedBankSession().getUser();
                        TokenStorage store = getTokenStore();
                        store.addTokenId(username, tokenId);
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
