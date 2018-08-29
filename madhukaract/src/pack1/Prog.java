package pack1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Prog {

	public static void main(String[] args) {
		String msg="user account ha s been successfully created";
		FirefoxDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("http://127.0.0.1/login.do;jsessionid=34datw2rf0osr");
		driver.findElement(By.name("username")).sendKeys("admin");
	 	driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		
		
		driver.findElement(By.xpath("//div[text()='Tasks']/..")).click();
	    driver.findElement(By.xpath("//a[text()='Projects & Customers']")).click();
	    driver.findElement(By.xpath("//input[@value='Create New Customer']")).click();
	    driver.findElement(By.name("name")).sendKeys("punjab1");
	    driver.findElement(By.name("createCustomerSubmit")).click();
	    driver.findElement(By.xpath("//input[@value='Create New Project']")).click();
	   WebElement wb1 =driver.findElement(By.name("customerId"));
	   Select sel1=new Select(wb1);
	   sel1.selectByVisibleText("punjab1");
	   driver.findElement(By.name("name")).sendKeys("testId");
	   driver.findElement(By.name("createProjectSubmit")).click();
	   driver.findElement(By.xpath("//a[text()='Open Tasks']")).click();
	   driver.findElement(By.xpath("//input[@value='Create New Tasks']")).click();
	   WebElement wb2 =driver.findElement(By.name("customerId"));
	   Select sel2=new Select(wb2);
	   sel2.selectByVisibleText("punjab1");
	   WebElement wb3 =driver.findElement(By.name("projectId"));
	   Select sel3=new Select(wb3);
	   sel3.selectByVisibleText("testId");
	   driver.findElement(By.name("task[0].name")).sendKeys("test1");
	   driver.findElement(By.name("task[1].name")).sendKeys("test2");
	   driver.findElement(By.name("task[2].name")).sendKeys("test3");
	   driver.findElement(By.xpath("//input[@value='Create Tasks']")).click();
	  WebElement wb5 =driver.findElement(By.xpath("//span[@class='successmsg']"));
	  String actMsg=wb5.getText();
	  if(actMsg.contains("new tasks were added to the customer"))
	  {
		  System.out.println("pass");
	  }
	  else
	  {
		  System.out.println("fail");
	  }
	   
	   
	   
	}

}
