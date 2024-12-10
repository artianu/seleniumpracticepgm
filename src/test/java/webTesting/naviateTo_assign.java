package webTesting;

import org.openqa.selenium.*;
import org.openqa.selenium.edge.*;

public class naviateTo_assign {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		WebDriver Driver1= new EdgeDriver();
		Driver1.get("https://www.google.com");
		System.out.println("This is current URL...."+Driver1.getCurrentUrl());
		Driver1.navigate().to("https://www.facebook.com");
		System.out.println("This is current URL after Naviagation...."+Driver1.getCurrentUrl());
		Driver1.navigate().refresh();	
		Driver1.navigate().back();
		Driver1.navigate().forward();
		System.out.println("This is current URL...."+Driver1.getPageSource());
		Driver1.quit();
		

		
		
	}

}
