package com.mycomp.basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class BasicEx1 {
	public static void main(String[] args) {
		String baseUrl = "http://google.com";
		 WebDriver driver; 
		//  Load the driver
		// step 1 : TODO
		// this step loads the chrome driver 
		
//		System.setProperty("webdriver.chrome.driver", 
//				"C:\\software\\SeleniumDriver\\chromedriver.exe");
//		 driver = new ChromeDriver();
		
		 // "webdriver.firefox.marionette"
		 System.setProperty("webdriver.gecko.driver", 
				 "C:\\software\\SeleniumDriver\\geckodriver.exe");
		 
		 driver = new FirefoxDriver();
		 
		// Open the browser / connection 
		// step 2 : TODO
		 driver.get(baseUrl);
		 
		// do the processing 
		// step 3 : TODO

		 System.out.println("Title -> " + driver.getTitle());
		 
		 try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		// close 
		// step 4 : TODO
		 driver.close();
	}
}
