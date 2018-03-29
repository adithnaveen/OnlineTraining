package com.sdet.step;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class InsuranceStep {

	@Given("The policy is issued")
	public void the_policy_is_issued(){
		// TODO  will go here 
		// Connect to selenium 
		// connecting to DB 
		System.out.println("The policy is issured>>> ");
	}
	
	@When("Policy attains maturity of ([a-zA-Z]{1,}) years")
	public void policy_attains_maturity_of_ten_years(String year){
		System.out.println("Policy attains maturity of " + year+ " years>>>>> ");
	}
	
	@Then("Pay policy amount of (\\d+)")
	public void pay_policy_amount_of_some_thousand(int amount){
		System.out.println("Pay policy amount of "+amount+">>>>>");
	}
	
	@And("Recieve policy document")
	public void recieve_policy_document(){
		System.out.println("Recieve policy document>>>> ");
	}
}
