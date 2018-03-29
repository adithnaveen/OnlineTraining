package com.sdet.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test02Login {
	public static void main(String[] args)
		throws InterruptedException{
		WebDriver driver; 
		// 1. TODO Load the driver 
		System.setProperty("webdriver.chrome.driver", 
					"C:\\OnlineTraining\\SDET Mar 2018\\SeleniumDeps\\chromedriver.exe");
				
		driver = new ChromeDriver(); 
				
		String url="http://naveenks.com/selenium/LoginForm.html";
		
		driver.get(url);
		
		driver.findElement(By.id("uname")).sendKeys("hello@gmail.com");
		Thread.sleep(2500);
				
		driver.findElement(By.id("pwd")).sendKeys("hello112233");
		Thread.sleep(2500);
		
		driver.findElement(By.id("submitBtn")).click();
		Thread.sleep(2500);
		driver.quit();
	}
}
