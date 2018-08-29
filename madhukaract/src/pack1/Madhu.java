package pack1;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Madhu {

	public static void main(String[] args) 
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
		System.out.println(System.getProperty("user.dir"));
		System.out.println( dayOfMonth+"/"+month+"/"+year);
		System.out.println(  hourOfDay+"/"+minute  +"/"+ second );
	}
	}
	