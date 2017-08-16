package com.mycomp.basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

// send some values to the login screen 
// and click on submit 
public class BasicTest02 {
	public static void main(String[] args) 
			throws Exception{
		WebDriver driver ; 
		String baseUrl ="http://naveenks.com/selenium/LoginForm.html";
		
		System.setProperty("webdriver.chrome.driver", "C:\\software\\SeleniumDriver\\chromedriver.exe");
		driver = new ChromeDriver();
		
		// open the page 
		driver.get(baseUrl);
		
		// processing 
		// Text Fields 
		WebElement userElement = driver.findElement(By.id("uname"));
		WebElement passwordElement  = driver.findElement(By.id("pwd"));
		
		// button 
		WebElement submitButtonElement = driver.findElement(By.id("submitBtn"));
		
		
		userElement.sendKeys("hello@gmail.com");
		Thread.sleep(2000);
		
		passwordElement.sendKeys("secret123");
		Thread.sleep(2000);

		submitButtonElement.click();
		Thread.sleep(2000);

		// to close the browser 
		// driver.close();
		
	}
}
