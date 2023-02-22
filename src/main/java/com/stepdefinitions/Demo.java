package com.stepdefinitions;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

import org.testng.Assert;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Demo {
	
	int x,y;
	private int result;

	@Given("this is first step of background")
	public void firstStepOfBackground() {
		System.out.println("this is first step of background");
	}

	@Given("first step of first scenario")
	public void firstStepFirstScenario() {
		System.out.println("this is first step of first scenario");
	}

	@Given("first step of second scenario")
	public void firstStepSecondScenario() {
		System.out.println("this is first step of second scenario");
	}
	
	@Given ("I have following numbers:")
	public void acceptTable(DataTable dt) {
		Map<Integer, Integer> m = dt.asMap(Integer.class, Integer.class);
		System.out.println("Content of Map: " + m);
	}
	
	@Given ("I have {int} and {int}")
	public void acceptTwoNumbers(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	@When ("I add them")
	public void addNumbers() {
		 result = x + y;
	}
	
	@Then ("the addition must be even")
	public void verifyEven() {
		Assert.assertTrue(result%2==0, "Addition is not even: " + result);
	}
	
	@Given ("I have {int}")
	public void readDataFromExcel(int num) {
//		Logic to read excel file
	}

}
