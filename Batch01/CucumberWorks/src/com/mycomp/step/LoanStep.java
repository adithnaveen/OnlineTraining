package com.mycomp.step;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoanStep {

	@Given("^the customer works full time$")
	public void the_customer_works_full_time() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("the customer works full time<<<<<<<<<<<<<<<<");
	}

	@Given("^working in govt office$")
	public void working_in_govt_office() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("working in govt office<<<<<<<<<<<<<<<<<<<<");
	}

	@When("^credit score is more than (\\d+)$")
	public void credit_score_is_more_than(int arg1) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("credit score is more than " +arg1 +"<<<<<<<<<<<" );
	}

	@Then("^sanction loan$")
	public void sanction_loan() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("sanction loan<<<<<<<<<<<<");
	}

	@Then("^customer has to repay within (\\d+) years$")
	public void customer_has_to_repay_within_years(int arg1) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		
		System.out.println("customer has to repay within  " + arg1 +" years<<<<<");
	}

}
