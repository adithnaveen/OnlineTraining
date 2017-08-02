package com.mycomp.basictest;
// This program have 3 test cases 

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

public class Test05 {
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
		driver.quit();
	}
	
	// To get number of options present in the select box of adult  
	
	@Ignore
	@Test
	public void expediaTestIndia() throws Exception{
		driver.get(baseURLExpediaIndia);
		// move from Bundle Deals to Flights tab
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
	}
	
	
	
	
	
	

	// this one works well in USA 
	@Ignore
	@Test
	public void expediaTest() throws Exception {
		driver.get(baseURL1);
		// move from Bundle Deals to Flights tab
		driver.findElement(By.id("tab-flight-tab-hp")).click();

		WebElement roomsElement = driver.findElement(By.id("flight-adults-hp-flight"));
		Select roomsSelect = new Select(roomsElement);
		List<WebElement> options = roomsSelect.getOptions();
		for (int i = 0; i < options.size(); i++) {
			System.out.println(options.get(i).getText());
		}
		roomsSelect.selectByIndex(1);
		Thread.sleep(2000);
		roomsSelect.selectByIndex(2);
		Thread.sleep(3000);
	}

	// this test will goto html.com this will select with multiple option 
	// and before that it will scroll... 
	// try knowing you can execute any javascript in selenium 
	// in this exmaple we are showing to scroll with the javascript object 
	@Ignore
	@Test
	public void multipleSelectTest() throws InterruptedException{
		driver.get(baseURL);
		JavascriptExecutor jse = (JavascriptExecutor)driver;

		jse.executeScript("window.scrollBy(0,250)", "");

		WebElement selectElement = 
		driver.findElement(By.xpath(".//*[@id='post-291']/div/div[2]/select"));

		Select select = new Select(selectElement);
		
		
		select.selectByIndex(1);
		Thread.sleep(2000);
		
		select.selectByIndex(2);
		Thread.sleep(2000);
		
		select.deselectByIndex(2);
		Thread.sleep(2000);
		
		select.deselectAll();
		
		select.selectByValue("American");
		select.selectByValue("Greater");
		select.selectByValue("Lesser");
		
		List<WebElement> selectedList = select.getAllSelectedOptions();
		
		System.out.println(selectedList.size());
		
		for(WebElement temp : selectedList){
			System.out.println(temp.getText());
		}

	}


	@Test
	public  void getAttributeValueTest() throws Exception{
		driver.get(baseURL2);
		
		// getting the attribute value of Register User 
		WebElement element = driver.findElement
					(By.xpath("html/body/div[1]/form/div[15]/div/input[1]"));

		String elementText = element.getAttribute("value");
		System.out.println("Attribute Value is " + elementText);
		
	}
	
}
