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
public class BasicTest02 {
	WebDriver driver;
	String baseUrl = "http://naveenks.com/selenium/LoginForm.html";

	@Before
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", 
			"C:\\software\\SeleniumDriver\\chromedriver.exe");
		driver = new ChromeDriver();

		// open the page
		driver.get(baseUrl);

	}

	@After
	public void tearDown() {
		driver.close();
	}

	@Test
	public void loginTest() throws Exception{
		// processing
		// Text Fields
		WebElement userElement = driver.findElement(By.id("uname"));
		WebElement passwordElement = driver.findElement(By.id("pwd"));

		// button
		WebElement submitButtonElement = driver.findElement(By.id("submitBtn"));

		userElement.sendKeys("hello@gmail.com");
		Thread.sleep(2000);

		passwordElement.sendKeys("secret123");
		Thread.sleep(2000);

		submitButtonElement.click();
	}

}
