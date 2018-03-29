package com.sdet.pom.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import com.sdet.pom.LoginPOM02;
import com.sdet.pom.NaveenKSFactory;
import com.sdet.pom.RegistrationPOM01;
import com.sdet.utility.DriverFactory;

public class NaveenKSTest {


	WebDriver driver; 
	String baseURL = null;
	String baseURL1 = null;
	RegistrationPOM01 registerPom; 
	LoginPOM02 loginPom; 
	
	NaveenKSFactory factory = null ; 
	@Before
	public void setUp(){
		driver = DriverFactory.getDriver("chrome");
		
		factory = new NaveenKSFactory(driver); 
		registerPom = factory.getRegisterForm(); 
		loginPom = factory.getLoginForm(); 
		
		
		baseURL ="http://naveenks.com/selenium/RegForm.html";
		baseURL1 = "http://naveenks.com/selenium/LoginForm.html"; 
	}
	
	@After
	public void tearDown()  throws InterruptedException{
		Thread.sleep(2000);
		driver.quit();
	}
	

	@Test
	public void registerFormTest(){
		driver.get(baseURL);
		registerPom.sendEmail("harry@gmail.com");
		registerPom.sendPassword("secret@123");
		registerPom.sendCnfPassword("secret@123");
		registerPom.sendFirstName("Harry");
		registerPom.sendLastName("Larry");
		registerPom.clickRegisterButton();
	}

	@Test
	public void loginFormTest(){
		driver.get(baseURL1);
		loginPom.sendUserName("mini@gmail.com");
		loginPom.sendPassword("testing@123");
		loginPom.clickSubmitBtn(); 
	}
}
