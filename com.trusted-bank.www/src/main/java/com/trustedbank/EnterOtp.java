package com.trustedbank;

import wicket.markup.html.link.BookmarkablePageLink;
import wicket.markup.html.link.PageLink;
import wicket.markup.html.basic.Label;

import com.trustedbank.account.SelectAuthCredPanel;
import com.trustedbank.signin.EnterOtpPanel;
import com.trustedbank.signin.ListOtpInstructions;
import com.trustedbank.signin.ListSMSInstructions;

public class EnterOtp extends BasePage {

	public EnterOtp() {
		add(new LoginSidebarPanel("loginSidebarPanel"));
		add(new BookmarkablePageLink("forgotOrResend", ForgotToken.class));

		if (!getTrustedBankSession().getSMS()) {
			if (!getTrustedBankSession().getOTP()){
				add(new SelectAuthCredPanel("listInstructions"));
				add(new Label("resendSMSPanel",""));
				add(new Label("enterOtpPanel",""));
			} else {
				add(new ListOtpInstructions("listInstructions"));
				add(new Label("resendSMSPanel",""));
				add(new EnterOtpPanel("enterOtpPanel")
				{
					public boolean validateOtp(String oneTimePassword)
					{
						return getTrustedBankSession().strongAuthenticate(oneTimePassword);
					}
				});	
			}
		} else {
			//send SMS
			try{
				getTrustedBankSession().sendSMSotp();
			} catch (Exception e) {
				e.printStackTrace();
			};

			add(new ListSMSInstructions("listInstructions"));
			add(new Label("resendSMSPanel","This where the resend panel will go."));

			add(new EnterOtpPanel("enterOtpPanel")
			{
				public boolean validateOtp(String oneTimePassword)
				{
					return getTrustedBankSession().strongAuthenticate(oneTimePassword);
				}
			});
		}	
	}
}
