package webTesting;

import java.time.Duration;

import org.openqa.selenium.*;
import org.openqa.selenium.edge.*;

public class LocateBycssSelector_ass3 {
	
	

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver Driver1= new EdgeDriver();
		Driver1.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		Driver1.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); //add implicit wait
		
	//	<input data-v-1f99f73c="" class="oxd-input oxd-input--active" name="username" placeholder="Username" autofocus="">
		
		Driver1.findElement(By.cssSelector("input[name='username']")).sendKeys("Admin"); //username
		
		
		
		//<input data-v-1f99f73c="" class="oxd-input oxd-input--active" type="password" name="password" placeholder="Password">
		
		Driver1.findElement(By.cssSelector("input[type='password']")).sendKeys("admin123"); //password
		
		
//		<button data-v-10d463b7="" data-v-0af708be="" type="submit" class="oxd-button oxd-button--medium oxd-button--main orangehrm-login-button"><!----> Login <!----></button>
		
		Driver1.findElement(By.cssSelector("button.oxd-button.oxd-button--medium.oxd-button--main.orangehrm-login-button")).click();   //login
		
		
//		<i data-v-bddebfba="" data-v-bdd6d943="" class="oxd-icon bi-caret-down-fill oxd-userdropdown-icon"></i>
		
		Thread.sleep(2000);
		
		
		Driver1.findElement(By.cssSelector("i.oxd-icon.bi-caret-down-fill.oxd-userdropdown-icon")).click(); //dropdown
		
//		<a href="/web/index.php/auth/logout" role="menuitem" class="oxd-userdropdown-link">Logout</a>
		
		Driver1.findElement(By.cssSelector("a[href=\'/web/index.php/auth/logout\']")).click();   //logout
		
		
		
		
		
		
		
	}

}
