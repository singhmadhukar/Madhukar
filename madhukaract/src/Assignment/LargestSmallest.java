package Assignment;
/*
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FreshersWorld {

	public static void main(String[] args){ 
		FirefoxDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.freshersworld.com/");
		driver.findElement(By.xpath("//*[@id='register-here-block']/a")).click();

	}

}*/



	
		public class LargestSmallest 
		{
			public static void main(String[] args) 
			{
				int a[] =  { 23, 34, 13, 64, 72, 90, 10, 15, 9, 27 };

				int min = a[0]; 
				int max = a[0]; 
				int larIndex=0;
				int smalindex=0;

				for (int i = 1; i < a.length; i++)  
				{
					if (a[i] > max) 
					{
						max = a[i];
						larIndex=i;
					}
					if (a[i] < min) 
					{
						min = a[i];
						smalindex=i;
					}
			
				}

				System.out.println("Largest Number in a given array is : " + max );
				System.out.println("Largest index number :"+larIndex);
				System.out.println("Smallest Number in a given array is : " + min);
				System.out.println("smallest index number :"+smalindex);
			}

		}
 
	
