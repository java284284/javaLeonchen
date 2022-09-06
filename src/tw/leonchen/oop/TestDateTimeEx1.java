package tw.leonchen.oop;

import java.util.Calendar;
import java.util.Date;

public class TestDateTimeEx1 {

	public static void main(String[] args) {
		Date date = new Date();
        System.out.println("date:" + date);
        
        Calendar c1 = Calendar.getInstance();
        int day = c1.get(Calendar.DAY_OF_MONTH);
        int month = c1.get(Calendar.MONTH);
        int year = c1.get(Calendar.YEAR);
        
        System.out.println(year + "/" + (month+1) + "/" + day);
	}

}
