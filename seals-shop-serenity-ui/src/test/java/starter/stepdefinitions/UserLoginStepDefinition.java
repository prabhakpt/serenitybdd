package starter.stepdefinitions;

import com.tss.pages.HomePage;
import com.tss.pages.LoginPage;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class UserLoginStepDefinition {

	@Steps
	LoginPage loginPage;
	
	@Then("Enter Email address in login popup")
	public void enterEmailAddressinLoginPopupWindow() {
		loginPage.enterEmailAddress("test_apis@tss.com");
	}
	
	@And("Enter Password in login popup")
	public void enterPasswordinLoginPopupwindow() {
		loginPage.enterPassword("Testing@123");
	}
	
	@Then("Click on login button")
	public void clickOnLoginButton() {
		loginPage.clickLoginButton();
	}
	
}
