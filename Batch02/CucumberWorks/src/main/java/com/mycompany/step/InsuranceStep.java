package com.mycompany.step;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


// we can connect to Selenium 
public class InsuranceStep {
	@Given("^The policy is issued$")
	public void the_policy_is_issued(){
		// TODO 
		System.out.println("The policy is issued>>>>>>>>>");
	}
	
	@When("^Policy attains maturity of ([a-zA-Z]{1,}) years$")
	public void policy_attains_maturity_of_years(String years){
		System.out.println("Policy attains maturity of "+ years +"  years>>>>>>>>");
	}
	
	@Then("^Pay policy amount of (\\d+)$")
	public void pay_policy_amount_of_amount(int amount){
		System.out.println("Pay policy amount of ("+amount+")>>>>>>>>");
	}
	
	@And("^Receive policy documents$")
	public void receive_policy_documents(){
		System.out.println("Receive policy documents>>>>>>");
	}
	
	
}
