package com.stepdefinitions;

import org.testng.Assert;

import com.pages.ui.HomePage;
import com.pages.ui.ProductSummaryPage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Browse {

	HomePage onHomePage;
	ProductSummaryPage fromPSP;

	@Given("User clicks on Budget Tab under 'Browser Bikes by' section")
	public void clickOnBudgetTab() {
		onHomePage = new HomePage();
		onHomePage.clickOnBudgetTab();
	}

	@Given("User clicks on 'Displacement' Tab under 'Browser Bikes by' section")
	public void clickOnDisplacementTab() {
		onHomePage = new HomePage();
		onHomePage.clickOnDisplacementTab();
	}

	@And("clicks on 'Under 2 Lakh'")
	public void clickOnUnder2Lakh() {
		onHomePage = new HomePage();
		onHomePage.clickOnUnder2Lakh();
	}

	@And("clicks on 'Above 2 Lakh'")
	public void clickOnAbove2Lakh() {
		onHomePage = new HomePage();
		onHomePage.clickOnAbove2Lakh();
	}

	@And("click on '250cc-500cc' segment")
	public void clickOn250cc500cc() {
		onHomePage = new HomePage();
		onHomePage.clickOn250cc_500cc();
	}

	@And("click on 'Above 500cc' segment")
	public void clickOnAbove500cc() {
		onHomePage = new HomePage();
		onHomePage.clickOnAbove500cc();
	}

	@Then("check if all bike prices are Under 2 lakh")
	public void verifyBikePricesAreUnder2Lakh() {
		fromPSP = new ProductSummaryPage();
		
		fromPSP.clickOnLoadMoreBtn();
		Assert.assertTrue(fromPSP.checkBikePricesAreUnder(200000));
	}

	@Then("check if all bike prices are Above 2 lakh")
	public void verifyBikePricesAreAbove2Lakh() {
		fromPSP = new ProductSummaryPage();
		
		fromPSP.clickOnLoadMoreBtn();
		Assert.assertTrue(fromPSP.checkBikePricesAreAbove(200000));
	}

	@Then("check if all bike engine sizes are within '250cc-500cc'")
	public void checkEnginSizeWithin250cc500cc() {
		fromPSP = new ProductSummaryPage();
		
		fromPSP.clickOnLoadMoreBtn();
		Assert.assertTrue(fromPSP.checkEngineSizeIsWithin(250, 500));
	}

	@Then("check if all bike engine sizes are above '500cc'")
	public void checkEnginSizeAbove500cc() {
		fromPSP = new ProductSummaryPage();
		
		fromPSP.clickOnLoadMoreBtn();
		Assert.assertTrue(fromPSP.checkEngineSizeIsAbove(500));
	}

}
