package com.mycompany.test.basics;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.mycompany.utility.Driver;
import com.mycompany.utility.MathUtility;

public class BasicTest05 {
	WebDriver driver;
	String baseURL;

	@Before
	public void setUp() {
		// driver location
		System.setProperty(Driver.CHROME_KEY, Driver.CHROME_PATH);
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		baseURL = "https://demostore.x-cart.com/";

	}



	@After
	public void tearDown() throws InterruptedException {
		Thread.sleep(2000);
		driver.quit();
	}
	
	@Test
	public void demoCartTest() throws InterruptedException{
		
		driver.get(baseURL);
		
		// we dont have to give xpath 
		driver.findElement(By.linkText("Shipping")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.partialLinkText("Contact")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.id("name")).sendKeys("Peter");
		Thread.sleep(1500);
		
		driver.findElement(By.id("email")).sendKeys("peter@gmail.com");
		Thread.sleep(1500);
		
		driver.findElement(By.id("subject")).sendKeys("Testing from Selenium");
		
	}
	
	
}






