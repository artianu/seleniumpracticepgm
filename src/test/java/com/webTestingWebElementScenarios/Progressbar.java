package com.webTestingWebElementScenarios;

import org.testng.annotations.Test;

import java.time.Duration;

import org.openqa.selenium.*;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Progressbar {
  @Test
  public void f() throws InterruptedException {
	  
	  WebDriver driver=new EdgeDriver();
	  driver.get("https://demo.automationtesting.in/ProgressBar.html");

	  	  
	
	  driver.findElement(By.xpath("//button[text()=' Download']")).click();
	  
		  
		By el1=By.xpath("//div[@class='progressbar-text']");
		 
	  
	  WebDriverWait wait1=new WebDriverWait(driver,Duration.ofSeconds(50));
	Thread.sleep(5000);
	

	
	
	WebDriverWait wait2=new WebDriverWait(driver,Duration.ofSeconds(5));
	
	 WebElement ele2=wait1.until(ExpectedConditions.presenceOfElementLocated(el1));
		System.out.println(ele2.getText());
		
	  wait2.until(ExpectedConditions.textToBe(el1, "100"));
	  System.out.println(ele2.getText());
	
	

  }
}
