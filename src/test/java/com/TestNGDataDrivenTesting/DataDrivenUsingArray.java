package com.TestNGDataDrivenTesting;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.TestNGpropertiesfilereading.PropertyFileReadingUtility;

public class DataDrivenUsingArray {
	
	@DataProvider(name="arraydata")
	public Object[][] dataset()
	{
		Object data[][]= {{"admin1","admin123"},{"admin2","admin123"},{"admin3","admin123"},{"admin4","admin123"}};
		return data;
		
	}
	
		
	
	@Test(dataProvider="arraydata")
	 public void login(String un ,String psw) {
		  
	  System.out.println("user name is "+un);
	  System.out.println("password is "+psw);
		  
	    }
	
	
	
	
	
	  
	  
  }

