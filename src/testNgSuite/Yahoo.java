package testNgSuite;

import org.testng.annotations.Test;

public class Yahoo extends BrowserOpen {
			
			
			@Test
			public void openGoogle()
			{
				driver.get("https://www.fb.com/");
				driver.manage().window().maximize();
			}

		}

