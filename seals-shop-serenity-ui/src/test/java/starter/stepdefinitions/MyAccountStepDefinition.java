package starter.stepdefinitions;

import com.tss.pages.MyAccountPage;

import cucumber.api.java.en.Then;
import net.thucydides.core.annotations.Steps;

public class MyAccountStepDefinition {

	@Steps
	MyAccountPage myAccoutPage;
	
	@Then("Click on Account information link")
	public void clickOnAccountInfoLink() {
		myAccoutPage.clickAccountInfoLink();
	}
}
