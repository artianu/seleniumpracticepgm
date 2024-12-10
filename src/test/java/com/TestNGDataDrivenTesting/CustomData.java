//

package com.TestNGDataDrivenTesting;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class CustomData {
	
	
	//DataProvider for Array
	@DataProvider(name="arraydata")
	public Object[][] dataset()
		{
			Object data[][]= {{"admin1","admin123"},{"admin2","admin123"},{"admin3","admin123"},{"admin","admin123"}};
			return data;
			
		}
	
	
	XSSFWorkbook wb;
	
	@DataProvider(name="exceldata")
	//DataProvider for XLS file
		public Object[][] filedata(){
		
			
			File f1=new File(System.getProperty("user.dir")+"//TestData//Data.xlsx");
			
			//File Input Stream
			FileInputStream fs;
			try {
				fs = new FileInputStream(f1);
				
				//Read Workbook in XLS WB>>Sheet>>Row>>cell>>value
				
				wb =new XSSFWorkbook(fs);
				
				
				
				
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
								
				
	
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
					//System.out.print(data[i-1][j]+" ");
					
				}	
				
				//System.out.println("");
			}
			
			
			return data;
		
		
	}
	
	
	

}
