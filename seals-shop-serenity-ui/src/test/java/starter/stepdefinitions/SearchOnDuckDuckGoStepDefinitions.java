package starter.stepdefinitions;

import com.tss.pages.HomePage;
import com.tss.pages.LoginPage;
import com.tss.pages.SearchPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class SearchOnDuckDuckGoStepDefinitions {

    @Steps
    HomePage homePage;
    //SearchPage searchPage;
    //LoginPage loginPage;

    @Given("User accessed seals shop application")
    public void i_am_on_the_DuckDuckGo_home_page() {
    	homePage.openHomePage();
    }

    @When("s?he searches for \"(.*)\"")
    public void i_search_for(String term) {
    	homePage.inputTextInTextBox(term);
    	homePage.clickByButton();
    }

    @Then("all the result titles should contain the word \"(.*)\"")
    public void all_the_result_titles_should_contain_the_word(String term) {
    	//searchPage.assertResults(term);
    }
    
    @When("Click on login register or myacount link")
	public void clicOnLoginRegisterLink() {
		homePage.clicOnLoginRegisterLink();
	}
	
    
}
