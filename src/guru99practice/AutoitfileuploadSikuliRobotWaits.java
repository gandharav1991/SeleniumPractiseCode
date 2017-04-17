package guru99practice;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.jboss.netty.util.Timeout;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

import com.gargoylesoftware.htmlunit.ElementNotFoundException;
import com.thoughtworks.selenium.webdriven.commands.KeyEvent;

public class AutoitfileuploadSikuliRobotWaits {

	public static void main(String[] args) throws InterruptedException, Exception {
		
		WebDriver driver;
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.olx.in/posting/");
		driver.findElement(By.xpath("//*[@id='add-file-1']/div/a")).click();
		Thread.sleep(5000);
		
		//Autoit technique
		//Runtime.getRuntime().exec("G:\\eclipse\\selenium cook book\\driver\\Fileupload.exe");
		
		
	//Sikuli Techique
		
		Pattern fileInput = new Pattern("G:\\eclipse\\selenium cook book\\driver\\fileupload.PNG");
		Pattern OpenButton = new Pattern("G:\\eclipse\\selenium cook book\\driver\\Openbutton.PNG");
		Screen screen = new Screen();
		Thread.sleep(5000);
		screen.type(fileInput,"C:\\Users\\Public\\Pictures\\Sample Pictures\\Penguins.jpg");
		screen.click(OpenButton);
		
		
		//Robot class 
		
	/*	
		Robot robot = new Robot();
		robot.setAutoDelay(5000);
		//ctrl+c (copy)
		StringSelection stringselection = new StringSelection("C:\\Users\\Public\\Pictures\\Sample Pictures\\Penguins.jpg");
		// to save this path in clipboard 
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringselection,null);
		robot.setAutoDelay(2000);
		robot.keyPress(java.awt.event.KeyEvent.VK_CONTROL);
		robot.keyPress(java.awt.event.KeyEvent.VK_V);
		robot.keyRelease(java.awt.event.KeyEvent.VK_CONTROL);
		robot.keyRelease(java.awt.event.KeyEvent.VK_V);
		robot.setAutoDelay(5000);
		robot.keyPress(java.awt.event.KeyEvent.VK_ENTER);
		robot.keyRelease(java.awt.event.KeyEvent.VK_ENTER);
		
		
		*/
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);  // implicit wait
		WebDriverWait wait = new WebDriverWait(driver, 120); //explicit wait
		wait.pollingEvery(2, TimeUnit.SECONDS);  //fluent wait
		wait.ignoring(ElementNotFoundException.class);
wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("add")));	//explicit wait	
		
	}

	
	
}
