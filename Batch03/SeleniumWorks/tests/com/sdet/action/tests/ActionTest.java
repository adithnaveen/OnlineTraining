package com.sdet.action.tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.sdet.generics.GenericMethods;
import com.sdet.utility.DriverFactory;
import com.sdet.utility.ScreenShot;

public class ActionTest {

	WebDriver driver;
	String baseURL;
	GenericMethods genericMethod; 
	ScreenShot screenShot; 
	@Before
	public void setUp() {
		driver = DriverFactory.getDriver("chrome");
		genericMethod = new GenericMethods(driver);
		screenShot = new ScreenShot(driver);
		baseURL="https://tasyah.com/";
	}

	@After
	public void tearDown() throws InterruptedException {
		Thread.sleep(2000);
		driver.quit();
	}

	@Test
	public void hoverTest() throws InterruptedException{
		driver.get(baseURL);
		
		// hover on this 
		String menuItem=".//*[@id='menu_category_Menu_VIfWm2LT_439']/a/span/span";
		// click on this 
		String subMenuItem=".//*[@id='menu_category_Menu_VIfWm2LT_439']/ul/li[2]/a/span";
		
		WebElement menuItemElement = genericMethod.getElement(menuItem, "xpath");

		Actions actions = new Actions(driver); 
		actions.moveToElement(menuItemElement).perform(); 
		
		Thread.sleep(1000);
		
		screenShot.captureScreen();
		
		System.out.println("Clicking on Sub Menu Item.. ");
		WebElement subMenuElement = genericMethod.getElement(subMenuItem, "xpath");
		// this works 
		//subMenuElement.click(); 
		
		
		actions.click(subMenuElement).perform();
		
		Thread.sleep(3000);
		screenShot.captureScreen();

		
	}
	
	
	
}
