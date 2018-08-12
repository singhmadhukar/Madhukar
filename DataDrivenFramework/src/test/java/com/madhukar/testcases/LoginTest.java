package com.madhukar.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import com.madhukar.base.Testbase;

public class LoginTest  extends Testbase{
	
	@Test
	public void loginAsBankManager() throws InterruptedException
	{
		//driver=new FirefoxDriver();
		
		driver.findElement(By.xpath(OR.getProperty("Bmlbutton"))).click();
		Thread.sleep(2000);
		
	}

}
