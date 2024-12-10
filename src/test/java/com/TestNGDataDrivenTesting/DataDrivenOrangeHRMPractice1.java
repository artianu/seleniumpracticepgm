
//Data provider is in different class

package com.TestNGDataDrivenTesting;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.TestNGpropertiesfilereading.PropertyFileReadingUtility;

public class DataDrivenOrangeHRMPractice1 {

  
  @DataProvider(name="arraydata")
	public Object[][] dataset()
	{
		Object data[][]= {{"admin1","admin123"},{"admin2","admin123"},{"admin3","admin123"},{"admin4","admin123"}};
		return data;
		
	}
  
  @Test(dataProvider="arraydata")
  public void LoginTest(String uname ,String passwd) {
	  
	
	  
	  WebDriver Driver = new EdgeDriver();
	  Driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		Driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  
		By un=By.name("username");
		By password=By.name("password");
		By btn=By.xpath("//button[@type='submit']");
		
		Driver.findElement(un).sendKeys(uname);
		Driver.findElement(password).sendKeys(passwd);
		Driver.findElement(btn).click();
  }


}
