package com.webTestingWebElementScenarios;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class CalenderIndigoTest {
  @Test
  public void f() {
	  WebDriver Driver1=new EdgeDriver();
	  Driver1.get("https://www.goindigo.in/");
	  
	  //<span class="label_top">Departure</span>
	 // Driver1.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
	  
	  Driver1.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	 
	
	  Driver1.findElement(By.xpath("//span[text()='Departure']"));
			  
	
	
	  
	  
  }
}
