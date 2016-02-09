package com.trustedbank.account;

import java.io.StringReader;
import java.util.HashMap;
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
import com.trustedbank.VIPUserMgmtClient;
import com.trustedbank.idverified.IdVerifyClient;
import com.trustedbank.LoginSidebarPanel;
import com.trustedbank.store.StorageException;
import com.trustedbank.store.TokenStorage;

public class Signup extends BasePage {
	public Signup() {
		add(new LoginSidebarPanel("loginSidebarPanel"));
		add(new SignUpPanel("signUpPanel")
		{
			public boolean signup(String username, String password) {

				// try to add the user to VIP first
				VIPUserMgmtClient vipMgmtClient = VIPUserMgmtClient.getInstance();
				
				if(!vipMgmtClient.addUser(username)) {
					return false;
				}
				
				TokenStorage store = getTokenStore();
				
				try
				{
					store.addAccount(username, password);
				}
				catch (StorageException se)
				{
					se.printStackTrace();
					return false;
				}

				return getTrustedBankSession().authenticate(username, password);
			}
			public void resetId() {
				getTrustedBankSession().resetIdInit();
				getTrustedBankSession().resetIdChallenge();
			}
		});
	}
}
