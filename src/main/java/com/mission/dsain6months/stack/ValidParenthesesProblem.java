package com.mission.dsain6months.stack;

public class ValidParenthesesProblem {
	
	public static void main(String[] args) {
		String s="{()}";
		String s1="{[";
		String s2="{]";
		String s3="{()";
		String s4="{([])}";
		
		System.out.println(validParentheses(s3));
	}
	
	public static boolean validParentheses(String s) {
		Stack stack=new Stack();
		char[] ch=s.toCharArray();
		
		for(char c:ch) {
			if(c=='(' || c=='{' || c=='[') {
				stack.push(c);
			}else {
				if(stack.isEmpty()) {
					return false;
				}else {
					char top=(char) stack.peek();
					if((c==')' && top=='(')||(c=='}' && top=='{')||(c==']' && top=='[')) {
						stack.pop();
					}else {
						return false;
					}
				}
			}
		}
		
		return stack.isEmpty();
	}
}
