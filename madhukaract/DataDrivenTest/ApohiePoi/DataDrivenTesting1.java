package ApohiePoi;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import pack1.properties;

public class DataDrivenTesting1 {
	
		public static void main(String[] args) throws Throwable {
			
			
			
			
			FileInputStream fis=new FileInputStream("./src\\pack1\\Inputdata.properties");
			
			Properties pobj=new properties();
			pobj.load(fis);
			
			
			String URL=pobj.getProperty("url");
			String USERNAME=pobj.getProperty("username");
			String PASSWORD=pobj.getProperty("password");
			
			
			System.out.println(URL);
			System.out.println(USERNAME);
			System.out.println(PASSWORD);
			
	
			FileInputStream fis1=new FileInputStream("./Book1.xlsx");
			
			Workbook wb=WorkbookFactory.create(fis1);
			
			Sheet sh=wb.getSheet("sheet1");
			
			 Row row1=sh.getRow(1);
			 
			 
			 
			 String user=row1.getCell(0).getStringCellValue();
			 String pass=row1.getCell(1).getStringCellValue();
			 String repass=row1.getCell(2).getStringCellValue();
			 String first=row1.getCell(3).getStringCellValue();
			 String last=row1.getCell(4).getStringCellValue();
			 
		
			 String email=row1.getCell(6).getStringCellValue();
			 
			 
			 System.out.println(user);
			 System.out.println(pass);
			 System.out.println(first);
			 System.out.println(last);
			 System.out.println(repass);
			 System.out.println(email);
			 
			 
			 
			 
			 
				String msg="User account has been successfully created.";
				FirefoxDriver driver=new FirefoxDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
				driver.get(URL);
				driver.findElement(By.name("username")).sendKeys(USERNAME);
				driver.findElement(By.name("pwd")).sendKeys(PASSWORD);
				driver.findElement(By.id("loginButton")).click();
				
				
				driver.findElement(By.xpath("//div[text()='Users']/..")).click();
			     driver.findElement(By.xpath("//input[@value='Create New User']")).click();
			     driver.findElement(By.name("username")).sendKeys(user);
			     driver.findElement(By.name("passwordText")).sendKeys(pass);
			     driver.findElement(By.name("passwordTextRetype")).sendKeys(repass);
			     driver.findElement(By.name("firstName")).sendKeys(first);
			     driver.findElement(By.name("lastName")).sendKeys(last);
			     driver.findElement(By.name("email")).sendKeys(email);
			    
			     driver.findElement(By.xpath("//input[@type='submit']")).click();
			     
			    
			     WebElement wb1=driver.findElement(By.xpath("//span[text()='User account has been successfully created.']"));
			     String actmsg=wb1.getText();
			     if(actmsg.contains(msg))
			     {
			    	 System.out.println("User account has been successfully created.");
		    	 
			     }
			     else
		     {
		    	 System.out.println("User account has  not been successfully created.");			    	 
		     }
			     
			 
			 
	}

}
