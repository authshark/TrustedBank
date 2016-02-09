package com.trustedbank;


import wicket.markup.html.link.BookmarkablePageLink;
import wicket.markup.html.panel.Panel;

import com.trustedbank.account.Profile;
import com.trustedbank.transaction.Transfer;


class Header extends Panel
{
	public Header(String id)
	{
		super(id);
		
		if ( ((TrustedBankSession)getSession()).isSignedIn() )
		{
			add(new SignedInPanel("loginHeaderPanel"));
		}
		else
		{
			add(new SignedOutPanel("loginHeaderPanel"));
		}
		
		add(new BookmarkablePageLink("goToMain", Main.class));
		add(new BookmarkablePageLink("goToTransfer", Transfer.class));
		add(new BookmarkablePageLink("goToProfile", Profile.class));
	}
}
