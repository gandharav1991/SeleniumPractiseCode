package sampleTest;


	

	import java.util.regex.Pattern;
	import java.util.concurrent.TimeUnit;
	import org.junit.*;
	import static org.junit.Assert.*;
	import static org.hamcrest.CoreMatchers.*;
	import org.openqa.selenium.*;
	import org.openqa.selenium.firefox.FirefoxDriver;
	import org.openqa.selenium.support.ui.Select;

	public class Idecoder {
	  private WebDriver driver;
	  private String baseUrl;
	  private boolean acceptNextAlert = true;
	  private StringBuffer verificationErrors = new StringBuffer();

	  @Before
	  public void setUp() throws Exception {
	    driver = new FirefoxDriver();
	    baseUrl = "https://www.facebook.com/";
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  }

	  @Test
	  public void testIdecoder() throws Exception {
	    driver.get(baseUrl + "/");
	    driver.findElement(By.id("js_6")).click();
	    driver.findElement(By.id("u_0_4")).click();
	    driver.findElement(By.cssSelector("#js_1z > a._55ln > div._55lp > div._55lr")).click();
	    driver.findElement(By.id("js_2i")).click();
	    driver.findElement(By.cssSelector("div._5v0s._5my8")).click();
	  }

	  @After
	  public void tearDown() throws Exception {
	    driver.quit();
	  }
	}
	  