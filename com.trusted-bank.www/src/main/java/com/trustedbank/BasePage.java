package com.trustedbank;

import wicket.markup.html.WebPage;
import wicket.markup.html.basic.Label;

import com.trustedbank.store.TokenStorage;

/**
 * Base class for all pages in the BizyBank application. Any page which
 * subclasses this page can get session properties from BizyBankSession via
 * getBizyBankSession().
 */
public abstract class BasePage extends WebPage {
	public BasePage() {
		add(new Label("title", "Trusted Bank"));

		add(new Header("header"));
		add(new Footer("footer"));

        add( new DemoFooterPanel( "demoFooter" ).setVisible( false ) );
	}

	/**
	 * Get downcast session object for easy access by subclasses
	 * 
	 * @return The session
	 */
	public TrustedBankSession getTrustedBankSession()
	{
		return (TrustedBankSession)getSession();
	}

	/**
	 * Get storage object for easy access by subclasses
	 * 
	 * @return The storage
	 */
	public TokenStorage getTokenStore()
	{
		return ((TrustedBankApplication)getApplication()).getTokenStore();
	}
}
