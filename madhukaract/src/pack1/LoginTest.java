package pack1;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends TestBase{

	@Test(priority=1)
	public void doLogin()
	{
		driver.findElement(By.id("email")).sendKeys("madhukarshyam111@gmail.com");
		driver.findElement(By.id("next")).click();
	}
	
	@Test(priority=2)
	public void composeEmail()
	{
		Assert.fail("error in composing mail");
		
	

	}

}
