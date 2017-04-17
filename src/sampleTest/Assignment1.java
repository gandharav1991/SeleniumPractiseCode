package sampleTest;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.thoughtworks.selenium.webdriven.commands.Click;

public class Assignment1 {

	WebDriver driver;
	
	@Before
	
	public void beforetest(){
		
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
	}
	
	@Test
	
	public void testnow() throws Exception{
		driver.get("https://www.olx.in/");
		driver.findElement(By.xpath("//*[@id='postNewAdLink']/span")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//*[@id='add-title']")).sendKeys("Latest Smartphone free voucher");
		driver.findElement(By.xpath("//*[@id='targetrenderSelect1-0']/dt/a")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id='cat-1411']/span[1]")).click();
		driver.findElement(By.xpath("//*[@id='category-1411']/div[2]/div[2]/div/ul/li[1]/a/span[1]")).click();
		driver.findElement(By.xpath("//*[@id='category-1453']/div[2]/div[2]/div/ul/li[1]/a/span[1]")).click();
		Thread.sleep(5000);
		driver.findElement(By.name("data[param_price][1]")).sendKeys("10000");
		driver.findElement(By.xpath("//*[@id='add-description']")).sendKeys("best mobile company on Android OS");
		driver.findElement(By.xpath("//*[@id='show-gallery-html']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id='htmlbutton_1']/input")).sendKeys(("C:\\Users\\Public\\Pictures\\Sample Pictures\\Penguins.jpg"));
        driver.findElement(By.xpath("//*[@id='add-person']")).sendKeys("gandharav katyal");
        driver.findElement(By.id("add-phone")).sendKeys("8802606971");
        driver.findElement(By.id("mapAddress")).sendKeys("Ghaziabad");
        driver.findElement(By.xpath("//*[@id='autosuggest-geo-ul']/li/a/strong")).click();
        driver.findElement(By.xpath("//*[@id='save']")).click();
        //page scroll
        driver.findElement(By.tagName("html")).sendKeys(Keys.PAGE_UP);
        driver.findElement(By.tagName("html")).sendKeys(Keys.PAGE_UP);
        Thread.sleep(5000);
        driver.findElement(By.tagName("html")).sendKeys(Keys.PAGE_DOWN);
        driver.findElement(By.tagName("html")).sendKeys(Keys.PAGE_DOWN);
        driver.findElement(By.xpath("//*[@id='save']")).click();
        // open new tab
        driver.findElement(By.tagName("html")).sendKeys(Keys.CONTROL + "t");
        driver.get("https://www.facebook.com/");
        driver.findElement(By.tagName("html")).sendKeys(Keys.CONTROL + "t");
        driver.get("http://www.seleniumhq.org/");
        driver.findElement(By.xpath("//*[@id='menu_download']/a")).click();
        // navigate
        driver.navigate().back();
        Thread.sleep(10000);
        driver.navigate().forward();
        Thread.sleep(10000);
        // refresh
        
        driver.navigate().refresh();
	}
        
        @After
        public void closenow(){
        	driver.close();
        }
	
	
}
