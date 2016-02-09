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
import com.symantec.schemas.vip._2011._04.vipuserservices.query.*;

public class VIPUserQueryClient {
	private static final Log log = LogFactory.getLog(VIPUserQueryClient.class); 
	private static Properties defaultProps = new Properties();
	
	private QueryService queryService;
	private QueryServicePort queryPort;
	
	private String m_url;
	private static String certFile; 
	private static String certPassword;
	
	private static VIPUserQueryClient VIPUserQueryClient = null;
	
	private String errorMessage;
	
	public static VIPUserQueryClient getInstance() {
		try {
			FileInputStream in = new FileInputStream("/home/trustedbank/trustedBank.properties");
			defaultProps.load(in);
			in.close();
		} catch (Exception e) {
			log.error("VIPUserQueryClient() Exception: " + e);
			return null;
		}

		String activeSystem = defaultProps.getProperty("com.verisign.active");
		
		String querySvcUrl = defaultProps.getProperty("com.symantec.webservice.query."+activeSystem+".url");
		certFile = defaultProps.getProperty("com.verisign.webservice."+activeSystem+".cert.file");
		certPassword = defaultProps.getProperty("com.verisign.webservice."+activeSystem+".cert.password");
		
		if (VIPUserQueryClient == null) {
			VIPUserQueryClient = new VIPUserQueryClient(querySvcUrl);
		}		
		return VIPUserQueryClient;
	}
	
	private VIPUserQueryClient(String url) {
		queryService = new QueryServiceLocator();
		m_url = url;
		System.setProperty("javax.net.ssl.keyStoreType", "pkcs12");
		System.setProperty("javax.net.ssl.keyStore", certFile);
		System.setProperty("javax.net.ssl.keyStorePassword", certPassword);
		try {
			queryPort = queryService.getQueryServicePort(new java.net.URL(m_url));
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			log.debug("getServerTime(), Exception : " + e);
		} catch (ServiceException e) {
			// TODO Auto-generated catch block
			log.debug("getServerTime(), Exception : " + e);
		}
	}
	
	public String getServerTime() {	
		GetServerTimeRequestType reqT = new GetServerTimeRequestType(UUID.randomUUID().toString().replace("-", ""));
		try {
			GetServerTimeResponseType respT = queryPort.getServerTime(reqT);
			BigInteger reason = new BigInteger(respT.getStatus());
			if (reason.intValue() != 0) {
				log.debug("Reason Code = " + reason.toString(16));
				log.debug("Message = " + respT.getStatusMessage());
				log.debug("Error Detail = " + respT.getDetailMessage());
				return null;
			} else {
				log.info("VIPUserQueryClient.getServerTime() Success! Result =  " + respT.getTimestamp().getTime().toString());
				return (respT.getTimestamp().getTime().toString());
			}
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	public boolean pollPushById(String transactionId) {
		try {
			FileInputStream in = new FileInputStream("/home/trustedbank/trustedBank.properties");
			defaultProps.load(in);
			in.close();
		} catch (Exception e) {
			log.error("VIPUserAuthClient.sendAuthPush() Exception: " + e);
			return false;
		}
		
		int attempts = Integer.parseInt(defaultProps.getProperty("com.symantec.webservice.query.push.poll.retries"));
		 
		try {
			Thread.sleep(Long.parseLong(defaultProps.getProperty("com.symantec.webservice.query.push.poll.sleep")));
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		for (int counter = 1; counter < attempts; counter++) {
			
			int pushStatus = pollPush(transactionId);
			
			switch (pushStatus) {
			case -1: 			//service error
				errorMessage = "VIP Service error";
				return false;
			case -2: 			//call error
				errorMessage = "VIP Service call error";
				return false;
			case 28672:			//approved by user
				return true;
			case 28673:			//request in progress
				break;
			case 28674:			//denied by user
				errorMessage = "Mobile push request denied by user";
				return false;
			case 28675:			//request changed
				errorMessage = "Mobile push request changed";
				return false;
			case 28676:			//request expired
				errorMessage = "Mobile push request expired";
				return false;
			case 28677:			//request not found
				errorMessage = "Mobile push request not found";
				return false;
			case 28678:			//not completed
				break;
			}
						
			try {
				Thread.sleep(Long.parseLong(defaultProps.getProperty("com.symantec.webservice.query.push.poll.sleep")));
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		errorMessage = "Mobile push not answered by user";
		return false;
	}
	
	private int pollPush(String transactionId) {
		PollPushStatusRequestType reqT = new PollPushStatusRequestType();
		reqT.setRequestId(UUID.randomUUID().toString().replace("-",""));
		
		String[] transactionIds = new String[1];
		transactionIds[0] = transactionId;
		reqT.setTransactionId(transactionIds);
				
		try {
			PollPushStatusResponseType respT = queryPort.pollPushStatus(reqT);
			BigInteger reason = new BigInteger(respT.getStatus());
			if (reason.intValue() != 0) {
				log.debug("Reason Code = " + reason.toString(16));
				log.debug("Message = " + respT.getStatusMessage());
				log.debug("Error Detail = " + respT.getDetailMessage());
				return -1;
			} else {
				log.info("VIPUserQueryClient.verifyAuthPush() Success! Checking for Transaction Status!");
				BigInteger status = new BigInteger(respT.getTransactionStatus()[0].getStatus());
				return status.intValue();
			}
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return -2;
		}	
	}

	public String getErrorMessage() {
		return errorMessage;
	}
}
