package com.trustedbank.account;

import com.trustedbank.BasePage;
import com.trustedbank.LoginSidebarPanel;


public class RemoveToken extends BasePage {
	public RemoveToken() {
		add(new LoginSidebarPanel("loginSidebarPanel"));
		add(new ProfileSidebarPanel("profileSidebarPanel"));
	}
}
