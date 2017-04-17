package com.excel.test;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class CreateExcelfile {
	
	public static void main(String[] args) throws Exception {
		
	//	Workbook wb = new HSSFWorkbook();  for xLs wookbook
		Workbook wb = new XSSFWorkbook(); // for xlsx woorkbook
		FileOutputStream file = new FileOutputStream("G:\\seleniumtesting\\test.xlsx");
		wb.write(file);
		file.close();
		wb.close();
		
		
		
		
	}

}
