package com.mycompany.test.basics;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.mycompany.utility.Driver;

// This program will show working of navigation from two web application

public class NavigationTest03 {

	WebDriver driver;
	String baseURL; 
	String baseURL1;
	
	@Before
	public void setUp(){
		// driver location
		System.setProperty(Driver.CHROME_KEY, Driver.CHROME_PATH);

		driver = new ChromeDriver();
		baseURL = "http://naveenks.com/selenium/LoginForm.html";
		baseURL1 = "http://google.com";
		
		driver.get(baseURL);
	}
	
	@After
	public void tearDown() throws InterruptedException{
		Thread.sleep(2000);
		driver.quit();
	}
	
	@Test
	public void navigateTest() throws InterruptedException{
		String baseUrlTitle = driver.getTitle();

		System.out.println("Base URL Title -> " 
				+  (baseUrlTitle.length()<1 ?"No Title":baseUrlTitle));
		
		Thread.sleep(2000);
		
		// driver.get(baseURL1);
		
		driver.navigate().to(baseURL1);
		String baseUrl1Title = driver.getTitle();
		
		System.out.println("Base URL 1 Title " + baseUrl1Title);
		
		// move to previous page 
		System.out.println("Moving Back... ");
		driver.navigate().back();
		baseUrlTitle = driver.getTitle();
		System.out.println("Base URL Title -> " 
				+  (baseUrlTitle.length()<1 ?"No Title":baseUrlTitle));
		
		System.out.println("Refreshing page...");
		driver.navigate().refresh(); 
		System.out.println("Refreshed Page is " + driver.getTitle());
		
		System.out.println("Forwrding to other page...");
		driver.navigate().forward();
		System.out.println("Forwarded Page is " + driver.getTitle());
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
