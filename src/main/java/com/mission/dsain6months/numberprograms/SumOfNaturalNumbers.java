package com.mission.dsain6months.numberprograms;

public class SumOfNaturalNumbers {

	public static void main(String[] args) {
		
		//time complexity is too much here
		int sum=0;
		for(int i=0; i<=100;i++) {
			sum=sum+i;
		}
		System.out.println("Sum of numbers is "+sum);
		
		//using function n*(n+1)/2
		int n=100;
		sum=n*(n+1)/2;
		System.out.println(sum);
	}

}
