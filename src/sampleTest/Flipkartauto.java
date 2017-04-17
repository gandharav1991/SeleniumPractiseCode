package sampleTest;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Flipkartauto {
	
	WebDriver driver ;
	
	@Before
	
	public void beforetest(){
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
	}

	
	@Test
	
	public void testnow() throws Exception{
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//*[@id='container']/div/header/div[1]/div[1]/div/ul/li[9]/a")).click();
        driver.findElement(By.xpath("html/body/div[3]/div/div/div/div/div[2]/div/form/div[1]/input")).sendKeys("7982492721");
        driver.findElement(By.xpath("html/body/div[3]/div/div/div/div/div[2]/div/form/div[2]/input")).sendKeys("aumaeeng@1");
        driver.findElement(By.xpath("html/body/div[3]/div/div/div/div/div[2]/div/form/div[3]/button")).click();
        driver.findElement(By.tagName("html")).sendKeys(Keys.PAGE_DOWN);
        driver.findElement(By.tagName("html")).sendKeys(Keys.PAGE_DOWN);
        driver.findElement(By.tagName("html")).sendKeys(Keys.PAGE_UP);
        driver.findElement(By.tagName("html")).sendKeys(Keys.PAGE_UP);
        Thread.sleep(10000);
        driver.findElement(By.xpath("//*[@id='container']/div/header/div[2]/div/ul/li[3]/a")).click();
        Thread.sleep(10000);
        driver.findElement(By.xpath("//*[@id='container']/div/header/div[2]/div/ul/li[3]/ul/li/ul/li[1]/ul/li[2]/a")).click();
        Thread.sleep(10000);
        driver.findElement(By.tagName("html")).sendKeys(Keys.PAGE_DOWN);
        driver.findElement(By.tagName("html")).sendKeys(Keys.PAGE_DOWN);
	}
	
	@After
	
	public void aftertest()
	
	{
		
	}
	
	
	}

