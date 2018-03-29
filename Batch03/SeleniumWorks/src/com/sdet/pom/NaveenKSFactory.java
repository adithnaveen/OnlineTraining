package com.sdet.pom;

import org.openqa.selenium.WebDriver;

public class NaveenKSFactory {
	private WebDriver driver; 
	
	
	public NaveenKSFactory(WebDriver driver){
		this.driver = driver; 
	}
	
	public RegistrationPOM01 getRegisterForm(){
		return new RegistrationPOM01(driver); 
	}
	
	public LoginPOM02 getLoginForm(){
		return new LoginPOM02(driver); 
	}
}
