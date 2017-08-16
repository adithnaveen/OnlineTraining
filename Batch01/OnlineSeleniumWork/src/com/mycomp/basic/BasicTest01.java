package com.mycomp.basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

// this program is to test working of selenium for google.com 
public class BasicTest01 {
	public static void main(String[] args) {
		
		String url ="http://google.com";
		WebDriver driver ; 
		// TODO 
		// 1 Load the Driver 
		// System.setProperty("webdriver.chrome.driver", "C:\\software\\SeleniumDriver\\chromedriver.exe");
		// webdriver.ie.driver 
		// webdriver.safari.driver 
		System.setProperty("webdriver.gecko.driver", "C:\\software\\SeleniumDriver\\geckodriver.exe");
		
		
		// driver = new ChromeDriver();
		driver = new FirefoxDriver();
		
		// 2 Website to go for
		driver.get(url);
		
		// 3 do processing 
		String title = driver.getTitle();
		System.out.println("From Selenium -> " + title);
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		// 4 Close the browser 
		driver.close();
	}
}
