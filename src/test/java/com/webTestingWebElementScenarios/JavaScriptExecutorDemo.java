package com.webTestingWebElementScenarios;

import org.testng.annotations.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.idealized.Javascript;
import org.openqa.selenium.edge.EdgeDriver;

public class JavaScriptExecutorDemo {
  @Test
  public void f() throws InterruptedException {
	  
	  WebDriver Driver1= new EdgeDriver();
	  Driver1.get("https://www.amazon.com");
	  
	  JavascriptExecutor js = (JavascriptExecutor)Driver1;
	 // js.executeScript("window.scrollTo(0,5000)");
	  		
	  //scroll down
	  js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	  
	  Thread.sleep(2000);
	  
	  //scroll up
	  js.executeScript("window.scrollTo(document.body.scrollHeight,0)");
	  
	  
	  WebElement el1= Driver1.findElement(By.xpath("//span[contains(text(),'Best Sellers in Home')]"));
	  
	  //scroll upto element
	  js.executeScript("arguments[0].scrollIntoView(true)", el1);
	  
	  
	  
	  
	  
	  
  }
}
