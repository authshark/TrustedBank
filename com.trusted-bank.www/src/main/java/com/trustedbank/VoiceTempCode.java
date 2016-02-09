package com.trustedbank;

import com.trustedbank.signin.EnterOtpPanel;


public class VoiceTempCode extends BasePage {
	public VoiceTempCode() {
		add(new LoginSidebarPanel("loginSidebarPanel"));

		try{
			getTrustedBankSession().sendTmpVoiceOtp();
		} catch (Exception e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
		};
		
		getTrustedBankSession().setTmpSMS();
		
		add(new EnterOtpPanel("enterOtpPanel")
		{
			public boolean validateOtp(String oneTimePassword)
			{
				return ((TrustedBankSession)getSession()).strongAuthenticate(oneTimePassword);
				//return ((TrustedBankSession)getSession()).strongAuthenticate();
			}
		});
	}
}
