package com.webTestingWebElementScenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class MouseSliderDrag {
  @Test
  public void f() {
	  
	  WebDriver Driver1= new EdgeDriver();
	  Driver1.get("https://jqueryui.com/slider/");
	  
	  Driver1.switchTo().frame(0);
	  WebElement el1=Driver1.findElement(By.xpath("//span[contains(@class,'ui-slider-handle')]"));
	  
	
	  Actions act=new Actions(Driver1);
	  act.clickAndHold(el1).moveToElement(el1, 100, 0).build().perform();
	  
	  
	  
  }
}
