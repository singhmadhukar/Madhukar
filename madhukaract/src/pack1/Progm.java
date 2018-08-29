package pack1;

import java.util.List;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Progm {

	public static void main(String[] args) 
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://google.com");
		
		driver.findElement(By.id("lst-ib")).sendKeys("wipro jobs");
		
		String x="//ul[@class='sbsb_b']/li";
		
		List<WebElement>lst=driver.findElements(By.xpath(x));
		for(WebElement wb:lst)
		{
			System.out.println(wb.getText());
		}
	
		
	
		
	}

}
