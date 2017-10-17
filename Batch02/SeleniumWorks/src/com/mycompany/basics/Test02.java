package com.mycompany.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test02 {
	public static void main(String[] args) 
			throws InterruptedException {
		WebDriver driver;

		// driver location
		System.setProperty("webdriver.chrome.driver", 
				"C:\\OnlineTraining\\SeleiumDeps\\Drivers\\chromedriver.exe");

		// ctrl + shift + O
		// imports required dependencies
		driver = new ChromeDriver();
		String baseURL = "http://naveenks.com/selenium/LoginForm.html";

		driver.get(baseURL);

		driver.findElement(By.id("uname")).sendKeys("hello@gmail.com");
		Thread.sleep(2000);
		
		driver.findElement(By.id("pwd")).sendKeys("hello@123");
		Thread.sleep(2000);

		driver.findElement(By.id("submitBtn")).click();
		Thread.sleep(2000);

		driver.quit();

	}
}
