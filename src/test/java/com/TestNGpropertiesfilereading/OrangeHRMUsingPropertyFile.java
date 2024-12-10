package com.TestNGpropertiesfilereading;

import org.testng.annotations.Test;

import java.time.Duration;

import org.openqa.selenium.*;
import org.openqa.selenium.edge.EdgeDriver;
import com.TestNGpropertiesfilereading.PropertyFileReadingUtility;


public class OrangeHRMUsingPropertyFile {
  @Test
  public void LoginTest() {
	  
	  PropertyFileReadingUtility p2=new PropertyFileReadingUtility();
	  
	  WebDriver Driver = new EdgeDriver();
	  Driver.get(p2.getData("url"));
		
		Driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  
		By un=By.name("username");
		By password=By.name("password");
		By btn=By.xpath("//button[@type='submit']");
		
		Driver.findElement(un).sendKeys(p2.getData("un"));
		Driver.findElement(password).sendKeys(p2.getData("pwd"));
		Driver.findElement(btn).click();
  }
}
