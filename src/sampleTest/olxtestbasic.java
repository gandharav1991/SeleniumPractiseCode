package sampleTest;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class olxtestbasic {
WebDriver driver;

@Before

public void atBefore() throws Exception
{
	driver = new FirefoxDriver();
	driver.manage().window().maximize();
}

@Test

public void atTest() throws Exception{
	
 driver.get("https://www.coursera.org/?authMode=login/");
 //driver.findElement(By.xpath("//*[@id='c-ph-right-nav']/ul/li[4]/a")).click();
// Thread.sleep(15000);


 //driver.findElement(By.xpath("//*[@id='user-modal-email']")).clear();
 
 driver.findElement(By.xpath("//*[@id='user-modal-email']")).sendKeys("abc@gmail.com");

 driver.findElement(By.name("password")).sendKeys("hbsuxgsu");

}
@After

public void atAfter()
{
//driver.close();	
}


















}
