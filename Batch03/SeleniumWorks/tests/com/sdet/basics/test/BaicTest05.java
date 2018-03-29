package com.sdet.basics.test;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.sdet.utility.Driver;

public class BaicTest05 {
	WebDriver driver;
	String baseURL;

	@Before
	public void setUp() {
		System.setProperty(Driver.CHROME_KEY, Driver.CHROME_PATH);

		driver = new ChromeDriver();
		baseURL = "https://demostore.x-cart.com/";
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@After
	public void tearDown() throws InterruptedException {
		Thread.sleep(2000);
		driver.quit();
	}

	@Test
	public void demoCartTest() throws InterruptedException {
		driver.get(baseURL);
		
		// we are not selecting xpath 
		//*[@id="header-area"]/div[1]/div/div[4]/div/ul/li[4]/a/span
		
		// selecting by link text 
		
		driver.findElement(By.linkText("Shipping")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.partialLinkText("Contact")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.id("name")).sendKeys("Peter");
		driver.findElement(By.id("email")).sendKeys("peter@gmail.com");
		driver.findElement(By.name("subject")).sendKeys("toys");
		driver.findElement(By.id("message")).sendKeys("This is for Testing");
		
		driver.findElement(By.xpath
				("//*[@id='form-1521766731270']/div[2]/div[2]/div/button")).click();
	}

}
