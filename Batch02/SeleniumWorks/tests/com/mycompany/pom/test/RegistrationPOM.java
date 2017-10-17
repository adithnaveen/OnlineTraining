package com.mycompany.pom.test;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.mycompany.generics.GenericMethods;
import com.mycompany.pom.RegisterPOM;
import com.mycompany.utility.Driver;

public class RegistrationPOM {

	WebDriver driver;
	RegisterPOM regPom; 
	String baseURL;

	@Before
	public void setUp() {
		// driver location
		System.setProperty(Driver.CHROME_KEY, Driver.CHROME_PATH);
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		regPom = new RegisterPOM(driver);
		baseURL = "http://naveenks.com/selenium/RegForm.html";

	}

	@After
	public void tearDown() throws InterruptedException {
		Thread.sleep(2000);
		driver.quit();
	}
	
	
	@Test
	public void regFormTest01() {
		driver.get(baseURL);
		regPom.sendEmail("harry@gmail.com");
		regPom.sendPassword("secret@123");
		regPom.sendConfirmPassword("secret@123");
		regPom.sendFirstName("HARRY");
		regPom.clickRegBtn();
	}
	
	

}
