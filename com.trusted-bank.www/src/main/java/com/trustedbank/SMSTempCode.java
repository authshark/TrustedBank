package com.trustedbank;

import com.trustedbank.signin.EnterOtpPanel;


public class SMSTempCode extends BasePage {
	public SMSTempCode() {
		add(new LoginSidebarPanel("loginSidebarPanel"));

		try{
			getTrustedBankSession().sendTmpSMSotp();
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
