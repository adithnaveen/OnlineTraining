package com.mycomp.screenshots;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;


import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.mycomp.generics.GenericMethods;
import com.mycomp.utils.DriverFactory;
import com.mycomp.utils.DriverNames;
import com.mycomp.utils.ElementType;
import com.mycomp.utils.ScreenShot;

public class ScreenShotTest {

	WebDriver driver; 
	String baseURL ;
	GenericMethods genMethods;
	ScreenShot screenShot;
	
	@Before
	public void setUp() throws Exception {
		driver = DriverFactory.getDriver(DriverNames.CHROME);
		
	// driver.manage().window().maximize();
		baseURL = "https://www.expedia.com/";
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
	
	
	@Test
	public void test() throws Exception{
		// click flights tab 
		genMethods.getElement("tab-flight-tab-hp", ElementType.ID).click();
		
		genMethods.getElement("flight-origin-hp-flight", ElementType.ID).
			sendKeys("New York, NY (JFK-John F. Kennedy Intl.)");

		screenShot.takeScreenShot();
		Thread.sleep(1000);
		genMethods.getElement("flight-destination-hp-flight", ElementType.ID)
			.sendKeys("New York, NY (JFK-John F. Kennedy Intl.)");

		Thread.sleep(1000);

		screenShot.takeScreenShot();
		genMethods.getElement(".//*[@id='gcw-flights-form-hp-flight']/div[8]/label/button",
					ElementType.XPATH).click();
	
	}

}
