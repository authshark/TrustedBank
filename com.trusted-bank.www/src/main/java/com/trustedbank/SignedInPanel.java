package com.trustedbank;

import com.trustedbank.signin.SignOut;

import wicket.markup.html.basic.Label;
import wicket.markup.html.link.BookmarkablePageLink;
import wicket.markup.html.panel.Panel;

public class SignedInPanel extends Panel
{
	public SignedInPanel(final String id)
	{
		super(id);
		
		String username = ((TrustedBankSession)getSession()).getUser();
		
		add(new Label("username", username));
		add(new BookmarkablePageLink("goToSignOut", SignOut.class));
	}
}
