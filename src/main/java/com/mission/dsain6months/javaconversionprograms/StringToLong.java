package com.mission.dsain6months.javaconversionprograms;

public class StringToLong {

	public static void main(String[] args) {
		String s="347890952446";
		long l=Long.parseLong(s);
		System.out.println(l);
		Long l1=Long.valueOf(s);
		System.out.println(l1);
	}

}
