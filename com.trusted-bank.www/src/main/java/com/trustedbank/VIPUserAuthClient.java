package com.trustedbank;

import java.math.BigInteger;
import java.net.MalformedURLException;
import java.rmi.RemoteException;
import java.util.Properties;
import java.util.UUID;
import java.io.FileInputStream;

import javax.xml.rpc.ServiceException;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.symantec.schemas.vip._2011._04.vipuserservices.*;
import com.symantec.schemas.vip._2011._04.vipuserservices.auth.*;

public class VIPUserAuthClient {
	private static final Log log = LogFactory.getLog(VIPUserAuthClient.class); 
	private static Properties defaultProps = new Properties();
	
	private AuthenticationService authService;
	private AuthenticationServicePort authPort;
	
	private String m_url;
	private static String certFile; 
	private static String certPassword;
	
	private String errorMessage;
	
	private String pushTransactionId;
	
	private static VIPUserAuthClient VIPUserAuthClient = null;
	
	public static VIPUserAuthClient getInstance() {
		try {
			FileInputStream in = new FileInputStream("/home/trustedbank/trustedBank.properties");
			defaultProps.load(in);
			in.close();
		} catch (Exception e) {
			log.error("VIPUserAuthClient() Exception: " + e);
			return null;
		}

		String activeSystem = defaultProps.getProperty("com.verisign.active");
		
		String querySvcUrl = defaultProps.getProperty("com.symantec.webservice.authentication."+activeSystem+".url");
		certFile = defaultProps.getProperty("com.verisign.webservice."+activeSystem+".cert.file");
		certPassword = defaultProps.getProperty("com.verisign.webservice."+activeSystem+".cert.password");
		
		if (VIPUserAuthClient == null) {
			VIPUserAuthClient = new VIPUserAuthClient(querySvcUrl);
		}		
		return VIPUserAuthClient;
	}
	
	private VIPUserAuthClient(String url) {
		authService = new AuthenticationServiceLocator();
		m_url = url;
		System.setProperty("javax.net.ssl.keyStoreType", "pkcs12");
		System.setProperty("javax.net.ssl.keyStore", certFile);
		System.setProperty("javax.net.ssl.keyStorePassword", certPassword);
		try {
			authPort = authService.getAuthenticationServicePort(new java.net.URL(m_url));
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			log.debug("VIPUserAuthClient, Exception : " + e);
		} catch (ServiceException e) {
			// TODO Auto-generated catch block
			log.debug("VIPUserAuthClient, Exception : " + e);
		}
	}
	
	public boolean sendAuthPush(String userId) {
		try {
			FileInputStream in = new FileInputStream("/home/trustedbank/trustedBank.properties");
			defaultProps.load(in);
			in.close();
		} catch (Exception e) {
			log.error("VIPUserAuthClient.sendAuthPush() Exception: " + e);
			return false;
		}
		
		AuthenticateUserWithPushRequestType reqT = new AuthenticateUserWithPushRequestType();
		reqT.setRequestId(UUID.randomUUID().toString().replace("-",""));
		reqT.setUserId(userId);
		
		KeyValuePairType authTimeout = new KeyValuePairType();
		
		authTimeout.setKey("request.timeout");
		authTimeout.setValue(defaultProps.getProperty("com.symantec.webservice.authentication.push.auth.request.timeout")); 
		
		KeyValuePairType pushTitle = new KeyValuePairType();
		pushTitle.setKey("push.message.text");
		pushTitle.setValue(defaultProps.getProperty("com.symantec.webservice.authentication.push.auth.push.message.text"));
		
		KeyValuePairType authTitle = new KeyValuePairType();
		authTitle.setKey("display.message.title");
		authTitle.setValue(defaultProps.getProperty("com.symantec.webservice.authentication.push.auth.display.message.title"));
		
		KeyValuePairType authText = new KeyValuePairType();
		authText.setKey("display.message.text");
		authText.setValue(defaultProps.getProperty("com.symantec.webservice.authentication.push.auth.display.message.text"));
		
		KeyValuePairType authProfile = new KeyValuePairType();
		authProfile.setKey("display.message.profile");
		authProfile.setValue(defaultProps.getProperty("com.symantec.webservice.authentication.push.auth.display.message.profile"));
		
		PushAuthDataType pushData = new PushAuthDataType();
		KeyValuePairType[] requestParameters = new KeyValuePairType[1];
		requestParameters[0] = authTimeout;
		pushData.setRequestParameters(requestParameters);
		
		KeyValuePairType[] displayParameters = new KeyValuePairType[4];
		displayParameters[0] = authText;
		displayParameters[1] = authTitle;
		displayParameters[2] = authProfile;
		displayParameters[3] = pushTitle;
		pushData.setDisplayParameters(displayParameters);
		
		reqT.setPushAuthData(pushData);
		
		try {
			AuthenticateUserWithPushResponseType respT = authPort.authenticateUserWithPush(reqT);
			BigInteger reason = new BigInteger(respT.getStatus());
			if (reason.intValue() != 24640) {
				log.debug("Reason Code = " + reason.toString(16));
				log.debug("Message = " + respT.getStatusMessage());
				log.debug("Error Detail = " + respT.getDetailMessage());
				errorMessage = respT.getStatusMessage();
				return false;
			} else {
				log.info("VIPUserMgmtClient.sendAuthPush() Success!");
				pushTransactionId = respT.getTransactionId();
				return true;
			}
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}				
	}
	
	public boolean sendTxnPush(String userId, String fromAccount, String toAccount, String amount) {
		try {
			FileInputStream in = new FileInputStream("/home/trustedbank/trustedBank.properties");
			defaultProps.load(in);
			in.close();
		} catch (Exception e) {
			log.error("VIPUserAuthClient.sendAuthPush() Exception: " + e);
			return false;
		}
		
		AuthenticateUserWithPushRequestType reqT = new AuthenticateUserWithPushRequestType();
		reqT.setRequestId(UUID.randomUUID().toString().replace("-",""));
		reqT.setUserId(userId);
		
		KeyValuePairType authTimeout = new KeyValuePairType();
		
		authTimeout.setKey("request.timeout");
		authTimeout.setValue(defaultProps.getProperty("com.symantec.webservice.authentication.push.txn.request.timeout")); 

		KeyValuePairType pushTitle = new KeyValuePairType();
		pushTitle.setKey("push.message.text");
		pushTitle.setValue(defaultProps.getProperty("com.symantec.webservice.authentication.push.txn.push.message.text"));

		KeyValuePairType authTitle = new KeyValuePairType();
		authTitle.setKey("display.message.title");
		authTitle.setValue(defaultProps.getProperty("com.symantec.webservice.authentication.push.txn.display.message.title"));
		
		String txnMessage = new String(
				defaultProps.getProperty("com.symantec.webservice.authentication.push.txn.display.message.text.from") +
				fromAccount.split("-")[0].substring(2) + " " +
				defaultProps.getProperty("com.symantec.webservice.authentication.push.txn.display.message.text.to") +
				toAccount.split("-")[0].substring(2) + " " +
				defaultProps.getProperty("com.symantec.webservice.authentication.push.txn.display.message.text.amount") +
				" " + amount +
				defaultProps.getProperty("com.symantec.webservice.authentication.push.txn.display.message.text.confirm")
				);
		
		KeyValuePairType authText = new KeyValuePairType();
		authText.setKey("display.message.text");
		authText.setValue(txnMessage);
		
		KeyValuePairType authProfile = new KeyValuePairType();
		authProfile.setKey("display.message.profile");
		authProfile.setValue(defaultProps.getProperty("com.symantec.webservice.authentication.push.auth.display.message.profile"));
		
		PushAuthDataType pushData = new PushAuthDataType();
		KeyValuePairType[] requestParameters = new KeyValuePairType[1];
		requestParameters[0] = authTimeout;
		pushData.setRequestParameters(requestParameters);
		
		KeyValuePairType[] displayParameters = new KeyValuePairType[4];
		displayParameters[0] = authText;
		displayParameters[1] = authTitle;
		displayParameters[2] = authProfile;
		displayParameters[3] = pushTitle;
		pushData.setDisplayParameters(displayParameters);
		
		reqT.setPushAuthData(pushData);
		
		try {
			AuthenticateUserWithPushResponseType respT = authPort.authenticateUserWithPush(reqT);
			BigInteger reason = new BigInteger(respT.getStatus());
			if (reason.intValue() != 24640) {
				log.debug("Reason Code = " + reason.toString(16));
				log.debug("Message = " + respT.getStatusMessage());
				log.debug("Error Detail = " + respT.getDetailMessage());
				errorMessage = respT.getStatusMessage();
				return false;
			} else {
				log.info("VIPUserMgmtClient.sendAuthPush() Success!");
				pushTransactionId = respT.getTransactionId();
				return true;
			}
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
				
	}
	
	public String getErrorMessage() {
		return errorMessage;
	}
	
	public String getPushTransactionId() {
		return pushTransactionId;
	}
}
