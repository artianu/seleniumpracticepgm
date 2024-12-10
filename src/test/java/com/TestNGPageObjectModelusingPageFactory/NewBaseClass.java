//loginpage constructor will be created here

package com.TestNGPageObjectModelusingPageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeClass;

import com.TestNGPageObjectModelusingByLocator.OrangehrmLoginClass;

public class NewBaseClass {
	
	
	WebDriver Driver;

	NewLoginPageclass np;
	
	@BeforeClass
	  public void setup() {
		
		Driver=new EdgeDriver();
		Driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		

		 np=new NewLoginPageclass(Driver);
		 
		 

}
	
}

