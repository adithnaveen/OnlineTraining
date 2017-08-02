package com.mycomp.pomtest;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import com.mycomp.generics.GenericMethods;
import com.mycomp.pom.FlightPageEPOM;
import com.mycomp.pom.FlightPagePOM;
import com.mycomp.utils.DriverFactory;
import com.mycomp.utils.DriverNames;
import com.mycomp.utils.ScreenShot;

// this program will not work properly since it is refactored in src for 
// factory example 

public class FlightPageTest {

	WebDriver driver;
	String baseURL;
	ScreenShot screenShot;
	FlightPageEPOM flightPage; 
	
	@Before
	public void setUp() throws Exception {
		driver = DriverFactory.getDriver(DriverNames.CHROME);

		// driver.manage().window().maximize();
		baseURL = "https://www.expedia.com/";
		screenShot = new ScreenShot(driver);
		flightPage = new FlightPageEPOM();
		driver.get(baseURL);
	}

	@After
	public void tearDown() throws Exception {
		screenShot.takeScreenShot();
		Thread.sleep(3000);
		// driver.quit();
	}

	@Ignore
	@Test
	public void test() throws Exception {
		FlightPagePOM.clickFlightTab(driver);
		FlightPagePOM.sendFlyFromTextBox("Washington, DC (IAD-Washington Dulles Intl.)", driver);
		FlightPagePOM.sendFlyToTextBox("San Francisco, CA (QSF-All Airports)", driver);
		FlightPagePOM.selectDepartingDate("29", driver);
		FlightPagePOM.selectReturningDate("15", driver);
	}

	@Test
	public void testFlightPageFactory(){
		flightPage.clickFlightTab();
		flightPage.sendFlyFrom("Washington, DC (IAD-Washington Dulles Intl.)");
		flightPage.sendFlyTo("San Francisco, CA (QSF-All Airports)");
	}
	
	
}
















