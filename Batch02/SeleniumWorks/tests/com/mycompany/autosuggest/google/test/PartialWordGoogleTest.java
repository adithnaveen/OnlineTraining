package com.mycompany.autosuggest.google.test;

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

// This program shall use the partial text to send it to google.com 
// and get the suggestions from google and test each value got from the 
// server 


public class PartialWordGoogleTest {
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
		baseURL = "http://google.com";

	}

	@After
	public void tearDown() throws InterruptedException {
		Thread.sleep(2000);
		driver.quit();
	}
	
	
	@Test
	public void partialTextGoogleTest() throws InterruptedException{
		driver.get(baseURL);
		
		
		String partialText = "places to";
		
		genericMethod.getElement("lst-ib", "id").clear();
		genericMethod.getElement("lst-ib", "id").sendKeys(partialText);
		
		Thread.sleep(1500);
		
		List<WebElement> googleOptions = genericMethod.getElements("sbqs_c", "class");
		System.out.println("Number of suggessions got from Google : "+ googleOptions.size());
		
		List<String> googleOptionsAsString = new ArrayList<String>();
		for(WebElement temp : googleOptions){
			System.out.println(temp.getText());
			googleOptionsAsString.add(temp.getText());
		}
		
		for(String temp: googleOptionsAsString){
			genericMethod.getElement("lst-ib", "id").clear();
			genericMethod.getElement("lst-ib", "id").sendKeys(temp);
			
			Thread.sleep(2500);
		}
		
		
		
		
	}

}










