package com.tss.pages;

import com.tss.pageobjects.LoginPagePOJ;

import net.thucydides.core.steps.ScenarioSteps;

public class LoginPage extends ScenarioSteps {

	LoginPagePOJ loginPoj;
	
	
	public void enterEmailAddress(String emailID) {
		loginPoj.getPopupEmailTexBox().sendKeys(emailID);
	}
	
	public void enterPassword(String password) {
		loginPoj.getPopupPasswordTextBox().sendKeys(password);
	}
	
	public void clickLoginButton() {
		loginPoj.getPopupLoginButton().click();
	}
	
	
}
