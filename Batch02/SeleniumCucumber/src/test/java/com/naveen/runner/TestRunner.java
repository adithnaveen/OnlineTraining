package com.naveen.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features={"src/main/resources"}, 
		plugin={"pretty", "html:target/cucumber-html-report"}, 
		glue={"com.naveen.step"}, 
		monochrome= true
		)

public class TestRunner {}