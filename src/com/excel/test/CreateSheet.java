
package com.excel.test;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class CreateSheet {
	
	public static void main(String[] args) throws Exception {
		
	//	Workbook wb = new HSSFWorkbook();
		Workbook wb = new XSSFWorkbook();
		Sheet sheet = wb.createSheet("Testdata");
		Row row = sheet.createRow(1);
		Cell cell = row.createCell(1);
		cell.setCellValue("jai mata di");
		
		FileOutputStream file = new FileOutputStream("G:\\seleniumtesting\\test.xlsx");
		wb.write(file);
		file.close();
		wb.close();
		
		
		
		
	}

}
