package com.webTestingWebElementScenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ResizableAutomation {
  @Test
  public void f() throws InterruptedException {
	  
	  WebDriver Driver1=new EdgeDriver();
	  Driver1.get("https://jqueryui.com/resizable/");
	  Driver1.manage().window().maximize();
	  Driver1.switchTo().frame(0);
	  Thread.sleep(2000);
	  
	  WebElement el1=Driver1.findElement(By.className("ui-resizable-se"));
	
	  Actions act=new Actions(Driver1);
	  //Thread.sleep(10);
  
	  //act.clickAndHold(el1).moveToElement(el1, 150,20).release().build().perform();  
	  act.dragAndDropBy(el1, 150, 20).build().perform();
	  
  }
}
