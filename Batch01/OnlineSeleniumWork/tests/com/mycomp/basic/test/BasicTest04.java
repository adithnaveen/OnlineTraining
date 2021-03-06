package com.mycomp.basic.test;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import com.mycomp.utils.DriverFactory;
import com.mycomp.utils.DriverNames;

// this program is to show working of navigation between two links 
// and show working of getting the driver with driver factory 
public class BasicTest04 {

	WebDriver driver;
	String baseURL1;
	String baseURL2;
	
	@Before
	public void setUp() throws Exception {
		
		driver = DriverFactory.getDriver(DriverNames.CHROME);
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		
		baseURL1 = "http://fanniemae.com/portal/index.html";
		baseURL2 = "https://google.com";
		driver.get(baseURL1);
	}

	@After
	public void tearDown() throws Exception {
		Thread.sleep(3000);
		driver.quit();
	}
	
	
	// import ctrl + shift + O
	@Test
	public void test() throws Exception {
		String baseUrl1Title = driver.getTitle();
		System.out.println("Base Url1 title -> " + baseUrl1Title);
		Thread.sleep(2000);
		
		driver.navigate().to(baseURL2);
		String baseUrl2Title = driver.getTitle();
		System.out.println("BaseURL 2 Title -> " + baseUrl2Title);
		Thread.sleep(2000);
		
		System.out.println("going back....");
		driver.navigate().back();
		Thread.sleep(1500);
		
		System.out.println("Before Refresh... ");
		driver.navigate().refresh();
		System.out.println("Before forward... ");
		driver.navigate().forward();
		System.out.println("current URL after forward is " + driver.getCurrentUrl());
	
		System.out.println("------------------------");
		System.out.println(driver.getPageSource());
	}

}
