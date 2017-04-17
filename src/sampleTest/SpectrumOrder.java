package sampleTest;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SpectrumOrder {
WebDriver driver;
	
	
	@BeforeTest
	public void atBefore(){
		
	driver= new FirefoxDriver();
	driver.manage().window().maximize();
	driver.get("https://www.spectrum.com/");
	}
	@Test
	public void atTest() throws Exception{
		   driver.findElement(By.name("address1")).clear();
		   driver.findElement(By.name("address1")).sendKeys("9799 HALE DR");
		   driver.findElement(By.id("zip")).clear();
		   driver.findElement(By.id("zip")).sendKeys("63123");
		   driver.findElement(By.cssSelector("button.localization__input-submit")).click();
		   Thread.sleep(10000);
		   driver.findElement(By.xpath("//*[@id='newly_built_or_apartment_yes']/span")).click();
		   Thread.sleep(10000);
		   driver.findElement(By.xpath("//*[@id='newly_built_or_apartment_continue']")).click();
		   Thread.sleep(20000);
		   driver.findElement(By.xpath("//*[@id='emailAddress']")).clear();
		   driver.findElement(By.xpath("//*[@id='emailAddress']")).sendKeys("abc@gmail.com");
		   Thread.sleep(3000);
		   driver.findElement(By.xpath("//*[@id='start_new_order_proceed_with_order']")).click();
		   Thread.sleep(20000);
		   driver.findElement(By.xpath("//*[@id='chooseOffer_103311010']")).click();
		   Thread.sleep(10000);
		   driver.findElement(By.id("tv_option_dvr_no")).click();
		   Thread.sleep(1000);
		   driver.findElement(By.id("autoCust4065219_no")).click();
		   Thread.sleep(1000);
		   driver.findElement(By.id("phone-anchor")).click();
		   Thread.sleep(1000);
		   driver.findElement(By.id("portInOptions_false_0")).click();
		   Thread.sleep(1000);
		   driver.findElement(By.id("voice_unlisted_choice_no_autoCustGrp4075250_1")).click();
		   Thread.sleep(1000);
		   driver.findElement(By.id("voice_self_choice_autoCustGrp4075600_autoCust4075602_1")).click();
		   Thread.sleep(1000);
		   driver.findElement(By.xpath("(//a[contains(text(),'Continue')])[2]")).click();
		   Thread.sleep(10000);
		   driver.findElement(By.xpath("//*[@id='firstname']")).sendKeys("Puneet");
		   driver.findElement(By.xpath("//*[@id='lastname']")).sendKeys("Singh");
		   driver.findElement(By.xpath("//*[@id='phone-type-home-label']/span")).click();
		   driver.findElement(By.xpath("//*[@id='phoneNumber']")).sendKeys("9999345876");
		   driver.findElement(By.xpath("//*[@id='email']")).sendKeys("abc@gmail.com");
		   driver.findElement(By.xpath("//*[@id='confirm-email']")).sendKeys("abc@gmail.com");
		   driver.findElement(By.xpath("//*[@id='address-changed-yes']")).click();
		   driver.findElement(By.xpath("//*[@id='e911_agree']/span")).click();
		   Thread.sleep(10000);
		   //driver.switchTo().window("agree-nine-one-one");
		 //  driver.findElement(By.xpath("//*[@id='agree-nine-one-one']/div/div/div[3]/button")).click();
		 //  driver.findElement(By.xpath("//*[@id='terms_agree']/span")).click();
		 //  Thread.sleep(50000);
		
		
		    	}
	@AfterTest
	public void atAfter(){
		
		
		}

}
