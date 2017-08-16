package com.mycomp.actions;

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


public class ActionTest {

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
		baseURL = "https://tasyah.com/";
	}

	@After
	public void tearDown() throws Exception {
		Thread.sleep(3000);
		driver.quit();
	}
	
	@Test
	public void hoverTest() throws Exception{
		driver.get(baseURL);
		
		String mainMenuXpath  =".//*[@id='menu_category_Menu_VIfWm2LT_332']/a/span/span";
		String subMenuXpath =".//*[@id='menu_category_Menu_VIfWm2LT_332']/ul/li[3]/a/span";
		
		
		// TODO 1 -> Hover on mainMenu item 
		
		WebElement menuElement = genMethods.getElement(mainMenuXpath, "xpath");
		
		Actions action = new Actions(driver);
		// perform here is do the action 
		action.moveToElement(menuElement).perform();
		
		Thread.sleep(2000);
		screenShot.takeScreenShot();
		
		
		System.out.println("Before going to sub menu item ");
		WebElement subMenuElement = genMethods.getElement(subMenuXpath, "xpath");
		
		// both are same 
		action.click(subMenuElement).perform();
		// subMenuElement.click();
		Thread.sleep(6000);
		screenShot.takeScreenShot();
		
		
		
	}
		
	
	
	
}
