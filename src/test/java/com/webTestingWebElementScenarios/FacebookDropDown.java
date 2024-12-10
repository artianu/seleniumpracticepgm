package com.webTestingWebElementScenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class FacebookDropDown {
  @Test
  public void f() {
	  
		WebDriver driver1=new EdgeDriver();
		driver1.get("https://www.facebook.com/r.php");
		
		 WebElement dropdownele1=driver1.findElement(By.name("birthday_month")); //select month
		  Select sc1=new Select(dropdownele1);
		  System.out.println("Is DropDown is multiselect : "+sc1.isMultiple());
		  sc1.selectByVisibleText("Aug");
		  
		  WebElement dropdownele2=driver1.findElement(By.name("birthday_day")); //select day
		  Select sc2=new Select(dropdownele2);
		  System.out.println("Is DropDown is multiselect : "+sc2.isMultiple());
		 		
		  sc2.selectByVisibleText("17");
		  
		  WebElement dropdownele3=driver1.findElement(By.name("birthday_year")); //select year
		  Select sc3=new Select(dropdownele3);
		  System.out.println("Is DropDown is multiselect : "+sc3.isMultiple());
		 		
		  sc3.selectByVisibleText("2011");
		  
		  
		  
		  
	//	  Thread.sleep(2000);
		
	  
  }
}
