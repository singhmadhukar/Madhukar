package com.actitime.projectTest;

import org.testng.annotations.Test;

public class ProjectTest {
	
	@Test(groups={"smokeTest"})
	public void createProjectTest()
	{
		System.out.println("execute createProjectTest");
		
	}
	@Test(groups={"regressionTest","smokeTest"})
	public void modifyProjectTest()
	{
		System.out.println("execute modifyProjectTest");
		
	}
	@Test(groups={"regressionTest"})
	public void deleteProjectTest()
	{
		System.out.println("execute deleteProjectTest");
		
	}

}
