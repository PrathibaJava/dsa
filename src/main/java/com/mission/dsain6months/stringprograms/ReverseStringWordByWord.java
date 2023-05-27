package com.mission.dsain6months.stringprograms;

public class ReverseStringWordByWord {

	public static void main(String[] args) {
		String str = "Good";
		String[] a = str.split(" ");
		// char[] ch=new char[a.length];
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
			char[] temp = a[i].toCharArray();
			for (int j = temp.length - 1; j >= 0; j--) {
				System.out.print(temp[j]);
			}
			System.out.println();
		}
		printReverse(str);
		String reversed = reverseString(str);  
		System.out.println("The reversed string is: " + reversed);  
	}

	public static void printReverse(String str) {
		String reverseString = "";
		System.out.println("Original String is: " + str);
		for (int i = str.length() - 1; i >= 0; i--) {
			reverseString = reverseString + str.charAt(i);
		}
		System.out.println("Reverse String is: " + reverseString);
	}

	// reversing using recursion
	public static String reverseString(String s) {
		if (s.isEmpty()) // checks the string if empty
			return s;
		return reverseString(s.substring(1)) + s.charAt(0); // recursively called function
	}
}
