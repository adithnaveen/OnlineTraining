package com.mycomp.datepicker;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.mycomp.generics.GenericsMethods;
import com.mycomp.utils.DriverFactory;
import com.mycomp.utils.DriverNames;
import com.mycomp.utils.ScreenShot;

public class DatePickerTest {

	WebDriver driver;
	String baseURL;
	GenericsMethods genMethods; 
	ScreenShot screenShot; 
	@Before
	public void setUp() throws Exception {
		driver = DriverFactory.getDriver(DriverNames.CHROME);
		screenShot = new ScreenShot(driver);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		genMethods = new GenericsMethods(driver);
		baseURL = "http://naveenks.com/selenium/RegForm.html";
	}

	@After
	public void tearDown() throws Exception {
		Thread.sleep(3000);
		driver.quit();
	}
	
	@Test
	public void regFormTest() throws Exception{
		driver.get(baseURL);
	
		genMethods.getElement("travelfrom", "id").click();
		Thread.sleep(1000);
		
		screenShot.takeScreenShot();
		String allDates = ".//*[@id='ui-datepicker-div']/div[1]/table/tbody/tr/td";
		String currentDate =".//*[@id='ui-datepicker-div']/div[1]/table/tbody/tr/td[contains(@class,"
				+ " 'ui-datepicker-today')]";
		List<WebElement> allElements = genMethods.getElementAsList(allDates, "xpath");
		List<String> allDatesElementsAsStringList = new ArrayList<String>();
		
		
		for(WebElement temp : allElements){
			System.out.println(temp.getText());
			allDatesElementsAsStringList.add(temp.getText());
		}
		
		
		// get current date  only for format 

		genMethods.getElement(currentDate, "xpath").click();
		String getCurrentDate  = genMethods.getElement("travelfrom", "id").getAttribute("value");
		System.out.println("Current Date selected " + getCurrentDate);
		
		System.out.println("Size of element  " + allDatesElementsAsStringList.size());
		
		for(String temp : allDatesElementsAsStringList){
			if(temp.length()!=0){
				
				// date sending format 
				// the format 08/08/2017  -- MM/DD/YYYY
				String dateSending =(String) getCurrentDate.subSequence(0, getCurrentDate.indexOf("/") +1)
						+ temp + 
						getCurrentDate.subSequence(getCurrentDate.lastIndexOf("/"), getCurrentDate.length());
				
				System.out.println("Sending Date " + dateSending);
				
				genMethods.getElement("travelfrom", "id").clear();
				genMethods.getElement("travelfrom", "id").sendKeys(dateSending);
				Thread.sleep(1000);
				screenShot.takeScreenShot();
			}
		}
	}
}
