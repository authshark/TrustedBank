package com.trustedbank.account;

import com.trustedbank.Home;

import wicket.PageParameters;
import wicket.markup.html.form.Button;
import wicket.markup.html.form.Form;
import wicket.markup.html.form.PasswordTextField;
import wicket.markup.html.form.RequiredTextField;
import wicket.markup.html.form.validation.EqualPasswordInputValidator;
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
public abstract class SignUpPanel extends Panel
{
	/** Field for user name. */
	private RequiredTextField username;

	/** Field for password. */
	private PasswordTextField password;

	/** Field for re-entered password. */
	private PasswordTextField passwordConfirm;

	/**
	 * Sign in form.
	 */
	public final class SignUpForm extends Form
	{
		/** El-cheapo model for form. */
		private final ValueMap properties = new ValueMap();

		/**
		 * Constructor.
		 * 
		 * @param id
		 *            id of the form component
		 */
		public SignUpForm(final String id)
		{
			super(id);
			
			// Attach textfield components that edit properties map in lieu of a formal beans model
			add(username = new RequiredTextField("username", new PropertyModel(properties, "username")));
			
			// headline.add(StringValidator.lengthBetween(1, 80));
			// add(new ComponentFeedbackPanel("headlineErrors", headline));
			add(password = new PasswordTextField("password", new PropertyModel(properties, "password")));
			add(passwordConfirm = new PasswordTextField("passwordConfirm", new PropertyModel(properties, "passwordConfirm")));
			add(new EqualPasswordInputValidator(password, passwordConfirm));
			
	        
	        Button cancel = new Button("cancelbutton"){
	            public void onSubmit() {
	                //info("Cancel was pressed!");
	            	resetId();
	            	setResponsePage(getApplication().getSessionSettings().getPageFactory().newPage(Home.class, (PageParameters)null));
	            }
	        };
	        cancel.setDefaultFormProcessing(false);
	        add(cancel);
	        
	        add(new Button("okbutton"));
		}

		/**
		 * @see wicket.markup.html.form.Form#onSubmit()
		 */
		public final void onSubmit()
		{
			if (signup(getUsername(), getPassword()))
			{
				// If login has been called because the user was not yet
				// logged in, than continue to the original destination,
				// otherwise to the Home page
				if (!continueToOriginalDestination())
				{
					setResponsePage(getApplication().getSessionSettings().getPageFactory().newPage(SignupDone.class, (PageParameters)null));
				}
			}
			else
			{
				// Try the component based localizer first. If not found try the
				// application localizer. Else use the default
				final String errmsg = getLocalizer().getString("signUpError", this,
						"Unable to sign you up");

				error(errmsg);
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
	public SignUpPanel(final String id)
	{
		super(id);

		// Create feedback panel and add to page
		final FeedbackPanel feedback = new FeedbackPanel("signUpFeedback");
		add(feedback);

		// Add sign-in form to page, passing feedback panel as
		// validation error handler
		Form signUpForm = new SignUpForm("signUpForm");
		add(signUpForm);
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
	 * Convenience method to access the password.
	 * 
	 * @return The password
	 */
	public String getPassword()
	{
		return password.getModelObjectAsString();
	}

	/**
	 * Convenience method to access the password.
	 * 
	 * @return The password
	 */
	public String getPasswordConfirm()
	{
		return passwordConfirm.getModelObjectAsString();
	}

	/**
	 * Sign up user if possible.
	 * 
	 * @param username
	 *            The username
	 * @param password
	 *            The password
	 * @return True if signup was successful
	 */
	public abstract boolean signup(String username, String password);
	public abstract void resetId();
}
