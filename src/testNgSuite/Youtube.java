package testNgSuite;

import org.testng.annotations.Test;

public class Youtube extends BrowserOpen {
	
	
	@Test
	public void openGoogle()
	{
		driver.get("https://www.youtube.com/");
		driver.navigate().to("http://www.bing.com/");
		driver.manage().window().maximize();
	}

}