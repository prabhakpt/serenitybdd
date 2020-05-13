package com.tss.pageobjects;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.support.FindBy;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.core.steps.UIInteractionSteps;
import net.thucydides.core.webdriver.WebDriverFacade;

public class SearchResultsPagePOJ extends UIInteractionSteps{
	
	@FindBy(css="#links .result__title")
	private List<WebDriverFacade> searchResultsTitles;
	
	public List<WebDriverFacade> getSearchResultsTitles() {
		return searchResultsTitles;
	}
	
	public List<String> getListofResults() {
		return findAll("#links .result__title").stream().map(WebElementFacade::getText).collect(Collectors.toList());
	}
}
