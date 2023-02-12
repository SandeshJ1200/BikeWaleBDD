package com.stepdefinitions;

import com.core.KeywordUI;
import com.pages.ui.HomePage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FirstStep {
	
	static HomePage onHomePage = new HomePage();
	
	@Given("User clicks on Budget Tab option under Browser Bikes by section")
	public static void clickOnBudgetTab() {
		onHomePage.clickOnBudgetTab();
	}

	@And("clicks on 'Under 2 Lakh'")
	public static void clickOnUnder2Lakh() {
		onHomePage.clickOnUnder2Lakh();
	}

}
