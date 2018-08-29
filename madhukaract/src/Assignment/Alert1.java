package Assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Alert1 {
	public static void main(String[]args)
  {
		String msg="User account has been successfully created.";
		FirefoxDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("http://127.0.0.1/login.do;jsessionid=34datw2rf0osr");
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");  
		driver.findElement(By.id("loginButton")).click();
		
		
		driver.findElement(By.xpath("//div[text()='Users']/..")).click();
		driver.findElement(By.linkText("Shyam, Madhukar (MADHUKARA)")).click();
		driver.findElement(By.xpath("//input[@value='Delete This User']")).click();
		
		Alert alt=driver.switchTo().alert();
		System.out.println(alt.getText());
		alt.accept();
		
		  WebElement wb=driver.findElement(By.xpath("//span[text()='User account has been successfully created.']"));
		     String actmsg=wb.getText();
		     if(msg.equals(actmsg))
		     {
		    	 System.out.println("User account has been successfully created.");
		     }
		     else
		     {
		    	 System.out.println("user account has not been successfully deleted");
		    	 
		     }
		     
		
		
		

}













}