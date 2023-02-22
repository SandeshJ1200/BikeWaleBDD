package com.testrunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/resources/Features", glue = "com/stepdefinitions")
public class RunnerTest extends AbstractTestNGCucumberTests {

}
