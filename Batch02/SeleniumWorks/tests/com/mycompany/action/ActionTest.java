package com.mycompany.action;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import com.mycompany.generics.GenericMethods;
import com.mycompany.utility.Driver;
import com.mycompany.utility.ScreenShot;

public class ActionTest {
	WebDriver driver;
	GenericMethods genericMethod;
	String baseURL;
	ScreenShot screenShot;

	@Before
	public void setUp() {
		// driver location
		System.setProperty(Driver.CHROME_KEY, Driver.CHROME_PATH);
		driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		genericMethod = new GenericMethods(driver);
		screenShot = new ScreenShot(driver);
		baseURL = "https://tasyah.com/";

	}

	@After
	public void tearDown() throws InterruptedException {
		Thread.sleep(2000);
		// driver.quit();
		screenShot.captureScreenShot("Step2.png");
	}
	
	
	@Test
	public void hoverTest() throws InterruptedException{
		driver.get(baseURL);
		
		String menuItem=".//*[@id='menu_category_Menu_VIfWm2LT_414']/a/span/span";
		String subMetnuItem=".//*[@id='menu_category_Menu_VIfWm2LT_414']/ul/li[1]/a/span";
		
		// TODO -> Hover on Menu Item 
		
		WebElement menuItemElement = genericMethod.getElement(menuItem, "xpath");
	
		Actions actions = new Actions(driver); 
		// perform the job 
		actions.moveToElement(menuItemElement).perform();
	
		Thread.sleep(1500);
		
		screenShot.captureScreenShot("Step1.png");
		
		System.out.println("Clicking on Sub Menu Item... ");
		WebElement subMenuItemElement = genericMethod.getElement(subMetnuItem, "xpath");
		actions.click(subMenuItemElement).perform();
		// or (both are same )
//		subMenuItemElement.click();
	}
}
