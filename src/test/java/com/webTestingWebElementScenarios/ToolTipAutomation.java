package com.webTestingWebElementScenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ToolTipAutomation {
  @Test
  public void f() {
	  
	  
	  WebDriver Driver1= new EdgeDriver();
	  Driver1.get("https://jqueryui.com/tooltip/");
	  Driver1.manage().window().maximize();
	  
	  Driver1.switchTo().frame(0);
	  
	  WebElement el1=Driver1.findElement(By.id("age"));
	  
	
	  Actions act=new Actions(Driver1);
	  
	  act.moveToElement(el1).perform();
	  
	  String tootlipstr=Driver1.findElement(By.className("ui-tooltip-content")).getText();
	  
	  System.out.println("Tooltip is as follows:  "+tootlipstr);
	  
	  
	  
  }
}
