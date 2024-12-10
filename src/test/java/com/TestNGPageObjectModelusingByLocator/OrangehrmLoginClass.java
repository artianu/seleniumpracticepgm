package com.TestNGPageObjectModelusingByLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OrangehrmLoginClass {
	
	WebDriver Driver;
	
	//to initialize Driver
	public OrangehrmLoginClass(WebDriver Driver)
	
	{
		this.Driver=Driver;
	}
	
	//Locator
	
	By un=By.name("username");
	By password=By.name("password");
	By btn=By.xpath("//button[@type='submit']");
	
	
	
	
	//Methods/Actions
	
	public void doLogin(String uname,String Passwd)
	
	{
		
		Driver.findElement(un).sendKeys(uname);
		Driver.findElement(password).sendKeys(Passwd);
		Driver.findElement(btn).click();
		
	}
	
	
	public String getAppurl()
	{
		return(Driver.getCurrentUrl());
		
	}
	
	public String getpageTitle()
	{
		return(Driver.getTitle());
		
	}
	

}
