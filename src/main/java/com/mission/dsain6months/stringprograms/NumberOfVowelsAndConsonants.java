package com.mission.dsain6months.stringprograms;

public class NumberOfVowelsAndConsonants {

	public static void main(String[] args) {
		String s="This is a really simple sentence";
		String s1=s.toLowerCase();
		int vowels=0;
		int consonants=0;
		for(int i=0;i<s1.length();i++) {
			if(s1.charAt(i)=='a'||s1.charAt(i)=='e'||s1.charAt(i)=='i'||s1.charAt(i)=='o'||s1.charAt(i)=='u') {
				vowels++;
			}else if(s1.charAt(i)<='z' && s1.charAt(i)>='a') {
					consonants++;
			}	
		}
		System.out.println("Number of vowels are: "+vowels);
		System.out.println("Number of consonants are: "+consonants);
	}
}
