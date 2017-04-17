package testNgSuite;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;


public class BrowserOpen {
	
	
	WebDriver driver;
	
	@BeforeTest
	@Parameters("browser")
	public void start(String browser)
	{
		if(browser.equalsIgnoreCase("ff"))
		{
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
		}
		else if (browser.equalsIgnoreCase("chrome"))
		{
			File file = new File("G:\\eclipse\\selenium cook book\\chromedriver_win32\\chromedriver.exe");
			System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
			driver = new ChromeDriver();
			driver.manage().window().maximize();
		}
		else
		{
			
			File file = new File("G:\\eclipse\\selenium cook book\\driver\\IEDriverServer_Win32_3.0.0\\IEDriverServer.exe");
			System.setProperty("webdriver.ie.driver", file.getAbsolutePath());
			driver = new InternetExplorerDriver();
			driver.manage().window().maximize();
		}
	}
	

	
	@AfterTest
	public void shutdown()
	{
		
	}

}
