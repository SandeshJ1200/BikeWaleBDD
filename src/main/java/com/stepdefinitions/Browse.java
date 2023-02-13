package com.stepdefinitions;

import org.testng.Assert;

import com.pages.ui.HomePage;
import com.pages.ui.ProductSummaryPage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Browse {

	HomePage onHomePage = new HomePage();
	ProductSummaryPage fromPSP = new ProductSummaryPage();

	@Given("User clicks on Budget Tab under 'Browser Bikes by' section")
	public void clickOnBudgetTab() {
		onHomePage.clickOnBudgetTab();
	}

	@Given("User clicks on 'Displacement' Tab under 'Browser Bikes by' section")
	public void clickOnDisplacementTab() {
		onHomePage.clickOnDisplacementTab();
	}

	@And("clicks on 'Under 2 Lakh'")
	public void clickOnUnder2Lakh() {
		onHomePage.clickOnUnder2Lakh();
	}

	@And("clicks on 'Above 2 Lakh'")
	public void clickOnAbove2Lakh() {
		onHomePage.clickOnAbove2Lakh();
	}

	@And("click on '250cc-500cc' segment")
	public void clickOn250cc500cc() {
		onHomePage.clickOn250cc_500cc();
	}

	@And("click on 'Above 500cc' segment")
	public void clickOnAbove500cc() {
		onHomePage.clickOnAbove500cc();
	}

	@Then("check if all bike prices are Under 2 lakh")
	public void verifyBikePricesAreUnder2Lakh() {
		fromPSP.clickOnLoadMoreBtn();
		Assert.assertTrue(fromPSP.checkBikePricesAreUnder(200000));
	}

	@Then("check if all bike prices are Above 2 lakh")
	public void verifyBikePricesAreAbove2Lakh() {
		fromPSP.clickOnLoadMoreBtn();
		Assert.assertTrue(fromPSP.checkBikePricesAreAbove(200000));
	}

	@Then("check if all bike engine sizes are within '250cc-500cc'")
	public void checkEnginSizeWithin250cc500cc() {
		fromPSP.clickOnLoadMoreBtn();
		fromPSP.checkEngineSizeIsWithin(250, 500);
	}

	@Then("check if all bike engine sizes are above '500cc'")
	public void checkEnginSizeAbove500cc() {
		fromPSP.clickOnLoadMoreBtn();
		fromPSP.checkEngineSizeIsAbove(500);
	}

}
