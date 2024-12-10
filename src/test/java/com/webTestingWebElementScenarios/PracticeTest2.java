package com.webTestingWebElementScenarios;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class PracticeTest2 {
  @Test
  public void f() throws InterruptedException {
	  
	  WebDriver Driver1=new EdgeDriver();
	  Driver1.get("https://testautomationpractice.blogspot.com/");
	  Driver1.findElement(By.xpath("//input[@id='Wikipedia1_wikipedia-search-input']")).sendKeys("Novel");
    Driver1.findElement(By.xpath("//input[@class='wikipedia-search-button']")).click();
    
    //List<WebElement> el1=Driver1.findElements(By.xpath("//div[@class='wikipedia-search-results']"));
    Thread.sleep(2000);
 
    
    WebElement el1=Driver1.findElement(By.xpath("//div[@id='Wikipedia1_wikipedia-search-results']"));
    //System.out.println(el1.size());
    
 
    	System.out.println(el1.getText());
    	
    	//Driver1.findElement(By.linkText("More »")).click();  //to click on linked text
    	
    	
    	Driver1.findElement(By.name("start")).click();
    	
    	System.out.println("Stop button is displayed::"+Driver1.findElement(By.name("stop")).isDisplayed());   //check whether stop button displayed or not
    	
    	Driver1.findElement(By.xpath("//button[@id='alertBtn']")).click();
    	
    	  Alert at=Driver1.switchTo().alert();
    	  
    	  System.out.println("Simple Alert Text:: "+at.getText());
    	  
    	 Thread.sleep(3000);
    	  at.accept();
    	  
    	  
    	Driver1.findElement(By.xpath("//button[@id='confirmBtn']")).click();
          Alert at2=Driver1.switchTo().alert();	  
    	 
    	  System.out.println("Confim Alert Text:: "+at2.getText());
    	  
    	 Thread.sleep(3000);
    	  at2.dismiss();
    	  
    	  
    
    		Driver1.findElement(By.xpath("//button[@id='promptBtn']")).click();
          Alert at3=Driver1.switchTo().alert();	  
    	 
    	  System.out.println("Confim Alert Text:: "+at3.getText());
    	  
    	  
    	 Thread.sleep(3000);
    	  at.accept();
    	  
    	  
    	  
    	  
    	  
    	  
    	  
    	  
    	
    	
  	
  }
}
