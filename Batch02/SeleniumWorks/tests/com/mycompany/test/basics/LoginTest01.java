package com.mycompany.test.basics;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import com.mycompany.utility.Driver;;
public class LoginTest01 {
	WebDriver driver;
	@Before
	public void setUp(){
		// driver location
		System.setProperty(Driver.CHROME_KEY, Driver.CHROME_PATH);

		driver = new ChromeDriver();
		String baseURL = "http://naveenks.com/selenium/LoginForm.html";
		driver.get(baseURL);
	}
	
	@After
	public void tearDown() throws InterruptedException{
		Thread.sleep(2000);
		driver.quit();
	}
	
	@Test
	public void loginTest() throws InterruptedException {
		driver.findElement(By.id("uname")).sendKeys("hello@gmail.com");
		Thread.sleep(2000);
		
		driver.findElement(By.id("pwd")).sendKeys("hello@123");
		Thread.sleep(2000);

		driver.findElement(By.id("submitBtn")).click();
		

		
	}

}
