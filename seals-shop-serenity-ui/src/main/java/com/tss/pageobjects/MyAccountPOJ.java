package com.tss.pageobjects;

import org.openqa.selenium.support.FindBy;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class MyAccountPOJ extends PageObject{

	@FindBy(xpath="//div[2]/div/a")
	private WebElementFacade accountInfoLink;

	public WebElementFacade getAccountInfoLink() {
		return accountInfoLink;
	}
	
	
}
