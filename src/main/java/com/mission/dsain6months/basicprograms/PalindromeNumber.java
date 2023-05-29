package com.mission.dsain6months.basicprograms;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		isPalindrome(1001);
		isPalindrome();
	}
	
	public static void isPalindrome(int n) {
		int temp=n; 
		int r=0;	
		int sum=0; 
		while(n>0) {
			r=n%10; //2 3 2
			sum=(sum*10)+r; //2 23 232
			n=n/10; //23 2
		}
		
		if(temp==sum) {
			System.out.println(temp+" is a palindrome number");
		}else {
			System.out.println(temp+" is not a palindrome number");
		}
	}
	
	//To check when the input received is palindrome or not in case of both int and String
	
	public static void isPalindrome() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string/number to check if it is palindrome or not");
		String original=sc.next();
		String reverse="";
		for(int i=original.length()-1; i>=0; i--) {
			reverse=reverse+original.charAt(i);
		}
		if(original.equals(reverse)) {
			System.out.println(original+ " string is a palindrome");
		}else {
			System.out.println(original+ " string is not a palindrome");
		}
		sc.close();
	}
}