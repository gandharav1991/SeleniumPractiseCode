package sampleTest;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Salesforce {
	
	WebDriver driver;
	
	@BeforeTest
	
	public void start()
	{
		File file = new File("G:\\eclipse\\selenium cook book\\chromedriver_win32\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	
	
	@Test
	
	public void testnow() throws Exception
	{
		
	
	driver.get("https://www.salesforce.com/");
	Thread.sleep(10000);
  WebElement link =	driver.findElement(By.xpath("//a[@data-target='#industries_expand_par_1']"));
  Actions act = new Actions(driver);
  Actions mousehover =  act.moveToElement(link);
  mousehover.build().perform();
  Thread.sleep(5000);
  driver.findElement(By.xpath("(//*[@href='https://www.salesforce.com/in/crm/']/span)[1]")).click();
  
	
	
}
	
}
	