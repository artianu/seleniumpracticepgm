//This class is for OrangeHRM URL for Login and Logout functionality.


package webTesting;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;


public class OrangehrmClassName {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//initialize web driver
		WebDriver driver1= new EdgeDriver();
		
		
		driver1.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); //add implicit wait
				
		driver1.get("https://opensource-demo.orangehrmlive.com/auth/login");//Open URL
		
		
		driver1.findElement(By.name("username")).sendKeys("Admin"); //Provide the username..
		driver1.findElement(By.name("password")).sendKeys("admin123"); //provide the password..
		driver1.findElement(By.className("oxd-button")).click(); //click on login
		driver1.findElement(By.className("oxd-userdropdown-icon")).click(); //click on dropdown button
		System.out.println("TestCase 1: User should successfully logged in after clicking on login button.");
		Thread.sleep(2000);
		
		
		driver1.findElement(By.linkText("Logout")); //click on logout
		System.out.println("TestCase 2: User should successfully looged out after clicking on logout button.");
				
       driver1.quit();
       
	}
	
			
		

	}



