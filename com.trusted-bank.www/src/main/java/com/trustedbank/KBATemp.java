package com.trustedbank;

import com.trustedbank.signin.KBAPanel;

public class KBATemp extends BasePage {
	public KBATemp() {
		add(new LoginSidebarPanel("loginSidebarPanel"));
		
		add(new KBAPanel("enterKBAPanel")
		{
			public boolean validateKBA()
			{
				//return ((TrustedBankSession)getSession()).strongAuthenticate(oneTimePassword);
				return ((TrustedBankSession)getSession()).strongAuthenticate();
			}
		});
	}
}
