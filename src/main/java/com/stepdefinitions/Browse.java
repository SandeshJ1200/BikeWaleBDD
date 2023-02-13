package com.stepdefinitions;

import org.testng.Assert;

import com.pages.ui.HomePage;
import com.pages.ui.ProductSummaryPage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Browse {

	static HomePage onHomePage = new HomePage();
	static ProductSummaryPage fromPSP = new ProductSummaryPage();

	@Given("User clicks on Budget Tab under 'Browser Bikes by' section")
	public static void clickOnBudgetTab() {
		onHomePage.clickOnBudgetTab();
	}
	
	@Given ("User clicks on 'Displacement' Tab under 'Browser Bikes by' section")
	public static void clickOnDisplacementTab() {
		onHomePage.clickOnDisplacementTab();
	}

	@And("clicks on 'Under 2 Lakh'")
	public static void clickOnUnder2Lakh() {
		onHomePage.clickOnUnder2Lakh();
	}

	@And("clicks on 'Above 2 Lakh'")
	public static void clickOnAbove2Lakh() {
		onHomePage.clickOnAbove2Lakh();
	}
	
	@And ("click on '250cc-500cc' segment")
	public static void clickOn250cc500cc() {
		onHomePage.clickOn250cc_500cc();
	}
	
	@And ("click on 'Above 500cc' segment")
	public static void clickOnAbove500cc() {
		onHomePage.clickOnAbove500cc();
	}

	@Then("check if all bike prices are Under 2 lakh")
	public static void verifyBikePricesAreUnder2Lakh() {
		fromPSP.clickOnLoadMoreBtn();
		Assert.assertTrue(fromPSP.checkBikePricesAreUnder(200000));
	}

	@Then("check if all bike prices are Above 2 lakh")
	public static void verifyBikePricesAreAbove2Lakh() {
		fromPSP.clickOnLoadMoreBtn();
		Assert.assertTrue(fromPSP.checkBikePricesAreAbove(200000));
	}
	
	@Then ("check if all bike engine sizes are within '250cc-500cc'")
	public static void checkEnginSizeWithin250cc500cc() {
		fromPSP.clickOnLoadMoreBtn();
		fromPSP.checkEngineSizeIsWithin(250, 500);
	}
	
	@Then ("check if all bike engine sizes are above '500cc'")
	public static void checkEnginSizeAbove500cc() {
		fromPSP.clickOnLoadMoreBtn();
		fromPSP.checkEngineSizeIsWithin(250, 500);
	}

}
