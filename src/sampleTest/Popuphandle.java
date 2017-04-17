package sampleTest;

import java.io.File;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Popuphandle {
WebDriver driver;


@Before

public void atbefore()
{
	File file= new File("G:\\eclipse\\selenium cook book\\driver\\IEDriverServer_Win32_3.0.0\\IEDriverServer.exe");
	System.setProperty("webdriver.ie.driver", file.getAbsolutePath());
	driver = new InternetExplorerDriver();
}


@Test

public void testnow() throws Exception{
	
	driver.get("https://www.sitepoint.com/basetheme/?utm_source=sitepoint&utm_campaign=basetheme&utm_medium=themepage");
	driver.findElement(By.xpath("html/body/div[4]/div/div[1]/article/div/div[2]/a/div/img")).click();
	Thread.sleep(10000);
	driver.findElement(By.xpath("//*[@id='previewModal']/a")).click(); //popup window
	
	//popup alert handling now
	
	driver.navigate().to("http://www.web-source.net/web_design_tips/alert_message_web_page_load.htm");
	driver.switchTo().alert().accept();
	
	
}
{
	
}
}
