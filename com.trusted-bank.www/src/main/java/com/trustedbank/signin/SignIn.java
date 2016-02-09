package com.trustedbank.signin;

import wicket.PageParameters;

import com.trustedbank.LoginSidebarPanel;
import com.trustedbank.PublicPage;
import com.trustedbank.TrustedBankSession;

public final class SignIn extends PublicPage
{
	public SignIn()
	{
		this(null);
	}

	public SignIn(final PageParameters parameters)
	{
		add(new LoginSidebarPanel("loginSidebarPanel"));

		add(new SignInPanel("signInPanel")
		{
			public boolean signIn(String username, String password)
			{
				return ((TrustedBankSession)getSession()).authenticate(username, password);
			}
		});
	}
}
