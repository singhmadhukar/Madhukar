package pack1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Data1 {
	
	public static void main(String []args) throws Throwable {
		
		FileInputStream fis=new FileInputStream("./src\\pack1\\Inputdata.properties");
		
		Properties pobj=new properties();
		pobj.load(fis);
		
		
		String URL=pobj.getProperty("url");
		String USERNAME=pobj.getProperty("username");
		String PASSWORD=pobj.getProperty("password");
		
		
		System.out.println(URL);
		System.out.println(USERNAME);
		System.out.println(PASSWORD);
		
		
		WebDriver driver=new FirefoxDriver();
		
		driver.get(URL);
		driver.findElement(By.name("username")).sendKeys(USERNAME);
		driver.findElement(By.name("pwd")).sendKeys(PASSWORD);
        driver.findElement(By.id("loginButton")).click();
		
		
		driver.findElement(By.xpath("//div[text()='Users']/..")).click();
	     driver.findElement(By.xpath("//input[@value='Create New User']")).click();
	     driver.findElement(By.name("username")).sendKeys("shantanu");
	     driver.findElement(By.name("passwordText")).sendKeys("shantanu");
	     driver.findElement(By.name("passwordTextRetype")).sendKeys("shantanu");
	     driver.findElement(By.name("firstName")).sendKeys("shantanu");
	     driver.findElement(By.name("lastName")).sendKeys("mishra");
	     driver.findElement(By.name("email")).sendKeys("shantanumishra900@gmail.com");
	     driver.findElement(By.name("mobile")).sendKeys("9537920082");
	     driver.findElement(By.xpath("//input[@type='submit']")).click();
	     
	    
	     WebElement wb=driver.findElement(By.xpath("//span[@class='errormsg']"));
	     String actmsg=wb.getText();
	     if(actmsg.contains(msg))
	     {
	    	 System.out.println("Error msg successfully verfied");
	     }
	     else
	     {
	    	 System.out.println("Error msg successfully not verfied");
	    	 
	     }
	     
		
		
		
		
		
		
		
		

        

	}

}
