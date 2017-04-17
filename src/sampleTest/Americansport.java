package sampleTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Americansport {
	
	WebDriver driver;
	
	//@BeforeTest
	
	//public void atbefore()
	public static void main(String ...a) throws Exception
	
	{WebDriver driver;
		driver = new FirefoxDriver();
		driver.manage().window().maximize();

	
   //@Test
   
  // public  void test() throws Exception
   
	   driver.get("http://www.americansports.com/");
	   Thread.sleep(10000);
	  driver.findElement(By.xpath("//*[text()='Exclusive Offer']")).click();
	  Thread.sleep(15000);
	   driver.switchTo().frame(0);
	   driver.findElement(By.name("user[email]")).sendKeys("gsndharavkatyal@gmail.com");
	   String s= driver.findElement(By.xpath("//p[@style='text-align:left!important;']")).getText();
	System.out.println(s); 
	
	  
	}  
   }

