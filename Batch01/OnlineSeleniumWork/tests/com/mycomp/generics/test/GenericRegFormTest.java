package com.mycomp.generics.test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.mycomp.generics.GenericsMethods;
import com.mycomp.utils.DriverFactory;
import com.mycomp.utils.DriverNames;


public class GenericRegFormTest {

	WebDriver driver;
	String baseURL;
	GenericsMethods genMethods; 
	
	@Before
	public void setUp() throws Exception {
		
		driver = DriverFactory.getDriver(DriverNames.CHROME);
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();

		genMethods = new GenericsMethods(driver);
		baseURL = "http://naveenks.com/selenium/RegForm.html";
	}

	@After
	public void tearDown() throws Exception {
		Thread.sleep(3000);
		driver.quit();
	}
	
	@Test
	public void regFormTest() throws Exception{
		driver.get(baseURL);
		
		// this data can be pulled from .txt / .xls / .xlsx 
		String email = "inputEmail";
		String password = "inputPassword";
		String confirmPassword ="confirmPassword";
		String firstName = "firstName";
		String regButton ="html/body/div[1]/form/div[15]/div/input[1]";
		
		// will do findElement by Id 
		// this method will make check for single entry 
		// this method will return null if no element is found or 
		// if there are multiple entries 
		
		
		genMethods.getElement(email, "id").sendKeys("radha@gmail.com");
		Thread.sleep(1000);
		genMethods.getElement(password, "id").sendKeys("secret@123");
		Thread.sleep(1000);
		genMethods.getElement(confirmPassword, "id").sendKeys("secret@123");
		Thread.sleep(1000);
		genMethods.getElement(firstName, "id").sendKeys("Radha");
		Thread.sleep(1000);
		genMethods.getElement(regButton, "xpath").click();
		
		
	}
		
	
	
	
}
