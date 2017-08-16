package com.naveen.cucumber.test;

import static org.junit.Assert.*;

import org.junit.Test;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features = { "src/main/resources/com/naveen/features" }, 
		glue = { "com.naveen.cucumber.stepdef" }, 
		plugin = { "pretty","html:target/cucumber-html-report", 
		"json:target/cucumber-report.json"},
		monochrome = true)

public class TestRunner {

}