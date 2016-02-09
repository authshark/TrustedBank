package com.trustedbank;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import wicket.Component;
import wicket.ISessionFactory;
import wicket.RestartResponseAtInterceptPageException;
import wicket.Session;
import wicket.authorization.Action;
import wicket.authorization.IAuthorizationStrategy;
import wicket.protocol.http.WebApplication;
import wicket.protocol.http.request.CryptedUrlWebRequestCodingStrategy;
import wicket.protocol.http.request.WebRequestCodingStrategy;
import wicket.request.IRequestCycleProcessor;
import wicket.request.compound.CompoundRequestCycleProcessor;

import com.trustedbank.login.LoginPage;
import com.trustedbank.push.TryPush;
import com.trustedbank.signin.SignIn;
import com.trustedbank.store.TokenStorage;
import com.trustedbank.store.TokenStorageEmbeddedDBImpl;

/**
 * Application object for your web application. If you want to run this application without deploying, run the Start class.
 * 
 * @see com.trustedbank.TrustedBankStart#main(String[])
 */
public class TrustedBankApplication extends WebApplication
{    
	/** Logging */
	private static final Log log = LogFactory.getLog(TrustedBankApplication.class);
	
	private TokenStorage tokenStore = new TokenStorageEmbeddedDBImpl();
	
    /**
     * Constructor
     */
	public TrustedBankApplication()
	{
		// getWicketServlet().getInitParameter(arg0);
	}
	
	protected void init()
	{
		super.init();

		getSecuritySettings().setAuthorizationStrategy(new IAuthorizationStrategy()
		{
			public boolean isActionAuthorized(Component component, Action action)
			{
				return true;
			}

			public boolean isInstantiationAuthorized(Class componentClass)
			{
				if (PrivatePage.class.isAssignableFrom(componentClass))
				{
					// Is user signed in?
					if (!((TrustedBankSession)Session.get()).isSignedIn())
					{
						// Force sign in
						throw new RestartResponseAtInterceptPageException(SignIn.class);
					}
					
					// Is user strong authenticated?
					if (!((TrustedBankSession)Session.get()).isStrongAuthenticated())
					{
						// Does user require strong authentication?
						if (((TrustedBankSession)Session.get()).requiresStrongAuthentication()) {
							//is Push selected
							if(((TrustedBankSession)Session.get()).getTryPush()) {
								// Force strong authentication with Push 
								throw new RestartResponseAtInterceptPageException(TryPush.class);	
							} else  {
								if (!((TrustedBankSession)Session.get()).requiresSMSAuthentication()) { // Does user also have SMS OTP ?
									// if not, set the OTP flag
									((TrustedBankSession)Session.get()).setOTP();	
								}
								throw new RestartResponseAtInterceptPageException(EnterOtp.class);
							}
						} else {
							if (((TrustedBankSession)Session.get()).requiresSMSAuthentication()) {
								// set SMS flag
								((TrustedBankSession)Session.get()).setSMS();
								// Force strong authentication
								throw new RestartResponseAtInterceptPageException(EnterOtp.class);
							}
						}
					}
				}
				return true;
			}
		});

		tokenStore.startup();
		mountBookmarkablePage( "/login", LoginPage.class );
	}
	
	/**
	 * @see wicket.Application#getHomePage()
	 */
	public Class getHomePage()
	{
		return Home.class;
	}

    /**
     * @see wicket.protocol.http.WebApplication#getSessionFactory()
     */
    public ISessionFactory getSessionFactory()
    {
        return new ISessionFactory()
        {        	
			public Session newSession()
            {
                return new TrustedBankSession(TrustedBankApplication.this);
            }
        };
    }

	/**
	 * @see wicket.protocol.http.WebApplication#newRequestCycleProcessor()
	 */
	protected IRequestCycleProcessor newRequestCycleProcessor()
	{
		return new CompoundRequestCycleProcessor(
				new CryptedUrlWebRequestCodingStrategy(new WebRequestCodingStrategy()),
				null, null, null, null);
	}
	
	/**
	 * @return token database
	 */
	public TokenStorage getTokenStore()
	{
		return tokenStore;
	}
}
