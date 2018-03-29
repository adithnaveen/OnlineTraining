package com.sdet.generics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GenericMethods {
	WebDriver driver; 
	
	// the driver information will be passed by selenium 
	// script depending on the kind of browser which it 
	// uses 
	
	public GenericMethods(WebDriver driver){
		this.driver = driver; 
	}
	
	// method will will return me a webelement on the
	// request from selenium 
	public WebElement getElement(String locator, String type){
		WebElement element = null; 
		type = type.toLowerCase(); 
		
		try{
			 
			if(type.equals("id")){
				element = driver.findElement(By.id(locator));
			}else if(type.equals("name")){
				element = driver.findElement(By.name(locator));
			}else if(type.equals("partiallinktext")){
				element = driver.findElement(By.partialLinkText(locator));
			}else if(type.equals("xpath")){
				element = driver.findElement(By.xpath(locator));
			}else if(type.equals("class")){
				element = driver.findElement(By.className(locator));
			}else if(type.equals("css")){
				element = driver.findElement(By.cssSelector(locator)); 
			}
			
			if(checkSingleEntry(type, locator)){
				return element; 
			}else{
				System.out.println("Sorry Element Has more than One Entry");
			}
			
		}catch(Exception e){
			e.printStackTrace();
		}
		System.out.println("Sorry Element Not Found");
		return null;
		
	}
	
	public List<WebElement> getElements(String type, String locator){
		List<WebElement> elements = null; 
		type = type.toLowerCase(); 
		
		if(type.equals("id")){
			elements = driver.findElements(By.id(locator)); 
		}else if(type.equals("name")){
			elements = driver.findElements(By.name(locator));
		}else if (type.equals("class")){
			elements = driver.findElements(By.className(locator));
		}else if(type.equals("xpath")){
			elements  = driver.findElements(By.xpath(locator));
		}
		
		return elements; 
	}
	
	public boolean checkSingleEntry(String type, String locator){
		return getElements(type, locator).size() ==1; 
	}
	
	
	
}









