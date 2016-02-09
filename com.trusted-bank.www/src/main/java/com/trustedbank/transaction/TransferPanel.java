package com.trustedbank.transaction;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.trustedbank.Main;

import wicket.PageParameters;
import wicket.markup.html.form.DropDownChoice;
import wicket.markup.html.form.Form;
import wicket.markup.html.form.RadioChoice;
import wicket.markup.html.form.RequiredTextField;
import wicket.markup.html.panel.FeedbackPanel;
import wicket.markup.html.panel.Panel;
import wicket.model.PropertyModel;
import wicket.util.value.ValueMap;

public abstract class TransferPanel extends Panel {
	/**
	 * @param id
	 *            See Component constructor
	 * @param includeRememberMe
	 *            True if form should include a remember-me checkbox
	 * @see wicket.Component#Component(String)
	 */

	private class acctChoice implements Serializable 
	{
		private String choice = null;

		public String getChoice()
		{
			return choice;
		}

		public void setChoice(String c)
		{
			this.choice = c;
		}
	}
	
	private class authzChoice implements Serializable 
	{
		private String choice;
		
		public String getChoice()
		{
			return choice;
		}
		
		public void setChoice(String c)
		{
			this.choice = c;
		}
	}

	public final class transferAcctForm extends Form
	{

		private acctChoice fromChoice = new acctChoice();
		private acctChoice toChoice = new acctChoice();
		private RequiredTextField amount;

		/** El-cheapo model for form. */
		private final ValueMap properties = new ValueMap();
		
		private authzChoice myChoice = new authzChoice();

		private String[] txn = null;
		/**
		 * Constructor.
		 * 
		 * @param id
		 *            id of the form component
		 */
		public transferAcctForm(final String id, List accts, List authzs)
		{
			super(id);	
			add(new DropDownChoice("fromList",new PropertyModel(fromChoice,"choice"),accts));
			add(new DropDownChoice("toList",new PropertyModel(toChoice,"choice"),accts));
			add(amount = new RequiredTextField("amnt", new PropertyModel(properties, "amnt")));
			
			RadioChoice myAuthzChoices = new RadioChoice("authzchoices", new PropertyModel(myChoice,"choice"),authzs);
			myAuthzChoices.setSuffix("&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;");
			myChoice.setChoice(authzs.get(0).toString());
			add(myAuthzChoices);
		}

		/**
		 * @see wicket.markup.html.form.Form#onSubmit()
		 */
		public final void onSubmit()
		{		
			boolean amountIsNumber = true;

			try {
				Double.parseDouble(amount.getModelObjectAsString());
			} catch (NumberFormatException e) {
				amountIsNumber = false;
			}

			if (fromChoice.getChoice()!= null) {
				if (toChoice.getChoice() != null) {
					if (fromChoice.getChoice() != toChoice.getChoice()) {
						if (!amountIsNumber) {
							error("Illegal amount!");
						} else {
							//check if VIP Push or OOB verification is desired
							if (myChoice.getChoice() == "Voice Call") {
								if (callVerifyTxn(fromChoice.getChoice(), toChoice.getChoice(), amount.getModelObjectAsString())) {
									setResponsePage(getApplication().getSessionSettings().getPageFactory().newPage(Transfer.class, (PageParameters)null));
								} else {
									error("Please register a phone number before using this feature!");
								}								
							} else { //assume Mobile Push for now
								if (pushVerifyTxn(fromChoice.getChoice(), toChoice.getChoice(), amount.getModelObjectAsString())) {
									setResponsePage(getApplication().getSessionSettings().getPageFactory().newPage(Transfer.class, (PageParameters)null));
								} else {
									error("Please register a Push enabled VIP Credential before using this feature!");
								}	
							}				
						}
					} else {
						error("Cannot transfer into the same account!");
					}
				} else {
					error("Please select a destination account!");
				}
			} else {
				error("Please select a source account!");
			}
		}		
	}

	public TransferPanel(final String id)
	{
		super(id);
		List accts = new ArrayList();

		accts.add("107882 - Checking");
		accts.add("117725 - Joint Checking");
		accts.add("107933 - Savings");
		accts.add("110007 - Investment");
		
		List authzs = new ArrayList();
		authzs.add("Mobile Push");
		authzs.add("Voice Call");

		// Create feedback panel and add to page
		final FeedbackPanel feedback = new FeedbackPanel("feedback");
		add(feedback);

		// Add form
		add(new transferAcctForm("transferForm", accts, authzs));
	}
	public abstract boolean callVerifyTxn(String fromAccount, String toAccount, String amount);
	public abstract boolean pushVerifyTxn(String fromAccount, String toAccount, String amount);
}
