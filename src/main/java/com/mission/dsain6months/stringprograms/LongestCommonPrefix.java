package com.mission.dsain6months.stringprograms;

import java.util.Arrays;

public class LongestCommonPrefix {

	public static void main(String[] args) {
		String[] str= {"flower", "flight", "flow"};
		lcp(str);
	}
	
	public static void lcp(String[] str) {
		Arrays.sort(str);
		String s1=str[0];
		String s2=str[str.length-1];
		int index=0;
		while(index<s1.length()-1) {
			if(s1.charAt(index)==s2.charAt(index)) {
				index++;
			}else {
				break;
			}
		}
		System.out.println(s1.substring(0, index));
	}
}
