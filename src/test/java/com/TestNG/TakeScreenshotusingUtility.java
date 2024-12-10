package com.TestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;
import com.Generic.ScreenshotUtil;

public class TakeScreenshotusingUtility {
  @Test
  public void TakeScreenshot() throws InterruptedException {
	  WebDriver Driver = new EdgeDriver();
	  Driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		Driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		
		//ScreenshotUtil.Takescreenshot(Driver, "orangehrm", "edgepic");
		
	  
		By un=By.name("username");
		By password=By.name("password");
		By btn=By.xpath("//button[@type='submit']");
		
		Driver.findElement(un).sendKeys("Admin");
		Driver.findElement(password).sendKeys("admin123");
		
		Thread.sleep(2000);
		
		ScreenshotUtil.Takescreenshot(Driver, "orangehrm", "edgepic");
		
		Driver.findElement(btn).click();
		Thread.sleep(2000);
		
		ScreenshotUtil.Takescreenshot(Driver, "orangehrm", "edgepic");
	  
  }
}
