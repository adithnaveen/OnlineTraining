package com.mycomp.basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.mycomp.utils.DriverFactory;
import com.mycomp.utils.DriverNames;

public class BasicEx2 {
	public static void main(String[] args) 
		throws Exception{
		WebDriver driver = DriverFactory.getDriver(DriverNames.CHROME);
		String baseURL="http://naveenks.com/selenium/LoginForm.html";
		
		driver.get(baseURL);
		// processing 
		driver.findElement(By.id("uname")).sendKeys("hello@hello.com");
		Thread.sleep(1500);
		
		driver.findElement(By.id("pwd")).sendKeys("secret@123");
		Thread.sleep(1500);

		driver.findElement(By.id("submitBtn")).click();
		Thread.sleep(2000);

		driver.close();
		
	}
}
