package com.mycom.autosuggest.test;

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
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.mycomp.generics.GenericsMethods;
import com.mycomp.utils.DriverFactory;
import com.mycomp.utils.DriverNames;
import com.mycomp.utils.ScreenShot;


public class PartialTextGoogleTest {

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
		baseURL = "https://www.google.co.in/";
	}

	@After
	public void tearDown() throws Exception {
		Thread.sleep(3000);
		driver.quit();
	}
	
	@Test
	public void partialTextGoogleTest() throws Exception{
		driver.get(baseURL);
		
		String partialText = "places to ";
		
		genMethods.getElement("lst-ib", "id").clear();
		genMethods.getElement("lst-ib", "id").sendKeys(partialText);
		
		Thread.sleep(1500);

		List<WebElement> googleOptions = genMethods.getElementAsList("sbqs_c", "class");
		System.out.println("Number of Suggessions Given By google : " + googleOptions.size());
		
		List<String> googleOptionsAsString = new ArrayList<String>();
		
		for(WebElement temp : googleOptions){
			System.out.println(temp.getText());
			googleOptionsAsString.add(temp.getText());
		}
		
		for(String temp : googleOptionsAsString){
			genMethods.getElement("lst-ib", "id").clear();
			genMethods.getElement("lst-ib", "id").sendKeys(temp);

			Thread.sleep(2000);
		}
		
		
		
	}
		
	
	
	
}
