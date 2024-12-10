//This program is for counting naukri.com links..

package webTesting;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.*;
import org.openqa.selenium.edge.*;

public class CountLinks {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver1= new EdgeDriver();
		
		driver1.get("https://www.naukri.com");
		driver1.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); //add implicit wait
		
		List <WebElement> linkc= driver1.findElements(By.tagName("a"));
		
		String Exp1="https://resume.naukri.com/resume-writing-services?fftid=101001";

		System.out.println(linkc.size());
		Thread.sleep(2000);
		
		for(WebElement i:linkc)
			
		{
					
			System.out.println(i.getText());
			System.out.println("========="+i.getAttribute("href"));
			
			
		/*	if(i.getAttribute("href").contains(Exp1));
			{
				System.out.println("link found");
				break;
				
			}*/
			
		}
			
	}

}
