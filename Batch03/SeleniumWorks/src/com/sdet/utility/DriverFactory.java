package com.sdet.utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class DriverFactory {
	public static WebDriver getDriver(String driverName){
		WebDriver driver = null;
		if(driverName.equals("chrome")){
			// return chrome driver details 
			System.setProperty(Driver.CHROME_KEY, Driver.CHROME_PATH);
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			return driver; 

		}else if(driverName.equals("firefox")){
			// return firefox driver details 
			
			System.setProperty(Driver.FIREFOX_KEY,Driver.FIREFOX_PATH);
			
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			
			return driver; 
		}else if(driverName.equals("ie")){
			System.setProperty(Driver.IE_KEY,Driver.IE_PATH);
			driver = new InternetExplorerDriver(); 
			
		}

		return null; 
	}
}
