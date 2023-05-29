package com.mission.dsain6months.javaconversionprograms;

public class LongToString {

	public static void main(String[] args) {
		long l=123456789;
		String s=Long.toString(l);
		System.out.println(l+10);
		System.out.println(s+10);
		
		String s1=String.valueOf(l);
		System.out.println(s1+"new");
	}

}
