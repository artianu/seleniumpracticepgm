package com.TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class TestNG_Skip_demo3 {
	 @Test(priority=1,description="This is functional demo test case")
	  public void registration() {
		  
		  System.out.println("Registration Test Case");
		  
	  }
	  
	  @Test(priority=2)
	  public void login() {
		  
		  System.out.println("Login Test Case");
		  
	  }
	  
	  
	  @Test(priority=3)
	  public void search() {
		  
		  System.out.println("Search Test Case");
		  
	  }
	  
	  
	  @Test(priority=4,enabled=false)
	  public void addtocart() {
		  
		  System.out.println("AddtoCart Test Case");
		  
	  }

	  
	  
  }

