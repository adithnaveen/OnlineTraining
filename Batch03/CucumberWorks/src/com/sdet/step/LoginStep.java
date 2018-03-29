package com.sdet.step;

import java.util.List;
import java.util.Map;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


// ctrl + shift + o 
public class LoginStep {

	// assuming that user will send usernamd and password 
	// all the data will be injected to method by cucumber 
	// by data table 
	@Given("^username and password$")
	public void username_and_password(DataTable dataTable) throws Throwable {
		
		System.out.println("Given UserName and passord below is the test cases ");
		System.out.println("------------------------------------------------------");
		
		List<Map<String, String>> dataList = dataTable.asMaps(String.class, String.class); 
		
		for(Map<String, String> temp : dataList){
			System.out.println("User Name " + temp.get("username") +", " + 
					"Password : " + temp.get("password"));
		}
		
		// you can have any conditions 

	}

	@When("^the credentials are validated$")
	public void the_credentials_are_validated() throws Throwable {
		System.out.println("TODO->the credentials are validated...");
	}

	@Then("^redirect the appliction to home page$")
	public void redirect_the_appliction_to_home_page() throws Throwable {
		System.out.println("TODO -> redirect the appliction to home page...");
	}

}
