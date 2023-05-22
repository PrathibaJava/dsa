package com.mission.dsain6months.basicprograms;

public class Factorial {

	public static void main(String[] args) {
		int factorial = factorial(5);
		System.out.println("Factorial is " + factorial);
	}

	public static int factorial(int n) {
		int factorial = 1;
		for (int i = 1; i <= n; i++) {
			factorial = factorial * i;
		}
		return factorial;
	}
}
