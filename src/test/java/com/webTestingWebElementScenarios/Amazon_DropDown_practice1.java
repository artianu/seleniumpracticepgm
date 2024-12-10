//If dropdown is configured using select tag then Select method is used to select dropdown options.


package com.webTestingWebElementScenarios;

import org.testng.annotations.Test;

import java.util.List;

import org.openqa.selenium.*;
import org.openqa.selenium.edge.*;
import org.openqa.selenium.support.ui.Select;

public class Amazon_DropDown_practice1 {
  @Test
  public void f() throws InterruptedException {
	  
	  WebDriver driver1= new EdgeDriver();
	  driver1.get("https://www.google.com");
	  driver1.navigate().to("https://www.amazon.in");
	  
	  WebElement dropdownele1=driver1.findElement(By.name("url"));
	  Select sc1=new Select(dropdownele1);
	  System.out.println("Is DropDown is multiselect : "+sc1.isMultiple());
	  
	  sc1.selectByIndex(2);
	  Thread.sleep(2000);
	  
	/*  sc1.selectByValue("search-alias=handmade");
	  Thread.sleep(2000);*/
	  
	  sc1.selectByVisibleText("Books");
	  Thread.sleep(2000);
	  
	  List<WebElement> alloptions=sc1.getOptions();
	  System.out.println("size of "+alloptions.size());
	  
	  for(WebElement i:alloptions)
	  {
		  
		  System.out.println(i.getText());
		  if(i.getText().contains("Beauty"))
		  {
			  
			  i.click();
			  break;

			  }
	  }
		  
		  
	  }
	  
	  
	  
  }

