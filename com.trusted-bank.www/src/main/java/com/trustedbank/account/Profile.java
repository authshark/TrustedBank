package com.trustedbank.account;

import java.util.List;

import wicket.markup.html.basic.Label;

import com.trustedbank.LoginSidebarPanel;
import com.trustedbank.PrivatePage;
import com.trustedbank.TrustedBankApplication;
import com.trustedbank.store.TokenStorage;


public class Profile extends PrivatePage {
	public Profile() {
		add(new LoginSidebarPanel("loginSidebarPanel"));
		add(new ProfileSidebarPanel("profileSidebarPanel"));
		
		String username = getTrustedBankSession().getUser();
		TokenStorage storage = ((TrustedBankApplication)getApplication()).getTokenStore();
		List tokenIds = storage.getTokenIdFromUserId(username);
		List smsIds = storage.getSMSIdFromUserId(username);
		List smsTmpIds = storage.getTmpIdFromUserId(username,"SMS");
		List voiceTmpIds = storage.getTmpIdFromUserId(username,"Voice");
		List smsTxnIds = storage.getTxnIdFromUserId(username,"SMS");
		List voiceTxnIds = storage.getTxnIdFromUserId(username,"Voice");
		
		add(new ListTokensPanel("listTokensPanel", 
				tokenIds, smsIds, 
				smsTmpIds, voiceTmpIds, 
				smsTxnIds, voiceTxnIds));
		
		/*
		if (tokenIds.isEmpty() && smsIds.isEmpty())
		{
			add(new Label("listTokensPanel", "You don't have any VIP credentials configured."));
		} 
		else			
		{
			add(new ListTokensPanel("listTokensPanel", tokenIds, smsIds, smsTmpIds, voiceTmpIds, smsTxnIds, voiceTxnIds));
		}
		*/
	}
}
