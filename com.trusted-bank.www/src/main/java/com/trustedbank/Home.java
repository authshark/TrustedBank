package com.trustedbank;

import com.trustedbank.signin.SignInPanel;

public class Home extends PublicPage {

	public Home() {
		add(new SignInPanel("signInPanel")
		{
			public boolean signIn(String username, String password)
			{
				return ((TrustedBankSession)getSession()).authenticate(username, password);
			}
		});
	}
}
