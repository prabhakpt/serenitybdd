package com.tss.pages;

import static org.assertj.core.api.Assertions.assertThat;
import static starter.matchers.TextMatcher.textOf;

import java.util.List;

import com.tss.pageobjects.SearchResultsPagePOJ;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class SearchPage extends ScenarioSteps {
	
	private SearchResultsPagePOJ searchResultsPage;
	
	@Step("Custom - Verifying the search results")
	public List<String> getSearchResultsPage() {
		return searchResultsPage.getListofResults();
				
	}
	
	public void assertResults(String searchKey) {
		assertThat(getSearchResultsPage())
        .matches(results -> results.size() > 0)
        .allMatch(title -> textOf(title).containsIgnoringCase(searchKey));
	}
}
