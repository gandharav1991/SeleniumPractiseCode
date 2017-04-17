package sampleTest;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SpectrumAssignment {
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
		driver.get("https://www.spectrum.com/buyflow/buyflow-localization");
		driver.findElement(By.xpath("//*[contains(text(),'CONT')]//preceding::input[3]")).sendKeys("9798 hale dr");
		driver.findElement(By.xpath("//*[contains(text(),'CONT')]//preceding::input[1]")).sendKeys("63123");
		driver.findElement(By.xpath("//*[contains(text(),'CONT')]")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//*[contains(@id,'newly_built_or_apartment_y')]")).click();
		//driver.findElement(By.xpath("*[@class='form-group']/div/div/label[@id='newly_built_or_apartment_yes']")).click();
		driver.findElement(By.xpath("//*[text()='Continue']")).click();
		Thread.sleep(20000);
		driver.findElement(By.xpath("//*[text()='Proceed With a New Order']")).click();
		Thread.sleep(15000);
		driver.findElement(By.xpath("//*[@id='chooseOffer_103211010']")).click();
		Thread.sleep(15000);
		driver.findElement(By.xpath("//*[@class='col-xs-6 col-sm-3 no-button']/label")).click();
		/*for(int i=0;i<=4;i++)
		{
			driver.findElement(By.tagName("html")).sendKeys(Keys.PAGE_DOWN);
		}*/
	//	driver.findElement(By.xpath("//*[@id='phone_option_port_new_number']")).click();
		driver.findElement(By.xpath("//*[@for='autoCust4065219_no']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id='phone_option_port_new_number']")).click();
		Thread.sleep(5000);
		//driver.findElement(By.xpath("//*[@id='autoCustGrp4075600_autoCust4075602']")).click();
		driver.findElement(By.xpath("//*[@id='autoCustGrp4075600_autoCust4075601']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@for='autoCust4075402_no']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//*[contains(text(),'Continue')])[2]")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//*[@id='firstname']//following::input[1]")).sendKeys("TestAuto");
		driver.findElement(By.xpath("//*[@id='firstname']")).sendKeys("TestCH0107");
		driver.findElement(By.xpath("//*[@id='phone-type-home-label']")).click();
		driver.findElement(By.xpath("//*[@id='firstname']//following::input[4]")).sendKeys("123-456-7890");
		driver.findElement(By.xpath("//*[@id='firstname']//following::input[5]")).sendKeys("DLDigitalMarketing@charter.com");
		driver.findElement(By.xpath("//*[@id='firstname']//following::input[6]")).sendKeys("DLDigitalMarketing@charter.com");
		driver.findElement(By.xpath("//*[@for='address-changed-yes']")).click();
		driver.findElement(By.xpath("//*[@id='e911_agree']")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//*[text()='I agree']")).click();
		
		
		
		
		
	}
}
