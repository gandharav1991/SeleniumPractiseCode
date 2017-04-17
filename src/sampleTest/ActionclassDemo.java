package sampleTest;

import java.awt.Robot;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ActionclassDemo {
	
	WebDriver driver;
	
	
	
	@BeforeTest
	
	public void start()
	{
		/*File file = new File("G:\\eclipse\\selenium cook book\\chromedriver_win32\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
		driver = new ChromeDriver();
		//driver.manage().window().maximize();
		//driver.manage().window().setSize(d);*/
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
	}
 
	 @Test
	 
	 public void testnow() throws Exception
	 {
		 Actions act = new Actions(driver);
		 driver.get("http://jqueryui.com/");
		 WebElement link = driver.findElement(By.xpath("//a[text()='Draggable']"));
		 link.click();
		Thread.sleep(5000);
		 driver.switchTo().frame(0);
		 Thread.sleep(2000);
		 WebElement source = driver.findElement(By.xpath("//div[@id='draggable']"));
		 act.clickAndHold(source).moveByOffset(0, 50).release(source).build().perform();
		 //act.dragAndDrop(source, target)
		 driver.switchTo().defaultContent();
		 driver.findElement(By.xpath("//a[text()='Droppable']")).click();
		 Thread.sleep(5000);
		 driver.switchTo().frame(0);
		 source = driver.findElement(By.xpath("//*[@id='draggable']")) ;
		 WebElement target = driver.findElement(By.xpath("//*[@id='droppable']"));
		 act.dragAndDrop(source, target).build().perform();
		 driver.switchTo().defaultContent();
		 driver.findElement(By.xpath("//a[text()='Resizable']")).click();
		 Thread.sleep(5000);
		 driver.switchTo().frame(0);
		 source = driver.findElement(By.xpath("//*[@id='resizable']/div[1]"));
		 act.clickAndHold(source).moveByOffset(100, 0).release(source).build().perform();
		 source = driver.findElement(By.xpath("//*[@id='resizable']/div[3]"));
		 act.clickAndHold(source).moveByOffset(100, 150).release(source).build().perform();
		 driver.switchTo().defaultContent();
		 driver.findElement(By.xpath("//*[@id='sidebar']/aside[1]/ul/li[4]/a")).click();
		 Thread.sleep(5000);
		 driver.switchTo().frame(0);
		 List <WebElement> dropdown = driver.findElements(By.xpath("//*[@id='selectable']/li"));
		 for(int i=0 ; i<=6; i++)
		 {   
			 act.keyDown(Keys.CONTROL);
			 source = dropdown.get(i);
			 act.click(source).build().perform();
			 act.keyDown(Keys.CONTROL);
		 
		 
			//tick.keyDown(Keys.CONTROL).build().perform();
			 
		 }
		
		 act.keyUp(Keys.CONTROL).build().perform();
		 act.keyUp(Keys.CONTROL).perform();
		 Thread.sleep(5000);
		 driver.switchTo().defaultContent();

		 driver.findElement(By.xpath("//a[text()='Sortable']")).click();

		 driver.findElement(By.xpath("//a[text()='Sortable']")).getLocation();
		 Thread.sleep(5000);
		 driver.switchTo().frame(0);
		 
		 
		Point coordinates = driver.findElement(By.xpath("//*[@id='sortable']/li[5]")).getLocation();
		//Robot robot = new Robot();
		source = driver.findElement(By.xpath("//*[@id='sortable']/li[1]"));
		act.clickAndHold(source).moveByOffset(coordinates.getX(), coordinates.getY()).build().perform();
		act.release(source).build().perform();
		System.out.println(coordinates.getX() + " " + coordinates.getY());
		//robot.mouseMove(coordinates.getX(), coordinates.getY());
		 
		 
	 }
	
}

	
	