package com.mission.dsain6months.stringprograms;

import java.util.Arrays;

public class AnagramString {

	public static void main(String[] args) {
		String s1="Grab";
		String s2="Brag";
		if(s1.length()!=s2.length()) {
			System.out.println("Given strings are not anagram");
		}else {
			s1=s1.toLowerCase();
			s2=s2.toLowerCase();
			char[] c1=s1.toCharArray();
			char[] c2=s2.toCharArray();
			Arrays.sort(c1);
			Arrays.sort(c2);
			if(Arrays.equals(c1, c2)) {
				System.out.println("Given strings are anagram");
			}else {
				System.out.println("Given strings are not anagram");
			}
		}
	}

}
