package DateAndCalendar;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateAndCalendar {

	public static void main(String[] args) {
		Date d=new Date();
		System.out.println(d);
		SimpleDateFormat sdf=new SimpleDateFormat("M/dd/yyyy");
		System.out.println(sdf.format(d)); 
		Calendar cl=Calendar.getInstance();
		
		System.out.println(cl.get(Calendar.DAY_OF_YEAR));
		
		System.out.println(sdf.format(cl.getTime()));
		System.out.println(cl.get(Calendar.HOUR));
		System.out.println(cl.get(Calendar.AM_PM));

	}

}
