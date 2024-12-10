//Locators and Methods will be defined here.

package com.TestNGPageObjectModelusingPageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewLoginPageclass {
	
	private WebDriver driver;
	
	public NewLoginPageclass(WebDriver Driver)
	
	{
		this.driver=Driver;
		PageFactory.initElements(Driver,this);  //pagefactory initialization
		
	}
	
	
	//Locator
	
	@FindBy(name="username")
	WebElement uname;
	
	@FindBy(name="password")
	WebElement password1;
	
	@FindBy(xpath="//button[@type='submit']")
		WebElement btn;
	
	
	//Methods
	
public void doLogin(String uname1,String Passwd1)
	
	{
		
		uname.sendKeys(uname1);
		password1.sendKeys(Passwd1);
		btn.click();
		
	}
	
	
	public String getAppurl()
	{
		return(driver.getCurrentUrl());
		
	}
	
	public String getpageTitle()
	{
		return(driver.getTitle());
		
	}
	
	
	
}
