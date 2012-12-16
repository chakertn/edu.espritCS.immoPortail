package edu.espritCs.immoPortailClient.tests;

import java.util.Calendar;
import java.util.Date;

public abstract class DateUtils {
public static Date dateAdd(Date date, int jours){
	
	Calendar calendar = Calendar.getInstance();
    calendar.setTime(date);
    calendar.add(Calendar.DAY_OF_YEAR, jours);
    return calendar.getTime();
	
}
}
