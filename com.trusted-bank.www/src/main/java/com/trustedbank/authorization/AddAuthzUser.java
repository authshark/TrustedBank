package com.trustedbank.authorization;

import java.math.BigInteger;
import java.util.List;

import com.trustedbank.BasePage;
import com.trustedbank.LoginSidebarPanel;
import com.trustedbank.VIPClient;
import com.trustedbank.account.ProfileSidebarPanel;
import com.trustedbank.store.TokenStorage;

public class AddAuthzUser extends BasePage {
    public AddAuthzUser() {
        add(new LoginSidebarPanel("loginSidebarPanel"));
        add(new ProfileSidebarPanel("profileSidebarPanel"));
        
        TokenStorage store = getTokenStore();
        List elligibleUsers = store.getElligibleUsersFromRole("idverify");
        
        add(new AddAuthzUserPanel("addAuthzUserPanel", elligibleUsers) {
            public boolean addAuthzUserId(String username) {
                try {
                    TokenStorage store = getTokenStore();
                    store.addAuthzUser(username, "idverify");
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
