package com.trustedbank;

import wicket.markup.html.link.BookmarkablePageLink;
import wicket.markup.html.panel.Panel;

import com.trustedbank.account.Signup;
import com.trustedbank.idverified.SignupIdVerified;
import com.trustedbank.authorization.Authorize;
import com.trustedbank.signin.SignIn;


public class SignedOutPanel extends Panel
{
	public SignedOutPanel(final String id)
	{
		super(id);
		
		add(new BookmarkablePageLink("goToSignIn", SignIn.class));
		//add(new BookmarkablePageLink("goToSignUpId", Authorize.class));
		add(new BookmarkablePageLink("goToSignUp", Signup.class));
	}
}
