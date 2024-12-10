package webTesting;

import org.openqa.selenium.*;
import org.openqa.selenium.edge.EdgeDriver;


public class LocatorBy_classname {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		WebDriver driver= new EdgeDriver();
		driver.get("https://www.google.com");
		
		driver.findElement(By.id("APjFqb")).sendKeys("Selenium");
		driver.findElement(By.className("gNO89b")).click();
		
		
		
		driver.quit();

	}

}
