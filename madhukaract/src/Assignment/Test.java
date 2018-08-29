package Assignment;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test 
{

	public static void main(String[] args)throws InterruptedException 
	{
		
	FirefoxDriver driver=new FirefoxDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	driver.get("http://flipkart.com");
	driver.findElement(By.xpath("//button[text()='✕']")).click();
	driver.findElement(By.name("q")).sendKeys("iphone x",Keys.ENTER);
	
	driver.findElement(By.xpath("//div[text()='Apple iPhone X (Space Gray, 64 GB)']")).click();
	Set<String>set=driver.getWindowHandles();
	System.out.println(set.size());
	java.util.Iterator<String>it=set.iterator();
	String parentSessionID=it.next();
	String childSessionID=it.next();
	driver.switchTo().window(childSessionID);
	Thread.sleep(4000);
	driver.findElement(By.xpath("//button[text()='BUY NOW']")).click();
	driver.close();
	driver.switchTo().window(parentSessionID);
	driver.findElement(By.name("q")).clear();
	driver.findElement(By.name("q")).sendKeys("nokia",Keys.ENTER);
	
	
	}
	
	}