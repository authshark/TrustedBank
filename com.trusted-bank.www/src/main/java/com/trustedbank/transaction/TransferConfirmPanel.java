package com.trustedbank.transaction;

import wicket.PageParameters;
import wicket.markup.html.basic.Label;
import wicket.markup.html.form.Form;
import wicket.markup.html.panel.FeedbackPanel;
import wicket.markup.html.panel.Panel;

public abstract class TransferConfirmPanel extends Panel {
	
	
	public final class transferForm extends Form
	{
	 	 /**
		 * Constructor.
		 * 
		 * @param id
		 *            id of the form component
		 */
		public transferForm(final String id, String fromAcct, String toAcct, String amount, String otp)
		{
			super(id);
			add(new Label("fromAcct", fromAcct));
			add(new Label("toAcct", toAcct));
			add(new Label("amnt", amount));
			add(new Label("passcode", otp));
		}
		
		/**
		 * @see wicket.markup.html.form.Form#onSubmit()
		*/
		public final void onSubmit()
		{		
			setTxnConfirm();			
			setResponsePage(getApplication().getSessionSettings().getPageFactory().newPage(Transfer.class, (PageParameters)null));
		}
	}
	
	/**
	 * @param id
	 *            See Component constructor
	 * @param includeRememberMe
	 *            True if form should include a remember-me checkbox
	 * @see wicket.Component#Component(String)
	 */
	
	public TransferConfirmPanel(final String id, String fromAcct, String toAcct, String amount, String otp)
	{
		super(id);
		
		// Create feedback panel and add to page
		final FeedbackPanel feedback = new FeedbackPanel("feedback");
		add(feedback);
		// create form
		add(new transferForm("transferForm", fromAcct, toAcct, amount, otp));
	}
	public abstract void setTxnConfirm();
}
