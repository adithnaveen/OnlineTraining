package com.sdet.step;

import org.openqa.selenium.WebDriver;

import com.sdet.generics.GenericMethods;
import com.sdet.utility.DriverFactory;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStep {

	WebDriver driver; 
	String baseURL ; 
	GenericMethods genericMethods; 
	// Background method 
	@Given("^the browser is loaded$")
	public void the_browser_is_loaded() throws Throwable {
		// we have to load the browser 
		driver = DriverFactory.getDriver("chrome");
		genericMethods = new GenericMethods(driver); 
		baseURL ="http://naveenks.com/selenium/LoginForm.html";
		driver.get(baseURL);
	}

	// step methods 
	@Given("^the username and password$")
	public void the_username_and_password() throws Throwable {
		// find the elements username and password 
		System.out.println("Send username and password.>>>>>");
		
		genericMethods.getElement("uname", "id").sendKeys("harry@gmail.com");
		genericMethods.getElement("pwd", "id").sendKeys("testing@1234");
		
	}

	@When("^user clicks on submit$")
	public void user_clicks_on_submit() throws Throwable {
		// click submit 
		genericMethods.getElement("submitBtn", "id").click();
	}

	@Then("^redirec to home page$")
	public void redirec_to_home_page() throws Throwable {
		// say successfully logged in 
		System.out.println("You will be rediredted to home page... ");
		
		driver.quit(); 
	}

}
