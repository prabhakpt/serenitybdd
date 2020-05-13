package com.tss.pageobjects;

import org.openqa.selenium.support.FindBy;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class LoginPagePOJ extends PageObject{

	@FindBy(id="loginHeadInputEmail1")
	private WebElementFacade popupEmailTexBox;
	
	@FindBy(id="loginHeadInputPassword1")
	private WebElementFacade popupPasswordTextBox;
	
	@FindBy(xpath="//button[@type='click']")
	private WebElementFacade popupLoginButton;
	
	@FindBy(xpath="//p[4]/a")
	private WebElementFacade registerButton;
	
	@FindBy(xpath="//small/a")
	private WebElementFacade popupForgotPassword;

	public WebElementFacade getPopupEmailTexBox() {
		return popupEmailTexBox;
	}

	public WebElementFacade getPopupPasswordTextBox() {
		return popupPasswordTextBox;
	}

	public WebElementFacade getPopupLoginButton() {
		return popupLoginButton;
	}

	public WebElementFacade getRegisterButton() {
		return registerButton;
	}

	public WebElementFacade getPopupForgotPassword() {
		return popupForgotPassword;
	}
	
	
}
