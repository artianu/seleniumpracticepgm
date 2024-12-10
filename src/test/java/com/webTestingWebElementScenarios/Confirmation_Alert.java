package com.webTestingWebElementScenarios;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import org.openqa.selenium.edge.*;

public class Confirmation_Alert {
  @Test
  public void ConformationAlertTest() throws InterruptedException {
	  
	  WebDriver Driver1=new EdgeDriver();
	  Driver1.get("https://the-internet.herokuapp.com/javascript_alerts");
	  
	  //<button onclick="jsAlert()">Click for JS Alert</button>
	  
	  Driver1.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
	  
	  Alert at=Driver1.switchTo().alert();
	  Thread.sleep(2000);
	  
	  System.out.println(at.getText());
	  
	  //clicking on cancel button
	  at.dismiss();
	  
	  System.out.println("Alert Text is::   "+Driver1.findElement(By.id("result")).getText());
	  
	  Driver1.quit();
	  
	  		
	  		
  }
}
