package com.mission.dsain6months.stringprograms;

public class PalindromeString {

	public static void main(String[] args) {
		String str1="madAma";
		str1=str1.toLowerCase();
		String str2="";
		for(int i=str1.length()-1;i>=0;i--) {
			str2=str2+str1.charAt(i);
		}
		if(str1.equals(str2)) {
			System.out.println(str1+" is a palindrome string");
		}else {
			System.out.println(str1+" is not a palindrome string");
		}
	}
}
