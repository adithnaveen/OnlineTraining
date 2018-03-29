package com.sdet.testrunner;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

// this class will act as place holder for the definations provided 

@RunWith(Cucumber.class)
@CucumberOptions(
	// features will take string or array of string, where each value 
	// is the package where feature files are written 
	features={"resources/com/sdet/features"},
	// source files to be loaded from this package 
	// is is also called as step files 
	glue={"com.sdet.step"}, 
	plugin={"pretty", "html:target/cucumber"}, 
	// to show characters in readable format on console 
	monochrome=true
)
public class TestRunner {
}
