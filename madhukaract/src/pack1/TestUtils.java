package pack1;

import java.io.File;
import java.io.IOException;
import java.util.Calendar;
import java.util.GregorianCalendar;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.actitime.genericlib.FileUtils;

public class TestUtils extends TestBase {
	public static String mailscreenshotpath;
	public static void capturescreenshot(String MethodName)
	{
		Calendar calendar = new GregorianCalendar();
		 
		int year       = calendar.get(Calendar.YEAR);
		int month      = calendar.get(Calendar.MONTH); 
		int dayOfMonth = calendar.get(Calendar.DAY_OF_MONTH); // Jan = 0, not 1
		int dayOfWeek  = calendar.get(Calendar.DAY_OF_WEEK);
		int weekOfYear = calendar.get(Calendar.WEEK_OF_YEAR);
		int weekOfMonth= calendar.get(Calendar.WEEK_OF_MONTH);
		 
		int hour       = calendar.get(Calendar.HOUR);        // 12 hour clock
		int hourOfDay  = calendar.get(Calendar.HOUR_OF_DAY); // 24 hour clock
		int minute     = calendar.get(Calendar.MINUTE);
		int second     = calendar.get(Calendar.SECOND);
		int millisecond= calendar.get(Calendar.MILLISECOND);
		
		File srcfile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try
		{
		mailscreenshotpath=System.getProperty("user.dir")+("\\screenshot\\+MethodName+"_"+year+"_ "+dayOfMonth+"__"+month+"_"+.png"); 
		FileUtils.copyFile(srcfile,new File(mailscreenshotpath));
	}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	
	}
}

