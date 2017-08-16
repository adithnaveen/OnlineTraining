package com.mycomp.basic.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

// This junit will send values to login page 
public class BasicTest03 {
	WebDriver driver;
	String baseUrl1; 
	String baseUrl2; 
	
	
	@Before
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", 
			"C:\\software\\SeleniumDriver\\chromedriver.exe");
		driver = new ChromeDriver();
		
		baseUrl1 = "http://naveenks.com/selenium/LoginForm.html";
		baseUrl2 = "http://google.com";
		// open the page
		driver.get(baseUrl1);

	}

	@After
	public void tearDown() {
		driver.close();
	}

	@Test
	public void loginTest() throws Exception{
		// processing
		String baseUrl1Title = driver.getTitle();
		System.out.println("Current Url " + baseUrl1Title);
		
		Thread.sleep(2000);
		
		// we you do driver.get it opens a new browser 
//		driver.get("");
		
		driver.navigate().to(baseUrl2);
		String baseUrl2Title = driver.getTitle();
		System.out.println("current Url " + baseUrl2Title);
		
		
		Thread.sleep(2000);	
		
		System.out.println("Going Back...");
		driver.navigate().back();
		Thread.sleep(2000);	

		System.out.print("Refreshing the current Page " + driver.getTitle());
		driver.navigate().refresh();
		Thread.sleep(2000);	

		
		System.out.println("Moving forward.... ");
		driver.navigate().forward();
		System.out.println("After moving forward title is " + driver.getTitle());
		
	}

}
