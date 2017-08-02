package com.mycomp.generictests;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;


import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.mycomp.generics.GenericMethods;
import com.mycomp.utils.DriverFactory;
import com.mycomp.utils.DriverNames;
import com.mycomp.utils.ElementType;

public class GenericExampleTest {

	WebDriver driver; 
	String baseURL ;
	GenericMethods genMethods;

	@Before
	public void setUp() throws Exception {
		driver = DriverFactory.getDriver(DriverNames.CHROME);
		
	// driver.manage().window().maximize();
		baseURL = "http://webmail.sdettraining.com/Login.aspx";
		genMethods = new GenericMethods(driver);
		driver.get(baseURL);
	}

	@After
	public void tearDown() throws Exception {
		Thread.sleep(3000);
		// driver.quit();
	}
	
	
	@Test
	public void test() {
		
		// 1. -> email ctl00_MPH_txtUserName
		String userName ="ctl00_MPH_txtUserName";
		genMethods.getElement(userName, ElementType.ID)
			.sendKeys("cohort415@sdettraining.com");
		
		// 2. -> pwd ctl00_MPH_txtPassword
		String password="ctl00_MPH_txtPassword";
		genMethods.getElement(password, ElementType.ID)
			.sendKeys("Hexaware04!");
		
		// 3. -> login btnLogin
		String subBtn = "btnLogin";
		genMethods.getElement(subBtn, ElementType.ID)
			.click();
		
		// refer to content iFrame -> ctl00_Split_Frame_ContentFrame
		driver.switchTo().frame("ctl00_Split_Frame_ContentFrame");
		
		WebElement lblCalendar = 
				genMethods.getElement("ctl00_MPH_calendarToday__Label", 
						ElementType.ID); 
		
		System.out.println("Coming from server " + lblCalendar.getText());
		
		Assert.assertEquals("Testing for Calendar Element", 
			"Cale", lblCalendar.getText());
	}

}
