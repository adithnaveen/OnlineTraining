package com.naveen.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FlightPagePOMFactory {

	WebDriver driver;
	public FlightPagePOMFactory(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="flight-origin")
	WebElement flyingFrom;
	
	@FindBy(id="flight-destination")
	WebElement flyingTo;
	
	@FindBy(id="flight-departing")
	WebElement departingDate; 
	
	@FindBy(id="flight-returning")
	WebElement returnDate;
	
	@FindBy(id="search-button")
	WebElement searchButton;
	
	@FindBy(id="tab-flight-tab")
	WebElement flightTab;
	
	
	public void clickFlightTab(){
		flightTab.click();
	}
	
	public void sendFlyingFrom(String src){
		flyingFrom.click();
		flyingFrom.clear();
		flyingFrom.sendKeys(src);
	}
	
	public void sendFlyingTo(String dest){
		flyingTo.click();
		flyingTo.clear();
		flyingTo.sendKeys(dest);
	}
	
	public void sendDepartingDate(String date){
		departingDate.click();	
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
//		departingDate.clear();
		String xpath =" .//*[@id='flight-departing-wrapper']/div/div/div[2]/table/"
				+ "tbody/tr/td/button[not(@disabled) and contains(text(), '"+date+"')]";
		WebElement dateElement = driver.findElement(By.xpath(xpath));
		dateElement.click();
// 		departingDate.sendKeys(date);
	}
	
	public void sendReturnDate(String date){
		returnDate.click();		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String xpath =" .//*[@id='flight-returning-wrapper']/div/div/div[2]/table/"
				+ "tbody/tr/td/button[not(@disabled) and contains(text(), '"+date+"')]";
		WebElement dateElement = driver.findElement(By.xpath(xpath));
		dateElement.click();
	}
	
	public void clickSearchButton(){
			searchButton.click();	}
}