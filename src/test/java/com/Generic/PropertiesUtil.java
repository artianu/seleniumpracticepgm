package com.Generic;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesUtil {
	
	 //properties class
	  Properties p1= new Properties();
	
	
	public PropertiesUtil()
	{
		
		
		//file name
		  File f1= new File(System.getProperty("user.dir")+"//src//test//java//configdemo.properties");
		  
		  //file read in stream
		   FileInputStream fs;
		try {
			fs = new FileInputStream(f1);
			
			  //load the file data
		    p1.load(fs);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		  
	}
		  
		 
		public String getData(String key)
		{
			return p1.getProperty(key);
			
		}
		  
		
		  
		
		  
	}


