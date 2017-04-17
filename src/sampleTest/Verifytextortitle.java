package sampleTest;

import java.io.File;










import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By.ByName;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Verifytextortitle {
	
	WebDriver driver;
	
	Dimension d= new Dimension(720,1330);
	
	@BeforeTest
	
	public void start()
	{
		File file = new File("G:\\eclipse\\selenium cook book\\chromedriver_win32\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
		driver = new ChromeDriver();
		//driver.manage().window().maximize();
		driver.manage().window().setSize(d);
		driver.manage().window().maximize();
	}
	
	
	
	@Test
	public void test()
	{
		
		String expectedTitle = "xyz from inspect title=";
	driver.get("abc");
	String actualTitle= driver.getTitle();
//	Assert.assertEquals(actualTitile, expectedTitle);
  
	Assert.assertEquals(actualTitle, expectedTitle);
	/*if(expectedTitle.equals(actualTitile))
		System.out.println("pass");
	else
		System.out.println("fail");*/
		
	}
	
}