//This is new TESTNG class file and all test cases will be written here...

package com.TestNGPageObjectModelusingPageFactory;

import org.testng.Assert;
import org.testng.annotations.Test;

public class NewLoginPageTestClass extends  NewBaseClass {

	  @Test(priority=1)
	  public void validateURL() {
		  
		
		  String acturl=np.getAppurl();
		  Assert.assertTrue(acturl.contains("opensource"),"URL is not matching");
		  
		  System.out.println("URL is Matching");
		  
	  }
	  
	  
	  @Test(priority=2)
	  public void validateTitle() {
		  
		 
		  String actTitle=np.getpageTitle();
		  Assert.assertEquals(actTitle,"OrangeHRM","Title is not matching");
		  
		  System.out.println("Title is Matching");
		  
	  }
	  
	  
	  @Test(priority=3)
	  public void validateLoginL() {
		  
		  np.doLogin("Admin", "admin123");
		  String acturl1=np.getAppurl();
		  Assert.assertTrue(acturl1.contains("dashboard"),"Login is not successful");
		  
		  System.out.println("Login is successful");
		  
		  
		  
		  
	  }
	  
	}
