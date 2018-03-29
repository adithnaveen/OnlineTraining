package com.sdet.basics.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.sdet.utility.Driver;

public class GoogleTest02 {

	WebDriver driver; 
	
	@Before
	public void setUp(){
		System.setProperty(Driver.CHROME_KEY, Driver.CHROME_PATH);
		
		driver = new ChromeDriver();
		String baseURL ="http://google.com";
		driver.get(baseURL);
	}
	
	@After
	public void tearDown()  throws InterruptedException{
		Thread.sleep(2000);
		driver.quit();
	}
	
	@Test
	public void googleTest(){
		// 3 logical element for search box in google.com 
		/*
		 * 	lst-ib
			gs_taif0
			gs_htif0
		 */
		
		WebElement searchElement = driver.findElement(By.id("gs_htif0"));
		
		if(searchElement.isEnabled()){
			System.out.println("The field is enabled and values are sent");
			searchElement.sendKeys("places near me");
		}else {
			System.out.println("The field is disabled ");
		}
		
		
	}
	

}
