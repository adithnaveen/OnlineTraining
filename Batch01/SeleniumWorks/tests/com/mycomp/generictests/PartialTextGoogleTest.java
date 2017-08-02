package com.mycomp.generictests;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;


import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.mycomp.generics.GenericMethods;
import com.mycomp.utils.DriverFactory;
import com.mycomp.utils.DriverNames;
import com.mycomp.utils.ElementType;

/**
 * This program will take the partial text which can be sent to google.com and get the 
 * options/suggestions which google shows, for each options we can do iterations 
 */
public class PartialTextGoogleTest {

	WebDriver driver; 
	String baseURL ;
	GenericMethods genMethods;

	@Before
	public void setUp() throws Exception {
		driver = DriverFactory.getDriver(DriverNames.CHROME);

		baseURL = "https://www.google.com/";
		genMethods = new GenericMethods(driver);
		driver.get(baseURL);
	}

	@After
	public void tearDown() throws Exception {
		Thread.sleep(3000);
		driver.quit();
	}
	
	@Test
	public void partialGoogleTest() throws Exception{
		
		String partialText = "places to ";
		
		// click on flight tab 
		genMethods.getElement("lst-ib", ElementType.ID).click();
		genMethods.getElement("lst-ib", ElementType.ID).clear();
		
		
		genMethods.getElement("lst-ib", ElementType.ID).sendKeys(partialText);
		
		Thread.sleep(2000);
		
		List<WebElement> googleOptions = driver.findElements(By.className("sbqs_c"));
		System.out.println("Number of Google Suggessions -> " +googleOptions.size());
		
		List<String> listOfGoogleOptions = new ArrayList<String>();
		
		for(WebElement temp : googleOptions){
			System.out.println(temp.getText());
			listOfGoogleOptions.add(temp.getText());
		}
		
		for(String temp : listOfGoogleOptions){
			genMethods.getElement("lst-ib", ElementType.ID).clear();			
			genMethods.getElement("lst-ib", ElementType.ID).sendKeys(temp);
			Thread.sleep(1500);
		}
		
		
	}
}



