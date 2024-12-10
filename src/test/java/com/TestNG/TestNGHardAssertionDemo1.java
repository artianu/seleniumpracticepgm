package com.TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGHardAssertionDemo1 {

//Assertequals	
	
  @Test
  public void hardAssertDemoMethod1() {
	  
	  String actual1="Selenium WebDriver is webUI Autimation Library";
	  String exp1="Selenium WebDriver is webUI Autimation Library";
	  
	  Assert.assertEquals(actual1, exp1, "Test case failed");
	  
	  System.out.println("String are matching... Test Case Pass");
	
	  
  }
  
//AssertTrue	
	
  @Test
  public void hardAssertDemoMethod2() {
	  
	  String actual1="Selenium WebDriver is webUI Autimation Library";
	  String exp1="Selenium WebDriver is webUI Autimation Library";
	  
	  Assert.assertTrue(actual1.contains("Selenium"),"Test case 2 failed..." );
	  
	  System.out.println("String contains selenium word... Test Case Pass");
	  
	  
  }
  
  
//AssertFalse	
	
  @Test
  public void hardAssertDemoMethod3() {
	  
	  String actual1="Selenium WebDriver is webUI Autimation Library";
	  String exp1="Selenium WebDriver is webUI Autimation Library";
	  
	  Assert.assertFalse(actual1.contains("Selenium1"),"Test case 3 failed..." );
	  
	  System.out.println("String does not contain Selenium1 word... Test Case Pass");
	  
	  
  }
  
  
  
}
