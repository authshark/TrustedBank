package com.trustedbank.idverified;

import java.util.Arrays;
import java.util.List;

import com.trustedbank.account.Signup;

import wicket.PageParameters;
import wicket.markup.html.form.Form;

import wicket.markup.html.panel.FeedbackPanel;
import wicket.markup.html.panel.Panel;
import wicket.markup.html.basic.Label;
import wicket.model.PropertyModel;
import wicket.util.value.ValueMap;
import wicket.markup.html.form.RadioChoice;
import wicket.markup.html.form.Button;

/**
 * Reusable user Id questions panel 
 * 
 */
public abstract class IdChallengePanel extends Panel
{
	private final ValueMap properties = new ValueMap();
	/** Field for the answer to the first challenge. */
	//private RequiredTextField firstIdAnswer;
	private RadioChoice firstIdAnswer;

	/** Field for the answer to the second challenge. */
	private RadioChoice secondIdAnswer;
	
	/** Field for the answer to the third challenge. */
	private RadioChoice thirdIdAnswer;
	
	/**
	 * ID Questions form.
	 */
	public final class IdChallengeForm extends Form
	{
		/** El-cheapo model for form. */
		private final ValueMap properties = new ValueMap();

		/**
		 * Constructor.
		 * 
		 * @param id
		 *            id of the form component
		 */
		public IdChallengeForm(final String id, 
				String firstFormChallenge, String[] firstFormAnswers, 
				String secondFormChallenge, String[] secondFormAnswers, 
				String thirdFormChallenge, String[] thirdFormAnswers)
		{
			super(id);
					
			// Attach textfield components that edit properties map in lieu of a formal beans model
			
			add(new Label("FirstIdChallenge", firstFormChallenge));
			List firstListAnswers = Arrays.asList(firstFormAnswers);
			
			firstIdAnswer = new RadioChoice("FirstIdAnswer", new PropertyModel(properties, "FirstIdAnswer"), firstListAnswers);
			firstIdAnswer.setRequired(true);
			add(firstIdAnswer);
			
			add(new Label("SecondIdChallenge",secondFormChallenge));
			List secondListAnswers = Arrays.asList(secondFormAnswers);
			secondIdAnswer = new RadioChoice("SecondIdAnswer", new PropertyModel(properties, "SecondIdAnswer"), secondListAnswers);
			secondIdAnswer.setRequired(true);
			add(secondIdAnswer);
			
			
			add(new Label("ThirdIdChallenge",thirdFormChallenge));
			List thirdListAnswers = Arrays.asList(thirdFormAnswers);
			thirdIdAnswer = new RadioChoice("ThirdIdAnswer", new PropertyModel(properties, "ThirdIdAnswer"), thirdListAnswers);
			thirdIdAnswer.setRequired(true);
			add(thirdIdAnswer);
			
	        add(new Button("okbutton"));
	        
	        Button cancel = new Button("cancelbutton"){
	            public void onSubmit() {
	                //info("Cancel was pressed!");
	            	resetId();
	            	setResponsePage(getApplication().getSessionSettings().getPageFactory().newPage(SignupIdVerified.class, (PageParameters)null));
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
			
					
			if (verifyIdChallenge(getFirstIdAnswer(), getSecondIdAnswer(), getThirdIdAnswer()))
			{
				// If login has been called because the user was not yet
				// logged in, than continue to the original destination,
				// otherwise to the Home page
				if (!continueToOriginalDestination())
				{
					setResponsePage(getApplication().getSessionSettings().getPageFactory().newPage(Signup.class, (PageParameters)null));
				}
			}
			else
			{
				// Try the component based localizer first. If not found try the
				// application localizer. Else use the default
				final String errmsg = getLocalizer().getString("signUpError", this, "Unable to verify answers. Please click on \"Cancel\" and try again!");
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
	public IdChallengePanel(final String id, 
			String firstChallenge, String[] firstAnswers,  
			String secondChallenge, String[] secondAnswers,
			String thirdChallenge, String[] thirdAnswers)
	{
		super(id);

		// Create feedback panel and add to page
		final FeedbackPanel feedback = new FeedbackPanel("IdChallengeFeedback");
		add(feedback);

		// Add sign-in form to page, passing feedback panel as
		// validation error handler
		Form signUpForm = new IdChallengeForm("IdChallengeForm", 
				firstChallenge, firstAnswers,
				secondChallenge, secondAnswers,
				thirdChallenge, thirdAnswers);
		add(signUpForm);
	}

	/**
	 * Convenience method to access the first answer.
	 * 
	 * @return the first answer as a String
	 */
	public String getFirstIdAnswer()
	{
		
		return firstIdAnswer.getModelObjectAsString();
	}

	/**
	 * Convenience method to access the first answer.
	 * 
	 * @return the first answer as a String
	 */
	public String getSecondIdAnswer()
	{
		return secondIdAnswer.getModelObjectAsString();
	}
	
	/**
	 * Convenience method to access the first answer.
	 * 
	 * @return the first answer as a String
	 */
	public String getThirdIdAnswer()
	{
		return thirdIdAnswer.getModelObjectAsString();
	}
	
	/**
	 * Verify answers if possible.
	 * 
	 * @param firstIdAnswer
	 *            The answer to the first challenge.
	 * @param secondIdAnswer
	 *            The answer to the second challenge.
	 * @param thirdIdAnswer
	 *            The answer to the third challenge.            
	 * @return True if verifyAnswers was successful
	 */
	public abstract boolean verifyIdChallenge(String firstIdAnswer, String secondIdAnswer, String thirdIdAnswer);
	public abstract void resetId();
}
