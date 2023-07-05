package com.mission.dsain6months.stack;

public class ReverseString {

	public static void main(String[] args) {
		Stack s=new Stack();
		String str="Good Luck";
		char[] c=str.toCharArray();
		for(char c1:c) {
			s.push(c1);
		}
		
		for(int i=0;i<str.length();i++) {
			c[i]=(char) s.pop();
		}
		
		System.out.println(new String(c));
	}

}
