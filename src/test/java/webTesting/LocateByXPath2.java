
//This is program to automate facebook page

package webTesting;

import org.openqa.selenium.*;
import org.openqa.selenium.edge.*;

public class LocateByXPath2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver Driver1=new EdgeDriver();
		Driver1.get("https://www.facebook.com/r.php");
		Driver1.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Anuraj");
		Driver1.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Firodiya");
		

        // Select "month" from the dropdown
		Driver1.findElement(By.xpath("//select[@name='birthday_month']")).click();
		
        Driver1.findElement(By.xpath("//option[@value='8']")).click();
        

        // Select "date" from the dropdown
         Driver1.findElement(By.xpath("//select[@title='Day']")).click();

        Driver1.findElement(By.xpath("//option[@value='17']")).click();
        
        

        // Select "date" from the dropdown
         Driver1.findElement(By.xpath("//select[@name='birthday_year']")).click();

        Driver1.findElement(By.xpath("//option[@value='2011']")).click();
        
        //to select radio button 
        
        Driver1.findElement(By.xpath("//input[@type='radio' and @value='2']")).click();
        
        
      //to select radio button 
        
        Driver1.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("anurajfirodiya06@gmail.com");
        
        
        Driver1.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("anuraj123");
        
        
	}

}
