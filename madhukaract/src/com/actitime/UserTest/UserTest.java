package com.actitime.UserTest;

import org.testng.annotations.Test;

public class UserTest {
	
	
	@Test(groups={"smokeTest"})
	public void createUserTest()
	{
		System.out.println("execute createUserTest");
		
	}
	@Test(groups={"smokeTest"})
	public void modifyUserTest()
	{
		System.out.println("execute modifyUserTest");
		
	}
	@Test(groups={"regressionTest"})
	public void deleteUserTest()
	{
		System.out.println("execute deleteUserTest");
		
	}

}
