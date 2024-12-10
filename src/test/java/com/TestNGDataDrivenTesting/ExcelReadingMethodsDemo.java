package com.TestNGDataDrivenTesting;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.xssf.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class ExcelReadingMethodsDemo {
	
	
	//Method1 to read XLS data of Row 1...
	@Test
	public void fileRead() throws IOException
	{
		File f1=new File(System.getProperty("user.dir")+"//TestData//Data.xlsx");
		
		//File Input Stream
		FileInputStream fs=new FileInputStream(f1);
		
		
	//Read Workbook in XLS WB>>Sheet>>Row>>cell>>value
		
		XSSFWorkbook wb =new XSSFWorkbook(fs);
		
		XSSFSheet sheet1=wb.getSheet("userdata");
		
		XSSFRow r1=sheet1.getRow(1);
		XSSFCell cell1=r1.getCell(0);
		String uname=cell1.getStringCellValue();
		
		XSSFCell cell2=r1.getCell(1);
		String pwd=cell2.getStringCellValue();
		
		System.out.println(uname+" "+pwd);
		
		
	}
	
	
	//Method2 to read XLS data of Row 1...
		@Test
		public void fileRead2() throws IOException
		{
			File f1=new File(System.getProperty("user.dir")+"//TestData//Data.xlsx");
			
			//File Input Stream
			FileInputStream fs=new FileInputStream(f1);
			
			
		//Read Workbook in XLS WB>>Sheet>>Row>>cell>>value
			
			XSSFWorkbook wb =new XSSFWorkbook(fs);
			
			
			String uname=wb.getSheet("userdata").getRow(2).getCell(0).getStringCellValue();
			
			String pwd=wb.getSheet("userdata").getRow(2).getCell(1).getStringCellValue();
			
		
			
			System.out.println(uname+" "+pwd);
	
	
		}
		
		//Method3 to read XLS data using array
				@Test
				public void fileRead3() throws IOException
				{
					File f1=new File(System.getProperty("user.dir")+"//TestData//Data.xlsx");
					
					//File Input Stream
					FileInputStream fs=new FileInputStream(f1);
										
							
				//Read Workbook in XLS WB>>Sheet>>Row>>cell>>value
					
					XSSFWorkbook wb =new XSSFWorkbook(fs);
					
					//Number of Rows
					int rowcnt=wb.getSheet("userdata").getPhysicalNumberOfRows();
					
					
					//Number of Columns
					int colcnt=wb.getSheet("userdata").getRow(0).getPhysicalNumberOfCells();
					
				
					
					System.out.println("Total Row Count: "+rowcnt);
			
					System.out.println("Total Col Count :"+colcnt);
					
					
					//create array of same size as per number of rows and columns..
					
					Object data[][]=new Object [rowcnt-1][colcnt];
					
					for(int i=1;i<rowcnt;i++)
					{
						for(int j=0;j<colcnt;j++)
							
						{
							
							data[i-1][j]=wb.getSheet("userdata").getRow(i).getCell(j).getStringCellValue();
							System.out.print(data[i-1][j]+" ");
							
						}	
						
						System.out.println("");
					}
					
					
					
					
				}
		
		
		
	
 }
