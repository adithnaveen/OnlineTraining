package com.mycompany.generics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GenericMethods {
	WebDriver driver; 
	
	// the driver will be passed by selenium script depending on the 
	// browser which it has to use 
	public GenericMethods(WebDriver driver){
		this.driver = driver; 
	}
	
	
	// method to get the webelement based on the requirement from selenium 
	/**
	 * 
	 * @param locator -> is the field name on the web application 
	 * @param type -> id, name, linkText, partialLinkText, className, cssSelector, xpath 
	 * @return
	 */

	public WebElement getElement(String locator, String type){
		WebElement element = null; 
		type = type.toLowerCase();
		try{
		if(type.equals("id")){
			element = driver.findElement(By.id(locator));
		}else if(type.equals("name")){
			element = driver.findElement(By.name(locator));
		}else if(type.equals("class")){
			element = driver.findElement(By.className(locator));
		}else if(type.equals("css")){
			element = driver.findElement(By.cssSelector(locator));
		}else if(type.equals("xpath")){
			element = driver.findElement(By.xpath(locator));
		}else if(type.equals("linktext")){
			element = driver.findElement(By.linkText(locator));
		}else if(type.equals("partiallinktext")){
			element = driver.findElement(By.partialLinkText(locator));
		}

		if(checkForSingleEntry(type, locator)){
			// System.out.println("Elemnet Found and it is Single Entry -> " + locator);
			return element;
		}else{
			System.out.println("Sorry Element Not Found or Has more than 1 Entry");
		}

		}catch(Exception e){
			System.out.println("Exception " + e.getMessage());
		}
		return null;

	}
	
	
	public List<WebElement> getElements(String locator, String type){
		type = type.toLowerCase();
		
		List<WebElement> elements = null;
		
		if(type.equals("id")){
			elements = driver.findElements(By.id(locator));
		}else if(type.equals("name")){
			elements = driver.findElements(By.name(locator));
		}else if(type.equals("class")){
			elements = driver.findElements(By.className(locator));
		}else if(type.equals("xpath")){
			elements = driver.findElements(By.xpath(locator));
		}else if(type.equals("linktext")){
			elements = driver.findElements(By.linkText(locator));
		}else if(type.equals("partiallinktext")){
			elements = driver.findElements(By.partialLinkText(locator));
		}else {
			elements = null;
		}
		return elements;
	}
	
	public boolean checkForSingleEntry(String type, String locator){
		return getElements(locator, type).size() ==1 ;
		
//		if(getElements(locator, type).size() ==1){
//			return true; 
//		}else {
//			return false;
//		}
	}
	
	
	
}











