package com.mycomp.testrunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
			features={"features/com/mycomp/features"}, 
			glue={"com.mycomp.step"}, 
			plugin={"pretty", "html:target/cucumber-html-report"}, 
			monochrome=true
)
// this class shall be empty class, this will act like a place holder for annotation 
public class TestRunner {}
