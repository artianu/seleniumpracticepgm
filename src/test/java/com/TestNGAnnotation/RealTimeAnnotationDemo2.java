package com.TestNGAnnotation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import org.testng.annotations.Test;

public class RealTimeAnnotationDemo2 extends RealTimeAnnotationBaseClass {

	
	
		
  @Test(priority=1)
  public void validateSignin() {
	  
	 WebElement el1= Driver.findElement(By.linkText("Sign In"));
	  Assert.assertTrue(el1.isDisplayed(), "Not Displayed");
	  Assert.assertTrue(el1.isEnabled(), "Not Enabled");
	  Driver.findElement(By.linkText("Sign In")).click();
	  System.out.println("Sign In btton is disaplayed and present... Test Case Pass");
	  
		  
  }


  @Test(priority=2)
  public void validatelogIn() {
	
	 Driver.findElement(By.id("email-id")).sendKeys("test@gmail.com");
	 Driver.findElement(By.id("password")).sendKeys("test123"); 
	 Driver.findElement(By.id("submit-id")).click();
	  
  }



}
