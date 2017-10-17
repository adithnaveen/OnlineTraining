package com.mycompany.test.basics;

import static org.junit.Assert.*;

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
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.mycompany.utility.Driver;
import com.mycompany.utility.MathUtility;

// 1. This method is to work with multiple field with expedia.com for adults 
// 2. This method is to work with html.com to select multiple select 
// and to work with javascript scroll 
// 3. to get the attribute value from the application 

public class BasicTest04 {
	WebDriver driver;
	MathUtility mUtility;
	String baseURL; 
	String baseURLhtml;
	String baseURLAttribute; 
	
	
	@Before
	public void setUp(){
		// driver location
		System.setProperty(Driver.CHROME_KEY, Driver.CHROME_PATH);
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		baseURL = "https://www.expedia.co.in/";
		baseURLhtml = "http://html.com/attributes/select-multiple/";
		baseURLAttribute = "http://naveenks.com/selenium/RegForm.html";
		mUtility = new MathUtility();
		
	}
	
	@After
	public void tearDown() throws InterruptedException{
		Thread.sleep(2000);
		driver.quit();
	}
	
	

	@Ignore
	@Test
	public void expediaTest() throws InterruptedException{
		driver.get(baseURL);
		
		// move from hotels tab to flight tab 
		driver.findElement(By.id("tab-flight-tab")).click();
		
		Thread.sleep(2000);
		
		String flyFrom = "Bengaluru, India (BLR-Kempegowda Intl.)";
		String flyTo = "Washington, DC, United States (IAD-Washington Dulles Intl.)";
		
		driver.findElement(By.id("flight-origin")).sendKeys(flyFrom);
		driver.findElement(By.id("flight-destination")).sendKeys(flyTo);
		
		// selecting dropdown list for adults -> flight-adults
		WebElement flightAdultsElement = driver.findElement(By.id("flight-adults"));
		
		
		Select adultSelect = new Select(flightAdultsElement);
		
		List<WebElement> option = adultSelect.getOptions();
		
		System.out.println("The values for Adults is :");
		
		for(WebElement temp : option){
			System.out.println("-> " + temp.getText());
		}

		adultSelect.selectByIndex(mUtility.getRandomNumber(option.size()));
		Thread.sleep(2000);
		adultSelect.selectByIndex(mUtility.getRandomNumber(option.size()));
		Thread.sleep(2000);
		adultSelect.selectByIndex(mUtility.getRandomNumber(option.size()));
		Thread.sleep(2000);
		adultSelect.selectByIndex(mUtility.getRandomNumber(option.size()));
		Thread.sleep(2000);
	}
	
	
	@Ignore
	@Test
	public void htmlMultiSelectTest() throws InterruptedException{
		driver.get(baseURLhtml);
		// i. to scroll 
		// in selenium we can write any javascript 
		JavascriptExecutor jse = (JavascriptExecutor) driver; 
		jse.executeScript("window.scroll(0, 450)");
		System.out.println("Scrolled 450px....");
		
		// ii. to do multi select 
		String multiSelectXpath = "//*[@id='post-291']/div/div[2]/select";
		WebElement multiSelectElement = driver.findElement(By.xpath(multiSelectXpath));
		
		Select multiSelect = new Select(multiSelectElement);
		
		multiSelect.selectByIndex(1);
		Thread.sleep(2000);
		
		multiSelect.selectByIndex(3);
		Thread.sleep(2000);
		
		multiSelect.selectByIndex(4);
		Thread.sleep(2000);
		
		multiSelect.selectByValue("Lesser");
		Thread.sleep(2000);
		
		multiSelect.deselectByIndex(1);
		Thread.sleep(2000);
		
		multiSelect.deselectByIndex(4);
		Thread.sleep(2000);
		
		System.out.println("List of Selected Options : "  );
		List<WebElement> selectedOptions = multiSelect.getAllSelectedOptions();
		for(WebElement temp : selectedOptions){
			System.out.println(temp.getText());
		}
	}


	@Test
	public void getAttributeValueTest() throws InterruptedException{
		// open the page 
		driver.get(baseURLAttribute);
		// xpath for Register User 
		String xpath = "/html/body/div[1]/form/div[15]/div/input[1]";
		
		WebElement element = driver.findElement(By.xpath(xpath));
		
		String elementText = element.getAttribute("value");
		
		System.out.println("Attribute value got is -> " + elementText);
		
	}
	




}









