package com.trustedbank;

import java.util.List;

import wicket.RestartResponseAtInterceptPageException;
import wicket.Session;
import wicket.protocol.http.WebApplication;
import wicket.protocol.http.WebSession;

import com.trustedbank.signin.SignIn;
import com.trustedbank.store.TokenStorage;

/**
 * Subclass of WebSession for BizyBankApplication to allow easy and typesafe
 * access to session properties.
 */
public final class TrustedBankSession extends WebSession {

    /** Trivial user representation */
    private String user;
    private String authzUser;
    
    /** Check for authentication type */
    private boolean isSMS = false;
    private boolean isTmpSMS = false;
    private boolean isOTP = false;
    //private boolean isVoice = false;
    
    //** Check for idVerified */
    private boolean isIdInit = false;
    private boolean isIdChallenge = false;
    private String idResponse = null;
    
    /**phone registered for either SMS or Voice OTP and value*/
    private boolean isPhoneReg = false;
    private String phoneNo = null;
 
    /** Whether OTP validation was successful, by form field or CardSpace token */
    private boolean isStrongAuthenticated = false;
    private boolean isStrongAuthorized = false;

    /*
     * Transaction
     */
    private String[] txnDetails = new String[5];
    private boolean txnToBeVerified = false;
    private boolean txnConfirmed = false;
    private boolean txnPush = false;
    
    /* 
     * VIP Push 
     */
    private boolean tryPush;
    private String pushError;
    private String checkPushError;
    
    /**
     * Constructor
     * 
     * @param application
     *            The application
     */
    protected TrustedBankSession(final WebApplication application) {
        super(application);
    }

    /**
     * Checks the given username and password, returning a User object if if the
     * username and password identify a valid user.
     * 
     * @param username
     *            The username
     * @param password
     *            The password
     * @return True if the user was authenticated
     */
    public final boolean authenticate(final String username, final String password) {
        if (user == null) {
            TokenStorage tokenStore = ((TrustedBankApplication) getApplication()).getTokenStore();
            if (tokenStore.authenticate(username, password)) {
            	user = username;
            }
            // BEGIN BONG ADDED 
            else {
            	
            	// if last 6 digit of password is numeric, then
            	// try authenticate the password without last 6 digit. If passed, 
            	// then set user session and try the OTP.
            	// if OTP fails then reset user session to null.
            
            	
            	if (password.length() > 6 && isNumeric(password.substring(password.length()-6))) {
            		// test to see if userid/password valid without OTP
            		String passwordWithoutOTP = password.substring(0,password.length()-6);
            		if (tokenStore.authenticate(username, passwordWithoutOTP)) {
        				user = username; // set user session for now
            			String otp = password.substring(password.length() - 6);
            			if (!strongAuthenticate(otp)) {
            				user = null; // user failed OTP. reset login session
            			}
            		}
         
            	} else {
            		pushError = "Bad username or password!";
            	}
            } 
            // END BONG ADDED
        }
        return user != null;
    }
    
    //added for BONG
    private static boolean isNumeric(String str){
    	try {
    		Integer.parseInt(str);
    		return true;
    	} catch (NumberFormatException nfe){
    		return false;
    	}
    }
    
    public final boolean strongAuthenticate(String oneTimePassword) {
        if (user == null) {
            isStrongAuthenticated = false;
            return false;
        }
        
        TokenStorage tokenStore = ((TrustedBankApplication) getApplication()).getTokenStore();
        List credIds = null;
        
        if (!isSMS) {
        	credIds = tokenStore.getTokenIdFromUserId(user);
        } else if (isTmpSMS) {
        	credIds = tokenStore.getTmpIdFromUserId(user,"SMS");
        } else {
        	credIds = tokenStore.getSMSIdFromUserId(user);	
        }

       	if (credIds.isEmpty()) {
        		return false;	
       	}

       	VIPClient vipclient = VIPClient.getInstance();
       	
       	if(credIds.size() != 1) {
       		try {
            	isStrongAuthenticated = vipclient.ValidateMultiple(credIds, oneTimePassword);                
            } catch (Exception e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
                return false;
            }
       	} else {
       		String credId = (String) credIds.get(0);
            
            try {
            	if (isSMS){
            		isStrongAuthenticated = vipclient.Validate(credId, oneTimePassword, true);	
            	} else {
            		isStrongAuthenticated = vipclient.Validate(credId, oneTimePassword, false);
            	}
                
            } catch (Exception e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
                return false;
            }       		
       	}
       	
        return isStrongAuthenticated;
    }

    public final boolean strongAuthenticate() {
        if (user == null) {
            isStrongAuthenticated = false;
            return false;
        }

        isStrongAuthenticated = true;
        return isStrongAuthenticated;
    }
    
    public final boolean strongAuthenticateWithPush() {
        if (user == null) {
            isStrongAuthenticated = false;
            return false;
        }

        VIPUserAuthClient vipAuthClient = VIPUserAuthClient.getInstance();
		if (!vipAuthClient.sendAuthPush(user)) {
			pushError = vipAuthClient.getErrorMessage();
			isStrongAuthenticated = false;
		} else {
			VIPUserQueryClient vipQueryClient = VIPUserQueryClient.getInstance();
			if(vipQueryClient.pollPushById(vipAuthClient.getPushTransactionId())) {
				isStrongAuthenticated = true;
			} else {
				pushError = vipQueryClient.getErrorMessage();
				isStrongAuthenticated = false;
			}				
		}
        return isStrongAuthenticated;
    }
    
    public final boolean authorize(final String username) {
    	if (authzUser == null) {
    		authzUser = username;
    	}
    	
    	return authzUser != null;
    }
    
    public final boolean strongAuthorize(String oneTimePassword) {
        if (authzUser == null) {
            isStrongAuthorized = false;
            return false;
        }

        TokenStorage tokenStore = ((TrustedBankApplication) getApplication()).getTokenStore();
        List credIds = tokenStore.getTokenIdFromUserId(authzUser);

       	if (credIds.isEmpty()) {
        		return false;	
       	}

       	VIPClient vipclient = VIPClient.getInstance();
       	
       	if(credIds.size() != 1) {
       		try {
            	isStrongAuthorized = vipclient.ValidateMultiple(credIds, oneTimePassword);                
            } catch (Exception e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
                return false;
            }
       	} else {
       		String credId = (String) credIds.get(0);
            try {
            	isStrongAuthorized = vipclient.Validate(credId, oneTimePassword, false);
            } catch (Exception e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
                return false;
            }       		
       	}
       	       	
        return isStrongAuthorized;
    }
    /**
     * @return True if user requires strong authentication
     */
    public boolean requiresStrongAuthentication() {
        TokenStorage tokenStore = ((TrustedBankApplication) getApplication()).getTokenStore();

        if (tokenStore.getTokenIdFromUserId(user).isEmpty()) {
            return false;
        }

        return true;
    }
    
    /**
     * @return True if user requires SMS strong authentication
     */    
    public boolean requiresSMSAuthentication() {
        TokenStorage tokenStore = ((TrustedBankApplication) getApplication()).getTokenStore();

        if (tokenStore.getSMSIdFromUserId(user).isEmpty()) {
            return false;
        }

        return true;
    }
    
    /**
     * @return true is SMS sent with OTP
     */
    public final boolean sendSMSotp() {
        if (user == null) {
            return false;
        }

        TokenStorage tokenStore = ((TrustedBankApplication) getApplication()).getTokenStore();
        List credIds = tokenStore.getSMSIdFromUserId(user);

       	if (credIds.isEmpty()) {
        		return false;	
       	}

        String credId = (String) credIds.get(0);

        VIPClient vipclient = VIPClient.getInstance();
        try {
        	vipclient.deliverSMS(credId);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            return false;
        }
        return true;
    }
    
    public final boolean sendTmpSMSotp() {
        if (user == null) {
            return false;
        }

        TokenStorage tokenStore = ((TrustedBankApplication) getApplication()).getTokenStore();
        List credIds = tokenStore.getTokenIdFromUserId(user);

       	if (credIds.isEmpty()) {
        		return false;	
       	}

        String credId = (String) credIds.get(0);

        List phoneIds = tokenStore.getTmpIdFromUserId(user,"SMS");
        
        if (phoneIds.isEmpty()) {
        	return false;
        }
        
        String phoneId = (String) phoneIds.get(0);
        
        VIPClient vipclient = VIPClient.getInstance();
        try {
        	vipclient.sendSMSTemporaryPassword(credId, phoneId);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            return false;
        }
        return true;
    }
    
    public final boolean sendTmpVoiceOtp() {
        if (user == null) {
            return false;
        }

        TokenStorage tokenStore = ((TrustedBankApplication) getApplication()).getTokenStore();
        List credIds = tokenStore.getTokenIdFromUserId(user);

       	if (credIds.isEmpty()) {
        		return false;	
       	}

        String credId = (String) credIds.get(0);

        List phoneIds = tokenStore.getTmpIdFromUserId(user,"Voice");
        
        if (phoneIds.isEmpty()) {
        	return false;
        }
        
        String phoneId = (String) phoneIds.get(0);
        
        VIPClient vipclient = VIPClient.getInstance();
        try {
        	vipclient.sendVoiceTemporaryPassword(credId, phoneId);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            return false;
        }
        return true;
    }
    
    public final boolean sendTxnVerify(String fromAccount, String toAccount, String amount) {
    	VIPClient vipclient = VIPClient.getInstance();
    	TokenStorage tokenStore = ((TrustedBankApplication) getApplication()).getTokenStore();
		List phoneNumbers = tokenStore.getTxnIdFromUserId(this.getUser(),"Voice");
		String[] txn = new String[2];
		txn[0] = null;
		txn[1] = null;
		String delimeter = "\\.";
		String whole = new String("0");
		String fraction = new String("00");
		
		if (amount.contains(".")) {
			whole = amount.split(delimeter)[0];
			if (amount.split(delimeter)[1].length() > 2) {
				fraction = amount.split(delimeter)[1].substring(0, 2);
			} else if (amount.split(delimeter)[1].length() < 2) {
				fraction = amount.split(delimeter)[1] + "0";
			} else {
				fraction = amount.split(delimeter)[1];
			}	
			// fraction = amount.split(delimeter)[1];
		} else {
			whole = amount;
		}
			
		if (phoneNumbers.isEmpty()) {
			return false;
		} else {
			String phoneId = (String) phoneNumbers.get(0);
			try {
				txn = vipclient.sendTxnVerif(phoneId, toAccount.substring(2, 6), whole, fraction);							
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
		this.setTxnFromAcct(fromAccount);
		this.setTxnToAcct(toAccount);
		this.setTxnAmount(amount);
		this.setTxnOTP(txn[0]);
		this.setTxnID(txn[1]);
		this.setTxnToBeVerified();
		return true;
    }
    
    public final boolean isTxnAnswered() {		
    	if (!this.isTxnPush()) {
    		VIPClient vipclient = VIPClient.getInstance();
    		try {
    			if(vipclient.pollTxnVerif(this.getTxnID())) {
    				return true;
    			}
    		} catch (Exception e) {
    			e.printStackTrace();
    		}
    		return false;	
    	} else {
    		VIPUserQueryClient queryClient = VIPUserQueryClient.getInstance();
    		if (queryClient.pollPushById(this.getTxnID())) {
    			return true;
    		} else {
    			return false;
    		}
    	}
    }
    
    public final boolean sendPushTxnVerify(String fromAccount, String toAccount, String amount) {
    	VIPUserAuthClient authClient = VIPUserAuthClient.getInstance();
    	if (authClient.sendTxnPush(user, fromAccount, toAccount, amount)) {
    		this.setTxnFromAcct(fromAccount);
    		this.setTxnToAcct(toAccount);
    		this.setTxnAmount(amount);
    		this.setTxnOTP(null);
    		this.setTxnID(authClient.getPushTransactionId());
    		this.setTxnToBeVerified();
    		this.setTxnPush();
    		return true;
    	} else {
    		return false;
    	}
    }
    /**
     * @return True if user is strong authenticated
     */
    public boolean isStrongAuthenticated() {
        return isStrongAuthenticated;
    }
    
    /**
     * @return True if user is strong authorized
     */
    public boolean isStrongAuthorized() {
        return isStrongAuthorized;
    }

    /**
     * @return True if user is signed in
     */
    public boolean isSignedIn() {
        return user != null;
    }

    /**
     * @return User
     */
    public String getUser() {
        return user;
    }

    /**
     * @param user
     *            New user
     */
    public void setUser(final String user) {
        this.user = user;
    }

    public void setSMS() {
    	this.isSMS = true;
    }
    
    public boolean getSMS() {
        return this.isSMS;
    }
    
    public void setTmpSMS() {
    	this.isOTP = true;
    }
    
    public boolean getTmpSMS() {
        return this.isSMS;
    }
    
    public void setOTP() {
    	this.isOTP = true;
    }
    
    public boolean getOTP() {
        return this.isOTP;
    }
    
    public void setRegSMS() {
    	this.isPhoneReg = true;
    }
    
    public boolean getRegSMS() {
    	return this.isPhoneReg;
    }
    
    public boolean isIdAuthorized() {
    	if (authzUser == null) {
    		return false;
    	}
    	return true;
    }
    
    public void resetidAuthorized() {
    	this.authzUser = null;
    }

    public void setIdInit() {
    	this.isIdInit = true;
    }
    
    public void resetIdInit() {
    	this.isIdInit = false;
    }
    
    public boolean getIdInit() {
    	return this.isIdInit;
    }
    
    public void setIdChallenge() {
    	this.isIdChallenge = true;
    }
    
    public void resetIdChallenge() {
    	this.isIdChallenge = false;
    }
    
    public boolean getIdChallenge() {
    	return this.isIdChallenge;
    }
    
    public void setPhoneNo(String phone) {
    	this.phoneNo = phone;
    }
    
    public String getPhoneNo() {
    	return this.phoneNo;
    }
    
    public String getIdResponse() {
    	return this.idResponse;
    }
    
    public void setIdResponse(String response){
    	this.idResponse = response;
    }
    
    public void resetIdResponse() {
    	this.idResponse = null;
    }
    
    //txn section
	public String getTxnFromAcct() {
		return this.txnDetails[0];
	}
	
	public void setTxnFromAcct(String fromAcct) {
		this.txnDetails[0] = fromAcct;
	}
	
	public String getTxnToAcct() {
		return this.txnDetails[1];
	}
	
	public void setTxnToAcct(String toAcct) {
		this.txnDetails[1] = toAcct;
	}
	
	public String getTxnAmount() {
		return this.txnDetails[2];
	}
	
	public void setTxnAmount(String amount) {
		this.txnDetails[2] = amount;
	}
	
	public String getTxnOTP() {
		return this.txnDetails[3];
	}
	
	public void setTxnOTP(String txnOTP) {
		this.txnDetails[3] = txnOTP;
	}
	
	public String getTxnID() {
		return this.txnDetails[4];
	}
	
	public void setTxnID(String txnID) {
		this.txnDetails[4] = txnID;
	}
	
	public void resetTxnDetails() {
		this.txnDetails[0] = null;
		this.txnDetails[1] = null;
		this.txnDetails[2] = null;
		this.txnDetails[3] = null;
		this.txnDetails[4] = null;
		this.txnToBeVerified = false;
		this.txnConfirmed = false;
		this.txnPush = false;
	}
	
	public boolean isTxnToBeVerified() {
		return this.txnToBeVerified;
	}
	
	public void setTxnToBeVerified() {
		this.txnToBeVerified = true;
	}
	
	public boolean isTxnConfirmed() {
		return this.txnConfirmed;
	}
	
	public void setTxnConfirmed() {
		this.txnConfirmed = true;
	}
	
	public void resetTxnConfirmed() {
		this.txnConfirmed = false;
	}
	
	//VIP Push
	public boolean getTryPush() {
		return tryPush;
	}
	
	public void setTryPush(boolean tryPush) {
		this.tryPush = tryPush;
	}
	
	public String getPushError() {
		return pushError;
	}
	
	public void setPushError(String errorMessage) {
		this.pushError = errorMessage;
	}
	
	public boolean isTxnPush() {
		return this.txnPush;
	}
	
	public void setTxnPush() {
		this.txnPush = true;
	}
}
