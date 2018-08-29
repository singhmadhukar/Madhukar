package com.madhukar.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.madhukar.base.Testbase;

public class BankManagerLoginTest  extends Testbase{
	
	@Test
	public void loginAsBankManager() throws InterruptedException
	{	
		log.debug("Inside Login test ");
		driver.findElement(By.cssSelector(OR.getProperty("bmlButton"))).click();
		
		Assert.assertTrue(isElementPresent(By.cssSelector(OR.getProperty("AddCustButton"))),"Login not successful");
		
		log.debug("Login successfully executed");
		
	}

}
