package com.trustedbank.signin;

import com.trustedbank.Main;
import wicket.PageParameters;
import wicket.markup.html.form.Form;
import wicket.markup.html.panel.FeedbackPanel;
import wicket.markup.html.panel.Panel;

public abstract class KBAPanel extends Panel
{
	/**
	 * KBA form.
	 */
	public final class KBAForm extends Form
	{
		/**
		 * Constructor.
		 * 
		 * @param id
		 *            id of the form component
		 */
		public KBAForm(final String id)
		{
			super(id);
		}
		/**
		 * @see wicket.markup.html.form.Form#onSubmit()
		 */
		public final void onSubmit()
		{
			if (validateKBA()) {
				setResponsePage(getApplication().getSessionSettings().getPageFactory().newPage(Main.class, (PageParameters)null));
			} else {
				error("Could not validate KBA!");
			}
		}
	}

	/**
	 * @param id
	 *            See Component constructor
	 * @see wicket.Component#Component(String)
	 */
	public KBAPanel(final String id)
	{
		super(id);
		// Create feedback panel and add to page
		final FeedbackPanel feedback = new FeedbackPanel("feedback");
		add(feedback);

		// Add KBA form to page, passing feedback panel as
		// validation error handler
		Form myKBAForm = new KBAForm("enterKBAForm");
		add(myKBAForm);
	}
	/**
	 * Validate KBA
	 * @return True if validation was successful
	 */
	public abstract boolean validateKBA();
}
