package webTesting;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.*;
import org.openqa.selenium.edge.*;

public class LocateByXPath1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
WebDriver driver1= new EdgeDriver();
		
		driver1.get("https://tutorialsninja.com/demo/index.php?route=account/login");
		driver1.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); //add implicit wait
		
		driver1.findElement(By.xpath("//*[@id='input-email']")).sendKeys("sumit11@gmail.com");
		//*[@id="input-password"]
		driver1.findElement(By.xpath("//*[@id='input-password']")).sendKeys("test123");

		driver1.findElement(By.xpath("//*[@type='submit']")).click();
	}

}
