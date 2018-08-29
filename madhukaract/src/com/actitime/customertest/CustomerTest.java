package com.actitime.customertest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.actitime.genericlib.FileUtils;

import pack1.properties;

/**
 * 
 * 
 * @author User1
 *
 */

public class CustomerTest {

	public static void main(String[] args) throws Throwable {
		FileUtils fLib=new FileUtils();
		
		
		/*Read  the comman data from properties file*/
		properties pobj=fLib.getpropertiesFileObj();
		
		String LoginUrl=pobj.getProperty("url");
		String LoginUsername=pobj.getProperty("username");
		String LoginPassword=pobj.getProperty("password");
		
		/*Read the data from Excel sheet*/
		 
		 String customerName=fLib.getExcelData("sheet1",1,0);
		 String customerPassword=fLib.getExcelData("sheet1",1,1);
		 String customerReTypePassword=fLib.getExcelData("sheet1",1,2);
		 String customerFirstName=fLib.getExcelData("sheet1",1,3);
		 String customerLastName=fLib.getExcelData("sheet1",1,4);
		 String customerMobileNumber=fLib.getExcelData("sheet1",1,5);
		 String customerEmailId=fLib.getExcelData("sheet1",1,6);
		 
		 
		 
		 /*Print all the data */
		 System.out.println("@@@@@@@@@@@@@@@Data Taken From Properties File@@@@@@@@@@@@@@@@@@@");
		 
		 System.out.println(LoginUrl);
		 System.out.println(LoginUsername);
		 System.out.println(LoginPassword);
		 
		 
		 
		 System.out.println("$$$$$$$$$$$$$$$$$Data Taken From Excel Sheet$$$$$$$$$$$$$$$$$$$$$$$");
		 
		 
		 System.out.println(customerName);
		 System.out.println(customerPassword);
		 System.out.println(customerReTypePassword);
		 System.out.println(customerFirstName);
		 System.out.println(customerLastName);
		 System.out.println(customerEmailId);
		 System.out.println(customerMobileNumber);
		 
		 
		 
		 
		     /*Login to Application*/
		 
		 
			String msg="User account has been successfully created.";
			FirefoxDriver driver=new FirefoxDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			driver.get(LoginUrl);
			driver.findElement(By.name("username")).sendKeys(LoginUsername);
			driver.findElement(By.name("pwd")).sendKeys(LoginPassword);
			driver.findElement(By.id("loginButton")).click();
			
			
			driver.findElement(By.xpath("//div[text()='Users']/..")).click();
		     driver.findElement(By.xpath("//input[@value='Create New User']")).click();
		     driver.findElement(By.name("username")).sendKeys(customerName);
		     driver.findElement(By.name("passwordText")).sendKeys(customerPassword);
		     driver.findElement(By.name("passwordTextRetype")).sendKeys(customerReTypePassword);
		     driver.findElement(By.name("firstName")).sendKeys(customerFirstName);
		     driver.findElement(By.name("lastName")).sendKeys(customerLastName);
		     driver.findElement(By.name("mobile")).sendKeys(customerMobileNumber);
		     driver.findElement(By.name("email")).sendKeys(customerEmailId);
		    
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
