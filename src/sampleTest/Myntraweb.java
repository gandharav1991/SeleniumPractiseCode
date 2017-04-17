package sampleTest;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Myntraweb {
	
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
	
	public void test() throws Exception
	{
		driver.get("http://www.myntra.com/");
		Thread.sleep(15000);
		Actions action = new Actions(driver);
		WebElement link = driver.findElement(By.xpath("//*[text()='Men']"));
		action.moveToElement(link).build().perform();
		Thread.sleep(5000);;
		driver.findElement(By.xpath("//*[text()='Sports Shoes']")).click();
		driver.findElement(By.xpath("//*[text()='Reebok']")).click();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,500)");//scrolling by javascriptexecutor
		
		
		
	}
	
	
}