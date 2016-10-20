package com.htc.testing.testingproject;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;

public class ReadExcelFileData2 {
	public static void main(String[] args) {
		
		  try
	        {
	            FileInputStream file = new FileInputStream(new File("e:/anish/emp.xls"));
	 
	            //Create Workbook instance holding reference to .xlsx file
	            //XSSFWorkbook workbook = new XSSFWorkbook(file);
	            HSSFWorkbook workbook = new HSSFWorkbook(file);
	            
	            //Get first/desired sheet from the workbook
	            HSSFSheet sheet = workbook.getSheetAt(0);
	            for(Row row : sheet) {
	            	System.out.print(row.getCell(0) + "----");
	            	System.out.print(row.getCell(1) + "----");
	            	System.out.println(row.getCell(2));
	            }
	            file.close();
	        } 
	        catch (Exception e) 
	        {
	            e.printStackTrace();
	        }
	}
}
