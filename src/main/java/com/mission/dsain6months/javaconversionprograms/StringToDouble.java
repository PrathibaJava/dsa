package com.mission.dsain6months.javaconversionprograms;

public class StringToDouble {

	public static void main(String[] args) {
		String s="123456.789";
		double d=Double.parseDouble(s);
		System.out.println(d+10);
		
		System.out.println(String.valueOf(d)+"new");
	}

}
