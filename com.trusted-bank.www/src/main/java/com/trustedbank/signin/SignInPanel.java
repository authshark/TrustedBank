/*
 * $Id: SignInPanel.java 459234 2006-02-12 22:03:51Z jonl $ $Revision:
 * 1.6 $ $Date: 2006-02-12 23:03:51 +0100 (Sun, 12 Feb 2006) $
 * 
 * ==============================================================================
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package com.trustedbank.signin;

import wicket.PageParameters;
import wicket.markup.ComponentTag;
import wicket.markup.html.WebComponent;
import wicket.markup.html.WebMarkupContainer;
import wicket.markup.html.basic.Label;
import wicket.markup.html.form.CheckBox;
import wicket.markup.html.form.Form;
import wicket.markup.html.form.PasswordTextField;
import wicket.markup.html.form.TextField;
import wicket.markup.html.panel.FeedbackPanel;
import wicket.markup.html.panel.Panel;
import wicket.model.IModel;
import wicket.model.Model;
import wicket.model.PropertyModel;
import wicket.util.value.ValueMap;

import com.trustedbank.Main;
import com.trustedbank.TrustedBankSession;

/**
 * Reusable user sign in panel with username and password as well as support for
 * cookie persistence of the both. When the SignInPanel's form is submitted, the
 * abstract method signIn(String, String) is called, passing the username and
 * password submitted. The signIn() method should sign the user in and return
 * null if no error ocurred, or a descriptive String in the event that the sign
 * in fails.
 * 
 * @author Jonathan Locke
 * @author Juergen Donnerstag
 * @author Eelco Hillenius
 */
public abstract class SignInPanel extends Panel
{
	/** True if the panel should display a remember-me checkbox */
	private boolean includeRememberMe = true;

	/** Field for password. */
	private PasswordTextField password;

	/** True if the user should be remembered via form persistence (cookies) */
	private boolean rememberMe = true;
	
	/** True if we should attenpt VIP Push first */
	private boolean tryPush = true;
	private CheckBox tryPushCheckBox;

	/** Field for user name. */
	private TextField username;

	/**
	 * Sign in form.
	 */
	public final class SignInForm extends Form
	{
		/** El-cheapo model for form. */
		private final ValueMap properties = new ValueMap();

		/**
		 * Constructor.
		 * 
		 * @param id
		 *            id of the form component
		 */
		public SignInForm(final String id)
		{
			super(id);

			// Attach textfield components that edit properties map
			// in lieu of a formal beans model
			add(username = new TextField("username", new PropertyModel(properties, "username")));
			add(password = new PasswordTextField("password", new PropertyModel(properties,
					"password")));

			// MarkupContainer row for remember me checkbox
			WebMarkupContainer rememberMeRow = new WebMarkupContainer("rememberMeRow");
			add(rememberMeRow);

			// Add rememberMe checkbox
			rememberMeRow.add(new CheckBox("rememberMe", new PropertyModel(SignInPanel.this, "rememberMe")));
			
			// Make form values persistent
			setPersistent(rememberMe);

			// Show remember me checkbox?
			rememberMeRow.setVisible(includeRememberMe);
			
			// MarkupContainer for VIP Push
			WebMarkupContainer tryPushRow = new WebMarkupContainer("tryPushRow");
			add(tryPushRow);
			
			// Add Login with VIP Push checkbox
			tryPushRow.add(tryPushCheckBox = new CheckBox("tryPush", new PropertyModel(SignInPanel.this,"tryPush")));
			
		}

		/**
		 * @see wicket.markup.html.form.Form#onSubmit()
		 */
		public final void onSubmit()
		{
			// set the tryPush in the session 
			
			((TrustedBankSession)getSession()).setTryPush(getTryPushValue());
			
			if (signIn(getUsername(), getPassword()))
			{
				// If login has been called because the user was not yet
				// logged in, than continue to the original destination,
				// otherwise to the Home page
				if (!continueToOriginalDestination())
				{
					setResponsePage(getApplication().getSessionSettings().getPageFactory().newPage(Main.class, (PageParameters)null));
				}
			}
			else
			{
				// Try the component based localizer first. If not found try the
				// application localizer. Else use the default
				String errorMessage = "Unable to sign you in";
				
				final String errmsg = getLocalizer().getString("loginError", this, errorMessage);
				error(errmsg);
			}
		}
	}
	
	/**
	 * @see wicket.Component#Component(String)
	 */
	public SignInPanel(final String id)
	{
		this(id, true);
	}

	/**
	 * @param id
	 *            See Component constructor
	 * @param includeRememberMe
	 *            True if form should include a remember-me checkbox
	 * @see wicket.Component#Component(String)
	 */
	public SignInPanel(final String id, final boolean includeRememberMe)
	{
		super(id);

		this.includeRememberMe = includeRememberMe;

		// Create feedback panel and add to page
		final FeedbackPanel feedback = new FeedbackPanel("signInFeedback");
		add(feedback);

		// Add sign-in form to page, passing feedback panel as
		// validation error handler
		Form signInForm = new SignInForm("signInForm");
		add(signInForm);
	}

	/**
	 * Removes persisted form data for the signin panel (forget me)
	 */
	public final void forgetMe()
	{
		// Remove persisted user data. Search for child component
		// of type SignInForm and remove its related persistence values.
		getPage().removePersistedFormData(SignInPanel.SignInForm.class, true);
	}

	/**
	 * Convenience method to access the password.
	 * 
	 * @return The password
	 */
	public String getPassword()
	{
		return password.getModelObjectAsString();
	}

	/**
	 * Get model object of the rememberMe checkbox
	 * 
	 * @return True if user should be remembered in the future
	 */
	public boolean getRememberMe()
	{
		return rememberMe;
	}

	/**
	 * Convenience method to access the username.
	 * 
	 * @return The user name
	 */
	public String getUsername()
	{
		return username.getModelObjectAsString();
	}

	/**
	 * Convenience method set persistence for username and password.
	 * 
	 * @param enable
	 *            Whether the fields should be persistent
	 */
	public void setPersistent(boolean enable)
	{
		username.setPersistent(enable);
		password.setPersistent(enable);
	}

	/**
	 * Set model object for rememberMe checkbox
	 * 
	 * @param rememberMe
	 */
	public void setRememberMe(boolean rememberMe)
	{
		this.rememberMe = rememberMe;
		this.setPersistent(rememberMe);
	}
	
	/**
	 * Get model object of the tryPush checkbox
	 * 
	 * @return True if we should try VIP Push first
	 */
	public boolean getTryPush()
	{
		return tryPush;
	}
	
	/**
	 * Set model object for tryPush checkbox
	 * 
	 * @param tryPush
	 */
	public void setTryPush(boolean tryPush)
	{
		this.tryPush = tryPush;
	}
	
	/**
	 * Convenience function to get the tryPush value
	 * 
	 * @return true if checked
	 */
	public boolean getTryPushValue() {
		if(tryPushCheckBox.getModelObjectAsString().equals("true")) {
			return true;
		}
		return false;
	}
	

	/**
	 * Sign in user if possible.
	 * 
	 * @param username
	 *            The username
	 * @param password
	 *            The password
	 * @return True if signin was successful
	 */
	public abstract boolean signIn(final String username, final String password);
}
