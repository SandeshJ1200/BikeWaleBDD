package com.base;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Fluent Wait Implementation Class to provide Wait functionality for elements
 * of various conditions
 * 
 * @author Sandesh
 *
 */

public class WaitFor {

	static FluentWait<WebDriver> wait;
	
	static {
		TestBase base = new TestBase();
		wait = new WebDriverWait(base.driver, Duration.ofSeconds(20), Duration.ofMillis(500));
		wait.pollingEvery(Duration.ofMillis(500));
		wait.ignoring(NoSuchElementException.class);
	}

	public static void elementStaleness(WebElement element) {
		wait.until(ExpectedConditions.stalenessOf(element));
	}

	public static void elementToBeClickable(WebElement element) {
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}
	
	public static void presenceOfElementLocated(By byInstance) {
		wait.until(ExpectedConditions.presenceOfElementLocated(byInstance));
	}

}
