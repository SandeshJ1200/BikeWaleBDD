package com.home_page_tests;

import java.util.Collection;

import org.testng.annotations.Test;

import com.core.KeywordUI;
import com.pages.ui.HomePage;

public class SearchBox extends KeywordUI {

	@Test
	public void m2() {
		HomePage onHomePage = new HomePage();
		onHomePage.search("Ducati Monster 1200S");
		System.out.println("execute test");
	}

}
