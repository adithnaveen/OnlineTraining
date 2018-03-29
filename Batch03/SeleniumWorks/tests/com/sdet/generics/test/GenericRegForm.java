package com.sdet.generics.test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import com.sdet.generics.GenericMethods;
import com.sdet.utility.DriverFactory;

public class GenericRegForm {

	WebDriver driver;
	String baseURL;
	GenericMethods genericMethod; 
	@Before
	public void setUp() {
		driver = DriverFactory.getDriver("chrome");
		genericMethod = new GenericMethods(driver);
		baseURL="http://naveenks.com/selenium/RegForm.html";
	}

	@After
	public void tearDown() throws InterruptedException {
		Thread.sleep(2000);
		driver.quit();
	}
	
	@Test
	public void regFormTest(){
		driver.get(baseURL);
		
		// if the input locator is wrongly typed then the generic method 
		// shall give an error message 
		
		String emailLocator ="inputEmail";
		String passwordLocator="inputPassword";
		String confirmPwdLocator="confirmPassword";
		String firstNameLocator="firstName";
		String lastNameLocator="lastName";
		String regBtnLocator="/html/body/div[1]/form/div[15]/div/input[1]";
		
		genericMethod.getElement(emailLocator, "id").sendKeys("mahender@gmail.com");
		genericMethod.getElement(passwordLocator, "id").sendKeys("Test@123");
		genericMethod.getElement(confirmPwdLocator, "id").sendKeys("Test@123");
		genericMethod.getElement(firstNameLocator, "id").sendKeys("Mahender");
		genericMethod.getElement(lastNameLocator, "id").sendKeys("Kumar");
		
		genericMethod.getElement(regBtnLocator, "xpath").click();
		
		
		
		
	}
	

}















