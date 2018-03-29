package com.sdet.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

// the concept of POM is also there with selenium 
public class RegistrationPOM03 {

	public RegistrationPOM03(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="inputEmail")
	private WebElement email; 
	
	@FindBy(id="inputPassword")
	private WebElement password; 
	
	@FindBy(id="confirmPassword")
	private WebElement confirmPassword;
	
	@FindBy(id="firstName")
	private WebElement firstName;
	
	@FindBy(id="lastName")
	private WebElement lastName;
	
	@FindBy(xpath="/html/body/div[1]/form/div[15]/div/input[1]")
	private WebElement regBtn; 
	
	public void sendEmail(String email){
		this.email.clear();
		this.email.sendKeys(email);
	}
	
	public void sendPassword(String password){
		this.password.clear(); 
		this.password.sendKeys(password);
	}
	
	public void sendConfirmPassword(String cnfPassword){
		this.confirmPassword.clear();
		this.confirmPassword.sendKeys(cnfPassword);
	}
	public void sendFirstName(String firstName){
		this.firstName.clear(); 
		this.firstName.sendKeys(firstName);
	}
	
	public void sendLastName(String lastName){
		this.lastName.clear(); 
		this.lastName.sendKeys(lastName);
	}
	
	public void clickRegBtn(){
		this.regBtn.click(); 
	}
}
