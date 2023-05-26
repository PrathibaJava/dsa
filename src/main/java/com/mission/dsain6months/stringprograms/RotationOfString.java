package com.mission.dsain6months.stringprograms;

public class RotationOfString {

	public static void main(String[] args) {
		String s1="abcde";
		String s2="deabc";
		stringRotation(s1, s2);
		s1=s1+s2;
		if(s1.contains(s2)) {
			System.out.println("String 1 is rotation of String 2");
		}else {
			System.out.println("String 1 is not rotation of String 2");
		}
	}
	
	public static void stringRotation(String s1, String s2) {
		if(s1.length()!=s2.length()) {
			System.out.println("Not rotation of each other");
		}else {
			s1=s1.concat(s2);
			if(s1.indexOf(s2)!=-1) {
				System.out.println("Rotation");
			}else {
				System.out.println("Not rotation");
			}
		}
	}
}
