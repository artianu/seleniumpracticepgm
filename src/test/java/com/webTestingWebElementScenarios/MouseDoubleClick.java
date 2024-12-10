package com.webTestingWebElementScenarios;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class MouseDoubleClick {
  @Test
  public void f() throws InterruptedException {
	  
	  WebDriver Driver1= new EdgeDriver();
	  Driver1.get("https://demo.guru99.com/test/simple_context_menu.html");
	  WebElement el1=Driver1.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
	  
	  Actions act= new Actions(Driver1);
	  act.doubleClick(el1).perform();
	  
	  Thread.sleep(2000);
	  
	  Alert at=Driver1.switchTo().alert();
	  
	  System.out.println(at.getText());
	  
	  at.accept();
	  
  }
}
