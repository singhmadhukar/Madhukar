package com.actitime.customerTest2;



import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.actitime.genericlib1.BaseClass;

public class CustomerTest extends BaseClass{
	/*@Test
	public void verifyHomePage()
	{
		String expTitle="actiTIME - User List";
		String acttitle=driver.getTitle();
		System.out.println(acttitle);
		Assert.assertEquals(expTitle, acttitle);
		
	}	*/
		
		@Test
		public void verifyUserCredentials()
		{
		WebElement wb=driver.findElement(By.xpath("//span[text()='User account has been successfully created.']"));
		  String actMsg=wb.getText();
		  System.out.println(actMsg);
		  String expMsg="User account has been successfully created.";
		  Assert.assertEquals(expMsg, actMsg);
	}

}
