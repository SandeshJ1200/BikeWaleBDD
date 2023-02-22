package com.core;

import org.apache.log4j.Logger;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariDriver;

import com.exceptions.InvalidBrowserNameException;

/**
 * This Class contains Keywords for generic UI related Actions
 * 
 * @author Sandesh
 */

public class KeywordUI {

	public static RemoteWebDriver driver = null;

	private static final Logger LOG = Logger.getLogger(KeywordUI.class);

	/**
	 * This keyword helps launch a browser instance. You can choose to launch any
	 * one of the following Browsers
	 * <ol>
	 * <li>Microsoft Edge
	 * <li>Google Chrome
	 * <li>Mozilla Firefox
	 * <li>Safari
	 * </ol>
	 * 
	 * @param browserName
	 * @author Sandesh
	 */
	public static void launchBrowser(String browserName) {
		EdgeOptions options = new EdgeOptions();
		options.addArguments("");
		
		browserName = browserName.toLowerCase();

		if (browserName.equals("edge") || browserName.contains("microsoft")) {
			driver = new EdgeDriver();
		} else if (browserName.equals("chrome") || browserName.contains("google")) {
			driver = new ChromeDriver();
		} else if (browserName.equals("firefox") || browserName.contains("mozilla")) {
			driver = new FirefoxDriver();
		} else if (browserName.equals("safari")) {
			driver = new SafariDriver();
		} else {
			throw new InvalidBrowserNameException(browserName);
		}

	}

	/**
	 * Keyword to launch Web-Application/Website
	 * 
	 * @param url
	 * @author Sandesh
	 */
	public static void launchUrl(String url) {
		driver.get(url);
	}

	/**
	 * Keyword to close the browser instance
	 * 
	 * @author Sandesh
	 */
	public static void quitBrowser() {
		driver.quit();
	}

	/**
	 * Keyword to close the currently active browser Tab
	 * 
	 * @author Sandesh
	 */
	public static void closeBrowserWindow() {
		driver.close();
	}

	/**
	 * Maximizes current browser instance window
	 * 
	 * @author Sandesh
	 */
	public static void maximizeBrowser() {
		driver.manage().window().maximize();
	}

	/**
	 * Helps to scroll current window in given amounts- X and Y axis in pixels
	 * @param x axis
	 * @param y axis
	 */
	public static void scrollWindowBy(int x, int y) {
		driver.executeScript("window.scrollBy(arguments[0],arguments[1])",x,y);
	}
	
}
