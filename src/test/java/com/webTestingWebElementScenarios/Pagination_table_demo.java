package com.webTestingWebElementScenarios;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Pagination_table_demo {
  @Test
  public void f() throws InterruptedException {
	  
	  WebDriver Driver1=new EdgeDriver();
	  Driver1.get("https://testautomationpractice.blogspot.com/");
	  Driver1.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  Driver1.findElement(By.xpath("//ul[@class='pagination']//li[3]")).click();
	  
	  WebElement elname1=Driver1.findElement(By.xpath("//table[@id='productTable']//tr[4]//td[2]"));
	  Thread.sleep(2000);
	  if(elname1.getText().contentEquals("Fitness Tracker"))
	  {
		  
		  System.out.println("Row found successfully");
		  WebElement chk1=Driver1.findElement(By.xpath("//table[@id='productTable']//tr[4]//td[4]//input"));
		  
		  Thread.sleep(2000);
		  chk1.click();
		  if(chk1.isSelected())
		  {
			  System.out.println("After click,Checkbox is Selected");
		  }
		  
		  else
		  {
			  System.out.println("After click,Checkbox is not Selected");
			  
		  }
		  
		  		  
	  }
	  
	  
	  Thread.sleep(2000);
	 // Driver1.quit();
	  }
}
