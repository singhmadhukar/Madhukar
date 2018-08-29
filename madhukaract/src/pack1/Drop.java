package pack1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Drop {

	public static void main(String[] args)
	{
	FirefoxDriver driver=new FirefoxDriver();
	driver.get("https://www.amazon.in/?tag=googinabkkenshoo-21&ascsubtag=d293e63b-2dfa-47f3-b906-1b63b712c456&ie=UTF8");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	/*WebElement wb=driver.findElement(By.xpath("//span[text()='Shop by']"));
	Actions act=new Actions(driver);
	act.moveToElement(wb);
	act.perform();
	WebElement wb1=driver.findElement(By.xpath("//span[text()='Mobiles, Computers']"));
	act.moveToElement(wb1).perform();
	driver.findElement(By.xpath("//span[text()='Tablets']")).click();*/
	driver.findElement(By.name("field-keywords")).sendKeys("philips iron");
	driver.findElement(By.className("nav-input")).click();
	driver.findElement(By.xpath("//h2[text()='Philips HI114 1000-Watt Golden American Heritage Soleplate Dry Iron']")).click();
	driver.findElement(By.className("a-button-input")).click();
	driver.findElement(By.xpath("//*[@id='buy-now-button']")).click();
	}
}
	
	