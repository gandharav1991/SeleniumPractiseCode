package guru99practice;



import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Testcase3 {
	
	WebDriver driver;
	
	@Before
	
	public void opennow() {
		
		driver =new FirefoxDriver();
		driver.manage().window().maximize();
		
	}
  
}