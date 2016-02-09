package com.trustedbank.push;

import wicket.markup.html.basic.Label;
import wicket.markup.html.link.BookmarkablePageLink;

import com.trustedbank.*;
import com.trustedbank.signin.SignOut;

public class PushError extends PublicPage {

	public PushError() {
		add(new SignInPushPanel("signInPanel")
		{
			public boolean signInPush(String username)
			{
				return false;
			}
		});

		add(new Label("pushUserMessage", ((TrustedBankSession)getSession()).getPushError()));
		add(new Label("retryMessage","Did not receive the Sign In request?"));
		add(new BookmarkablePageLink("retryPush", TryPush.class));
		add(new BookmarkablePageLink("goToLogout", SignOut.class));
	}
}
