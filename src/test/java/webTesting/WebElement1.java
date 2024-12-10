package webTesting;



import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class WebElement1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			
				WebDriver driver1= new EdgeDriver();
				driver1.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				driver1.get("https://opensource-demo.orangehrmlive.com/auth/login");	
			
				
		
		
	}

}
