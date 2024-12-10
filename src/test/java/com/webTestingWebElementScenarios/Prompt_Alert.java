package com.webTestingWebElementScenarios;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Prompt_Alert {
	
	  WebDriver Driver1=new EdgeDriver();

	
  @Test
  public void PromptAlertAcceptTest() throws InterruptedException {
	//  WebDriver Driver1=new EdgeDriver();
	  Driver1.get("https://the-internet.herokuapp.com/javascript_alerts");
	  
	
	  
	  Driver1.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
	  
	  Alert at=Driver1.switchTo().alert();
	  Thread.sleep(2000);
	  
	  System.out.println(at.getText());
	  
	  at.sendKeys("Hurricane");
	  Thread.sleep(2000);
	  
	  //clicking on accept button
	  at.accept();	  
	
	  System.out.println("Alert Text is::"+Driver1.findElement(By.id("result")).getText());
	  
	
		    
  }
  
  @Test
  public void PromptAlertCancelTest() throws InterruptedException {
	  
	  Driver1.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
	  
	  Alert at=Driver1.switchTo().alert();
	  Thread.sleep(2000);
	  
	  System.out.println(at.getText());
	  
	  at.sendKeys("Null should be added");
	 
	  
	  Thread.sleep(2000);
	  
	  //clicking on cancel button
	  at.dismiss();	  
	
	  System.out.println("Alert Text is::"+Driver1.findElement(By.id("result")).getText());
	  
	  Thread.sleep(2000);
	  
	  Driver1.quit();
	  
  } 
  
  
  
}
