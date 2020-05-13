package com.tss.pages;

import com.tss.pageobjects.MyAccountPOJ;

import net.thucydides.core.steps.ScenarioSteps;

public class MyAccountPage extends ScenarioSteps{

	MyAccountPOJ myAccountPOJ;
	
	public void clickAccountInfoLink() {
		myAccountPOJ.getAccountInfoLink().click();
	}
	
	public void verifyText(String text) {
		
	}
}
