package sampleTest;

import java.io.File;










import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By.ByName;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SalesforceAssignment {
	
	WebDriver driver;
	
	
	
	@BeforeTest
	
	public void start()
	{
		File file = new File("G:\\eclipse\\selenium cook book\\chromedriver_win32\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
		driver = new ChromeDriver();
		//driver.manage().window().maximize();
		//driver.manage().window().setSize(d);
		driver.manage().window().maximize();
	}
	
	
	@Test
	
	public void teststart() throws Exception
	{
		driver.get("https://www.salesforce.com/in/form/signup/freetrial-sales.jsp?d=70130000000Ysa5");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); // implicit wait
		
		driver.findElement(By.xpath("//*[@id='UserFirstName']")).sendKeys("Gandharav");
		driver.findElement(By.xpath("//*[@id='UserFirstName']//following::input[1]")).sendKeys("katyal");
		driver.findElement(By.xpath("(//span[@class='selectBox-label'])[1]")).click();
		String check = "Personal Interest";
		List<WebElement> dropdownmenu = driver.findElements(By.xpath("(//ul[@class='selectBox-dropdown-menu selectBox-options' ])[1]//li/a"));
      Thread.sleep(10000);
		selectlogic(dropdownmenu , check);
		
	 driver.findElement(By.xpath("//*[@id='UserFirstName']//following::input[2]")).sendKeys("gsndharavkatyal@gmail.com");
	 driver.findElement(By.xpath("//*[@id='UserFirstName']//following::input[3]")).sendKeys("8802606971");
	 driver.findElement(By.xpath("//*[@id='CompanyName']")).sendKeys("Student");
	 driver.findElement(By.xpath("(//span[@class='selectBox-label'])[2]")).click();
	 dropdownmenu = driver.findElements(By.xpath("(//ul[@class='selectBox-dropdown-menu selectBox-options' ])[2]//li/a"));
	 check = "1 - 100 employees";
	 Thread.sleep(10000);
	 selectlogic(dropdownmenu, check);
	 driver.findElement(By.xpath("(//span[@class='selectBox-label'])[3]")).click();
	 dropdownmenu = driver.findElements(By.xpath("(//ul[@class='selectBox-dropdown-menu selectBox-options' ])[3]//li/a"));
	 check ="Hungary";
	 Thread.sleep(10000);
	 selectlogic(dropdownmenu, check);
	 String actualtext ="Enjoy the Free Trial with your company data";
     String expectedtext = driver.findElement(By.xpath("//div[text()='Enjoy the Free Trial with your company data']")).getText();
    Assert.assertEquals(actualtext, expectedtext);
   
     	
    
	}
	
	
	private void selectlogic( List<WebElement> dropdownmenu,
			String check) {
		// TODO Auto-generated method stubfor(WebElement x : dropdownmenu )
        {   for(WebElement x : dropdownmenu)
        {
        	String s= x.getAttribute("innerHTML");
        	if(s.contentEquals(check))
        	{
        		x.click();
        	}
        }
		
	}
	
}
	
}