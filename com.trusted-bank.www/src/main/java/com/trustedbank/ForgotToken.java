package com.trustedbank;

import java.util.List;

import com.trustedbank.store.TokenStorage;

import wicket.markup.html.basic.Label;
import wicket.markup.html.link.BookmarkablePageLink;


public class ForgotToken extends BasePage {
	public ForgotToken() {
		String username = getTrustedBankSession().getUser();
		TokenStorage storage = ((TrustedBankApplication)getApplication()).getTokenStore();
		List smsTmpIds = storage.getTmpIdFromUserId(username,"SMS");
		List voiceTmpIds = storage.getTmpIdFromUserId(username,"Voice");
		
		add(new LoginSidebarPanel("loginSidebarPanel"));
		
		if (!smsTmpIds.isEmpty()) {
			add(new BookmarkablePageLink("goToSMSTempCode", SMSTempCode.class));
		} else {
			add(new Label("goToSMSTempCode",""));
		}
		
		if (!voiceTmpIds.isEmpty()) {
			add(new BookmarkablePageLink("goToVoiceTempCode", VoiceTempCode.class));
		} else {
			add(new Label("goToVoiceTempCode",""));
		}
		
		add(new BookmarkablePageLink("goToKBATemp", KBATemp.class));
		
	}
}
