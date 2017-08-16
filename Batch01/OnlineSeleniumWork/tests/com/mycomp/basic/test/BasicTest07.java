package com.mycomp.basic.test;

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

import com.mycomp.utils.DriverFactory;
import com.mycomp.utils.DriverNames;

/// to show working of clicking by link text 
public class BasicTest07 {

	WebDriver driver;
	
	String baseURL;

	
	@Before
	public void setUp() throws Exception {
		
		driver = DriverFactory.getDriver(DriverNames.CHROME);
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();


		baseURL = "https://demostore.x-cart.com/";
	}

	@After
	public void tearDown() throws Exception {
		Thread.sleep(3000);
		driver.quit();
	}
	
	@Test
	public void testing() throws Exception{
		driver.get(baseURL);
		
		// find the element 
		driver.findElement(By.linkText("Shipping")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.partialLinkText("Contact")).click();
		
		Thread.sleep(2000);

		// enter yrou name 
		driver.findElement(By.id("name")).sendKeys("hello");
		Thread.sleep(1000);
		driver.findElement(By.id("email")).sendKeys("hello@hello.com");
	}
		
	
	
	
}
