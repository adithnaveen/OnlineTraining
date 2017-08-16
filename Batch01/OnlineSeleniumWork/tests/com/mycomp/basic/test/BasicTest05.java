package com.mycomp.basic.test;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.mycomp.utils.DriverFactory;
import com.mycomp.utils.DriverNames;

/**
* 
* @author Naveen
* This program is to test either the element is enabled or disabled since on
* google.com the search bar is merged with many few are disabled, you can 
* identify the same before posting the values 
*/

public class BasicTest05 {

	WebDriver driver;
	
	String baseURL;
	
	@Before
	public void setUp() throws Exception {
		
		driver = DriverFactory.getDriver(DriverNames.CHROME);
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		
		
		baseURL = "https://google.com";
		driver.get(baseURL);
	}

	@After
	public void tearDown() throws Exception {
		Thread.sleep(3000);
		driver.quit();
	}
	
	
	// there are 3 elements which are on google.com home page 
	// gs_taif0, gs_htif0, lst-ib
	@Test
	public void test() {

		// lst-ib -> valid on google.com 
		
		WebElement element1 = driver.findElement(By.id("gs_taif0"));
		
		System.out.println("Element1 Enables -> " + element1.isEnabled());
		element1.sendKeys("places to visit");
		

	}

}
