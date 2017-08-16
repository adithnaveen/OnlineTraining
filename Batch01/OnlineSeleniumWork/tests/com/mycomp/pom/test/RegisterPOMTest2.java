package com.mycomp.pom.test;

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
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.mycomp.generics.GenericsMethods;
import com.mycomp.pom.RegisterPOM;
import com.mycomp.pom.RegisterPOM1;
import com.mycomp.utils.DriverFactory;
import com.mycomp.utils.DriverNames;
import com.mycomp.utils.ScreenShot;


public class RegisterPOMTest2 {

	WebDriver driver;
	String baseURL;
	ScreenShot screenShot; 
	RegisterPOM1 regPOM; 
	
	@Before
	public void setUp() throws Exception {
		driver = DriverFactory.getDriver(DriverNames.CHROME);
		screenShot = new ScreenShot(driver);
		regPOM = new RegisterPOM1(driver);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();

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
		regPOM.sendEmail("kumar@gmail.com");
		regPOM.sendPassword("kumar@123");
		regPOM.sendConfirmPassword("kumar@123");
		regPOM.clickRegButton();
	}
	
	
	
}
