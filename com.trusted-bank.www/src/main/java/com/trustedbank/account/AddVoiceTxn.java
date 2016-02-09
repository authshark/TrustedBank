package com.trustedbank.account;

import com.trustedbank.BasePage;
import com.trustedbank.LoginSidebarPanel;
import com.trustedbank.store.TokenStorage;

public class AddVoiceTxn extends BasePage {
    public AddVoiceTxn() {
        add(new LoginSidebarPanel("loginSidebarPanel"));
        add(new ProfileSidebarPanel("profileSidebarPanel"));
        add(new AddVoiceTxnPanel("addVoiceTxnPanel") {
            public boolean addVoiceTxnId(String txnVoiceId) {
                try {
                	String username = getTrustedBankSession().getUser();
                    TokenStorage store = getTokenStore();
                    store.addTXNId(username, txnVoiceId, "Voice");
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
