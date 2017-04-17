package sampleTest;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Myntra {


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
		//Thread.sleep(5000);
		driver.findElement(By.xpath("//button[contains(.,'1')]")).click();
	//	driver.findElement(By.xpath("//li[@class='slick-active' AND @button='1']")).click();
	//	driver.findElement(By.xpath("//img[@src='http://assets.myntassets.com/w_980,c_limit,fl_progressive,dpr_1.0/assets/images/banners/2017/2/23/11487861896110-Desktop-Hugo-Boss.jpg']")).click();
	}
}
