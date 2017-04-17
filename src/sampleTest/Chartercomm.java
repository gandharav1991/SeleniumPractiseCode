package sampleTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Chartercomm {

WebDriver	driver ;


@BeforeTest

public void beforetest()
{
	driver = new FirefoxDriver();
	driver.manage().window().maximize();
}


@Test

public void test()
{
	driver.get("https://support.microsoft.com/en-in/help/14210/security-essentials-download");
	
}
	
}


