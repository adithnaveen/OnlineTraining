package com.sdet.generics.test;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.sdet.generics.GenericMethods;
import com.sdet.utility.DriverFactory;

public class DatePickerPartialExpediatTest {

	WebDriver driver;
	String baseURL;
	GenericMethods genericMethod;

	@Before
	public void setUp() {
		driver = DriverFactory.getDriver("chrome");
		genericMethod = new GenericMethods(driver);
		baseURL = "https://www.expedia.com/";
	}

	@After
	public void tearDown() throws InterruptedException {
		Thread.sleep(2000);
		 driver.quit();
	}

	
	
	@Ignore
	@Test
	public void partialTextTest() throws InterruptedException{
		
		driver.get(baseURL);
		genericMethod.getElement("tab-flight-tab-hp", "id").click();
		
		String flyFromPartial = "new"; 
		String flyToPartial="san";
		
		List<String> listOfSourceLocations = new ArrayList<String>();
		List<String> listofDestLocations = new ArrayList<String>(); 
		
		genericMethod.getElement("flight-origin-hp-flight", "id").clear();
		genericMethod.getElement("flight-origin-hp-flight", "id").sendKeys(flyFromPartial);

		Thread.sleep(1000);
		
		List<WebElement> flyFromPorts = genericMethod.getElements("class", "results-item");
		
		for(WebElement temp : flyFromPorts){
			System.out.println(temp.getText());
			listOfSourceLocations.add(temp.getText()); 
		}
		genericMethod.getElement("flight-destination-hp-flight", "id").clear();
		genericMethod.getElement("flight-destination-hp-flight", "id").sendKeys(flyToPartial);

		Thread.sleep(1000);

		List<WebElement> flyToPorts = genericMethod.getElements("class", "results-item");
		
		for(WebElement temp : flyToPorts){
			System.out.println(temp.getText());
			listofDestLocations.add(temp.getText()); 
		}
		
		for(String temp : listOfSourceLocations){
			System.out.println("Test Case for src " + temp +" is executing");
			
			genericMethod.getElement("flight-origin-hp-flight", "id").clear();
			genericMethod.getElement("flight-origin-hp-flight", "id").sendKeys(temp);
			Thread.sleep(500);
			
			for(String temp1 : listofDestLocations){
				genericMethod.getElement("flight-destination-hp-flight", "id").clear();
				genericMethod.getElement("flight-destination-hp-flight", "id").sendKeys(temp1);

			}
			
			Thread.sleep(700);
		}
	}
	
	
	
	@Test
	public void datePickerTest() throws InterruptedException{
		driver.get(baseURL);
		// click on flights tab 
		genericMethod.getElement("tab-flight-tab-hp", "id").click();
		
		// click departing date, such that the date picker is loaded  in the dom 
		genericMethod.getElement("flight-departing-hp-flight", "id").click(); 
		Thread.sleep(700);

		// pass the collected xpath where you can find all the dates which are enabled 
		String xpath=".//*[@id='flight-departing-wrapper-hp-flight']/div/div/div[2]/table/tbody/tr/td/button[not(@disabled)]";
		List<WebElement> activeDatesWebElement = genericMethod.getElements("xpath", xpath); 

		System.out.println("Number of Active Dates " + activeDatesWebElement.size());
		
		// work around for an element when it is found stale 
		List<String> activeDateListAsString = new ArrayList<String>();
		
		for(WebElement temp : activeDatesWebElement){
			activeDateListAsString.add(temp.getText());
		}
		
		// iterate all element in the list received, which is kept in list 
		for(String temp : activeDateListAsString){
			genericMethod.getElement("flight-departing-hp-flight", "id").click();

			Thread.sleep(500);
			
			
			String selectDateXpath=".//*[@id='flight-departing-wrapper-hp-flight']"
					+ "/div/div/div[2]/table/tbody/tr/td/button[text()='"
					+temp+"']";
			
			genericMethod.getElement(selectDateXpath, "xpath").click(); 
			Thread.sleep(500);
			
		}
		
	}
	
	
	
	
	
	
	
}
