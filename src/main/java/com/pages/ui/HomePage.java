package com.pages.ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.WaitFor;
import com.core.KeywordUI;

/**
 * Page Object Model for Home Page of Bikewale website
 * @author Sandesh
 *
 */

public class HomePage {
	
//	KeywordUI keyword = null;
	
	public HomePage(){
//		TestBase base = new TestBase();
		PageFactory.initElements(KeywordUI.driver, this);
//		keyword = new KeywordUI();
	}

	/*** =================ELEMENTS======================== ***/

	@FindBy(css = "input#newBikeList")
	public WebElement searchBox_HomePage;

	@FindBy(css = "div.login-box")
	public WebElement loginBtn;

	@FindBy(css = "li[data-testing-id='global-search-result-list']")
	public WebElement suggestionList;

	@FindBy(css = "li[data-tabs='discoverBrand']")
	public WebElement brandTab;
	
	@FindBy(css = "li[data-tabs='discoverBudget']")
	public WebElement budgetTab;
	
	@FindBy(css = "li[data-tabs='discoverMileage']")
	public WebElement displacementTab;
	
	@FindBy(css = "a[title='Best bikes under 2 lakh']")
	public WebElement under2LakhOption;
	
	@FindBy(css = "a[title='Best bikes above 2 lakh']")
	public WebElement above2LakhOption;
	
	@FindBy(css = "a[title='Best 500cc bikes']")
	public WebElement _250cc_500ccOption;
	
	@FindBy(css = "a[title='Best bikes above 500cc ']")
	public WebElement _500ccOption;
	
	@FindBy(css = "img[alt='Royal Enfield bikes']")
	public WebElement ROYALENFIELD;

	/*** =================METHODS======================== ***/

	public void clickOnSearchBox_HomePage() {
		searchBox_HomePage.click();
	}

	public void searchBike(String bikeName) {
		searchBox_HomePage.sendKeys(bikeName);
	}

	public void clickOnLoginBtn() {
		loginBtn.click();
	}

	public void waitForSuggestionList() {
		By by = By.cssSelector("li[data-testing-id='global-search-result-list']");
		WaitFor.presenceOfElementLocated(by);
	}

	public void clickOnBrandTab() {
		brandTab.click();
	}
	
	public void clickOnBudgetTab() {
		budgetTab.click();
	}
	
	public void clickOnDisplacementTab() {
		displacementTab.click();
	}
	
	public void clickOn250cc_500cc(){
		_250cc_500ccOption.click();
	}
	
	public void clickOnAbove500cc() {
		_500ccOption.click();
	}
	
	public void clickOnUnder2Lakh() {
		under2LakhOption.click();
	}
	
	public void clickOnAbove2Lakh() {
		above2LakhOption.click();
	}

	public void clickOnRoyalEnfield() {
		ROYALENFIELD.click();
	}

	public By searchBox_HomePage1 = By.cssSelector("input#newBikeList");

	public void searchBike1(String bikeName) {
		KeywordUI.driver.findElement(searchBox_HomePage1).sendKeys(bikeName);
	}



}
