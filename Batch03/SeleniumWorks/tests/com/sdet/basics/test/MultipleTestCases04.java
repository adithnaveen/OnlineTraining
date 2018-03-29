package com.sdet.basics.test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.sdet.utility.Driver;
import com.sdet.utility.MathUtility;

public class MultipleTestCases04 {



	WebDriver driver; 
	String baseURL = null;
	String baseURL1 = null;
	String baseURL2 = null;
	
	@Before
	public void setUp(){
		System.setProperty(Driver.CHROME_KEY, Driver.CHROME_PATH);
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		baseURL ="http://naveenks.com/selenium/RegForm.html";
		baseURL1="https://html.com/attributes/select-multiple/";
		baseURL2="https://www.expedia.com/";
	}
	
	@After
	public void tearDown()  throws InterruptedException{
		Thread.sleep(2000);
		driver.quit();
	}
	
	
	@Test
	public void getAttributeValueTest() throws InterruptedException{
		driver.get(baseURL);
		// xpath for reg button 
		String xpath="/html/body/div[1]/form/div[15]/div/input[1]";
		WebElement element = driver.findElement(By.xpath(xpath));
		
		/// we want to get the attribute value 
		String elementText = element.getAttribute("value");
		System.out.println("Attribute value got is " + elementText);
	}



	@Test
	public void htmlMultipleSelectTest() throws InterruptedException{
		// we may have to scroll for see the element action 
		driver.get(baseURL1);
		
		JavascriptExecutor jse = (JavascriptExecutor) driver; 
		jse.executeScript("window.scrollTo(0,580)");
		System.out.println("After scroll");
		
		String multiSelectXpath = "//*[@id='post-291']/div/div[2]/select";
		
		WebElement multiSelectElement = driver.findElement(By.xpath(multiSelectXpath)); 
		
		Select multiSelect = new Select(multiSelectElement); 
		
		multiSelect.selectByIndex(1);
		Thread.sleep(2000);
		
		multiSelect.selectByIndex(3);
		Thread.sleep(2000);
		
		multiSelect.selectByIndex(5);
		Thread.sleep(2000);
		
		multiSelect.deselectByValue("Lesser");
		
		// to list all the options which are selected in the multi select box 
		
		System.out.println("Selected Elements are : ");
		List<WebElement> selectedOptions = multiSelect.getAllSelectedOptions(); 
		for(WebElement temp : selectedOptions){
			System.out.println(temp.getText());
		}
		
		
	}


	@Test
	public void expediaTest() throws InterruptedException{
		// load the page 
		driver.get(baseURL2);
		
		String flightTabText="tab-flight-tab-hp"; 
		String flyFromText="flight-origin-hp-flight"; 
		String flyToText ="flight-destination-hp-flight";
		
		String flyFrom="Bengaluru, India (BLR-Kempegowda Intl.)";
		String flyTo="Washington, DC (IAD-Washington Dulles Intl.)";
		
		// move from bundles to flights tab 
		driver.findElement(By.id(flightTabText)).click();
		Thread.sleep(2000);

		driver.findElement(By.id(flyFromText)).clear();
		driver.findElement(By.id(flyFromText)).sendKeys(flyFrom);
		Thread.sleep(2500);

		driver.findElement(By.id(flyToText)).clear();
		driver.findElement(By.id(flyToText)).sendKeys(flyTo);
		Thread.sleep(2500);

		// selecting number of adults 
		
		WebElement flightAdultsElement = driver.findElement(By.id("flight-adults-hp-flight")); 
		
		Select adultSelect = new Select(flightAdultsElement); 
		List<WebElement> adultsOption = adultSelect.getOptions(); 
		
		int size = adultsOption.size(); 
		System.out.println("You can select one of the value for adults:");
		for(WebElement temp : adultsOption){
			System.out.println(temp.getText());
		}

		adultSelect.selectByIndex(MathUtility.getRandomNumber(size));
		Thread.sleep(2000);

		
		WebElement flightChildElement = driver.findElement(By.id("flight-children-hp-flight")); 
		Select childSelect = new Select(flightChildElement); 
		
		List<WebElement> childOptions = childSelect.getOptions(); 
		
		int childSize = childOptions.size(); 

		childSelect.selectByIndex(MathUtility.getRandomNumber(childSize));
		Thread.sleep(1500);

		
		/*
		 * 	flight-age-select-1-hp-flight
			flight-age-select-2-hp-flight
			flight-age-select-3-hp-flight
		 */
	}

}











