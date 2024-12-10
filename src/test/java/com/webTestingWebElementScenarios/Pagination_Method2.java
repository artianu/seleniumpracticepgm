package com.webTestingWebElementScenarios;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Pagination_Method2 {
  @Test
  public void f() throws InterruptedException  {
	  
	  WebDriver Driver1=new EdgeDriver();
	  Driver1.get("https://testautomationpractice.blogspot.com/");
	  Driver1.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  
	  List<WebElement> el1=Driver1.findElements(By.xpath("//ul[@class='pagination']//li//a"));
	  
	  System.out.println("Number of Pagination: "+(el1.size()));
	  
	  for(WebElement i:el1)
	  {
		  
		  if(i.getText().contains("3"))
		  {
			  i.click();
		  		break;
		  }
		  
		  
	  }
	  
	  //clicks on checkbox of fitness tracker
	Driver1.findElement(By.xpath("//table[@id='productTable']//tbody//tr[4]//td[text()='Fitness Tracker']//following-sibling::td[2]//input")).click();
	
	  
	 
  }
  }

