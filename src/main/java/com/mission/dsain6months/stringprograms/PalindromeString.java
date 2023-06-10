package com.mission.dsain6months.stringprograms;

public class PalindromeString {

	public static void main(String[] args) {
		String str1="madAm";
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
		
		System.out.println(isPalindrome(str1));
	}
	
	public static boolean isPalindrome(String s1) {
		char[] ch=s1.toCharArray();
		int start=0;
		int end=ch.length-1;
		while(start<end) {
			if(ch[start]!=ch[end]) {
				return false;
			}			
			start++;
			end--;
		}
		return true;
	}
}
