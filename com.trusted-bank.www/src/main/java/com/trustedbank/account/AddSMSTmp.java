package com.trustedbank.account;

import java.math.BigInteger;

import com.trustedbank.BasePage;
import com.trustedbank.LoginSidebarPanel;
import com.trustedbank.VIPClient;
import com.trustedbank.store.TokenStorage;

public class AddSMSTmp extends BasePage {
    public AddSMSTmp() {
        add(new LoginSidebarPanel("loginSidebarPanel"));
        add(new ProfileSidebarPanel("profileSidebarPanel"));
        add(new AddSMSTmpPanel("addSMSTmpPanel") {
            public boolean addSMSTmpId(String tmpSMSId) {
                try {
                	String username = getTrustedBankSession().getUser();
                    TokenStorage store = getTokenStore();
                    store.addTMPId(username, tmpSMSId, "SMS");
                    return true;
                } catch (Exception e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                    return false;
                }
            }
        });
    }
}
