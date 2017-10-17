package com.mycompany.generictests;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.mycompany.generics.GenericMethods;
import com.mycompany.utility.Driver;

public class GenericRegFormTest {
	WebDriver driver;
	GenericMethods genericMethod;
	String baseURL;

	@Before
	public void setUp() {
		// driver location
		System.setProperty(Driver.CHROME_KEY, Driver.CHROME_PATH);
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		genericMethod = new GenericMethods(driver);
		baseURL = "http://naveenks.com/selenium/RegForm.html";

	}

	@After
	public void tearDown() throws InterruptedException {
		Thread.sleep(2000);
		driver.quit();
	}
	
	
	
	@Test
	public void regFormTest(){
		
		driver.get(baseURL);
		// if the input locator is wrongly typed then the generic method shall 
		// give the error message 
		
		
		String emailLocator = "inputEm";
		String passwordLocator ="inputPassword";
		String conPwdLocator="confirmPassword";
		String firstNameLocator = "firstName";
		String lastNameLocator ="lastName";
		
		genericMethod.getElement(emailLocator, "id").sendKeys("naren@gmail.com");
		genericMethod.getElement(passwordLocator, "id").sendKeys("secret@123");
		genericMethod.getElement(conPwdLocator, "id").sendKeys("secret@123");
		genericMethod.getElement(firstNameLocator, "id").sendKeys("Naren");
		genericMethod.getElement(lastNameLocator, "id").sendKeys("Kumar");
		
	}
}
