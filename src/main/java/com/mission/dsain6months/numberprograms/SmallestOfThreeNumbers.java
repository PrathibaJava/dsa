package com.mission.dsain6months.numberprograms;

public class SmallestOfThreeNumbers {

	public static void main(String[] args) {

		int n1 = 4;
		int n2 = 1;
		int n3 = 2;

		int result = n1 < n2 ? n1 : n2;
		result = result < n3 ? result : n3;

		System.out.println("Smallest number of three numbers is: " + result);
	}

}
