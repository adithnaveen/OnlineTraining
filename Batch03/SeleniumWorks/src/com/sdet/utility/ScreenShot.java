package com.sdet.utility;

import java.io.File;
import java.io.IOException;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import javax.swing.plaf.FileChooserUI;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;

public class ScreenShot {
	private WebDriver driver; 
	
	// driver information will be given by selenium script 
	public ScreenShot(WebDriver driver){
		this.driver = driver; 
	}
	
	public void captureScreen(String fileName){
		String path="C:\\OnlineTraining\\SDET Mar 2018\\screenshots\\";
		
		// 1. Create a file 
		// 2. We have to selenium Screen capturer to take screen shot 
		// 3. Finally save it in physical storage 


		try {
			TakesScreenshot takeScreenShot = (TakesScreenshot) driver; 
			File file  = takeScreenShot.getScreenshotAs(OutputType.FILE); 
			FileUtils.copyFile(file, new File(path + fileName));
		} catch (WebDriverException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void captureScreen(){
		String path="C:\\OnlineTraining\\SDET Mar 2018\\screenshots\\";
		String fileName; 
		
		GregorianCalendar calendar = new GregorianCalendar(); 
		
		fileName = new Integer(calendar.get(Calendar.DATE)).toString() +"-" + 
				new Integer(calendar.get(Calendar.MINUTE)).toString()  +"-" +
				new Integer(calendar.get(Calendar.SECOND)).toString()  +".png";
		
		// 1. Create a file 
		// 2. We have to selenium Screen capturer to take screen shot 
		// 3. Finally save it in physical storage 


		try {
			TakesScreenshot takeScreenShot = (TakesScreenshot) driver; 
			File file  = takeScreenShot.getScreenshotAs(OutputType.FILE); 
			FileUtils.copyFile(file, new File(path + fileName));
		} catch (WebDriverException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
