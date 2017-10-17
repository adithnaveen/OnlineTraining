package com.mycompany.datepickerinclass;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.mycompany.generics.GenericMethods;
import com.mycompany.utility.Driver;

public class DatePickerRegFormTest {
	WebDriver driver;
	GenericMethods genericMethod;
	String baseURL;

	@Before
	public void setUp() {
		// driver location
		System.setProperty(Driver.CHROME_KEY, Driver.CHROME_PATH);
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		genericMethod = new GenericMethods(driver);
		baseURL = "http://naveenks.com/selenium/RegForm.html";

	}

	@After
	public void tearDown() throws InterruptedException {
		Thread.sleep(2000);
		driver.quit();
	}
	
	
	@Test
	public void regFormDatePicker() throws InterruptedException{
		driver.get(baseURL);
		// to popup date picker
		genericMethod.getElement("travelfrom", "id").click();
		Thread.sleep(500);
		

		String xpathAllElements=".//*[@id='ui-datepicker-div']/div[1]/table/tbody/tr/td";
		String xpathCurrentDate=".//*[@id='ui-datepicker-div']/div[1]/table/tbody/tr/td"
				+ "[contains(@class, 'ui-datepicker-today')]";

		
		List<WebElement> allElements = genericMethod.getElements(xpathAllElements, "xpath");
		List<String> allDateElementsAsStringList = new ArrayList<String>();
		
		for(WebElement temp : allElements){
			System.out.println(temp.getText());
			allDateElementsAsStringList.add(temp.getText());
		}
		
		// get current date for format only 
		genericMethod.getElement(xpathCurrentDate, "xpath").click();
		
		// 10/10/2017 
		String getCurrentDate = genericMethod.getElement("travelfrom", "id").getAttribute("value");
		System.out.println("Current Date Selected : " + getCurrentDate);
		
		for(String temp: allDateElementsAsStringList){
			if(temp.length()!=0){
				// send date 
				// 10/10/2017 (MM/DD/YYYY)
				// from Srini Question for prefix 0 if single digit 
				if(Integer.parseInt(temp) <10){
					temp = "0" + temp;
				}
				// 10/ - 1 -
				String dateSending = getCurrentDate.subSequence
						(0, getCurrentDate.indexOf("/")+ 1) + 
						temp + 
						getCurrentDate.subSequence(
								getCurrentDate.lastIndexOf("/"),
								getCurrentDate.length());
				System.out.println("Date sending -> " + dateSending);
				
				genericMethod.getElement("travelfrom", "id").clear();
				genericMethod.getElement("travelfrom", "id").sendKeys(dateSending);
				Thread.sleep(1000);
			}
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
