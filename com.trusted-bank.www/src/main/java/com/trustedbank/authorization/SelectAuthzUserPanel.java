package com.trustedbank.authorization;
import java.io.Serializable;
import java.util.Arrays;
import java.util.List;

import com.trustedbank.account.Profile;
import com.trustedbank.authorization.Authorize;
import com.trustedbank.TrustedBankApplication;
import com.trustedbank.TrustedBankSession;
import com.trustedbank.EnterOtp;
import com.trustedbank.VIPClient;
import com.trustedbank.store.TokenStorage;

import wicket.PageParameters;
import wicket.RestartResponseAtInterceptPageException;
import wicket.Session;
import wicket.model.PropertyModel;
import wicket.model.Model;
import wicket.markup.html.basic.Label;
import wicket.markup.html.form.Form;
import wicket.markup.html.form.RadioGroup;
import wicket.markup.html.form.RadioChoice;
import wicket.markup.html.form.DropDownChoice;
import wicket.markup.html.panel.Panel;
import wicket.markup.html.panel.FeedbackPanel;
import wicket.markup.html.list.ListView;
import wicket.markup.html.list.ListItem;

public abstract class SelectAuthzUserPanel extends Panel {
	
	private class userChoice implements Serializable 
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
	
	public final class SelectUserForm extends Form
	{
		// Add a FeedbackPanel for displaying our messages
	    //FeedbackPanel feedbackPanel = new FeedbackPanel("feedback");
	    //add(feedbackPanel);
		private userChoice myChoice = new userChoice();
	 	 /**
		 * Constructor.
		 * 
		 * @param id
		 *            id of the form component
		 */
		public SelectUserForm(final String id, List authzUsers)
		{
			super(id);	
			add(new DropDownChoice("userList",new PropertyModel(myChoice,"choice"),authzUsers));
		}
		/**
		 * @see wicket.markup.html.form.Form#onSubmit()
		*/
		public final void onSubmit()
		{
			
			if (myChoice.getChoice()!= null) {
				if(sendTmpSMS(myChoice.getChoice())){
					info ("SMS sent!");
				}
				setResponsePage(getApplication().getSessionSettings().getPageFactory().newPage(Authorize.class,null));
			} else {
				error("Please select a user!");
			}
			
			
	
			// go back to OTP page
			//setResponsePage(getApplication().getSessionSettings().getPageFactory().newPage(EnterOtp.class,null));
			//setResponsePage(getApplication().getSessionSettings().getPageFactory().newPage(Profile.class, (PageParameters)null));
		}		
	}
	
	public SelectAuthzUserPanel(final String id, List authzUsers){
		super(id);		
		
		// Create feedback panel and add to page
		final FeedbackPanel feedback = new FeedbackPanel("feedback");
		add(feedback);
		
		Form selAuthForm = new SelectUserForm("selectUserForm", authzUsers);
		add(selAuthForm);
	}
	public abstract boolean sendTmpSMS(String username);
}