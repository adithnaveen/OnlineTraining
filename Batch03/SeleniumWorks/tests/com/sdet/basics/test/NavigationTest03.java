package com.sdet.basics.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.sdet.utility.Driver;

public class NavigationTest03 {

	WebDriver driver; 
	String baseURL = null;
	String baseURL1 = null;
	@Before
	public void setUp(){
		System.setProperty(Driver.CHROME_KEY, Driver.CHROME_PATH);
		
		driver = new ChromeDriver();
		baseURL ="http://yahoo.com";
		baseURL1="http://google.com";
		driver.get(baseURL);
	}
	
	@After
	public void tearDown()  throws InterruptedException{
		Thread.sleep(2000);
		driver.quit();
	}
	
	@Test
	public void navigateTest() throws InterruptedException{
		driver.get(baseURL);
		
		String baseURLTitle = driver.getTitle(); 
		System.out.println("Base Url Title is "+ baseURLTitle);
		
		Thread.sleep(1500);
		
		// navigation 
		driver.navigate().to(baseURL1);
		String baseURLTitle1 = driver.getTitle(); 
		System.out.println("Base URL1 Title After navigation " + baseURLTitle1);
		
		// back 
		driver.navigate().back(); 
		baseURLTitle = driver.getTitle(); 
		System.out.println("Base Url Title is -> Back "+ baseURLTitle);

		System.out.println("Refresing the page");
		driver.navigate().refresh();
		System.out.println("Refreshed Page is " + driver.getTitle());
		
		// forward 
		driver.navigate().forward(); 
		baseURLTitle1 = driver.getTitle(); 
		System.out.println("After Naviting forward " + baseURLTitle1);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
