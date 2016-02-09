package com.trustedbank.account;
import java.io.Serializable;
import java.util.Arrays;
import java.util.List;

import com.trustedbank.EnterOtp;
import com.trustedbank.TrustedBankSession;
import com.trustedbank.account.Profile;

import wicket.PageParameters;
import wicket.RestartResponseAtInterceptPageException;
import wicket.Session;
import wicket.model.PropertyModel;
import wicket.model.Model;
import wicket.markup.html.basic.Label;
import wicket.markup.html.form.Form;
import wicket.markup.html.form.RadioGroup;
import wicket.markup.html.form.RadioChoice;
import wicket.markup.html.panel.Panel;
import wicket.markup.html.panel.FeedbackPanel;
import wicket.markup.html.list.ListView;
import wicket.markup.html.list.ListItem;

public class SelectAuthCredPanel extends Panel {
	
	private class authChoice implements Serializable 
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
	
	public final class SelectAuthForm extends Form
	{
		// Add a FeedbackPanel for displaying our messages
	    //FeedbackPanel feedbackPanel = new FeedbackPanel("feedback");
	    //add(feedbackPanel);
		private authChoice myChoice = new authChoice();
		private final List authChoices = Arrays.asList(new String[] { "SMS", "OTP" });
	 	 /**
		 * Constructor.
		 * 
		 * @param id
		 *            id of the form component
		 */
		public SelectAuthForm(final String id)
		{
			super(id);	
			add(new RadioChoice("radiochoices", new PropertyModel(myChoice,"choice"),authChoices));
		}
		/**
		 * @see wicket.markup.html.form.Form#onSubmit()
		*/
		public final void onSubmit()
		{
			// set the SMS or OTP in the session based on selection here
			// set SMS flag
			//((TrustedBankSession)Session.get()).setSMS();
			
			// info("Submit:" + myChoice.getChoice());
			
			if (myChoice.getChoice() == "SMS"){
				((TrustedBankSession)Session.get()).setSMS();	
			} else {
				((TrustedBankSession)Session.get()).setOTP();
			}
	
			// go back to OTP page
			setResponsePage(getApplication().getSessionSettings().getPageFactory().newPage(EnterOtp.class,null));
			//setResponsePage(getApplication().getSessionSettings().getPageFactory().newPage(Profile.class, (PageParameters)null));
		}		
	}
	
	public SelectAuthCredPanel(final String id){
		super(id);		
		
		// Create feedback panel and add to page
		final FeedbackPanel feedback = new FeedbackPanel("enterOtpFeedback");
		add(feedback);
		
		Form selAuthForm = new SelectAuthForm("selectAuthForm");
		add(selAuthForm);
	}

}