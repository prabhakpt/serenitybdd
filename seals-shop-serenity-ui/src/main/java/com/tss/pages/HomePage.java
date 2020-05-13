package com.tss.pages;

import static org.junit.Assert.assertTrue;

import com.tss.pageobjects.HomePagePOJ;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import starter.navigation.DuckDuckGoHomePage;

public class HomePage extends ScenarioSteps{
	private HomePagePOJ homePage;
	private DuckDuckGoHomePage duckDuckGoHomePage;
	
	@Step("Custom - open home page")
	public void openHomePage() {
		duckDuckGoHomePage.open_Home_page("Stage");
	}
	public void clearSearchTextBox() {
		homePage.getSearchTextBox().clear();
	}
	
	@Step("Custom - Clearing the text box and entering new search key {0}")
	public void inputTextInTextBox(String searchKey) {
		clearSearchTextBox();
		homePage.getSearchTextBox().sendKeys(searchKey);
	}
	
	@Step("Custom - click on search button")
	public void clickByButton() {
		homePage.getSearchButton().click();
	}

	public void clicOnLoginRegisterLink() {
		assertTrue(homePage.getLoginRegisterLink().isVisible());
		homePage.getLoginRegisterLink().waitUntilEnabled();
		homePage.getLoginRegisterLink().click();
	}
}
