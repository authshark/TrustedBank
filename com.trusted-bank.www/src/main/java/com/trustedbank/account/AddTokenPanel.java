package com.trustedbank.account;

import wicket.PageParameters;
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
public abstract class AddTokenPanel extends Panel
{
	/** Field for token ID. */
	private RequiredTextField tokenId;

	/** Field for one-time password (OTP). */
	private RequiredTextField oneTimePassword;

	/**
	 * Sign in form.
	 */
	public final class AddTokenForm extends Form
	{
		/** El-cheapo model for form. */
		private final ValueMap properties = new ValueMap();

		/**
		 * Constructor.
		 * 
		 * @param id
		 *            id of the form component
		 */
		public AddTokenForm(final String id)
		{
			super(id);
			
			// Attach textfield components that edit properties map in lieu of a formal beans model
			add(tokenId = new RequiredTextField("vip_credentialid", new PropertyModel(properties, "vip_credentialid")));
			
			add(oneTimePassword = new RequiredTextField("vip_securitycode", new PropertyModel(properties, "vip_securitycode")));
		}

		/**
		 * @see wicket.markup.html.form.Form#onSubmit()
		 */
		public final void onSubmit()
		{
			if (activateToken(getTokenId(), getOneTimePassword()))
			{
				// If login has been called because the user was not yet
				// logged in, than continue to the original destination,
				// otherwise to the Home page
				if (!continueToOriginalDestination())
				{
					setResponsePage(getApplication().getSessionSettings().getPageFactory().newPage(Profile.class, (PageParameters)null));
				}
			}
			else
			{
				// Try the component based localizer first. If not found try the
				// application localizer. Else use the default
				final String errmsg = getLocalizer().getString("addTokenError", this,
						"Unable to add credential. Generate a new security code and try again.");

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
	public AddTokenPanel(final String id)
	{
		super(id);

		// Create feedback panel and add to page
		final FeedbackPanel feedback = new FeedbackPanel("addTokenFeedback");
		add(feedback);

		// Add sign-in form to page, passing feedback panel as
		// validation error handler
		Form signUpForm = new AddTokenForm("addTokenForm");
		add(signUpForm);
	}

	/**
	 * Convenience method to access the token ID.
	 * 
	 * @return The token ID
	 */
	public String getTokenId()
	{
		return tokenId.getModelObjectAsString();
	}

	/**
	 * Convenience method to access the one-time password.
	 * 
	 * @return The one-time password
	 */
	public String getOneTimePassword()
	{
		return oneTimePassword.getModelObjectAsString();
	}

	/**
	 * Validate token if possible.
	 * 
	 * @param tokenId
	 *            The token ID
	 * @param oneTimePassword
	 *            The one-time password
	 * @return True if validation was successful
	 */
	public abstract boolean activateToken(String tokenId, String oneTimePassword);
}
