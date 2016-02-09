package com.trustedbank.idverified;

import com.trustedbank.account.Signup;

import wicket.PageParameters;
import wicket.markup.html.form.Form;
import wicket.markup.html.form.PasswordTextField;
import wicket.markup.html.form.RequiredTextField;
import wicket.markup.html.form.TextField;
import wicket.markup.html.form.validation.EqualPasswordInputValidator;
import wicket.markup.html.panel.FeedbackPanel;
import wicket.markup.html.panel.Panel;
import wicket.model.PropertyModel;
import wicket.util.value.ValueMap;

/**
 * Reusable user Id questions panel 
 * 
 * --- remove below ---
 * username and password as well as support for
 * cookie persistence of the both. When the SignInPanel's form is submitted, the
 * abstract method signUp(String, String) is called, passing the username and
 * password submitted. The signUp() method should sign the user in and return
 * null if no error occurred, or a descriptive String in the event that the sign
 * in fails.
 */
public abstract class IdQuestionsPanel extends Panel
{
	/** Field for First Name. */
	private RequiredTextField firstName;

	/** Field for Last Name. */
	private RequiredTextField lastName;
	
	/** Field for Address. */
	private RequiredTextField address;
	
	/** Field for City. */
	private RequiredTextField city;

	/** Field for State. */
	private RequiredTextField state;
	
	/** Field for ZIP. */
	private RequiredTextField zip;
	
	/** Field for SSN4. */
	private TextField ssn;
	
	/** Field for YOB. */
	private TextField yob;
	
	/**
	 * ID Questions form.
	 */
	public final class IdQuestionsForm extends Form
	{
		/** El-cheapo model for form. */
		private final ValueMap properties = new ValueMap();

		/**
		 * Constructor.
		 * 
		 * @param id
		 *            id of the form component
		 */
		public IdQuestionsForm(final String id)
		{
			super(id);
			// Attach textfield components that edit properties map in lieu of a formal beans model
			add(firstName = new RequiredTextField("FirstName", new PropertyModel(properties, "FirstName")));
			add(lastName = new RequiredTextField("LastName", new PropertyModel(properties, "LastName")));
			add(address = new RequiredTextField("Address", new PropertyModel(properties, "Address")));
			add(city = new RequiredTextField("City", new PropertyModel(properties, "City")));
			add(state = new RequiredTextField("State", new PropertyModel(properties, "State")));
			add(zip = new RequiredTextField("Zip", new PropertyModel(properties, "Zip")));
			add(ssn = new TextField("Ssn", new PropertyModel(properties, "Ssn")));
			add(yob = new TextField("Yob", new PropertyModel(properties, "Yob")));
			
			//ssn.setConvertEmptyInputStringToNull(true);
			//yob.setConvertEmptyInputStringToNull(true);
		}

		/**
		 * @see wicket.markup.html.form.Form#onSubmit()
		 */
		public final void onSubmit()
		{
			if (!verifyIdAnswers(getFirstName(),getLastName(),getAddress(),getCity(),getState(),getZIP(),getSSN(),getYOB())) {
				final String errmsg = getLocalizer().getString("signUpError", this, "Unable to get an Id! Please verify entries above and try again.");
				error(errmsg);
			} else {
				if (!continueToOriginalDestination())
				{
					setResponsePage(getApplication().getSessionSettings().getPageFactory().newPage(SignupIdVerified.class, (PageParameters)null));
				}	
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
	public IdQuestionsPanel(final String id)
	{
		super(id);

		// Create feedback panel and add to page
		final FeedbackPanel feedback = new FeedbackPanel("IdQuestionsFeedback");
		add(feedback);

		// Add sign-in form to page, passing feedback panel as
		// validation error handler
		Form signUpForm = new IdQuestionsForm("IdQuestionsForm");
		add(signUpForm);
	}

	/**
	 * Convenience method to access the First Name.
	 * 
	 * @return the First Name as a String
	 */
	public String getFirstName()
	{
		return firstName.getModelObjectAsString();
	}

	/**
	 * Convenience method to access the Last Name.
	 * 
	 * @return the LAst Name as a String
	 */
	public String getLastName()
	{
		return lastName.getModelObjectAsString();
	}
	
	/**
	 * Convenience method to access the Address.
	 * 
	 * @return the Address as a String
	 */
	public String getAddress()
	{
		return address.getModelObjectAsString();
	}

	/**
	 * Convenience method to access the City.
	 * 
	 * @return the City as a String
	 */
	public String getCity()
	{
		return city.getModelObjectAsString();
	}
	
	/**
	 * Convenience method to access the State.
	 * 
	 * @return the State as a String
	 */
	public String getState()
	{
		return state.getModelObjectAsString();
	}
	
	/**
	 * Convenience method to access the ZIP.
	 * 
	 * @return the SSN as a String
	 */
	public String getZIP()
	{
		return zip.getModelObjectAsString();
	}
	
	/**
	 * Convenience method to access the SSN.
	 * 
	 * @return the SSN as a String
	 */
	public String getSSN()
	{
		return ssn.getModelObjectAsString();
	}
	
	/**
	 * Convenience method to access the YOB.
	 * 
	 * @return the YOB as a String
	 */
	public String getYOB()
	{
		return yob.getModelObjectAsString();
	}
	
	/**
	 * Send answers if possible.
	 * 
	 * @param username
	 *            The username
	 * @param password
	 *            The password
	 * @return True if signup was successful
	 */
	public abstract boolean verifyIdAnswers(String firstName, String lastName, String address, String city, String state, String zip, String ssn, String yob);
}
