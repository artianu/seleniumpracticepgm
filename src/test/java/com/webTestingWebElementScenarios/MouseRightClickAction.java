package com.webTestingWebElementScenarios;

import org.testng.annotations.Test;

import java.util.List;

import org.openqa.selenium.*;
import org.openqa.selenium.edge.*;
import org.openqa.selenium.interactions.Actions;

public class MouseRightClickAction {
  @Test
  public void f() {
	  
	  WebDriver Driver1= new EdgeDriver();
	  Driver1.get("https://demo.guru99.com/test/simple_context_menu.html");
	  WebElement el1=Driver1.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));
	  
	  
	  Actions at= new Actions(Driver1);
	  at.contextClick(el1).perform();  //contextClick() used for Right Click.
	 
	  /*------------------------------------------------------------------------------------
	  //Method 1 to click on Delete from list
	  
	Driver1.findElement(By.xpath("//ul[@class='context-menu-list context-menu-root']//li[5]")).click();
	  
	----------------------------------------------------------------------------------------*/
	  
	  /*------------------------------------------------------------------------------------
	   Method 2 to click on Delete from list 
	   
	   	  
	Driver1.findElement(By.xpath("//ul[@class='context-menu-list context-menu-root']//li//span[text()='Delete']")).click();
	
	----------------------------------------------------------------------------------------*/
	  
	  //Method 3 to click on Delete from list
	  
	  
	  List<WebElement> el2=Driver1.findElements(By.xpath("//ul[@class='context-menu-list context-menu-root']//li"));
	  
	  for(WebElement j:el2)
		  
	  {
		  System.out.println(""+j.getText());
		  
	  
		  
		 if(j.getText().contentEquals("Delete"))
				 {
			 		j.click();
			 		break;
			 
				 }
			  
	  }
	  
	  
	  Alert alt1= Driver1.switchTo().alert();
	  
	  System.out.println(""+alt1.getText());
	  alt1.accept();
	  
	  
	  
	  
  }
}
