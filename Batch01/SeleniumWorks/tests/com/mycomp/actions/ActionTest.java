package com.mycomp.actions;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.mycomp.generics.GenericMethods;
import com.mycomp.utils.DriverFactory;
import com.mycomp.utils.DriverNames;
import com.mycomp.utils.ElementType;
import com.mycomp.utils.ScreenShot;

public class ActionTest {

	WebDriver driver;
	String baseURL;
	GenericMethods genMethods;
	ScreenShot screenShot;

	@Before
	public void setUp() throws Exception {
		driver = DriverFactory.getDriver(DriverNames.CHROME);

		// driver.manage().window().maximize();
		baseURL = "http://tasyah.com/";
		genMethods = new GenericMethods(driver);
		screenShot = new ScreenShot(driver);
		driver.get(baseURL);
	}

	@After
	public void tearDown() throws Exception {
		screenShot.takeScreenShot();
		Thread.sleep(3000);
		driver.quit();
	}

	
	/**"
	 * This test is to test action item on hover on tasyah.com
	 * @throws Exception
	 */
	@Test
	public void test() throws Exception{
		
		String menuXpath =".//*[@id='menu_category_Menu_VIfWm2LT_332']/a/span/span";
		String subMenuXpath=".//*[@id='menu_category_Menu_VIfWm2LT_332']/ul/li[1]/a/span";
							 
		WebElement menuElement = genMethods.getElement(menuXpath, ElementType.XPATH);

		Actions action = new Actions(driver);
		action.moveToElement(menuElement).perform();
		Thread.sleep(1000);
		System.out.println("Before going to sub menu ");
		WebElement subMenuElement = genMethods.getElement(subMenuXpath, ElementType.XPATH);
		
//		action.click(subMenuElement).perform();
		subMenuElement.click();
	}

}
