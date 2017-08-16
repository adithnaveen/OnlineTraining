package com.mycomp.basic.test;

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

import com.mycomp.utils.DriverFactory;
import com.mycomp.utils.DriverNames;

/**
* 
* @author Naveen
* This program is to test either the element is enabled or disabled since on
* google.com the search bar is merged with many few are disabled, you can 
* identify the same before posting the values 
*/

public class BasicTest06 {

	WebDriver driver;
	
	String baseURL;
	String baseURL1;
	String baseURL2;
	String baseURLExpediaIndia;
	
	@Before
	public void setUp() throws Exception {
		
		driver = DriverFactory.getDriver(DriverNames.CHROME);
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();


		baseURL = "http://html.com/attributes/select-multiple/";
		baseURL1 = "https://www.expedia.com/";
		baseURLExpediaIndia ="https://www.expedia.co.in/";
		baseURL2 = "http://naveenks.com/selenium/RegForm.html";


	}

	@After
	public void tearDown() throws Exception {
		Thread.sleep(3000);
		// driver.quit();
	}
	
	
	@Ignore
	@Test
	public void expediaTestIndia() throws Exception{
		// load the page 
		driver.get(baseURLExpediaIndia);
		
		
		// move from Bundle Deals to Flights tab - tab-flight-tab
		driver.findElement(By.id("tab-flight-tab")).click();

		Thread.sleep(2000);
		WebElement roomsElement = driver.findElement(By.id("flight-adults"));
		
		
		Select roomsSelect = new Select(roomsElement);
		
		List<WebElement> options = roomsSelect.getOptions();
		
		
		for (int i = 0; i < options.size(); i++) {
			System.out.println(options.get(i).getText());
		}
		roomsSelect.selectByIndex(1);
		Thread.sleep(2000);
		roomsSelect.selectByIndex(2);
		Thread.sleep(3000);
		roomsSelect.selectByValue("5");
		
	}
	
	// this test will goto html.com this will select with multiple option 
		// and before that it will scroll... 
		// try knowing you can execute any javascript in selenium 
		// in this exmaple we are showing to scroll with the javascript object 
		@Ignore
		@Test
		public void multipleSelectTest() throws InterruptedException{
			driver.get(baseURL);
			
			// you can have any javascript invokation with Selenium 
			JavascriptExecutor jse = (JavascriptExecutor) driver;
			jse.executeScript("window.scrollBy(0, 450)");
			
			// the multi select xpath is 
			// //*[@id="post-291"]/div/div[2]/select
			String multiSelectXpath ="//*[@id='post-291']/div/div[2]/select";
			
			WebElement selectElement = driver.findElement(By.xpath(multiSelectXpath));
			
			Select select = new Select(selectElement);
			
			select.selectByIndex(1);
			Thread.sleep(2000);
			select.selectByIndex(3);
			
			Thread.sleep(2000);
			select.deselectAll();
			
			select.selectByValue("American");
			Thread.sleep(1500);
			select.selectByValue("Lesser");
			
			
			List<WebElement> selectedList =	select.getAllSelectedOptions();
			
			System.out.println("Number of Selected Elements Are :" + selectedList.size());
			
			for(WebElement temp : selectedList){
				System.out.println(temp.getText());
			}
		}
	
		
		@Test
		public void getAttributeValueTest() throws Exception{
			 // open/load  the page 
			driver.get(baseURL2);
			
			
			// find the web element 
			String webElementXpath ="/html/body/div[1]/form/div[15]/div/input[1]";
			
			WebElement element = driver.findElement(By.xpath(webElementXpath));
			
			String elementText = element.getAttribute("value");
			
			System.out.println("The Attribute Value is :" + elementText);
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	
	
}
