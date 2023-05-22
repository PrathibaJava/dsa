package com.mission.dsain6months.numberprograms;

public class ReverseNumber {

	public static void main(String[] args) {

		int n=98765;
		int r=0;
		int sum=0;
		while(n>0) {
			r=n%10;
			sum=(sum*10)+r;
			n=n/10;
		}
		System.out.println("Reverse of the number is: "+sum);
	}
}
