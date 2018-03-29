package com.sdet.step;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ShoppingStep {
	
	
	
	////////////// background steps goes here ///////////////// 
	
	@Given("the path is set")
	public void the_path_is_set (){
		System.out.println("The Path for the application is set here... ");
	}
	
	@And("the browser is loaded")
	public void the_browser_is_loaded(){
		System.out.println("The browser is loaded... ");
	}
	
	//////////  scenario steps goes here //////////////////// 

	@Given("^the user is \"([^\"]*)\"$")
	public void the_user_is(String loginStatus) throws Throwable {
		System.out.println("The user is " + loginStatus +">>> ");
	}

	@When("^the user selects products$")
	public void the_user_selects_products() throws Throwable {
		System.out.println("the user selects products>>>>");
	}

	@Then("^adds the products to cart$")
	public void adds_the_products_to_cart() throws Throwable {
		System.out.println("adds the products to cart>>>>");
	}

	@Then("^Pays the amount through \"([^\"]*)\"$")
	public void pays_the_amount_through(String paymentMethod) 
				throws Throwable {

		System.out.println("Pays the amount through " + paymentMethod +">>>>");
	}

}
