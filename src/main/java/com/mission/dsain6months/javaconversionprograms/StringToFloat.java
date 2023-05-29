package com.mission.dsain6months.javaconversionprograms;

public class StringToFloat {

	public static void main(String[] args) {
		String s="123.45";
		float f=Float.parseFloat(s);
		System.out.println(f);
		System.out.println(Float.valueOf(s));
	}

}
