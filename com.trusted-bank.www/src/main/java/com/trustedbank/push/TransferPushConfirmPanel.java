package com.trustedbank.push;

import com.trustedbank.transaction.Transfer;

import wicket.PageParameters;
import wicket.markup.html.basic.Label;
import wicket.markup.html.form.Button;
import wicket.markup.html.form.Form;
import wicket.markup.html.panel.FeedbackPanel;
import wicket.markup.html.panel.Panel;

public abstract class TransferPushConfirmPanel extends Panel {
	
	
	public final class transferForm extends Form
	{
	 	 /**
		 * Constructor.
		 * 
		 * @param id
		 *            id of the form component
		 */
		public transferForm(final String id, String fromAcct, String toAcct, String amount)
		{
			super(id);
			add(new Label("fromAcct", fromAcct));
			add(new Label("toAcct", toAcct));
			add(new Label("amnt", amount));
			// Add the Submit button and hide it
			Button submitBtn = new Button("doneButton");
			submitBtn.setVisible(false);
			add(submitBtn);
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
	
	
	public TransferPushConfirmPanel(final String id, String fromAcct, String toAcct, String amount)
	{
		super(id);
		
		// create form
		add(new transferForm("transferForm", fromAcct, toAcct, amount));
	}
	public abstract void setTxnConfirm();
}
