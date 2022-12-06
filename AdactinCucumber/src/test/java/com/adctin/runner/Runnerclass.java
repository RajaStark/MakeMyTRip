package com.adctin.runner;

@RunnerClass(Cucumber.class);
@CucumberOptions(features = "src//test//java//com//adactin//fearures"),
glue = "com.adactin.stepdefinition",

public class Runnerclass {
	public static Webdriver driver;
	
	

	}

}
