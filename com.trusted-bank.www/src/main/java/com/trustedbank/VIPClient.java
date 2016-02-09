package com.trustedbank;

import java.math.BigInteger;
import java.util.List;
import java.util.Iterator;
import java.util.Properties;
import java.io.FileInputStream;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.verisign.www._2006._08.vipservice.*;

public class VIPClient {

	private static final Log log = LogFactory.getLog(VIPClient.class); 
	private static Properties defaultProps = new Properties();

	private VipSoapInterfaceService service;
	private VipSoapInterface port;
	private String m_url;

	private static String version;
	private static String nonce;// can be unique per transaction – not used for now

	private static String SMSAcctId;
	private static String SMSAcctPwd;

	private static String certFile; 
	private static String certPassword;

	private static VIPClient vipClient = null;
	private static VIPClient vipClientsec = null;

	public static VIPClient getInstance() {
		try {
			FileInputStream in = new FileInputStream("/home/trustedbank/trustedBank.properties");
			defaultProps.load(in);
			in.close();
		} catch (Exception e) {
			log.error("VIPClient() Exception: " + e);
			return null;
		}

		version = defaultProps.getProperty("com.verisign.version");
		nonce = defaultProps.getProperty("com.verisign.nonce");
		SMSAcctId = defaultProps.getProperty("com.verisign.sms.id");
		SMSAcctPwd = defaultProps.getProperty("com.verisign.sms.password");

		String activeSystem = defaultProps.getProperty("com.verisign.active");
		// hard-code Pilot here
		// String activeSystem = "pilot";
		certFile = defaultProps.getProperty("com.verisign.webservice."+activeSystem+".cert.file");
		certPassword = defaultProps.getProperty("com.verisign.webservice."+activeSystem+".cert.password");
		String svcUrl = defaultProps.getProperty("com.verisign.webservice."+activeSystem+".url");

		if (vipClient == null) {
			vipClient = new VIPClient(svcUrl);
		}		
		return vipClient;            
	}

	private VIPClient(String url) {
		service = new VipSoapInterfaceServiceLocator();
		m_url = url;
		System.setProperty("javax.net.ssl.keyStoreType", "pkcs12");
		System.setProperty("javax.net.ssl.keyStore", certFile);
		System.setProperty("javax.net.ssl.keyStorePassword", certPassword);
	}

	public String getServerTime() {
		try {
			port = service.getvipServiceAPI(new java.net.URL(m_url
					+ "/prov/soap"));
			GetServerTimeType x = new GetServerTimeType(version, nonce);
			GetServerTimeResponseType resp = port.getServerTime(x);
			BigInteger reason = new BigInteger(resp.getStatus().getReasonCode());
			if (reason.intValue() != 0) {
				log.debug("Reason Code = " + reason.toString(16));
				log.debug("Message = "
						+ resp.getStatus().getStatusMessage());
				log.debug("Error Detail = "
						+ resp.getStatus().getErrorDetail());
				return null;
			} else {
				return (resp.getTimestamp().getTime().toString());
			}
		} catch (Exception e) {
			log.debug("getServerTime(), Exception : " + e);
			return null;
		}
	}

	public void GetTokenInformation(String TokenId) {
		try {
			port = service.getvipServiceAPI(new java.net.URL(m_url
					+ "/mgmt/soap"));
			GetTokenInformationType x = new GetTokenInformationType(version, nonce, null, 
					new TokenIdType(TokenId));
			GetTokenInformationResponseType resp = port.getTokenInformation(x);
			BigInteger reason = new BigInteger(resp.getStatus().getReasonCode());
			if (reason.intValue() != 0) {
				log.debug("Reason Code = " + reason.toString(16));
				log.debug("Message = "
						+ resp.getStatus().getStatusMessage());
				log.debug("Error Detail = "
						+ resp.getStatus().getErrorDetail());
			} else {
				TokenInformationType tokenInfo = resp.getTokenInformation();
				log.debug("Result = "
						+ resp.getStatus().getStatusMessage());
				log.debug("Token ID = " + tokenInfo.getTokenId());
				log.debug("Token Kind = " + tokenInfo.getTokenKind());
				log.debug("Adapter = " + tokenInfo.getAdapter());
				log.debug("Token Status = "
						+ tokenInfo.getTokenStatus());
				if (tokenInfo.getReportedReason() != null) {
					log.debug("  Reported Reason = "
							+ tokenInfo.getReportedReason());
				}
				log.debug("Expiration Date = "
						+ tokenInfo.getExpirationDate().getTime().toString());
				if (tokenInfo.getTempPasswordExpirationDate() != null)
					log.debug("Temp pwd expiration Date = "
							+ tokenInfo.getTempPasswordExpirationDate()
							.getTime().toString());
				System.out
				.println("Owner = " + tokenInfo.getOwner().toString());
				log.debug("Last update = "
						+ tokenInfo.getLastUpdate().getTime().toString());
				NetworkIntelligenceType ni = resp.getNetworkIntelligence();
				if (ni != null) {
					log.debug("Network Intelligence");
					log.debug("  Global failure count = "
							+ ni.getGlobalFailureCount());
					log.debug("  Number of parties = "
							+ ni.getNumberOfParties());
					for (int i = 0; i < ni.getTokenState().length; i++) {
						NetworkIntelligenceTypeTokenState state = ni
						.getTokenState(i);
						if (state.getReason() != null) {
							for (int j = 0; j < state.getReason().length; j++) {
								log.debug("    " + state.getType()
										+ ", " + state.getReason(j).getType()
										+ ": " + state.getTotal());
							}
						} else {
							log.debug("    " + state.getType() + ": "
									+ state.getTotal());
						}
					}

				}
			}
		} catch (Exception e) {
			log.debug("GetTokenInformation() Exception: " + e);
		}
	}

	public boolean ActivateToken(String tokenId, String otp1, String otp2, String type) throws Exception {
		try {
			port = service.getvipServiceAPI(new java.net.URL(m_url + "/mgmt/soap"));
			TokenIdType m = new TokenIdType(tokenId);

			if (type.equals("SMS")){
				m.setType(TokenType.SMS);
			}

			ActivateTokenType x = new ActivateTokenType(version, nonce, null, m, otp1, otp2);
			ActivateTokenResponseType resp = port.activateToken(x);

			BigInteger reason = new BigInteger(resp.getStatus().getReasonCode());
			if (reason.intValue() != 0) {
				log.debug("Activate CredentialId = " + tokenId + " with type: " + type + ": Failed");

				log.debug("Reason Code = " + reason.toString(16));
				log.debug("Message = " + resp.getStatus().getStatusMessage());
				log.debug("Error Detail = " + resp.getStatus().getErrorDetail());   
				return false;
			} else {
				log.debug("Activate CredentialId = " + tokenId + " with type: " + type + ": Success");
				if (resp.getSameInitialState()) {
					log.info("Note: credential was already activated");
				}        
				return true;
			}
		} catch (Exception e) {
			log.error("ActivateToken() Exception: " + e);
			throw e;
		}
	}

	public boolean DeactivateToken(String tokenId, String type) throws Exception {
		return DeactivateToken(tokenId, type, ReasonType.Unspecified);
	}

	public boolean DeactivateToken(String tokenId, String type, ReasonType deactReason) throws Exception {
		try {
			port = service.getvipServiceAPI(new java.net.URL(m_url+ "/mgmt/soap"));
			TokenIdType m = new TokenIdType(tokenId);

			if (type.equals("SMS")){
				m.setType(TokenType.SMS);
			}

			DeactivateTokenType x = new DeactivateTokenType(version, nonce, null, m, deactReason);
			DeactivateTokenResponseType resp = port.deactivateToken(x);

			BigInteger reason = new BigInteger(resp.getStatus().getReasonCode());
			if (reason.intValue() != 0) {
				log.debug("Deactivate CredentialId = " + tokenId + " with type: " + type + ": Failed");

				log.debug("Reason Code = " + reason.toString(16));
				log.debug("Message = "
						+ resp.getStatus().getStatusMessage());
				log.debug("Error Detail = "
						+ resp.getStatus().getErrorDetail());
				return false;
			} else {
				log.debug("Deactivate CredentialId = " + tokenId + " with type: " + type + ": Success");
				if (resp.getSameInitialState()) {
					log.info("Note: credential was already deactivated");
				}
				return true;
			}
		} catch (Exception e) {
			log.error("DectivateToken() Exception: " + e);
			throw e;
		}
	}

	public boolean Validate(String tokenId, String otp, boolean isSMS) throws Exception {
		try {
			port = service.getvipServiceAPI(new java.net.URL(m_url
					+ "/val/soap"));
			TokenIdType m = new TokenIdType(tokenId);
			if (isSMS) {
				m.setType(TokenType.SMS);
			}
			ValidateType x = new ValidateType(version, nonce, null, m,otp);
			ValidateResponseType resp = port.validate(x);

			BigInteger reason = new BigInteger(resp.getStatus().getReasonCode());
			if (reason.intValue() != 0) {
				log.debug("Validate TokenId = " + tokenId + ": Failed");
				log.debug("Reason Code = " + reason.toString(16));
				log.debug("Message = "
						+ resp.getStatus().getStatusMessage());
				log.debug("Error Detail = "
						+ resp.getStatus().getErrorDetail());
				return false;
			} else {
				log.debug("Validate TokenId = " + tokenId + ": Success");
				//if (resp.getNetworkAlert()) {
				//    log.info("VIP Network Alert on this credential");
				//}
				return true;
			}
		} catch (Exception e) {
			log.error("Validate() Exception: " + e);
			throw e;
		}
	}

	public boolean ValidateMultiple (List tokenIds, String otp) throws Exception {
		try {
			port = service.getvipServiceAPI(new java.net.URL(m_url
					+ "/val/soap"));
			TokenIdType[] m;

			Iterator it = tokenIds.iterator();
			int idx = 0;

			if(tokenIds.size() < 5){
				m = new TokenIdType[tokenIds.size()];
				while(it.hasNext()) {      
					m[idx] = new TokenIdType((String) it.next());
					idx++;
				}
			} else {
				return false;
			}

			ValidateMultipleType x = new ValidateMultipleType(version, nonce, null, m,otp, true);

			ValidateMultipleResponseType resp = port.validateMultiple(x);

			BigInteger reason = new BigInteger(resp.getStatus().getReasonCode());
			if (reason.intValue() != 0) {
				log.debug("ValidateMultiple TokenIds = " + tokenIds.toString() + ": Failed");
				log.debug("Reason Code = " + reason.toString(16));
				log.debug("Message = "
						+ resp.getStatus().getStatusMessage());
				log.debug("Error Detail = "
						+ resp.getStatus().getErrorDetail());
				return false;
			} else {
				log.debug("ValidateMultiple TokenIds = " + tokenIds.toString() + ": Success");
				return true;
			}
		} catch (Exception e) {
			log.error("Validate() Exception: " + e);
			throw e;
		}
	}    

	public boolean Synchronize(String tokenId, String otp1, String otp2) throws Exception {
		try {
			port = service.getvipServiceAPI(new java.net.URL(m_url
					+ "/val/soap"));
			SynchronizeType x = new SynchronizeType(version, nonce, null,
					new TokenIdType(tokenId), otp1, otp2);
			SynchronizeResponseType resp = port.synchronize(x);

			BigInteger reason = new BigInteger(resp.getStatus().getReasonCode());
			if (reason.intValue() != 0) {
				log.debug("Synchronize TokenId = " + tokenId + ": Failed");
				log.debug("Reason Code = " + reason.toString(16));
				log.debug("Message = "
						+ resp.getStatus().getStatusMessage());
				log.debug("Error Detail = "
						+ resp.getStatus().getErrorDetail());
				return false;
			} else {
				log.debug("Synchronize TokenId = " + tokenId + ": Success");
				return true;
			}
		} catch (Exception e) {
			log.error("Synchronize() Exception: " + e);
			throw e;
		}
	}

	public void UnlockToken(String tokenId) throws Exception {
		try {
			port = service.getvipServiceAPI(new java.net.URL(m_url
					+ "/mgmt/soap"));
			UnlockTokenType x = new UnlockTokenType(version, nonce, null, 
					new TokenIdType(tokenId));
			UnlockTokenResponseType resp = port.unlockToken(x);

			BigInteger reason = new BigInteger(resp.getStatus().getReasonCode());
			if (reason.intValue() != 0) {
				log.debug("Unlock TokenId = " + tokenId + ": Failed");
				log.debug("Reason Code = " + reason.toString(16));
				log.debug("Message = "
						+ resp.getStatus().getStatusMessage());
				log.debug("Error Detail = "
						+ resp.getStatus().getErrorDetail());
			} else {
				log.debug("Unlock TokenId = " + tokenId + ": Success");
				if (resp.getSameInitialState()) {
					log.debug("Note: credential was already unlocked");
				}
			}
		} catch (Exception e) {
			log.error("UnlockToken() Exception: " + e);
			throw e;
		}
	}

	public boolean RegisterPhone(String phoneId) throws Exception {
		try {
			port = service.getvipServiceAPI(new java.net.URL(m_url + "/prov/soap"));
			//SMSDeliveryInfoType t = new SMSDeliveryInfoType("46847","This is the registration message. Use this OTP to activate _OTP_");
			SMSDeliveryInfoType t = new SMSDeliveryInfoType();
			TokenIdType m = new TokenIdType(phoneId);
			m.setType(TokenType.SMS);
			RegisterType x = new RegisterType(version, nonce, null, m , true, null, null);
			RegisterResponseType resp = port.register(x);

			BigInteger reason = new BigInteger(resp.getStatus().getReasonCode());
			if (reason.intValue() != 0) {
				if (reason.toString(16).equals("4e1b")) {
					log.debug("Register Phone = " + phoneId + ": Failed");
					log.debug("Reason Code = " + reason.toString(16));
					log.debug("Message = " + resp.getStatus().getStatusMessage()+". Continue!");
					this.deliverSMS(phoneId);
					return true;
				} else {
					log.debug("Register Phone = " + phoneId + ": Failed");
					log.debug("Reason Code = " + reason.toString(16));
					log.debug("Message = " + resp.getStatus().getStatusMessage());
					log.debug("Error Detail = " + resp.getStatus().getErrorDetail());   
					return false;
				}

			} else {
				log.debug("Register Phone = " + phoneId + ": Success");        
				return true;
			}
		} catch (Exception e) {
			log.error("RegisterPhone() Exception: " + e);
			throw e;
		}
	}

	public boolean deliverSMS(String phoneId) throws Exception {
		try {
			port = service.getvipServiceAPI(new java.net.URL(m_url + "/val/soap"));
			SMSDeliveryInfoType t = new SMSDeliveryInfoType("46847","This is a login code from TrustedBank: _OTP_");
			TokenIdType m = new TokenIdType(phoneId);
			m.setType(TokenType.SMS);
			SendOTPType x = new SendOTPType(version, nonce, null, m,t, null);
			SendOTPResponseType resp = port.sendOTP(x);

			BigInteger reason = new BigInteger(resp.getStatus().getReasonCode());
			if (reason.intValue() != 0) {
				log.debug("DeliverOTP Phone = " + phoneId + ": Failed");

				log.debug("Reason Code = " + reason.toString(16));
				log.debug("Message = " + resp.getStatus().getStatusMessage());
				log.debug("Error Detail = " + resp.getStatus().getErrorDetail());   
				return false;
			} else {
				log.debug("DeliverOTP to Phone = " + phoneId + ": Success");        
				return true;
			}
		} catch (Exception e) {
			log.error("DeliverOTP() Exception: " + e);
			throw e;
		}
	}

	public boolean sendSMSTemporaryPassword(String tokenId, String phoneId) throws Exception {
		try {
			port = service.getvipServiceAPI(new java.net.URL(m_url + "/mgmt/soap"));
			TokenIdType m = new TokenIdType(tokenId);
			GatewayAcctInfoType g = new GatewayAcctInfoType(SMSAcctId,SMSAcctPwd);
			SMSDeliveryInfoType t = new SMSDeliveryInfoType("46847","This is a temporary login code from TrustedBank: _OTP_");

			SendTemporaryPasswordType x = new SendTemporaryPasswordType(
					version,
					nonce, 
					null, 
					m, 
					phoneId, 
					null, 
					g, 
					null,
					t, 
					null
			);

			SendTemporaryPasswordResponseType resp = port.sendTemporaryPassword(x);

			BigInteger reason = new BigInteger(resp.getStatus().getReasonCode());
			if (reason.intValue() != 0) {
				log.debug("SendSMSTempPassword to Phone = " + phoneId + ": Failed");

				log.debug("Reason Code = " + reason.toString(16));
				log.debug("Message = " + resp.getStatus().getStatusMessage());
				log.debug("Error Detail = " + resp.getStatus().getErrorDetail());   
				return false;
			} else {
				log.debug("SendSMSTempPassword to Phone = " + phoneId + ": Success");        
				return true;
			}
		} catch (Exception e) {
			log.error("SendTempPassword() Exception: " + e);
			throw e;
		}
	}

	public boolean sendVoiceTemporaryPassword(String tokenId, String phoneId) throws Exception {
		try {
			port = service.getvipServiceAPI(new java.net.URL(m_url + "/mgmt/soap"));
			TokenIdType m = new TokenIdType(tokenId);
			AuthentifyVoiceDeliveryInfoType aInfo = new AuthentifyVoiceDeliveryInfoType();
			VoiceDeliveryInfoType v = new VoiceDeliveryInfoType();
			v.setDeliveryInfoForVendor(aInfo);
			DestinationType d = new DestinationType(phoneId);
			d.setType(TokenType.Voice);

			SendTemporaryPasswordType x = new SendTemporaryPasswordType(
					version,
					nonce, 
					null, 
					m, 
					null, 
					d, 
					null, 
					null,
					null, 
					null
			);
			SendTemporaryPasswordResponseType resp = port.sendTemporaryPassword(x);

			BigInteger reason = new BigInteger(resp.getStatus().getReasonCode());
			if (reason.intValue() != 0) {
				log.debug("SendVoiceTempPassword to Phone = " + phoneId + ": Failed");

				log.debug("Reason Code = " + reason.toString(16));
				log.debug("Message = " + resp.getStatus().getStatusMessage());
				log.debug("Error Detail = " + resp.getStatus().getErrorDetail());   
				return false;
			} else {
				log.debug("SendVoiceTempPassword to Phone = " + phoneId + ": Success");        
				return true;
			}
		} catch (Exception e) {
			log.error("SendVoiceTempPassword() Exception: " + e);
			throw e;
		}
	}

	/**
	 * Method to send a voice transaction verification request. 
	 * Verification OTP is returned for display.
	 * The request is submitted and polled for success/failure.
	 * @param
	 * @return txnOTP, txnId
	 */
	public String[] sendTxnVerif(String phoneId, String account, String amount, String fraction) throws Exception {
		String voiceTemplate = new String("PaymentVerify");
		String language = new String("en-us");
		String currency = new String("USD");
		String[] txnDetails = new String[2];
		txnDetails[0] = null;
		txnDetails[1] = null;

		port = service.getvipServiceAPI(new java.net.URL(m_url + "/txn/soap"));

		NameValuePairType accountEnd = new NameValuePairType(account);
		accountEnd.setName("accountEndsWith");

		NameValuePairType amountInteger = new NameValuePairType(amount);
		amountInteger.setName("amount");        

		NameValuePairType amountFraction = new NameValuePairType(fraction);
		amountFraction.setName("fraction");

		NameValuePairType currencyName = new NameValuePairType(currency);
		currencyName.setName("currency");

		NameValuePairType[] params = new NameValuePairType[4];
		params[0] = accountEnd;
		params[1] = amountInteger;
		params[2] = amountFraction;
		params[3] = currencyName;

		try {			
			SubmitTxnVerificationType tx = new SubmitTxnVerificationType(
					version,
					nonce, 
					null, 
					phoneId,
					null,
					language,
					voiceTemplate,
					params
			);
			SubmitTxnVerificationResponseType resp = port.submitTxnVerification(tx);
			BigInteger reason = new BigInteger(resp.getStatus().getReasonCode());
			if (reason.intValue() != 0) {
				log.debug("sendTxnVerificaton URL = " + m_url);
				log.debug("sendTxnVerification to Phone = " + phoneId + ": Failed");
				log.debug("Reason Code = " + reason.toString(16));
				log.debug("Message = " + resp.getStatus().getStatusMessage());
				log.debug("Error Detail = " + resp.getStatus().getErrorDetail());
			} else {
				log.debug("SendTxnVerificaton URL = " + m_url);
				log.debug("SendTxnVerification to Phone = " + phoneId + ": Success");
				txnDetails[0] = resp.getTxnOTP();
				txnDetails[1] = resp.getTxnId();
			}
		} catch (Exception e) {
			log.debug("SendTxnVerification() Exception: " + e);
			throw e;
		} 
		return txnDetails;
	}

	/**
	 * Method to poll for the status of voice transaction verification request. 
	 * The request is previously submitted and polled for success/failure.
	 * Requires transaction_id (returned by sendTxnVerif() method)
	 * @param
	 * @return boolean
	 */
	public boolean pollTxnVerif(String id) throws Exception {
		port = service.getvipServiceAPI(new java.net.URL(m_url + "/txn/soap"));
		
		try {			
			PollTxnVerificationType txv = new PollTxnVerificationType(
					version,
					nonce, 
					null, 
					id
			);
			PollTxnVerificationResponseType resp = port.pollTxnVerification(txv);
			BigInteger reason = new BigInteger(resp.getStatus().getReasonCode());
			if (reason.intValue() != 0) {
				log.debug("pollTxnVerificaton URL = " + m_url);
				log.debug("pollTxnVerif for transaction = " + id + ": Failed");
				log.debug("Reason Code = " + reason.toString(16));
				log.debug("Message = " + resp.getStatus().getStatusMessage());
				log.debug("Error Detail = " + resp.getStatus().getErrorDetail());
				return false;
			} else {
				log.debug("pollTxnVerificaton URL = " + m_url);
				log.debug("pollTxnVerif for transaction = " + id + ": Success");
				return true;
			}
		} catch (Exception e) {
			log.debug("pollTxnVerif() Exception: " + e);
			throw e;
		} 
	}

	/**
	 * Method to send a voice transaction verification request. 
	 * Verification OTP is automatically sent via SMS.
	 * The request is submitted and polled for success/failure.
	 * @param
	 * @return txnId
	 */
	public boolean sendSMSTxnVerif(String phoneId) throws Exception {
		try {
			port = service.getvipServiceAPI(new java.net.URL(m_url + "/txn/soap"));
			//SMSDeliveryInfoType t = new SMSDeliveryInfoType("46847","This is a login code from TrustedBank: _OTP_");
			SMSDeliveryInfoType t = new SMSDeliveryInfoType();
			
			DestinationType m = new DestinationType(phoneId);
			m.setType(TokenType.SMS);
			
			DeliverTxnOTPType x = new DeliverTxnOTPType(
						version, 
						nonce, 
						null,
						null,
						m,
						t, 
						null);
			
			DeliverTxnOTPResponseType resp = port.deliverTxnOTP(x);

			BigInteger reason = new BigInteger(resp.getStatus().getReasonCode());
			if (reason.intValue() != 0) {
				log.debug("sendSMSTxnVerif Phone = " + phoneId + ": Failed");

				log.debug("Reason Code = " + reason.toString(16));
				log.debug("Message = " + resp.getStatus().getStatusMessage());
				log.debug("Error Detail = " + resp.getStatus().getErrorDetail());   
				return false;
			} else {
				log.debug("sendSMSTxnVerif to Phone = " + phoneId + ": Success");        
				return true;
			}
		} catch (Exception e) {
			log.error("sendSMSTxnVerif() Exception: " + e);
			throw e;
		}
	}
	
	/**
	 * Method to poll for the status of SMS transaction verification request. 
	 * The request is previously submitted and polled for success/failure.
	 * Requires transaction_id and OTP (returned by sendSMSTxnVerif() method)
	 * @param
	 * @return boolean
	 */

}
