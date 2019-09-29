package com.qa.Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
@RunWith(Cucumber.class)
@CucumberOptions(features = "Features", glue = { "com.qa.Steps" }, plugin = { "pretty",
		"html:target/cucumber-reports" }, monochrome = true)
public class MyRunner {

	

}
