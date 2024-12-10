package com.TestNG;

import org.testng.annotations.*;
import org.testng.annotations.Test;

public class TestNGAnnotationDemo {
  @Test
  public void TestCase1() {
	  System.out.println("This is Test Case1");
	  
  }
  
  
  @Test
  public void TestCase2() {
	  System.out.println("This is Test Case2");
	  
  }
  

  @BeforeMethod
  public void BMethod() {
	  System.out.println("This is Before Method will be excuted before every test case");
	  
  }


  @AfterMethod
  public void AMethod() {
	  System.out.println("This is After Method will be excuted after every test case");
	  
  }
  
  
  
  @BeforeClass
  public void BClass() {
	  System.out.println("This is Before class will be excuted before class");
	  
  }
	  
	  
	  @AfterClass
	  public void AClass() {
		  System.out.println("This is After class will be excuted after every class");	  
  
  
	  }
  
  
}
