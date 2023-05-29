package com.mission.dsain6months.stringprograms;

public class PermutationsOfString {

	public static void main(String[] args) {
		String str="ABC";
		permutations(str.toCharArray(), 0);
	}
	
	public static void permutations(char[] ch,int fi) {
		if(fi==ch.length-1) {
			System.out.println(ch);
			return;
		}
		for(int i=fi;i<ch.length;i++) {
			swap(fi, i, ch);
			permutations(ch, fi+1);
			swap(fi, i, ch);
		}
	}
	
	public static void swap(int fi, int i, char[] ch) {
		char temp=ch[fi];
		ch[fi]=ch[i];
		ch[i]=temp;
	}
}
