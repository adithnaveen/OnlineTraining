package com.naveen.step;

import org.openqa.selenium.WebDriver;

import com.naveen.pom.LoginPagePOMFactory;
import com.naveen.util.DriverFactory;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStep {

	private WebDriver driver; 
	private LoginPagePOMFactory loginPOMFactory;
	
	
	@Given("^load chrome driver$")
	public void load_chrome_driver(){
		driver = DriverFactory.getDriver("chrome");
	}
	@And("^get login page factory$")
	public  void get_login_page_factory(){
		loginPOMFactory = new LoginPagePOMFactory(driver);
		driver.get("http://naveenks.com/selenium/LoginForm.html");
	}
	
	@Given("^the user name as \"([^\"]*)\"$")
	public void the_user_name(String userName){
		loginPOMFactory.sendUserName(userName);
	}
	
	@And("^the password as \"([^\"]*)\"$")
	public void the_password(String password){
		loginPOMFactory.sendPasswor(password);
	}
	@When("^the user click on submit button$")
	public void the_user_click_on_submit_button(){
		loginPOMFactory.clickSubmitBtn();
	}
	
	@Then("^validate user credentials$")
	public void validate_user_credentials(){
		System.out.println("The user crendtials validation goes here... ");
	}
	
	@And("^close chrome browser$")
	public void close_chrome_browser(){
		driver.quit();
	}
}
