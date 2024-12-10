package com.webTestingWebElementScenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class MouseDragandDrop {
  @Test
  public void f() {
	  
	  WebDriver Driver1= new EdgeDriver();
	  Driver1.get("https://jqueryui.com/droppable/");
	  Driver1.switchTo().frame(0);
	  
	  WebElement src1=Driver1.findElement(By.id("draggable"));
	  
	  WebElement dest1=Driver1.findElement(By.id("droppable"));
	  
	  Actions act1= new Actions(Driver1);
	  act1.dragAndDrop(src1, dest1).perform();
	  
	  
  }
}
