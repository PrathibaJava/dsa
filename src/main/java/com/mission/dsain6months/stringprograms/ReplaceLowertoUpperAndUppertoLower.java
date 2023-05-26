package com.mission.dsain6months.stringprograms;

public class ReplaceLowertoUpperAndUppertoLower {

	public static void main(String[] args) {
		String str="Great Power";
		char[] c=str.toCharArray();
		StringBuffer str1=new StringBuffer(str);
		for(int i=0;i<str.length();i++) {
			if(Character.isLowerCase(c[i])) {
				str1.setCharAt(i, Character.toUpperCase(c[i]));
			}else if(Character.isUpperCase(c[i])) {
				str1.setCharAt(i, Character.toLowerCase(c[i]));
			}
		}
		System.out.println("Converted string: "+str1);
	}

}
