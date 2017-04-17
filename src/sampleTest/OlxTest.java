package sampleTest;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OlxTest {

	WebDriver driver;
	
	
	@Before
	public void setUp(){
		
	driver= new FirefoxDriver();
	driver.manage().window().maximize();
	}
	@Test
	public void myTest() throws Exception{
		
	driver.get("https://www.olx.in/");	
	driver.findElement(By.xpath("//*[@id='postNewAdLink']")).click();
	//Thread.sleep(15000);
	driver.findElement(By.id("add-title")).sendKeys("Brand new mobile for just sell");
	driver.findElement(By.id("choose-category-ilu")).click();
	Thread.sleep(5000);
	driver.findElement(By.id("cat-1411")).click();
	driver.findElement(By.xpath("//*[@id='category-1411']/div[2]/div[2]/div/ul/li[1]/a")).click();
	driver.findElement(By.xpath("//*[@id='category-1453']/div[2]/div[2]/div/ul/li[1]/a")).click();
	Thread.sleep(5000);
	driver.findElement(By.xpath("//*[@id='parameter-div-price']/div[2]/div/div[1]/p/span/input")).sendKeys("10000");
	
	driver.findElement(By.id("add-description")).sendKeys("hello, \nHope you are doing well");
	
	driver.findElement(By.xpath("//*[@id='show-gallery-html']")).click();
	
	
	}
	@After
	public void tearDown(){
		
		
	}
}
