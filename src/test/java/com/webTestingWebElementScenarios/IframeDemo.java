package com.webTestingWebElementScenarios;

import org.testng.annotations.Test;

import java.util.List;

import org.openqa.selenium.*;
import org.openqa.selenium.edge.*;

public class IframeDemo {
  @Test
  public void f() {
	  WebDriver Driver1=new EdgeDriver();
	  Driver1.get("https://ui.vision/demo/webtest/frames/");
	  Driver1.switchTo().frame(2);
	  Driver1.findElement(By.xpath("//input[@name='mytext3']")).sendKeys("Hi");
	  
	  WebElement iframe1=Driver1.findElement(By.xpath("//iframe[@src='https://docs.google.com/forms/d/1yfUq-GO9BEssafd6TvHhf0D6QLDVG3q5InwNE2FFFFQ/viewform?embedded=true']"));
	  Driver1.switchTo().frame(iframe1);
	  
	Driver1.findElement(By.xpath("//span[text()='I am a human']")).click();
	
	
	List<WebElement> el1=Driver1.findElements(By.xpath("//span[@class='aDTYNe snByac n5vBHf OIC90c']"));
			
	  for(WebElement i:el1)
	  {
		System.out.println(""+i.getText());
		if(i.getText().equalsIgnoreCase("Form Autofilling"))
		{
			i.click();
			break;
		  
	  }
	//Driver1.findElement(By.xpath("//span[text()='Form Autofilling']")).click();  
	  
	  } 
  }
}
