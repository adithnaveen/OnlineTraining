package com.mycompany.testrunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
		// will tell where feature file(s) located, can take array of arguments 
		features={"src/main/resources/com/mycompany/features"},
		// source file(s) located, 
		glue={"com.mycompany.step"},
		//  need html based output
		// json format out put 
		plugin={"pretty"},
		// should the output be shown on the console /
		monochrome=true, 
		// to invoke only the specified feature files 
		tags={"@Login"}
		)
public class TestRunner {}
