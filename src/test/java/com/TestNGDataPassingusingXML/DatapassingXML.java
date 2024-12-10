package com.TestNGDataPassingusingXML;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class DatapassingXML {
	
@Parameters({"un","psw"})
	  @Test
	  public void login(String un ,String psw) {
		  
		  System.out.println("user name is "+un);
		  System.out.println("password is "+psw);
		  
		    }

}
