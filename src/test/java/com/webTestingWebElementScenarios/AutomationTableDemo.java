package com.webTestingWebElementScenarios;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.openqa.selenium.edge.*;

public class AutomationTableDemo {
  @Test
  public void StaticTable_Countrowcol() {
	  WebDriver Driver1=new EdgeDriver();
	  Driver1.get("https://testautomationpractice.blogspot.com/");
	  List<WebElement> tablerow1= Driver1.findElements(By.xpath("//table[@name='BookTable']//tr"));
	  System.out.println("Total Number of Rows including headings: "+tablerow1.size());
	  System.out.println("Total Number of Rows excluding headings: "+(tablerow1.size()-1));
	  
	
	  List<WebElement> tablecol1= Driver1.findElements(By.xpath("//table[@name='BookTable']//tr[1]//th"));
	  System.out.println("Total Number of columns including headings: "+tablecol1.size());
	  System.out.println("Table Column Names are a follows:");
	  
	  System.out.println("----------------------------------");
	  for(WebElement i:tablecol1)
	  {
		  
		  System.out.println(i.getText());
		  
	  }
	 

   }
  
  @Test
  public void StaticTable_readdatatable() {
	  WebDriver Driver1=new EdgeDriver();
	  Driver1.get("https://testautomationpractice.blogspot.com/");
	  List<WebElement> tablerow1= Driver1.findElements(By.xpath("//table[@name='BookTable']//tr"));
	 
	  System.out.println("Table Read Data");
		  
	  System.out.println("----------------------------------");
	  for(WebElement i:tablerow1)
	  {
		  
		  System.out.println(i.getText());
		  
	  }
  
  }
  
  
  
  @Test
  public void StaticTable_printmatchrecord() {
	  WebDriver Driver1=new EdgeDriver();
	  Driver1.get("https://testautomationpractice.blogspot.com/");
	  List<WebElement> authorcol= Driver1.findElements(By.xpath("//table[@name='BookTable']//tr//td[2]"));
	  
	  
	
	  List<WebElement> pricecol= Driver1.findElements(By.xpath("//table[@name='BookTable']//tr//td[4]"));

	  int authorcnt=0;
	
	 for(WebElement i:authorcol)
		 
	 {
		 authorcnt++;
		 if(i.getText().contentEquals("Mukesh"))
			 
		 {
			
			  int pricecnt=1;
			 for(WebElement j:pricecol)
			 {
				 
				 if(authorcnt==pricecnt)
				 {
					 
					 System.out.print(i.getText()+" : ");
					 System.out.println(j.getText());
					  break;
					 
				 }
				 else 
				 {
					 
					 pricecnt++;
					 
				 }
				 
				 
			 }	
		
			 
					 
			 }
			 
			
			 
		 }
			 
	 }
	  
  }
  
  
  
  
  
  
  

