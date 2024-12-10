package com.TestNGPageObjectModelusingByLocator;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeClass;

public class OrangehrmBaseClass {
	
	WebDriver Driver;
	OrangehrmLoginClass lp;
	
	@BeforeClass
	  public void setup() {
		
		Driver=new EdgeDriver();
		Driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		lp = new OrangehrmLoginClass(Driver);
		
		  }

	
	
}
