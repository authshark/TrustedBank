package com.trustedbank.account;

import wicket.markup.html.basic.Label;
import wicket.markup.html.link.BookmarkablePageLink;

import com.trustedbank.BasePage;
import com.trustedbank.LoginSidebarPanel;
import com.trustedbank.TrustedBankSession;


public class SignupFailed extends BasePage {
	public SignupFailed() {
		add(new LoginSidebarPanel("loginSidebarPanel"));
		getTrustedBankSession().resetIdInit();
		getTrustedBankSession().resetIdChallenge();
		add(new BookmarkablePageLink("goToSignup", Signup.class));
	}
}
