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
package com.trustedbank.push;

import wicket.PageParameters;
import wicket.markup.html.WebMarkupContainer;
import wicket.markup.html.form.Button;
import wicket.markup.html.form.CheckBox;
import wicket.markup.html.form.Form;
import wicket.markup.html.form.TextField;
import wicket.markup.html.panel.Panel;
import wicket.model.PropertyModel;
import wicket.util.value.ValueMap;

import com.trustedbank.Home;
import com.trustedbank.Main;
import com.trustedbank.TrustedBankSession;
import com.trustedbank.signin.SignOut;

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
public abstract class SignInPushPanel extends Panel
{
	/** True if the user should be remembered via form persistence (cookies) */
	private boolean rememberMe = true;
	
	/** True if we should attenpt VIP Push first */
	private boolean tryPush = true;
	
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

			TextField username = new TextField("username", new PropertyModel(properties, "username"));
			username.setModelValue(((TrustedBankSession) getSession()).getUser());
			username.setEnabled(false);
			add(username);
			
			TextField password = new TextField("password", new PropertyModel(properties,"password"));
			password.setModelValue("********");
			password.setEnabled(false);
			add(password);

			// MarkupContainer row for remember me checkbox
			WebMarkupContainer rememberMeRow = new WebMarkupContainer("rememberMeRow");
			add(rememberMeRow);

			// Add rememberMe checkbox
			CheckBox checkBox = new CheckBox("rememberMe", new PropertyModel(SignInPushPanel.this, "rememberMe"));
			checkBox.setEnabled(false);
			rememberMeRow.add(checkBox);

			// MarkupContainer for VIP Push
			WebMarkupContainer tryPushRow = new WebMarkupContainer("tryPushRow");
			add(tryPushRow);
			
			// Add Login with VIP Push checkbox
			CheckBox tryPushCheckBox = new CheckBox("tryPush", new PropertyModel(SignInPushPanel.this,"tryPush"));
			tryPushCheckBox.setEnabled(false);
			tryPushRow.add(tryPushCheckBox);
			
			// Add the Submit button
			Button submitBtn = new Button("signin");
			submitBtn.setEnabled(false);
			add(submitBtn);
			
		}

		/**
		 * @see wicket.markup.html.form.Form#onSubmit()
		 */
		public final void onSubmit()
		{
			
			if (signInPush(((TrustedBankSession) getSession()).getUser()))
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
				// logout and go back to SignIn
				setResponsePage(getApplication().getSessionSettings().getPageFactory().newPage(PushError.class, (PageParameters)null));	
			}
		}
	}
	
	/**
	 * @see wicket.Component#Component(String)
	 */
	public SignInPushPanel(final String id)
	{
		super(id);

		// Add sign-in form to page
		Form signInForm = new SignInForm("signInForm");
		add(signInForm);
		
		//add message
		
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
	
	public void setRememberMe(boolean rememberMe)
	{
		this.rememberMe = rememberMe;
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
	 * Sign in user with Push if possible.
	 * 
	 * @param username
	 *            The username
	 * @param password
	 *            The password
	 * @return True if signin was successful
	 */
	public abstract boolean signInPush(final String username);
}
