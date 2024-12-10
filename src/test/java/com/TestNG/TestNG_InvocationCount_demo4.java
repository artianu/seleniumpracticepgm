package com.TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class TestNG_InvocationCount_demo4 {
	 @Test
	  public void testcase1() {
		  
		  System.out.println("Test Case 1 is running");
		  
	  }
	  
	  @Test(invocationCount=4)
	  public void testcase2() {
		  
		  System.out.println("Test Case 2 is running");
		  
	  }
	  
	  
	  @Test
	  public void testcase3() {
		  
		  System.out.println("Test Case 3 is running");
		  
	  }
	  
	  
	
	  }

	  
	  
  

