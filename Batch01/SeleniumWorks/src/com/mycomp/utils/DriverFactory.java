package com.mycomp.utils;

import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class DriverFactory {

	static WebDriver driver; 

	public static WebDriver getDriver(String driverName){
		ChromeOptions chromeOptions;
			if(driverName.equals("CHROME")){
				
				
				chromeOptions  = new ChromeOptions();
				
				System.setProperty(Driver.CHROME, Driver.CHROME_PATH);
				
				
				chromeOptions.addArguments("--start-maximized");
				chromeOptions.addArguments("--disable-web-security");
				chromeOptions.addArguments("--no-proxy-server");
				// chromeOptions.addArguments("--incognito");

				java.util.Map<String, Object> prefs = new HashMap<String, Object>();		

				prefs.put("credentials_enable_service", false);
				prefs.put("profile.password_manager_enabled", false);
				chromeOptions.setExperimentalOption("prefs", prefs);
				DesiredCapabilities capabilities = DesiredCapabilities.chrome();

				capabilities.setCapability(ChromeOptions.CAPABILITY, chromeOptions);
				driver = new ChromeDriver(capabilities);
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				
				
				
				
			} else if(driverName.equals("FIREFOX")){
				System.setProperty(Driver.FIREFOX, Driver.FIREFOX_PATH);
				 driver = new FirefoxDriver();
			
			} else if(driverName.equals("IE")){
			
			}
		
		return driver;
	}
	
	
}

