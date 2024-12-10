package com.TestNGPageObjectModelusingByLocator;

import org.testng.Assert;
import org.testng.annotations.Test;

public class OrangehrmLoginpageTest extends OrangehrmBaseClass {
	
  @Test(priority=1)
  public void validateURL() {
	  
	
	  String acturl=lp.getAppurl();
	  Assert.assertTrue(acturl.contains("opensource"),"URL is not matching");
	  
	  System.out.println("URL is Matching");
	  
  }
  
  
  @Test(priority=2)
  public void validateTitle() {
	  
	 
	  String actTitle=lp.getpageTitle();
	  Assert.assertEquals(actTitle,"OrangeHRM","Title is not matching");
	  
	  System.out.println("Title is Matching");
	  
  }
  
  
  @Test(priority=3)
  public void validateLoginL() {
	  
	  lp.doLogin("Admin", "admin123");
	  String acturl1=lp.getAppurl();
	  Assert.assertTrue(acturl1.contains("dashboard"),"Login is not successful");
	  
	  System.out.println("Login is successful");
	  
	  
	  
	  
  }
  
}
