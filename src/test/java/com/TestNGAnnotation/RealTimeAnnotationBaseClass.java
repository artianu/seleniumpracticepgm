package com.TestNGAnnotation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class RealTimeAnnotationBaseClass {
	
	
	
	WebDriver Driver;
	
	@BeforeClass
	  public void setup() {
		
		Driver=new EdgeDriver();
		Driver.get("https://automationplayground.com/crm/");
		
		  }
	
		
			 @AfterClass 
			 public void AfterClass() { 
				 
				 Driver.quit();
				 
			 }
			 

	@BeforeMethod
	public void BeforeMethod() { 
		 
		System.out.println(Driver.getCurrentUrl());
	 }
	
	
	@AfterMethod
	 public void TearDown() { 
		 
		System.out.println(Driver.getTitle());
		 
	}

}
