package com.excel.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.melloware.jintellitype.Main;

public class ReadData {
	
	public void tc() throws IOException, Exception  {
		/*File file = new File("G:\\eclipse\\selenium cook book\\chromedriver_win32\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
		WebDriver driver = new ChromeDriver();*/
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		ArrayList<String> user =readExcel(0);
		ArrayList<String> pass = readExcel(1);
		
		for(int i=0;i<user.size();i++){
		driver.findElement(By.id("email")).sendKeys(user.get(i));
		driver.findElement(By.id("pass")).sendKeys(pass.get(i));
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[contains(@type,'submit')]")).click();
		
		Thread.sleep(6000);
	//	driver.switchTo().alert().dismiss();
		driver.findElement(By.id("userNavigationLabel")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//span[contains(@class,'_54nh')])[9]")).click();
		Thread.sleep(10000);
		}
		
	}
	 
	public ArrayList<String> readExcel(int col) throws IOException
	{

		
		FileInputStream file = new FileInputStream("G:\\seleniumtesting\\Book2.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(file);
		XSSFSheet sh = wb.getSheet("Sheet1");
		Iterator<Row> rowit = sh.iterator();
		
		rowit.next();
		ArrayList<String > list = new ArrayList<>();
		while(rowit.hasNext())
		{
			list.add(rowit.next().getCell(col).getStringCellValue());
		}
		System.out.println(list);
		return list;
	}
		
		public static void main(String[] args) throws Exception {
			ReadData rd= new ReadData();
			rd.readExcel(0);
			rd.tc();
		}
		
	}

