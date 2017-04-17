package sampleTest;

import java.io.File;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Multipledriver {
	
  WebDriver driver;
	
	@Before
	
	public void start(){
		File file= new File("G:\\eclipse\\selenium cook book\\chromedriver_win32\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
	
	}
	
	 @Test
	 
	 public void test(){
		 driver.navigate().to("https://www.youtube.com/");
		 driver.get("https://www.facebook.com/");
		 new Select(driver.findElement(By.id("day"))).selectByValue("19");
		 new Select(driver.findElement(By.id("month"))).selectByVisibleText("Sept");
		 new Select(driver.findElement(By.id("year"))).selectByValue("1991");
	 }

}
