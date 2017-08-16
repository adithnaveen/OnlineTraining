package com.mycomp.utils;

import java.io.File;
import java.io.IOException;
import java.util.Calendar;
import java.util.GregorianCalendar;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;

// this class will help us to capture the screen shot 
// screen shot feature is from selenium 


public class ScreenShot {
	private WebDriver driver; 
	
	// the driver information is passed from selenium script 
	// the selenium script will get it from driver factory 
	public ScreenShot(WebDriver driver){
		this.driver = driver; 
	}
	
	
	// we have a method to capture screen shot 
	public void takeScreenShot(String fileName){
		String path="C:\\Users\\Naveen\\Desktop\\selenium_screen_shot\\";
		
		// 1. we have to create a file
		// 2. the selenium executor should give the current screen 
		// 3. the content given from the selenium executor should be saved to to the file 
		
		try {
			
			TakesScreenshot takeScreenShot = (TakesScreenshot) driver;
			// as of now it is not persisted 
			File file = takeScreenShot.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(file, new File(path + fileName));
			
			
		} catch (WebDriverException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	
	public void takeScreenShot(){
		String path="C:\\Users\\Naveen\\Desktop\\selenium_screen_shot\\";
		Calendar calendar = GregorianCalendar.getInstance();
		
		// 1. we have to create a file
		// 2. the selenium executor should give the current screen 
		// 3. the content given from the selenium executor should be saved to to the file 
		
		try {
			
			TakesScreenshot takeScreenShot = (TakesScreenshot) driver;
			// as of now it is not persisted 
			File file = takeScreenShot.getScreenshotAs(OutputType.FILE);
			
			String fileName =calendar.get(Calendar.DATE) +"-" + calendar.get(Calendar.HOUR) +"-"
			+ calendar.get(Calendar.MINUTE) + "-" + calendar.get(Calendar.SECOND) +".png";
			
			FileUtils.copyFile(file, new File(path + fileName));
			
			
		} catch (WebDriverException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}



















