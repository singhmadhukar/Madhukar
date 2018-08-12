package com.madhukar.rough;
//import com.madhukar.base.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;

public class Testproperties {

	public static void main(String[] args) throws IOException {
		Properties config=new Properties();
	    Properties OR=new Properties();
		System.out.println(System.getProperty("user.dir"));
		FileInputStream fis=new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\properties\\config.properties");
	     config.load(fis);
		fis = null;
		 fis=new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\properties\\OR.properties");
		 OR.load(fis);
	
         System.out.println(config.getProperty("browser"));
         
       //  driver.findElement(By.cssSelector(OR.getProperty("bmlButton"))).click();
         System.out.println(OR.getProperty("bmlButton"));
	}

}
