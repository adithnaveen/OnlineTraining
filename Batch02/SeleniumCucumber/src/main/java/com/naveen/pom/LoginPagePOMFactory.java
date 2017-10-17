package com.naveen.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPagePOMFactory {
	WebDriver driver; 
	public LoginPagePOMFactory(WebDriver driver){
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="uname")
	WebElement userName; 
	
	@FindBy(id="pwd")
	WebElement password;
	
	@FindBy(id="submitBtn")
	WebElement loginBtn; 
	
	public void sendUserName(String userName){
		this.userName.clear();
		this.userName.sendKeys(userName);
	}
	
	public void sendPasswor(String password){
		this.password.clear();
		this.password.sendKeys(password);
	}
	
	public void clickSubmitBtn(){
		this.loginBtn.click();
	}
}














