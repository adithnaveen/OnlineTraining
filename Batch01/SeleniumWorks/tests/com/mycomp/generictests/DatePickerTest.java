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

public class DatePickerTest {

	WebDriver driver; 
	String baseURL ;
	GenericMethods genMethods;

	@Before
	public void setUp() throws Exception {
		driver = DriverFactory.getDriver(DriverNames.CHROME);

		baseURL = "https://www.expedia.com/";
		genMethods = new GenericMethods(driver);
		driver.get(baseURL);
	}

	@After
	public void tearDown() throws Exception {
		Thread.sleep(3000);
		driver.quit();
	}
	
	
	@Ignore
	@Test
	public void test() throws Exception {
		// click on flights tab 
		genMethods.getElement("tab-flight-tab-hp", ElementType.ID).click();
		
		// click on departing date 
		genMethods.getElement("flight-departing-hp-flight", ElementType.ID).click();
		Thread.sleep(1000);
		String xpath =".//*[@id='flight-departing-wrapper-hp-flight']/div/div/div[2]/table/tbody/tr/td/button[not(@disabled)]";
		List<WebElement> activeDates = driver.findElements(By.xpath(xpath));
	
		System.out.println(activeDates.size());
		for(WebElement temp : activeDates){
			genMethods.getElement("flight-departing-hp-flight", ElementType.ID).click();

			System.out.println(temp.getText());
			Thread.sleep(2000);
			String selectDateXPath=".//*[@id='flight-departing-wrapper-hp-flight']/div"
					+ "/div/div[2]/table/tbody/tr/td/button[text()='"+temp.getText()+"']";

			genMethods.getElement(selectDateXPath, ElementType.XPATH).click();
			System.out.println("after click ");
			Thread.sleep(2000);
			// again click on depart date field 
			genMethods.getElement("flight-departing-hp-flight", ElementType.ID).click();

		}
	}

	
	@Test
	public void partialTest() throws Exception{
		
		String flyFromPartial = "new";
		String flyToPartial ="san";
		
		// click on flight tab 
		genMethods.getElement("tab-flight-tab-hp", ElementType.ID).click();
		
		genMethods.getElement("flight-origin-hp-flight", ElementType.ID).clear();
		genMethods.getElement("flight-origin-hp-flight", ElementType.ID).sendKeys(flyFromPartial);
		
		Thread.sleep(2000);
		
		List<WebElement> flyFromPorts = driver.findElements(By.className("results-item"));
		System.out.println("Number of Source locations -> " +flyFromPorts.size());
		
		List<String> listOfSourceLocations = new ArrayList<String>();
		
		for(WebElement temp : flyFromPorts){
			System.out.println(temp.getText());
			listOfSourceLocations.add(temp.getText());
		}
		
		
		for(String temp : listOfSourceLocations){
			genMethods.getElement("flight-origin-hp-flight", ElementType.ID).clear();
			genMethods.getElement("flight-origin-hp-flight", ElementType.ID).sendKeys(temp);
			Thread.sleep(1500);

		}
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}



