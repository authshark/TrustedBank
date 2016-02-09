package com.trustedbank.authorization;

import java.math.BigInteger;
import java.util.List;

import com.trustedbank.BasePage;
import com.trustedbank.LoginSidebarPanel;
import com.trustedbank.VIPClient;
import com.trustedbank.account.ProfileSidebarPanel;
import com.trustedbank.store.TokenStorage;

public class RemoveAuthzUser extends BasePage {
    public RemoveAuthzUser() {
        add(new LoginSidebarPanel("loginSidebarPanel"));
        add(new ProfileSidebarPanel("profileSidebarPanel"));
        
        TokenStorage store = getTokenStore();
        List authzUsers = store.getAuthzUsersFromRole("idverify");
        
        add(new RemoveAuthzUserPanel("addAuthzUserPanel", authzUsers) {
            public boolean removeAuthzUserId(String username) {
                try {
                    TokenStorage store = getTokenStore();
                    store.deleteAuthzUser(username, "idverify");
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
