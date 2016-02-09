package com.trustedbank.account;

import java.util.Iterator;
import java.util.List;

import com.trustedbank.TrustedBankApplication;
import com.trustedbank.TrustedBankSession;
import com.trustedbank.authorization.AddAuthzUser;
import com.trustedbank.authorization.RemoveAuthzUser;
import com.trustedbank.authorization.RemoveUser;
import com.trustedbank.store.TokenStorage;

import wicket.markup.html.basic.Label;
import wicket.markup.html.link.BookmarkablePageLink;
import wicket.markup.html.panel.Panel;

public class ProfileSidebarPanel extends Panel
{
	public ProfileSidebarPanel(final String id)
	{
		super(id);
		
		boolean isAdmin = false;
		
		String username = ((TrustedBankSession) getSession()).getUser();
        TokenStorage storage = ((TrustedBankApplication) getApplication()).getTokenStore();
        
        List adminNames = storage.getAuthzUsersFromRole("superadmin");
        Iterator it = adminNames.iterator();
        
        if (!adminNames.isEmpty()) {
        	while (it.hasNext()) {
        		if (username.equals((String) it.next())) {
        			isAdmin = true;
        		}
        	}
        }
        
		add(new BookmarkablePageLink("goToAddToken", AddToken.class));
		add(new BookmarkablePageLink("goToAddSMS", AddSMS.class));
		//placeholder for the Voice OTP credential
		add(new Label("goToAddVoice","Add VIP Voice Credential"));
		
		add(new BookmarkablePageLink("goToAddSMSTmp", AddSMSTmp.class));
		add(new BookmarkablePageLink("goToAddVoiceTmp", AddVoiceTmp.class));
		//placeholder for the EMail TMP
		add(new Label("goToAddEmailTmp","Add VIP E-Mail Temporary"));
		
		//placeholder for SMS TXN
		add(new Label("goToAddSMSTxn","Add VIP SMS Authorization"));
		//placeholder for Voice TXN
		//add(new Label("goToAddVoiceTxn","Add VIP Voice Authorization"));
		add(new BookmarkablePageLink("goToAddVoiceTxn", AddVoiceTxn.class));
		//placeholder for EMail TXN
		add(new Label("goToAddEmailTxn","Add E-Mail Auhorization"));
		
		if (isAdmin) {
			add(new BookmarkablePageLink("goToAddAuthzUser", AddAuthzUser.class));
		} else {
			add(new Label("goToAddAuthzUser","Report Broken Link"));
		}
		
		if (isAdmin) {
			add(new BookmarkablePageLink("goToRemoveAuthzUser", RemoveAuthzUser.class));
		} else {
			add(new Label("goToRemoveAuthzUser","Report Broken Page"));
		}
		
		if (isAdmin) {
			add(new BookmarkablePageLink("goToRemoveUser", RemoveUser.class));
		} else {
			add(new Label("goToRemoveUser","Report spam"));
		}
		
		
	}
}
