package sampleTest;

import java.io.File;









import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By.ByName;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ActionFBwebsite {
	
	WebDriver driver;
	
	Dimension d= new Dimension(720,1330);
	
	@BeforeTest
	
	public void start()
	{
		File file = new File("G:\\eclipse\\selenium cook book\\chromedriver_win32\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
		driver = new ChromeDriver();
		//driver.manage().window().maximize();
		driver.manage().window().setSize(d);
		driver.manage().window().maximize();
	}
	
  @Test
  
  public void testaction()
  {
	  driver.get("https://www.facebook.com/");
	WebElement link =  driver.findElement(By.name("email"));
// important action class.
	Actions act = new Actions(driver);
	Actions mousehover = act.moveToElement(link);
	mousehover.click().keyDown(Keys.SHIFT).sendKeys(link,"gandhrav").keyUp(Keys.SHIFT).build().perform();
	new Select(driver.findElement(By.id("day"))).selectByVisibleText("19");
	new Select(driver.findElement(By.id("month"))).selectByIndex(9);
	new Select(driver.findElement(By.id("year"))).selectByVisibleText("1991");
	JavascriptExecutor js = (JavascriptExecutor)(driver);
	String s = driver.findElement(By.name("email")).getText();
    System.out.println(s);
	
  }

  @AfterTest
  
  public void closenow() throws Exception
  {
	  
	 
  }
}