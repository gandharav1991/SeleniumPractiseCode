package sampleTest;



import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MakeMyTrip {
	
	WebDriver driver;
	
	@Before
	
	public void opennow() {
		
		driver =new FirefoxDriver();
		driver.manage().window().maximize();
		
	}
  
	
	@Test
	
	public void test() throws Exception{
		
		driver.get("https://www.makemytrip.com/");
		//driver.navigate().to("https://www.facebook.com/");
		//driver.navigate().back();
		driver.findElement(By.xpath("//*[@id='header_tab_flights']/a")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//label[contains(.,'one way')]")).click();
	driver.findElement(By.xpath("//*[@id='hp-widget__sfrom']")).clear();
		driver.findElement(By.xpath("//*[@id='hp-widget__sfrom']")).click();
		Thread.sleep(5000);
		List <WebElement> dropdown =driver.findElements(By.xpath("//ul[@id='ui-id-3']//li"));
		String check = "Chennai, India MAA";
		selectdropdown(dropdown,check);
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id='hp-widget__sTo']")).click();
		Thread.sleep(5000);
	 dropdown =driver.findElements(By.xpath("//*[@id='ui-id-4']//li"));
		check ="Singapore, Singapore SIN";
		selectdropdown(dropdown, check);
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='hp-widget__depart']")).click();
       Thread.sleep(2000);
       String selectdate="09/19/2017";
       Date d= new Date(selectdate);
       SimpleDateFormat simpledateformat = new SimpleDateFormat("MMMM/dd/YYYY");
       String date = simpledateformat.format(d);
       System.out.println(date);
       String[] split = date.split("/");
       String month = split[0];
       String year = split[2];
       while (true)
       {
    	   
    	   try{
    		   WebElement x = driver.findElement(By.xpath("//*[@class='ui-datepicker-group ui-datepicker-group-first']//span[contains(.,'"+month+"')]"));
    		   WebElement y= driver.findElement(By.xpath("//span[contains(.,'"+year+"')][1]"));
    		 
    		   if(x.isDisplayed() && y.isDisplayed())
    		   {
    			  // (//a[contains(.,'19')])[1]
    					 String dateselect = split[1];
    					 driver.findElement(By.xpath(("(//a[contains(.,'"+dateselect+"')])[1]"))).click();
    					   
    					   break;
    		   }
    		   
    	   }
    	   catch(Exception e)
    	   {
    		   driver.findElement(By.xpath("//span[contains(.,'Next')]")).click();
    		   Thread.sleep(2000);
    	   }
       }
       
		
		
		
		/*//driver.findElement(By.xpath("//*[@id='hp-widget__sfrom']")).sendKeys("Dubai");
		//driver.findElement(By.xpath("//*[@id='hp-widget__sfrom']")).sendKeys(Keys.ARROW_DOWN);
		//driver.findElement(By.xpath("//*[@id='hp-widget__sfrom']")).sendKeys(Keys.ARROW_DOWN);
		//driver.findElement(By.xpath("//*[@id='hp-widget__sfrom']")).sendKeys(Keys.ENTER);
		
		//driver.findElement(By.xpath("//*[@id='ui-id-2200']/div/p[1]")).click();
		//driver.findElement(By.xpath("//*[@id='ui-id-65']/div/p[1]/span[1]")).click();
		driver.findElement(By.xpath("//*[@id='hp-widget__sfrom']")).click();
		driver.findElement(By.xpath("//*[@id='ui-id-32']/div/p[1]")).click();
		
		driver.findElement(By.xpath("//*[@id='hp-widget__sTo']")).click();
		driver.findElement(By.xpath("//*[@id='js-filterOptins']")).click();
	
	driver.findElement(By.tagName("html")).sendKeys(Keys.PAGE_DOWN);
		driver.findElement(By.tagName("html")).sendKeys(Keys.PAGE_DOWN);
		driver.findElement(By.id("ui-id-145 ")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='hp-widget__depart']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='dp1486290147516']/div/div[1]/table/tbody/tr[2]/td[7]/a")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='hp-widget__return']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='dp1486290147517']/div/div[2]/table/tbody/tr[1]/td[4]/a")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id='js-adult_counter']/li[4]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='hp-widget__class']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='js-classFilters']/div[1]/label")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='searchBtn']")).click();
		Thread.sleep(15000);
		driver.findElement(By.xpath("html/body/page-view/div/div/div[2]/div[3]/div[5]/div[3]/div[1]/div/div[1]/div[1]/div/div[3]/div[3]/a")).click();
		driver.findElement(By.xpath("//*[@id='inputEmailIdForLoggin']")).sendKeys("gsndharavkatyal@gmail.com");
		driver.findElement(By.xpath("//*[@id='content']/div[3]/div/div[1]/div[10]/div[1]/a")).click();
		*/
	}
	
	
	private void selectdropdown(List<WebElement> dropdown, String check) throws Exception {
		// TODO Auto-generated method stub
		
		for(WebElement x : dropdown){
			
			String s=x.getAttribute("textContent");
			
			
			if(s.equalsIgnoreCase(check))
			{System.out.println(s);
               Thread.sleep(5000);
				x.click();
				break;
			}
		}
		
	}


	@After
	
	public void close(){
		
	}
}
