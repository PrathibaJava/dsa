package com.mission.dsain6months.numberprograms;

public class LargestOfThreeNumbers {

	public static void main(String[] args) {
		int n1 = 1000;
		int n2 = 150;
		int n3 = 20;

		int temp = n1 > n2 ? n1 : n2;
		temp = temp > n3 ? temp : n3;

		System.out.println("Largest of three numbers is: " + temp);
	}

}
