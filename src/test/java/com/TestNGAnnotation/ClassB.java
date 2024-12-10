package com.TestNGAnnotation;

import org.testng.annotations.*;
import org.testng.annotations.Test;

public class ClassB {
 
	
	@Test
 	  public void Testcase3() {
		  System.out.println("Test Case 3");
		  }
	  
	  @Test
	  public void Testcase4() {
		  System.out.println("Test Case 4");
		  
		  
	  }
	  
	  
	  @BeforeTest
	  public void BfTest() {
		  System.out.println("Before Test");
		  }
	  
	  
	  @AfterTest
	  public void AfTest() {
		  System.out.println("After Test");
		  }
	  
	  
	  
	  @BeforeSuite
	  public void BfSuite() {
		  System.out.println("Before Suite");
		  }
	  
	  
	  @AfterSuite
	  public void AfSuite() {
		  System.out.println("After Suite");
		  }
	  
	  
  }

