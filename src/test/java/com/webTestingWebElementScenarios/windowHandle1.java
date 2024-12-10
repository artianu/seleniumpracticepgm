package com.webTestingWebElementScenarios;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.*;
import org.openqa.selenium.edge.EdgeDriver;
 

public class windowHandle1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver= new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		String parentwindowHandle=driver.getWindowHandle();

		System.out.println("Main Windows Handle: "+parentwindowHandle);
		
		driver.findElement(By.linkText("OrangeHRM, Inc")).click();	
		
		Set<String> strhandles=driver.getWindowHandles();
		
		
		System.out.println("Avaialble Windows Handle: "+strhandles);
		
		String str2=driver.getWindowHandle();

		System.out.println("new Windows Handle: "+str2);
		
		for(String i:strhandles)
			
		{
			
			if(!(i.equals(parentwindowHandle)))
			{
				
			driver.switchTo().window(i);
			System.out.println("new Windows Handle: "+i);
			driver.findElement(By.name("EmailHomePage")).sendKeys("test@gmail.com");
			Thread.sleep(2000);
			driver.close();
				
		}
		
		
		
	}
	
	

}
}