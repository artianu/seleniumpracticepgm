package com.webTestingWebElementScenarios;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Redbus_dropdown_dynamic {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub


		WebDriver driver1=new EdgeDriver();
		
		driver1.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver1.get("https://www.redbus.in");
		
		//dropdown source
		driver1.findElement(By.id("src")).sendKeys("pune");
		
		List<WebElement> el1=driver1.findElements(By.xpath("//ul[contains(@class,'sc-dnqmqq')]//li//text[@class='placeHolderMainText']"));
		
		System.out.println("Total options available in source"+ el1.size());

		 for(WebElement i:el1)
		  {
			   //System.out.println(i.getText());
			  if(i.getText().contains("Wakad"))
			  {
				  i.click();
				  break;
				  
				  }
			  
		  }
		
	 Thread.sleep(1000);
	driver1.findElement(By.id("dest")).sendKeys("delhi");
	List<WebElement> el2=driver1.findElements(By.xpath("//ul[contains(@class,'sc-dnqmqq')]//li//text[@class='placeHolderMainText']"));
	System.out.println("Total options available in destination: "+ el2.size());
	driver1.quit();
			
		
	}

}
