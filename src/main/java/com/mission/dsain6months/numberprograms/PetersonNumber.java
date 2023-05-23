package com.mission.dsain6months.numberprograms;

public class PetersonNumber {

	public static void main(String[] args) {
		int num = 145;
		int temp = num;
		int sum = 0;

		while (num > 0) {
			int digit = num % 10;
			sum += factorial(digit);
			num /= 10;
		}

		if (sum == temp) {
			System.out.println(temp + " is a Peterson number");
		} else {
			System.out.println(temp + " is not a Peterson number");
		}

	}

	public static int factorial(int num) {
		int fact = 1;
		if (num > 0) {
			fact = num * factorial(num - 1);
			num--;
		}
		return fact;
	}
}
