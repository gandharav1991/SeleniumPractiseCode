package com.excel.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelTest {

	
	public static void main(String[] args) throws IOException  {
		
		FileInputStream file =  new FileInputStream("G:\\seleniumtesting\\Book2.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(file);
		XSSFSheet sh= wb.getSheet("Sheet1");
		Iterator<Row> rowit =sh.iterator();
		
		while (rowit.hasNext())
		{
			System.out.println(rowit.next().getCell(2).getStringCellValue());
		}
		
	}
}
      