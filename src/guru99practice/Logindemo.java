package guru99practice;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Logindemo {
	
	WebDriver driver;
	
	@BeforeTest
	
	public void start()
	{
		File file = new File("G:\\eclipse\\selenium cook book\\driver\\IEDriverServer_Win32_3.0.0\\IEDriverServer.exe");
		System.setProperty("webdriver.ie.driver", file.getAbsolutePath());
		driver = new InternetExplorerDriver();
		driver.manage().window().maximize();
	}
	
	
	@Test
	
	public void test(){
		
		driver.navigate().to("http://www.demo.guru99.com/v4/");
		//driver.findElement(By.tagName("html")).sendKeys(Keys.CONTROL +  "t");
		//driver.navigate().to("http://www.demo.guru99.com/v4/");
		driver.findElement(By.name("uid")).sendKeys("gsndharavk");
		driver.findElement(By.xpath("//*[@value='LOGIN']//preceding::input[1]")).sendKeys("aumaeeng@1");
	//	driver.findElement(By.xpath("//*[@value='LOGIN']")).click();
		driver.findElement(By.xpath("//*[@value='LOGIN']//following::input")).click();
		
	}
	
	
	
}
