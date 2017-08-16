package com.naveen.cucumber.stepdef;

import java.util.List;

import com.naveen.cucumber.beans.LoginBean;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStep {

	@Given("^username and password$")
	public void username_and_password(List<LoginBean> loginBeans) throws Throwable {

		for(LoginBean temp : loginBeans){
			System.out.println(temp.getLogin()
					+" <-> " + temp.getPwd() +"<->" + 
						temp.getRoles());
		}
	}

	@When("^login successful$")
	public void login_successful() throws Throwable {
	}

	@Then("^show inbox$")
	public void show_inbox() throws Throwable {
	}
}
