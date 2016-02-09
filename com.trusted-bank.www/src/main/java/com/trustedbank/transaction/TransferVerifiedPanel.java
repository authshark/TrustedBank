package com.trustedbank.transaction;

import wicket.PageParameters;
import wicket.markup.html.basic.Label;
import wicket.markup.html.form.Form;
import wicket.markup.html.panel.FeedbackPanel;
import wicket.markup.html.panel.Panel;

public abstract class TransferVerifiedPanel extends Panel {
	/**
	 * @param id
	 *            See Component constructor
	 * @param includeRememberMe
	 *            True if form should include a remember-me checkbox
	 * @see wicket.Component#Component(String)
	 */
	
	public final class transferVerifiedForm extends Form
	{
	 	 /**
		 * Constructor.
		 * 
		 * @param id
		 *            id of the form component
		 */
		public transferVerifiedForm(final String id, String resultMessage)
		{
			super(id);	
			add(new Label("verifyResult", resultMessage));
		}	
		/**
		 * @see wicket.markup.html.form.Form#onSubmit()
		*/
		public final void onSubmit()
		{		
			// reset txn details here and go back to main page
			resetTxnDetails();
			setResponsePage(getApplication().getSessionSettings().getPageFactory().newPage(Transfer.class, (PageParameters)null));		
		}
	}
	
	public TransferVerifiedPanel(final String id, boolean isVerified)
	{
		super(id);
		
		// Create feedback panel and add to page
		final FeedbackPanel feedback = new FeedbackPanel("feedback");
		add(feedback);
		
		if(isVerified) {
			add(new transferVerifiedForm("transferVerifiedForm", "Your transaction has been confirmed and will be reflected in your account upon funds settlement."));
		} else {
			add(new transferVerifiedForm("transferVerifiedForm", "Your transaction could not be confirmed and it has been cancelled. Please try again, or contact your support representative for help."));
		}		
	}
	public abstract void resetTxnDetails();

}
