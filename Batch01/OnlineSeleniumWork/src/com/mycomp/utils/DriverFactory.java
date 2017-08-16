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

	public static WebDriver getDriver(String driverName) {
		
		if (driverName.equals("CHROME")) {
			System.setProperty(Driver.CHROME, Driver.CHROME_PATH);
			driver = new ChromeDriver();

		} else if (driverName.equals("FIREFOX")) {
			System.setProperty(Driver.FIREFOX, Driver.FIREFOX_PATH);
			driver = new FirefoxDriver();

		} else if (driverName.equals("IE")) {
			// TODO 
		}

		return driver;
	}

}
