package com.webTestingWebElementScenarios;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class PracticeTest1 {
  @Test
  public void f() throws InterruptedException {
	  WebDriver Driver1=new EdgeDriver();
	  Driver1.get("https://testautomationpractice.blogspot.com/");
	  Driver1.findElement(By.xpath("//input[@placeholder='Enter Name']")).sendKeys("Arti");
	  Driver1.findElement(By.xpath("//input[@placeholder='Enter EMail']")).sendKeys("Arti@gmail.com");
	  Driver1.findElement(By.xpath("//input[@placeholder='Enter Phone']")).sendKeys("123456");
	  Driver1.findElement(By.xpath("//textarea[@id='textarea']")).sendKeys("Louisville");
	  Driver1.findElement(By.xpath("//input[@value='female']")).click();
	  Driver1.findElement(By.xpath("//input[@value='monday']")).click();
	  
	  List<WebElement> el1=Driver1.findElements(By.xpath("//select[@id='country']//option"));
	  System.out.println(el1.size());
	  
	  for(WebElement i:el1)
	  {
		  System.out.println(i.getText());
		  
	  }
	  
	  
	  for(WebElement j:el1)
	  {
		 // System.out.println(j.getText());
		  
		  if(j.getText().equalsIgnoreCase("China"))
		  {	
			  j.click();
		  		break;
		  }
		  
	  	}
	  
	  
	  //Method 1 to select color from DropDown
	/*  List<WebElement> el2=Driver1.findElements(By.xpath("//select[@id='colors']//option"));
	  System.out.println(el2.size());
	  
	  for(WebElement i:el2)
	  {
		  System.out.println(i.getText());
		  
	  }
	  
	  
	  for(WebElement j:el2)
	  {
		 
		  
		  if(j.getText().equalsIgnoreCase("green"))
		  {	
			  j.click();
		  		break;
		  }
		  
	  	}*/
	  
	  //Method 2 to select dropdown box of color..
	  
	  WebElement dropdownele=Driver1.findElement(By.xpath("//select[@id='colors']")); 
	  		
	  Select sc=new Select(dropdownele);
	  System.out.println("Is DropDown is multiselect : "+sc.isMultiple());
	 		
	  sc.selectByVisibleText("Green");
	  
	  sc.selectByVisibleText("Blue");
	  
	  
	  
	  //Method to select dropdown box of Animal..
	  
	  WebElement Animaldropdownele=Driver1.findElement(By.xpath("//select[@id='animals']")); 
		
	  Select sc1=new Select(Animaldropdownele);
	  System.out.println("Is DropDown is multiselect : "+sc1.isMultiple());
	 		
	  sc1.selectByVisibleText("Zebra");
	  
	  sc1.selectByVisibleText("Lion");
	  
	  Thread.sleep(2000);
	  
	  
		
	  
	  //Method to pick date picker1
 
	  System.out.println("vvvvaaaa");
	  
	  Driver1.findElement(By.xpath("//input[@id='datepicker']")).click();
	  
	  Driver1.findElement(By.xpath("//a[@data-handler='next']")).click();  //click on month button
	
 List<WebElement> el3=Driver1.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//td//a"));
 
 	for(WebElement k:el3)
 	{
	  System.out.println(k.getText());
		
	 
	if(k.getText().equalsIgnoreCase("22"))
	 {
		 k.click();
		 break;
	 }
	 
 }
 	
 
 	/*
 	//Date picker 3
 	
	Driver1.findElement(By.xpath("//input[@id='start-date']")).sendKeys("12-12-2012");
 	
 	Driver1.findElement(By.xpath("//input[@id='end-date']")).sendKeys("22-12-2012");
 	
 	
 	Driver1.findElement(By.xpath("//button[@class='submit-btn']")).click();
 	
 	String str=Driver1.findElement(By.xpath("//div[@id='result']")).getText();	
 	
 	 System.out.println(str);
 	 
 	 if(str.contains("You selected a range of"))
 	 {
 	 	 System.out.println("Test Case Passed");
 	 	 
  	 }
 	
  	 else 
 		 
 	 {
 	 	 System.out.println("Test Case Failed");
 	 	 
 	 	 	 } */
 	 
 	 
 	  //element click
	  WebElement ele=Driver1.findElement(By.xpath("//input[@id='start-date']"));
	  
	  JavascriptExecutor js=(JavascriptExecutor) Driver1;
	  
	  js.executeScript("arguments[0].click();",ele);
 	 
 	 
 	 
 	 
 	 
  
 
  }  
	  
  
}
