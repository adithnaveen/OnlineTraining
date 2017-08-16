package com.mycomp.step;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStep {

	@Given("^the path is set$")
	public void the_path_is_set(){
		System.out.println("************ the path is set   **************");
	}
	
	@Given("^the browser is \"([A-Za-z]{1,})\"$")
	public void the_browser_is_open(String browserStatus){
		// this does some job 
		System.out.println("The browser is "+ browserStatus+">>>>>>>>>>>");
	}	
	
	@When("^user name is \"([A-Za-z]{1,})\"$")
	public void user_name_is_entered(String userStatus){
		// TODO 
		System.out.println("User Name is "+userStatus + " >>>>>>>>>>>");
	}
	
	@And("^the password is entered$")
	public void the_password_is_entered(){
		System.out.println("the password is entered >>>>>>>>");
	}
	
	@Then("^validate the user credentials$")
	public void validate_the_user_credentials(){
		System.out.println("validate the user credentials >>>>>>");
	}
}
