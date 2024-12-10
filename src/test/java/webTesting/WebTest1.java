package webTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class WebTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		WebDriver driver1= new EdgeDriver();
		
		driver1.get("https://www.orangehrm.com");	
		String expTitle="Human Resources Management Software | OrangeHRM";
		String actTitle="";
		
		
		actTitle=driver1.getTitle();
		
		if(actTitle.equals(expTitle))
		{
			System.out.println("Titiles are matched..Test case Passed");
								
		}
		else
		{
					System.out.println("Titiles are not matched..Test case failed");
					
					
		}
		driver1.quit();
		  
			
	}

	
	
}

