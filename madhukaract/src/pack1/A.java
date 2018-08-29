package pack1;

import java.util.concurrent.TimeUnit;

import org.junit.rules.Timeout;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class A {

	public static void main(String[] args)  {
		String msg="user account has been successfully created";
	FirefoxDriver driver=new FirefoxDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.get("http://127.0.0.1/login.do;jsessionid=34datw2rf0osr");
	driver.findElement(By.name("username")).sendKeys("admin");
	driver.findElement(By.name("pwd")).sendKeys("manager");
	driver.findElement(By.id("loginButton")).click();
	
	
	driver.findElement(By.xpath("//div[text()='Users']/..")).click();
     driver.findElement(By.xpath("//input[@value='Create New User']")).click();
     driver.findElement(By.name("username")).sendKeys("MADHUKARA");
     driver.findElement(By.name("passwordText")).sendKeys("SHYAM");
     driver.findElement(By.name("passwordTextRetype")).sendKeys("SHYAM");
     driver.findElement(By.name("firstName")).sendKeys("Madhukar");
     driver.findElement(By.name("lastName")).sendKeys("Shyam");
     driver.findElement(By.name("email")).sendKeys("madhukarshyam111@gmail.com");
     driver.findElement(By.name("mobile")).sendKeys("9658899896");
     driver.findElement(By.xpath("//input[@type='submit']")).click();
     
    
     WebElement wb=driver.findElement(By.xpath("//span[text()='User account has been successfully created.']"));
     String actmsg=wb.getText();
     if(msg.equals(actmsg))
     {
    	 System.out.println("user account has been successfully created");
     }
     else
     {
    	 System.out.println("user account has not been successfully created");
    	 
     }
     
	}
}

