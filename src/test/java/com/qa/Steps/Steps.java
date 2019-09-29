package com.qa.Steps;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import com.qa.utilities.ConfigReader;

import cucumber.api.java.en.Given;

public class Steps {

	static Logger logger = Logger.getLogger(Steps.class);
	ConfigReader objConfigReader= new ConfigReader();

	@Given("^I want to write a step with precondition$")
	public void i_want_to_write_a_step_with_precondition() throws IOException {
		PropertyConfigurator.configure("log4j.properties");
		logger.info(objConfigReader.geturl());
	}

	@Given("^some other precondition$")
	public void some_other_precondition() {

	}

}
