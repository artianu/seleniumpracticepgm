package webTesting;

import org.openqa.selenium.*;
import org.openqa.selenium.edge.*;

public class LocateBycssSelector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver Driver1= new EdgeDriver();
		Driver1.get("https://www.saucedemo.com/v1");
		
//--------------------------------------------------------------------------------------------------------		
		
		//<input type="text" class="form_input" data-test="username" id="user-name" name="user-name" placeholder="Username" autocorrect="off" autocapitalize="none" value="">
		
		//First Method tagname with id
		
		//(Syntax tagname#id)
		
		Driver1.findElement(By.cssSelector("input#user-name")).sendKeys("standard_user");
		
//-----------------------------------------------------------------------------------------------------		
		
		//Second Method tagname with attribute
		
		//(Syntax tagname[attribute='value'])	
		
		//<input type="password" class="form_input" data-test="password" id="password" name="password" placeholder="Password" autocorrect="off" autocapitalize="none" value="">
		
		Driver1.findElement(By.cssSelector("input[type='password']")).sendKeys("secret_sauce");
		
//-----------------------------------------------------------------------------------------------------
	
		/*
		//Third Method tagname with classname
		
//		<input type="submit" class="btn_action" id="login-button" value="LOGIN">
		
		
		//(Syntax tagname.classname)
		Driver1.findElement(By.cssSelector("input.btn_action")).click();
		
		
		*/
//-----------------------------------------------------------------------------------------------------		
		
	//Fourth Method tagname with id,classname and attribute
		
//		<input type="submit" class="btn_action" id="login-button" value="LOGIN">
		
		
		//(Syntax tagname#id.classname[attribute='value']
		Driver1.findElement(By.cssSelector("input#login-button.btn_action[value='LOGIN']")).click();	
		
		
		
		

	}

}
