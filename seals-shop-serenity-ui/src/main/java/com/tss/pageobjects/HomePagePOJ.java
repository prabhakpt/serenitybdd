package com.tss.pageobjects;

import org.openqa.selenium.support.FindBy;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class HomePagePOJ extends PageObject{

	@FindBy(name="q")
	private WebElementFacade searchTextBox;
	
	@FindBy(css=".search__button")
	private WebElementFacade searchButton;

	@FindBy(xpath="//button[@id='dropdown-login']/span")
	private WebElementFacade loginRegisterLink;
	
	
	
	public WebElementFacade getSearchTextBox() {
		return searchTextBox;
	}

	public WebElementFacade getSearchButton() {
		return searchButton;
	}

	public WebElementFacade getLoginRegisterLink() {
		return loginRegisterLink;
	}
	
	
}
