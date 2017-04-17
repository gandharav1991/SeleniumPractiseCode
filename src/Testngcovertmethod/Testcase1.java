package Testngcovertmethod;



import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Testcase1 {
	
	WebDriver driver;
	
	@BeforeMethod
	public void opennow() {
		
		driver =new FirefoxDriver();
		driver.manage().window().maximize();
		
	}
	
	
	@Test
	public void openGoogle()
	{
		driver.get("https://www.fb.com/");
		driver.manage().window().maximize();
	}

}  