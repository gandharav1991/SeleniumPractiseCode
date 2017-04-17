package sampleTest;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class handleDropdown {

	WebDriver driver; // only used when inpect element have select
	
	@Before 
	
	public void start()
	{
		driver = new FirefoxDriver();
		driver.manage().window().maximize();    
	}
	
	
	@Test
	//diff bw get() and navigate();
	public void test()
	{
		driver.get("https://www.facebook.com/")  ; // only type only enter url but in navigate we can url + refresh, back, forward
	    new Select(driver.findElement(By.id("day"))).selectByIndex(19);
	    new Select(driver.findElement(By.id("month"))).selectByValue("9");
	    new Select(driver.findElement(By.id("year"))).selectByVisibleText("1991");
	   
	}
	
	
	@After
	
	public void close(){
		driver.close();
	}
	
	
	
	
}
