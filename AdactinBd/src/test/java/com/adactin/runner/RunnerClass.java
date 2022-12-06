package com.adactin.runner;

import cucumber.api.junit.Cucumber;

    @RunnerWith(Cucumber.class)
	@CucumberOptions(features = "src//test//java//com//adactin//feature",
	glue = "com.adactin.stepdefinition",
	monochrome= true,
	dryRun= false,
	strict = true,
	tags = "",
	plugin = {"html:Reports/HtmlReport",
			"pretty",
			"json:Reports/jsonreport.json",
			
	}
	
	


