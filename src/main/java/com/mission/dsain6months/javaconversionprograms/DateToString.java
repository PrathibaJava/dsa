package com.mission.dsain6months.javaconversionprograms;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateToString {

	public static void main(String[] args) {

		Date d=new Date();
		Date date=Calendar.getInstance().getTime();
		DateFormat df=new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		System.out.println(df.format(d));
		System.out.println(df.format(date));
		
		
	}

}
