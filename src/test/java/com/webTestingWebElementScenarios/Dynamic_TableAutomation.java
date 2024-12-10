package com.webTestingWebElementScenarios;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Dynamic_TableAutomation {
  @Test
  public void DynamicTable_Practice() {
	
	  
	  WebDriver Driver1=new EdgeDriver();
	  Driver1.get("https://testautomationpractice.blogspot.com/");
	  List<WebElement> tablerow1= Driver1.findElements(By.xpath("//table[@id='taskTable']//tr"));
	  System.out.println("Total Number of Rows including headings: "+tablerow1.size());
	  System.out.println("Total Number of Rows excluding headings: "+(tablerow1.size()-1));
	  
	  System.out.println("Table data are as follows:");
	  for(WebElement i:tablerow1)
	  {
		  
		  System.out.println(""+i.getText()); 
		  
	  }
	  
//	//table[@id='taskTable']//tr//th
	  
	  
	  List<WebElement> tablecol1= Driver1.findElements(By.xpath("//table[@id='taskTable']//tr//th"));
	  System.out.println("Total Number of Col including headings: "+tablecol1.size());
	  
	  
	  System.out.println("Table Columns are as follows:");
	  for(WebElement j:tablecol1)
	  {
		  
		  System.out.print(" "+j.getText()); 
		  
	  }
	  
	  	   
	  
	Driver1.quit();  
  }
  
  
  @Test
  public void DynamicTable_readcol() {
	
	  
	  WebDriver Driver1=new EdgeDriver();
	  Driver1.get("https://testautomationpractice.blogspot.com/");
	  List<WebElement> tablerow1= Driver1.findElements(By.xpath("//table[@id='taskTable']//tr"));
	
	  
  
	  
	  List<WebElement> tablecol1= Driver1.findElements(By.xpath("//table[@id='taskTable']//tr//th"));
		  
	
	  int counter=1;
	  
	  for(WebElement j:tablecol1)
	  {
		 
		  System.out.print(" "+j.getText()); 
		  
		  if(j.getText().contentEquals("Memory (MB)"))
		  {
			  break;
		  
		  }
		  else
		  {
			  counter++; 
			  
		  }
			  
		  }
	  
	  System.out.println("position:::="+counter); 
	  
	  
	  
	// //table[@id='taskTable']//tr//td[4]
	  
	List<WebElement> colmemory= Driver1.findElements(By.xpath("//table[@id='taskTable']//tr//td["+(counter)+"]"));
	for(WebElement k:colmemory)
	  {
		 
		  System.out.print(" "+k.getText()); 
		  
	    
		  
	  }
	  
	  
	  
	  

  }
  
  
  
  
  
}
