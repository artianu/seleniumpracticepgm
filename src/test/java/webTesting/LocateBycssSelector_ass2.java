package webTesting;

import org.openqa.selenium.*;
import org.openqa.selenium.edge.*;

public class LocateBycssSelector_ass2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		WebDriver Driver1= new EdgeDriver();
		Driver1.get("https://automationplayground.com/crm");
		Driver1.findElement(By.cssSelector("a.nav-link")).click(); //click on sign in link
		
		Driver1.findElement(By.cssSelector("input#email-id")).sendKeys("test@gmail.com");
		
		Driver1.findElement(By.cssSelector("input#password")).sendKeys("test123");	
		
		Driver1.findElement(By.cssSelector("input#remember")).click();
		
		Driver1.findElement(By.cssSelector("button#submit-id")).click();
		
		Thread.sleep(1000);
		
		
		Driver1.findElement(By.cssSelector("a.nav-link")).click(); //click on sign out link

		

	}

}
