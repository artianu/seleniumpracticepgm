package webTesting;

import org.openqa.selenium.*;
import org.openqa.selenium.edge.EdgeDriver;

public class LocatorBy_name {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver1= new EdgeDriver();
		driver1.get("https://automationplayground.com/crm/login.html");
		driver1.findElement(By.name("email-name")).sendKeys("test@gmail.com");
		driver1.findElement(By.name("password-name")).sendKeys("test123");
		
		driver1.findElement(By.id("remember")).click();
		driver1.findElement(By.name("submit-name")).click();
		Thread.sleep(2000);
		driver1.quit();

	}

}
