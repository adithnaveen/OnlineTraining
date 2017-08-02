package com.mycomp.basictest;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.mycomp.utils.DriverFactory;
import com.mycomp.utils.DriverNames;

// this program is the extraction from selenium IDE 
public class Testing1 {
  private WebDriver driver;
  private String baseUrl;
  
  @Before
  public void setUp() throws Exception {
	driver = DriverFactory.getDriver(DriverNames.CHROME);
    driver = new ChromeDriver();
    baseUrl = "https://www.google.com/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testIng1() throws Exception {
    driver.get(baseUrl + "/?gws_rd=ssl#q=places+to+visit+in+virginia");
    driver.findElement(By.id("lst-ib")).clear();
    driver.findElement(By.id("lst-ib")).sendKeys("places to visit in virginia");
    driver.findElement(By.id("_fZl")).click();
  }

  @After
  public void tearDown() throws Exception {
    driver.quit();
  }

}
