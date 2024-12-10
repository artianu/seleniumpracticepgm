package com.TestNG;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestNGSoftAssertDemo1 {
  @Test
  public void f() {
	  
	  int a=100;
	  int b=200;
	  SoftAssert sf= new SoftAssert();
	  sf.assertEquals(a, b,"Test case failed");
	  System.out.println("Test case pass");
	  sf.assertAll();
  }
}
