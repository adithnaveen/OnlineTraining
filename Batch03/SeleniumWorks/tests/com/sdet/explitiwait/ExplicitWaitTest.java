package com.sdet.explitiwait;

import static org.junit.Assert.*;

import java.lang.reflect.GenericSignatureFormatError;
import java.util.Arrays;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.sdet.generics.GenericMethods;
import com.sdet.jdbc.LoginBean;
import com.sdet.jdbc.LoginDAO;
import com.sdet.utility.DriverFactory;


public class ExplicitWaitTest {

	// selenium code 
	WebDriver driver;
	String baseURL;
	GenericMethods genericMethod;

	@Before
	public void setUp() {
		driver = DriverFactory.getDriver("chrome");
		genericMethod = new GenericMethods(driver);
		baseURL = "http://naveenks.com/selenium/LoginForm.html";
	}

	@After
	public void tearDown() throws InterruptedException {
		Thread.sleep(2000);
		// driver.quit();
	}
	
	@Test
	public void loginExplicitWaitTest(){
		driver.get(baseURL);
		
//		genericMethod.getElement("uname", "id").sendKeys("something");
		
		
		// the value 10 is maximum amount of time to wait for 
		WebDriverWait wait = new WebDriverWait(driver, 10); 
		
		WebElement userName = wait.until(
					ExpectedConditions.visibilityOfElementLocated(By.id("uname"))
				);
				
		
		userName.sendKeys("testing@gmail.com");
		
	}
}
