package com.TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class TestNG_priority_demo2 {
  @Test(priority=1)
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
  
  
  @Test(priority=4)
  public void addtocart() {
	  
	  System.out.println("AddtoCart Test Case");
	  
  }
  
}
