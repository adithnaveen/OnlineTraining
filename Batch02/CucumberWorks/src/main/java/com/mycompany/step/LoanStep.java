package com.mycompany.step;

import java.util.List;
import java.util.Map;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

// ctrl + shift + O 
public class LoanStep {

	@Given("^the user name and credit score$")
	public void the_user_name_and_credit_score(DataTable dataTable) throws Throwable {
		System.out.println("Given username and credit Score called.....");
		System.out.println("----------------------------------------");
		
		List<Map<String, String>> dataList = dataTable.asMaps(String.class, String.class);
		
		for(Map<String, String> temp: dataList){
			System.out.println("User Name :" + temp.get("username"));
			System.out.println("Credit Score : " + temp.get("creditscore"));
			
			int creditScore = Integer.parseInt(temp.get("creditscore"));
			
			if(creditScore > 750){
				System.out.println("Congrats User " + temp.get("username")
					+" Your loan is processing");
			}else{
				System.out.println("Sorry User " + temp.get("username"));
			}
		}
		
		System.out.println("----------------------------------------");
	}

	@When("^the criteria is met$")
	public void the_criteria_is_met() throws Throwable {
		System.out.println("the criteria is met>>>>>>>>>>>>>");
	}

	@Then("^sanction or reject the loan$")
	public void sanction_or_reject_the_loan() throws Throwable {
		System.out.println("sanction or reject the loan>>>>>>>>>");
	}
}
