package com.actitime.genericlib1;

import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseClass {
	public static WebDriver driver;
	@BeforeClass
	public void configBC()
	{
		System.out.println("===========launching the browser==========");
		driver=new FirefoxDriver();
				
	}
	@BeforeMethod
	public void configBM()
	{
	System.out.println("Login");
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
     
	}
	@AfterMethod
	public void configAM()
	{
		System.out.println("logout");
		driver.findElement(By.xpath("//a[text()='Logout']")).click();
	}
	@AfterClass
	public void configAC()
	{
		System.out.println("============CloseBrowser==========");
			
	}
}
