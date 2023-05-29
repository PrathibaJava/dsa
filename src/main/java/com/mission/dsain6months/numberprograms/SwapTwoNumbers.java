package com.mission.dsain6months.numberprograms;

public class SwapTwoNumbers {

	public static void main(String[] args) {
		int x=10;
		int y=20;
		System.out.println("Numbers before swapping: "+x +" "+y);
		x=x^y;
		y=x^y;
		x=x^y;
		System.out.println("Numbers after swapping: "+x +" "+y);
		swapNumbers(x,y);
	}

	public static void swapNumbers(int x, int y) {
		System.out.println("Numbers before swapping: "+x +" "+y);
		x=x*y;
		y=x/y;
		x=x/y;
		System.out.println("Numbers after swapping: "+x +" "+y);
	}
}
