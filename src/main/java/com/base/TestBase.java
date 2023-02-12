package com.base;

import com.core.KeywordUI;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class TestBase extends KeywordUI {

	/**
	 * The below method will run before scenario, because of @Before hook
	 */
	
	@Before
	public void setup() {
		KeywordUI.launchBrowser("edge");
		KeywordUI.driver.manage().window().maximize();
		KeywordUI.launchUrl("https://www.bikewale.com");
	}
	
	/**
	 * The Below method will run after every Scenario, because of the @After hook
	 */
	@After
	public void tearDown() {
		KeywordUI.quitBrowser();
	}

	
}
