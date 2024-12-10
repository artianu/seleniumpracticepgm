package com.TestNGDataDrivenTesting;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ExcelReadingTest {
  @Test(dataProvider="exceldata",dataProviderClass=CustomData.class)

  public void login(String uname,String passwd) {
	  
	  WebDriver Driver = new EdgeDriver();
	  Driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		Driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  
		By un=By.name("username");
		By password=By.name("password");
		By btn=By.xpath("//button[@type='submit']");
		
		Driver.findElement(un).sendKeys(uname);
		Driver.findElement(password).sendKeys(passwd);
		Driver.findElement(btn).click();
		
		Assert.assertTrue(Driver.getCurrentUrl().contains("dashboard"));
		System.out.println("Login Successful...Test Case Passed..");
  }

}
