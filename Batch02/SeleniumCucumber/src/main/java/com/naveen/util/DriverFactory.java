package com.naveen.util;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverFactory {
	static WebDriver driver;

	public static WebDriver getDriver(String browser) {
		if (browser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\OnlineTraining\\SeleiumDeps\\Drivers\\chromedriver.exe");

			driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			return driver;
		} else if (browser.equals("ie")) {
			// TODO fill IE driver
		} else if (browser.equals("firefox")) {
			// TODO fill Firefox Driver
		}

		return null;
	}
}