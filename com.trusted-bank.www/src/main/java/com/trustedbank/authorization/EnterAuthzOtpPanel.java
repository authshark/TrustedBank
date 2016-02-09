package com.trustedbank.authorization;

import com.trustedbank.Main;
import com.trustedbank.idverified.SignupIdVerified;

import wicket.PageParameters;
import wicket.markup.html.form.Button;
import wicket.markup.html.form.Form;
import wicket.markup.html.form.TextField;
import wicket.markup.html.panel.FeedbackPanel;
import wicket.markup.html.panel.Panel;
import wicket.model.PropertyModel;
import wicket.util.value.ValueMap;

public abstract class EnterAuthzOtpPanel extends Panel
{
	/** Field for one-time password. */
	private TextField oneTimePassword;

	/**
	 * Sign in form.
	 */
	public final class EnterOtpForm extends Form
	{
		/** El-cheapo model for form. */
		private final ValueMap properties = new ValueMap();

		/**
		 * Constructor.
		 * 
		 * @param id
		 *            id of the form component
		 */
		public EnterOtpForm(final String id)
		{
			super(id);

			// Attach textfield components that edit properties map
			// in lieu of a formal beans model
			add(oneTimePassword = new TextField("vip_securitycode", new PropertyModel(properties, "vip_securitycode")));
			
	        add(new Button("okbutton"));
	        
	        Button cancel = new Button("cancelbutton"){
	            public void onSubmit() {
	                //info("Cancel was pressed!");
	            	resetId();
	            	setResponsePage(getApplication().getSessionSettings().getPageFactory().newPage(Authorize.class, (PageParameters)null));
	            }
	        };
	        cancel.setDefaultFormProcessing(false);
	        add(cancel);
		}

		/**
		 * @see wicket.markup.html.form.Form#onSubmit()
		 */
		public final void onSubmit()
		{
			if (validateOtp(getOneTimePassword()))
			{
				// If login has been called because the user was not yet
				// logged in, than continue to the original destination,
				// otherwise to the Home page
				if (!continueToOriginalDestination())
				{
					setResponsePage(getApplication().getSessionSettings().getPageFactory().newPage(SignupIdVerified.class, (PageParameters)null));
				}
			}
			else
			{
				// Try the component based localizer first. If not found try the
				// application localizer. Else use the default
				final String errmsg = getLocalizer().getString("validationError", this,
						"Your security code could not be validated. Generate a new security code and try again.");

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
	public EnterAuthzOtpPanel(final String id)
	{
		super(id);

		// Create feedback panel and add to page
		final FeedbackPanel feedback = new FeedbackPanel("enterOtpFeedback");
		add(feedback);

		// Add sign-in form to page, passing feedback panel as
		// validation error handler
		Form enterOtpForm = new EnterOtpForm("enterOtpForm");
		add(enterOtpForm);
	}

	/**
	 * Removes persisted form data for the signin panel (forget me)
	 */
	public final void forgetMe()
	{
		// Remove persisted user data. Search for child component
		// of type SignInForm and remove its related persistence values.
		getPage().removePersistedFormData(EnterAuthzOtpPanel.EnterOtpForm.class, true);
	}

	/**
	 * Convenience method to access the password.
	 * 
	 * @return The password
	 */
	public String getOneTimePassword()
	{
		return oneTimePassword.getModelObjectAsString();
	}

	/**
	 * Convenience method set persistence for oneTimePassword.
	 * 
	 * @param enable
	 *            Whether the fields should be persistent
	 */
	public void setPersistent(boolean enable)
	{
		oneTimePassword.setPersistent(enable);

	}

	/**
	 * Validate oneTimePassword if possible.
	 * 
	 * @param oneTimePassword
	 *            The oneTimePassword
	 * @return True if validation was successful
	 */
	public abstract boolean validateOtp(final String oneTimePassword);
	public abstract void resetId();
}
