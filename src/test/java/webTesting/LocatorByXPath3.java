package webTesting;

import org.openqa.selenium.*;
import org.openqa.selenium.edge.*;

public class LocatorByXPath3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver Driver1=new EdgeDriver();
		Driver1.get("https://www.amazon.com");
		Driver1.navigate().refresh();
		Driver1.findElement(By.xpath("//input[@placeholder='Search Amazon']")).sendKeys("bags"+Keys.ENTER);
		Driver1.findElement(By.xpath("//input[@placeholder='Search Amazon']")).clear();
		Driver1.findElement(By.xpath("//input[@placeholder='Search Amazon']")).sendKeys("mobile"+Keys.ENTER);
		
		Driver1.findElement(By.xpath("//span[normalize-space()='Cart']")).click();
		
		Driver1.quit();

	}

}
