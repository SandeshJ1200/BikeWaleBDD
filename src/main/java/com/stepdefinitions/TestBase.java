package com.stepdefinitions;



import com.core.KeywordUI;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class TestBase extends KeywordUI {

	/**
	 * The below method will run before scenario, because of @Before hook
	 */
	
	@Before
	public static void setup() {
		launchBrowser("edge");
		maximizeBrowser();
		launchUrl("https://www.bikewale.com");
	}
	
	/**
	 * The Below method will run after every Scenario, because of the @After hook
	 */
	@After
	public static void tearDown() {
		quitBrowser();
	}

	/**
	public void setUp() {
		String env = System.getProperty("env");
		System.out.println("Environment: "+env);
		launchBrowser("edge");
		launchUrl(FileUtils.getAppUrl(env));
	}
	**/
	
}
