package com.trustedbank.authorization;

import com.trustedbank.TrustedBankSession;
import java.io.StringReader;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;

import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;

import wicket.PageParameters;

import com.trustedbank.BasePage;
import com.trustedbank.idverified.IdVerifyClient;
import com.trustedbank.LoginSidebarPanel;
import com.trustedbank.VIPClient;
import com.trustedbank.authorization.SelectAuthzUserPanel;
import com.trustedbank.store.StorageException;
import com.trustedbank.store.TokenStorage;

public class Authorize extends BasePage {
	public Authorize() {
		add(new LoginSidebarPanel("loginSidebarPanel"));
		
		if (!getTrustedBankSession().isIdAuthorized()) {
			TokenStorage store = getTokenStore();
			
			List authzUsers = store.getAuthzUsersFromRole("idverify");
			
			add(new SelectAuthzUserPanel("authzPanel", authzUsers)
			{
				public boolean sendTmpSMS(String user) {			 
					VIPClient vipclient = VIPClient.getInstance();
					TokenStorage store = getTokenStore();
					List phoneNumbers = store.getTmpIdFromUserId(user,"SMS");
					List credIds = store.getTokenIdFromUserId(user);
					
					getTrustedBankSession().authorize(user);
					
					if (phoneNumbers.isEmpty()) {
						return false;
					} else {
						 String phoneId = (String) phoneNumbers.get(0);
						 String credId = (String) credIds.get(0);
					     try {
					        vipclient.sendSMSTemporaryPassword(credId, phoneId);
					     } catch (Exception e) {
					            // TODO Auto-generated catch block
					            e.printStackTrace();
					            return false;
					        }
						return true;
					}	 
				}
			
			});
		} else {
			add(new EnterAuthzOtpPanel("authzPanel")
			{
				public boolean validateOtp(String oneTimePassword)
				{
					if (getTrustedBankSession().strongAuthorize(oneTimePassword)) {
						getTrustedBankSession().resetidAuthorized();
						return true;
					}
					return false;
				}
				public void resetId() {
					getTrustedBankSession().resetidAuthorized();
				}
			});
		}
	}
}
