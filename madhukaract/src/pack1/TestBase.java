package pack1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class TestBase {

	public static WebDriver driver;
	@BeforeSuite
	public void setUp()
	{
		if(driver==null)
		{
			driver=new FirefoxDriver();
			driver.get("http://gmail.com");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		}
	}
	
	@AfterSuite
	public void teardown()
	{
		driver.quit();
			
		}
		
		

	}


