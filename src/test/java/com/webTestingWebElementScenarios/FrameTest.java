//Frame can be identified using index,id/name and WebElement through selenium.
//First test case using id and second test case using webelemnt.

package com.webTestingWebElementScenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class FrameTest {
	
	
	
/*	  
  @Test
  public void frame_with_indexing() {
	  
	  
	 WebDriver Driver1=new EdgeDriver();
	  Driver1.get("https://ui.vision/demo/webtest/frames/");
	  
	  //<input type="text" name="mytext1" size="25">
	  
	  //frame with indexing
	  Driver1.switchTo().frame(0);
	  
	  Driver1.findElement(By.xpath("//input[@name='mytext1']")).sendKeys("Hi");
	  Driver1.close();
	  	    
  }
  */
  
  @Test
  public void frame_with_webelement() {
	  
	  
	  WebDriver Driver2=new EdgeDriver();
	 Driver2.get("https://ui.vision/demo/webtest/frames/");
	  
	  //<input type="text" name="mytext1" size="25">
	  
	  WebElement el1=Driver2.findElement(By.xpath("//frame[@src='frame_1.html']"));
	  
	  //frame with indexing
	  Driver2.switchTo().frame(el1);
	  
	  Driver2.findElement(By.xpath("//input[@name='mytext1']")).sendKeys("Hello from frame1");
	  
	  Driver2.switchTo().defaultContent();
	  
  WebElement el2=Driver2.findElement(By.xpath("//frame[@src='frame_2.html']"));
	  
	  //frame with indexing
	  Driver2.switchTo().frame(el2);
	  
	  Driver2.findElement(By.xpath("//input[@name='mytext2']")).sendKeys("Hello from frame2");
	  
	  Driver2.switchTo().defaultContent();
	  Driver2.quit();
	  
	  
	  	    
  }
  
  
  
  
  
  
  
  
  
}
