package com.trustedbank.push;

import java.io.FileInputStream;
import java.util.Properties;

import wicket.markup.html.basic.Label;
import wicket.markup.html.link.BookmarkablePageLink;

import com.trustedbank.*;
import com.trustedbank.signin.SignOut;

public class TryPush extends PublicPage {
	private static Properties defaultProps = new Properties();

	public TryPush() {

		String pushDisplayMessage = defaultProps.getProperty("com.symantec.webservice.authentication.push.auth.tb.display.message");
		
		
		add(new SignInPushPanel("signInPanel")
		{
			public boolean signInPush(String username)
			{
				return ((TrustedBankSession)getSession()).strongAuthenticateWithPush();
			}
		});
	}
}
