package com.webTestingWebElementScenarios;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class SimpleAlert {
  @Test
  public void SimpleAlertTest() throws InterruptedException {
	  WebDriver Driver1=new EdgeDriver();
	  Driver1.get("https://the-internet.herokuapp.com/javascript_alerts");
	  
	  //<button onclick="jsAlert()">Click for JS Alert</button>
	  
	  Driver1.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
	  
	  Alert at=Driver1.switchTo().alert();
	  Thread.sleep(1000);
	  
	  System.out.println(at.getText());
	  at.accept();
	  
	  System.out.println("Alert Text is::   "+Driver1.findElement(By.id("result")).getText());
	  
	  Driver1.quit();
	  
	  
  }
}
