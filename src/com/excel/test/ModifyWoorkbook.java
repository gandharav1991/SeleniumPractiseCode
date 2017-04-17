package com.excel.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ModifyWoorkbook {
	
	public static void main(String[] args) throws Exception {
		File file = new File("G:\\seleniumtesting\\test.xlsx");
		FileInputStream fil = new FileInputStream(file);
		Workbook wb = new XSSFWorkbook(fil);
		Sheet sheet = wb.getSheet("Testdata");
		Row row = sheet.getRow(1);
		Cell cell = row.getCell(1);
		System.out.println(cell);
		
		 row = sheet.createRow(5);
		 cell = row.createCell(5);
		 cell.setCellValue("gandharav");
		 
			FileOutputStream fo = new FileOutputStream(file);
			
			wb.write(fo);
	}

}
