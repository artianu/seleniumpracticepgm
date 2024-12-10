package com.webTestingWebElementScenarios;

import org.testng.annotations.Test;

import java.time.Duration;

import org.openqa.selenium.*;
import org.openqa.selenium.edge.EdgeDriver;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Progressbar2 {
  @Test
  public void f() throws InterruptedException {
	  WebDriver Driver1= new EdgeDriver();
	  
	  Driver1.get("http://uitestingplayground.com/progressbar");
	  
	  Driver1.findElement(By.xpath("//button[@id='startButton']")).click();
	  
	  By el1=By.xpath("//div[@class='progress-bar bg-info']");
	  
	  
	  WebDriverWait wait1=new WebDriverWait(Driver1,Duration.ofSeconds(50));
	  Thread.sleep(5000);
	

	  
	wait1.until(ExpectedConditions.attributeToBe(el1,"aria-valuenow","85"));
  
	  Driver1.findElement(By.xpath("//button[@id='stopButton']")).click();

	  
	  
  }
}
