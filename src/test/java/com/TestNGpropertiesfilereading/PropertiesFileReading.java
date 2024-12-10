//This Program is without utility

package com.TestNGpropertiesfilereading;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class PropertiesFileReading {
  @Test
  public void testReading() throws IOException {
	  
	  //file name
	  File f1= new File(System.getProperty("user.dir")+"//src//test//java//configdemo.properties");
	  
	  //file read in stream
	   FileInputStream fs= new FileInputStream(f1);
	  
	  
	  //properties class
	  Properties p1= new Properties();
	  
	  
	  //load the file data
	    p1.load(fs);
	  
	  System.out.println("URL in the property file is : "+ p1.getProperty("url"));
	  
	  
	  
	  
	  
  }
}
