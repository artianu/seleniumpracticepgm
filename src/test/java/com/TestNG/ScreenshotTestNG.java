package com.TestNG;

import java.io.File;
import java.io.IOException;
import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import org.openqa.selenium.io.FileHandler;

public class ScreenshotTestNG {
  @Test
  public void testScreenshot() throws IOException, InterruptedException {
	  	  
	  WebDriver Driver = new EdgeDriver();
	  Driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		Driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  
		By un=By.name("username");
		By password=By.name("password");
		By btn=By.xpath("//button[@type='submit']");
		
		Driver.findElement(un).sendKeys("Admin");
		Driver.findElement(password).sendKeys("admin123");
		
		
		TakesScreenshot ts=(TakesScreenshot) Driver;
		
		File temp=ts.getScreenshotAs(OutputType.FILE);
		
		File dest=new File(System.getProperty("user.dir")+"//Screenshots//pic.png");
		
		FileHandler.copy(temp,dest);
		
		Driver.findElement(btn).click();
		
		Thread.sleep(2000);
		//Assert.assertTrue(Driver.getCurrentUrl().contains("dashboard"));
		
	File temp2=ts.getScreenshotAs(OutputType.FILE);
		
		File dest2=new File(System.getProperty("user.dir")+"//Screenshots//pic2.png");
		
		FileHandler.copy(temp2,dest2);
	
		

		//System.out.println("Login Successful...Test Case Passed..");
  }
}
