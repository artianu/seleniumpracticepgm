package webTesting;

import org.openqa.selenium.*;
import org.openqa.selenium.edge.EdgeDriver;


public class LocatorBy_id {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver= new EdgeDriver();
		driver.get("https://www.google.com");
		
	/*	//Method 1 using id with if loop
		WebElement element=driver.findElement(By.id("APjFqb"));
		if (element.isDisplayed() && element.isEnabled())
		{
			element.sendKeys("TestNG"+Keys.ENTER); 
			
		} */
		
		
		//Method 2
		
		driver.findElement(By.id("APjFqb")).sendKeys("Selenium"+Keys.ENTER);
		driver.quit();
		
				
	}

}
