package pack1;

	import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.firefox.FirefoxDriver;
	public class User {


		public static void main(String[] args)  {
			String msg="is already registered. Please choose other username.";
		FirefoxDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("http://127.0.0.1/login.do;jsessionid=34datw2rf0osr");
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
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
	    	 System.out.println("Error msg is-->"+msg);
	     }
	     else
	     {
	    	 System.out.println("Error msg successfully not verfied");
	    	 
	     }
	     
	     String color=wb.getCssValue("color");
	     System.out.println(color);
	     
	     
		}
	}




