package com.mission.dsain6months.javaconversionprograms;

public class IntToString {

	public static void main(String[] args) {
		int i=60;
		String s=String.valueOf(i);
		System.out.println(s+100);
		System.out.println(i+100);
		int i1=100;
		System.out.println(Integer.toString(i1));
		String s2=String.format("%d", i);
		System.out.println(s2);
	}

}
