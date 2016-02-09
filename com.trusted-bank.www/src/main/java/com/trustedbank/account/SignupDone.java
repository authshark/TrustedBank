package com.trustedbank.account;

import wicket.markup.html.basic.Label;
import wicket.markup.html.link.BookmarkablePageLink;

import com.trustedbank.BasePage;
import com.trustedbank.LoginSidebarPanel;
import com.trustedbank.TrustedBankSession;


public class SignupDone extends BasePage {
	public SignupDone() {
		add(new LoginSidebarPanel("loginSidebarPanel"));
		
		String username = ((TrustedBankSession)getSession()).getUser();
		
		add(new Label("username", username));
		
		add(new BookmarkablePageLink("goToProfile", Profile.class));
	}
}
