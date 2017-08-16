package com.mycomp.basic.test;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import com.mycomp.utils.DriverFactory;
import com.mycomp.utils.DriverNames;

public class SeleniumIDE {
  private WebDriver driver;
  private String baseUrl;

  @Before
  public void setUp() throws Exception {
    driver = DriverFactory.getDriver(DriverNames.CHROME);

    baseUrl = "https://www.google.co.in/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testUntitled() throws Exception {
    driver.get(baseUrl + "/?gfe_rd=cr&ei=IhKFWcvwO6LT8geokYGwCQ&gws_rd=ssl");
    driver.findElement(By.id("lst-ib")).clear();
    driver.findElement(By.id("lst-ib")).sendKeys("places to visit");
  }

  @After
  public void tearDown() throws Exception {
	Thread.sleep(3000);
    driver.quit();
   
  }

}
