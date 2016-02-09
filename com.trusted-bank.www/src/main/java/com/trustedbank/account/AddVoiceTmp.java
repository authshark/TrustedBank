package com.trustedbank.account;

import com.trustedbank.BasePage;
import com.trustedbank.LoginSidebarPanel;
import com.trustedbank.store.TokenStorage;

public class AddVoiceTmp extends BasePage {
    public AddVoiceTmp() {
        add(new LoginSidebarPanel("loginSidebarPanel"));
        add(new ProfileSidebarPanel("profileSidebarPanel"));
        add(new AddVoiceTmpPanel("addVoiceTmpPanel") {
            public boolean addVoiceTmpId(String tmpVoiceId) {
                try {
                	String username = getTrustedBankSession().getUser();
                    TokenStorage store = getTokenStore();
                    store.addTMPId(username, tmpVoiceId, "Voice");
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
