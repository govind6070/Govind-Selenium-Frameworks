package pkgyt.utilities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateCalculation {

	public static String datecalculate() throws InterruptedException 
	{
	Thread.sleep(2000);		
	Date d = new Date();
	String timestamp = new SimpleDateFormat("yyyy_MM_dd").format(d);
    return timestamp;
	}	
}
