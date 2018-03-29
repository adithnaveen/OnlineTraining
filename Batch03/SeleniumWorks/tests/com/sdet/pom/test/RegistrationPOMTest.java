package com.sdet.pom.test;

import static org.junit.Assert.*;

import java.sql.DriverManager;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.sdet.pom.RegistrationPOM01;
import com.sdet.utility.Driver;
import com.sdet.utility.DriverFactory;

public class RegistrationPOMTest {




	WebDriver driver; 
	String baseURL = null;
	RegistrationPOM01 registerPom; 
	
	
	
	@Before
	public void setUp(){
		driver = DriverFactory.getDriver("chrome"); 
		registerPom = new RegistrationPOM01(driver); 
		baseURL ="http://naveenks.com/selenium/RegForm.html";
	}
	
	@After
	public void tearDown()  throws InterruptedException{
		Thread.sleep(2000);
		driver.quit();
	}
	
	@Test
	public void regFormTest01(){
		driver.get(baseURL);
		registerPom.sendEmail("harry@gmail.com");
		registerPom.sendPassword("secret@123");
		registerPom.sendCnfPassword("secret@123");
		registerPom.sendFirstName("Harry");
		registerPom.sendLastName("Larry");
		registerPom.clickRegisterButton();
	}
	
}
