package com.trustedbank.signin;

import wicket.PageParameters;

import com.trustedbank.LoginSidebarPanel;
import com.trustedbank.PublicPage;

public class SignOut extends PublicPage {
	public SignOut(final PageParameters parameters) {
		add(new LoginSidebarPanel("loginSidebarPanel"));
	}
	
	protected void onEndRequest() {
		getSession().invalidate();
		try {
			getWebRequestCycle().getWebResponse().getHttpServletResponse()
					.sendRedirect("app");
		} catch (Exception e) {
		}
	}
}
