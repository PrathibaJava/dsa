package com.mission.dsain6months.stringprograms;

public class ReverseString {

	public static void main(String[] args) {
		String str="I am good";
		int i=str.length()-1;;
		while(i>=0) {
			System.out.print(str.charAt(i));
			i--;
		}
	}
}
