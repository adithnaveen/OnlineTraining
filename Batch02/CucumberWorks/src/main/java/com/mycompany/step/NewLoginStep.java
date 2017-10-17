package com.mycompany.step;

import cucumber.api.java.en.Then;

public class NewLoginStep {

	@Then("^validate user credentials$")
	public void validate_user_credentials() throws Throwable {
		System.out.println("validate user credentials");
	}
}
