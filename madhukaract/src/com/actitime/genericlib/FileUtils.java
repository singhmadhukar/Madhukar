 package com.actitime.genericlib;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import pack1.properties;

/**
 * 
 * @author MADHUKAR
 *
 */

public class FileUtils {
	
	String excelPath="./Book1.xlsx";
	String propertyFilepath="./src\\pack1\\Inputdata.properties";
	
	
	/**
	 * 
	 * @return
	 * @throws Throwable
	 * 
	 * its return object of the properties File &load all the keys
	 */
	

     public properties getpropertiesFileObj() throws Throwable
     {
    	 FileInputStream fis=new FileInputStream(propertyFilepath);
    	 properties pobj=new properties();
    	 pobj.load(fis);
    	 return pobj;
    	  
     }
     /**
      * 
      * @param sheetName
      * @param rowName
      * @param colNum
      * @return data
      * @throws Throwable
      * 
      * it is used to read the data from excel file based on user argument
      */
    
    
		public String getExcelData(String sheetName,int rowName,int colNum) throws Throwable
		{
			FileInputStream fis=new FileInputStream(excelPath);
			Workbook wb=WorkbookFactory.create(fis);
			Sheet sh=wb.getSheet(sheetName);
			Row row=sh.getRow(rowName);
			String data=row.getCell(colNum).getStringCellValue();
			wb.close();
			return data;
		}
		/**
		 * 
		 * @param sheetName
		 * @param rowName
		 * @param colNum
		 * @param data
		 * @throws Throwable
		 * 
		 * it is used data back to excel based on user argument
		 * 
		 */
		
		public void setExcelData(String sheetName,int rowName,int colNum,String data) throws Throwable
		{
			FileInputStream fis=new FileInputStream(excelPath);
			Workbook wb=WorkbookFactory.create(fis);
			Sheet sh=wb.getSheet(sheetName);
			Row row=sh.getRow(rowName);
			Cell cel=row.createCell(colNum);
			cel.setCellValue(data);
			FileOutputStream fos=new FileOutputStream(excelPath);
			wb.write(fos);
			wb.close();
		
		}
		public static void copyFile(File srcfile, File file) {
			// TODO Auto-generated method stub
			
		}
			
			
}
	
	


