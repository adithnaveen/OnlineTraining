package com.mycompany.step;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStep {

	
	@Given("^the path is set$")
	public void the_path_is_set (){
		System.out.println("Your path setting will go here");
	}
	@Given("^the browser is \"([^\"]*)\"$")
	public void the_browser_is(String arg1) throws Throwable {
		System.out.println("The browser is " + arg1);
	}

	@When("^username is \"([^\"]*)\"$")
	public void username_is(String arg1) throws Throwable {
		System.out.println("User Name status is " + arg1);
	}


}
