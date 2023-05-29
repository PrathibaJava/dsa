package com.mission.dsain6months.javaconversionprograms;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class StringToDate {

	public static void main(String[] args) throws ParseException {
		DateFormat df=new SimpleDateFormat("DD-mm-yyyy");
		System.out.println(df.parse("22-08-1995"));
		
		String date="31 08 2000";
		DateFormat df1=new SimpleDateFormat("dd MM yyyy");
		System.out.println(df1.parse(date));
		
		String d1="08 31 2021";
		DateFormat df2=new SimpleDateFormat("mm dd yyyy");
		System.out.println(df2.parse(d1));
	}

}
