package com.actitime.CustomerTest1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class CustomerTest {
	
	@Test(groups={"smokeTest"})
	public void createCustomerTest()
	{
		WebDriver driver=new FirefoxDriver();
		WebDriverWait w=new WebDriverWait(driver, 20);
		System.out.println("execute createCustomerTest");
		
	}
	@Test(groups={"regressionTest","smokeTest"})
	public void modifyCustomerTest()
	{
		System.out.println("execute modifyCustomerTest");
		
	}
	@Test(groups={"regressionTest"})
	public void deleteCustomerTest()
	{
		System.out.println("execute deleteCustomerTest");
		
	}

} 
