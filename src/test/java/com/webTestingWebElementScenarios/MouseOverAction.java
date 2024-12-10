package com.webTestingWebElementScenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class MouseOverAction {
  @Test
  public void f() {
	  WebDriver Driver1= new EdgeDriver();
	  Driver1.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_onmouseover");
	  
	  Driver1.switchTo().frame("iframeResult");
	  
	  
	  
	  WebElement el1=Driver1.findElement(By.xpath("//img[@alt='Smiley']"));
	  
	  Actions at1=new Actions(Driver1);
	  
	  //moveToElement for MouseOver effect.
	  
	  at1.moveToElement(el1).perform();
	  
	  
	  
	  
	  
  }
}
