package com.sdet.parameterization;

import static org.junit.Assert.*;

import java.lang.reflect.GenericSignatureFormatError;
import java.util.Arrays;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.openqa.selenium.WebDriver;

import com.sdet.generics.GenericMethods;
import com.sdet.jdbc.LoginBean;
import com.sdet.jdbc.LoginDAO;
import com.sdet.utility.DriverFactory;

@RunWith(Parameterized.class)
public class LoginParameterizationTest {

	// selenium code 
	WebDriver driver;
	String baseURL;
	GenericMethods genericMethod;

	@Before
	public void setUp() {
		driver = DriverFactory.getDriver("chrome");
		genericMethod = new GenericMethods(driver);
		baseURL = "http://naveenks.com/selenium/LoginForm.html";
	}

	@After
	public void tearDown() throws InterruptedException {
		Thread.sleep(2000);
		driver.quit();
	}

	
//	private String userName; 
//	private String password; 
	
	private LoginBean loginBean; 
	
	// the values for this constructor will be injected by junit 
//	which comes from parameterization method 
	/*public LoginParameterizationTest(String userName, String password){
		this.userName = userName;
		this.password = password; 
	}*/
	
	
	public LoginParameterizationTest(LoginBean loginBean){
		this.loginBean = loginBean; 
	}
	
	// this method will give values for constructor 
	
	@Parameters
	public static List<LoginBean> data(){
		return new LoginDAO().getAllLoginUsers(); 
	}
	
	@Test
	public void loginTest(){
		driver.get(baseURL);
		
		System.out.println("Testing User " + this.loginBean.getUserName());
		
		genericMethod.getElement("uname", "id").clear(); 
		genericMethod.getElement("uname", "id").sendKeys(this.loginBean.getUserName());
	
		genericMethod.getElement("pwd", "id").clear(); 
		genericMethod.getElement("pwd", "id").sendKeys(this.loginBean.getPassword());
		
		genericMethod.getElement("submitBtn", "id").click();
	
	}
	
	
	
}
