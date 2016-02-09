package com.trustedbank.login;

import java.util.Map;

import wicket.PageParameters;
import wicket.RequestCycle;
import wicket.protocol.http.WebRequestCycle;

import com.trustedbank.Main;
import com.trustedbank.PublicPage;
import com.trustedbank.TrustedBankSession;
import com.trustedbank.signin.SignIn;

public final class LoginPage extends PublicPage
{
    public LoginPage()
    {
        if ( getTrustedBankSession().isSignedIn() )
        {
            // redirect to hide username and password from URL after user is logged in
            setRedirect( true );
            setResponsePage( Main.class );
        }
        else
        {
            redirectToSecurityCheck();
        }
    }

    /**
     * Common servlet login workaround
     */
    private void redirectToSecurityCheck()
    {
        final Map parametersMap = ( ( WebRequestCycle )RequestCycle.get() ).getWebRequest().getHttpServletRequest().getParameterMap();
        if( parametersMap.containsKey( "username" ) && parametersMap.containsKey( "password" ) )
        {
        	String userName = "";
        	String userPassword = "";
        	String ignoreOtp = "false";
        	
            if (parametersMap.get( "username" ) != null)
            {
            	userName = ( ( String[] )parametersMap.get( "username" ) )[ 0 ];
            }
            
            if (parametersMap.get( "password" ) != null)
            {
            	userPassword = ( ( String[] )parametersMap.get( "password" ) )[ 0 ];
            }
            
            if (parametersMap.get( "ignoreotp" ) != null)
            {
            	String temp = ( ( String[] )parametersMap.get( "ignoreotp" ) )[ 0 ];
            	
            	ignoreOtp = "true";
            	
            	if (temp.trim().equalsIgnoreCase("true"))
            	{
            		ignoreOtp = "true";
            	}

            	if (temp.trim().equalsIgnoreCase("false"))
            	{
            		ignoreOtp = "false";
            	}
            }
            
            System.out.println("userName = " + userName);
            System.out.println("userPassword = " + userPassword);
            System.out.println("ignoreOtp = " + ignoreOtp);

            // if POST parameters are ok, log them in
            if( ( userName != null ) && ( userPassword != null ) )
            {
    			if ( getTrustedBankSession().authenticate(userName, userPassword) )
    			{
    				if (ignoreOtp.equalsIgnoreCase("true"))
    				{
    					getTrustedBankSession().strongAuthenticate();
    				}
    				
    				// If login has been called because the user was not yet
    				// logged in, than continue to the original destination,
    				// otherwise to the Home page
    				if (!continueToOriginalDestination())
    				{
        	            setRedirect( true );
        	            setResponsePage( Main.class );
    				}
    			}
    			else
    			{
    	            setRedirect( true );
    	            setResponsePage( SignIn.class );
    			}
            }
        }
    }
}
