package com.poland.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Util {
	public static Date stringToDate(String dateInString){
		 SimpleDateFormat formatter = new SimpleDateFormat("dd-MMM-yyyy");
	        Date date = null;
	        try {

	            date = formatter.parse(dateInString);

	        } catch (ParseException e) {
	            e.printStackTrace();
	        }
			return date;

	}
	
	public static boolean isLessThanNov2014(String date){
		 return stringToDate(date).before(stringToDate("01-Nov-2014"));
	}
	

    public static boolean isholidayDay(Date date)
    {
        boolean isHoliday = false;
        
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        
        if(cal.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY
            || cal.get(Calendar.DAY_OF_WEEK) == Calendar.SATURDAY)
        {
            isHoliday = true;
        }
        return isHoliday;
    }
	
	public static void main(String[] args) {
		boolean lessThanNov2014 = isLessThanNov2014("01-Oct-2014");
	}
}
