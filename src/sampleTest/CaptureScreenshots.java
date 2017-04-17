package sampleTest;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.python.core.util.FileUtil;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class CaptureScreenshots {

WebDriver	driver ;


@BeforeTest

public void beforetest()
{
	driver = new FirefoxDriver();
	driver.manage().window().maximize();
}


@Test
public void test() throws IOException{
	
	File c = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE); 
	//FileUtils.copyFile(c, "c//");
	
	File d=new File("C:\\Program Files\\Java\\jdk1.8.0_112\bin");
	
	FileUtils.copyFile(c, d);
	
	
			}

}