package sampleTest;

import java.io.File;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;

public class IEbrowser {

	WebDriver driver;
	
	 @Before
	 
	 public void atbefore(){
		 File file = new File("G:\\eclipse\\selenium cook book\\driver\\IEDriverServer_Win32_3.0.0\\IEDriverServer.exe");
		 System.setProperty("webdriver.ie.driver", file.getAbsolutePath());
		 driver = new InternetExplorerDriver();
		 
	 }
	 
	 
	 
	 @Test
	 
	 public void attest()
	 {
		 driver.get("https://www.facebook.com/");
		 driver.navigate().to("http://www.seleniumhq.org/download/");
		 driver.navigate().back();
		 new Select(driver.findElement(By.id("day"))).selectByValue("19");
		 new Select(driver.findElement(By.id("month"))).selectByIndex(9);
		 new Select(driver.findElement(By.id("year"))).selectByVisibleText("1991");
	 }
}
