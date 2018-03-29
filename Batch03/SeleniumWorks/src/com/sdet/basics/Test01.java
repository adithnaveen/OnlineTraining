package com.sdet.basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test01 {
	public static void main(String[] args) {
		WebDriver driver; 
		
		// 1. TODO Load the driver 
		/*System.setProperty("webdriver.chrome.driver", 
				"C:\\OnlineTraining\\SDET Mar 2018\\SeleniumDeps\\chromedriver.exe");
		
		driver = new ChromeDriver(); */
		
		System.setProperty("webdriver.gecko.driver", 
				"C:\\OnlineTraining\\SDET Mar 2018\\SeleniumDeps\\geckodriver.exe");
		
		driver = new FirefoxDriver();
		
		// 2. TODO Open Browser 
		String url="http://yahoo.com";
		driver.get(url);
			
		// 3. TODO Do Operation
		String webSiteTitle = driver.getTitle();
		System.out.println("Page Title : " + webSiteTitle);
		
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		// 4. TODO close the browser 
		driver.quit();
		
	}
}
