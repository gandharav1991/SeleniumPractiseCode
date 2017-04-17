package sampleTest;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Navigate {



	WebDriver driver;
	
	
	@Before
	public void setUp(){
		
	driver= new FirefoxDriver();
	driver.manage().window().maximize();
	}
	@Test
	public void myTest() throws Exception {

	
		/*driver.get("http://www.seleniumhq.org/");
		driver.findElement(By.tagName("html")).sendKeys(Keys.CONTROL + "t");
		driver.get("http://www.fb.com/");
		driver.findElement(By.tagName("html")).sendKeys(Keys.CONTROL + "t");
		
		*/
		
		driver.navigate().to("http://www.seleniumhq.org/");
		driver.findElement(By.xpath("//*[@id='menu_documentation']/a")).click();
		Thread.sleep(10000);
		driver.navigate().back();
		Thread.sleep(10000);
		driver.navigate().forward();
	}
		
		@After
		 public void stop(){
			driver.close();
		}
	
		
		
		
		
	}
	
