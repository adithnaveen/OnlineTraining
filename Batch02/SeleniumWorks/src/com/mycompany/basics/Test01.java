package com.mycompany.basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test01 {
	public static void main(String[] args) {
		// 1. TODO  ->  Load The Driver 
		WebDriver driver; 
		
		// driver location 
		/*System.setProperty("webdriver.chrome.driver", 
			"C:\\OnlineTraining\\SeleiumDeps\\Drivers\\chromedriver.exe");
		
		driver = new ChromeDriver();*/
		
		
		System.setProperty("webdriver.gecko.driver", 
				"C:\\OnlineTraining\\SeleiumDeps\\Drivers\\geckodriver.exe");
		
		driver = new FirefoxDriver();
		
		String baseURL="http://yahoo.com";
		// 2. TODO -> Open The Browser 
		driver.get(baseURL);
		
		// 3. TODO -> Do Operation 
		String webSiteURL = driver.getTitle();
		System.out.println("Google's page title is -> "+  webSiteURL);
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		
		// 4. TODO -> close the Browser 
		driver.quit();
	}
}
