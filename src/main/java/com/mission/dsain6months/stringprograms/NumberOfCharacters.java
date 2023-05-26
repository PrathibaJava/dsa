package com.mission.dsain6months.stringprograms;

public class NumberOfCharacters {

	public static void main(String[] args) {
		String s1="God will make me the most powerful";
		String s2="The best of both worlds";
		int count=0;
		for(int i=0;i<s2.length();i++) {
			if(s2.charAt(i)!=' ')
				count++;
		}
		
		System.out.println("Number of characters in the string are: "+count);
	}

}
