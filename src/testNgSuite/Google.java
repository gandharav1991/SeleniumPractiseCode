package testNgSuite;

import org.testng.annotations.Test;

public class Google extends BrowserOpen {
	
	
	@Test
	public void openGoogle()
	{
		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();
	}

}
