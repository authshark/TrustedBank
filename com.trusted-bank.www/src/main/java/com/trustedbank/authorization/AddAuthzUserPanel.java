package com.trustedbank.authorization;

import java.io.Serializable;
import java.util.List;

import com.trustedbank.account.Profile;

import wicket.PageParameters;
import wicket.markup.html.form.DropDownChoice;
import wicket.markup.html.form.Form;
import wicket.markup.html.form.RequiredTextField;
import wicket.markup.html.panel.FeedbackPanel;
import wicket.markup.html.panel.Panel;
import wicket.model.PropertyModel;
import wicket.util.value.ValueMap;

/**
 * Reusable user sign up panel with username and password as well as support for
 * cookie persistence of the both. When the SignInPanel's form is submitted, the
 * abstract method signUp(String, String) is called, passing the username and
 * password submitted. The signUp() method should sign the user in and return
 * null if no error occurred, or a descriptive String in the event that the sign
 * in fails.
 */
public abstract class AddAuthzUserPanel extends Panel
{
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

	/**
	 * Sign in form.
	 */
	public final class addAuthzUserForm extends Form
	{
		private userChoice myChoice = new userChoice();
		/**
		 * Constructor.
		 * 
		 * @param id
		 *            id of the form component
		 */
		public addAuthzUserForm(final String id, List elligibleUsers)
		{
			super(id);
			add(new DropDownChoice("userList",new PropertyModel(myChoice,"choice"),elligibleUsers));
		}

		/**
		 * @see wicket.markup.html.form.Form#onSubmit()
		 */
		public final void onSubmit()
		{
			if (myChoice.getChoice()!= null) {
				if(addAuthzUserId(myChoice.getChoice())){
					info ("User added!!");
				}
				setResponsePage(getApplication().getSessionSettings().getPageFactory().newPage(AddAuthzUser.class,null));
			} else {
				error("Please select a user!");
			}
		}
	}

	/**
	 * @param id
	 *            See Component constructor
	 * @param includeRememberMe
	 *            True if form should include a remember-me checkbox
	 * @see wicket.Component#Component(String)
	 */
	public AddAuthzUserPanel(final String id, List users)
	{
		super(id);

		// Create feedback panel and add to page
		final FeedbackPanel feedback = new FeedbackPanel("addAuthzUserFeedback");
		add(feedback);

		// Add sign-in form to page, passing feedback panel as
		// validation error handler
		Form signUpForm = new addAuthzUserForm("addAuthzUserForm", users);
		add(signUpForm);
	}

	/**
	 * Convenience method to access the token ID.
	 * 
	 * @return The token ID
	 */
	
	public abstract boolean addAuthzUserId(String user);
}
