package com.sdet.pom.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import com.sdet.pom.RegistrationPOM01;
import com.sdet.pom.RegistrationPOM03;
import com.sdet.utility.DriverFactory;

public class RegFormSeleniumWayTest {
	WebDriver driver; 
	String baseURL = null;
	RegistrationPOM03 regPom; 
	
	@Before
	public void setUp(){
		driver = DriverFactory.getDriver("chrome"); 
		regPom = new RegistrationPOM03(driver); 
		baseURL ="http://naveenks.com/selenium/RegForm.html";
	}
	
	@After
	public void tearDown()  throws InterruptedException{
		Thread.sleep(2000);
		driver.quit();
	}
	
	@Test
	public void regFormTest(){
		driver.get(baseURL);
		regPom.sendEmail("aswini@gmail.com");
		regPom.sendPassword("hello@123");
		regPom.sendConfirmPassword("hello@123");
		regPom.sendFirstName("Aswini");
		regPom.sendLastName("sridhar");
		regPom.clickRegBtn();
	}
}
