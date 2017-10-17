package com.mycompany.utility;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;

public class ScreenShot {

	private WebDriver driver; 
	
	// the driver object will be given by selenium 
	// test case/script 
	public ScreenShot(WebDriver driver){
		this.driver = driver; 
	}
	
	// to capture the screen shot 
	
	public void captureScreenShot(String fileName){
		String path ="C:\\Users\\Naveen\\Desktop\\screenshots\\";
		
		// 1. Create file 
		// 2. we have to call the selenium screen capturer to take screen shot 
		// 3. finally save the content to path 
		
		try {
			TakesScreenshot takeScreenShot = (TakesScreenshot) driver; 
			// by doing this the file is create and it is in transient mode 
			// to persis the data which is got from selenium we may have to 
			// copy the raw contents given by selenium to physical file 
			File file = takeScreenShot.getScreenshotAs(OutputType.FILE);
			
			FileUtils.copyFile(file, new File(path + fileName));
		} catch (WebDriverException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
