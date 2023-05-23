package com.mission.dsain6months.basicprograms;

public class ArmstrongNumber {

	public static void main(String[] args) {

		int num = 143;
		int temp = num;
		double count = 0;
		double r = 0;
		double sum = 0;

		while (num > 0) {
			num = num / 10;
			count++;
		}

		num = temp;

		while (num > 0) {
			r = num % 10;
			sum += Math.pow(r, count);
			num = num / 10;
		}

		if (sum == temp)
			System.out.println(temp + " is an Armstrong number");
		else
			System.out.println(temp + " is not an Armstrong number");
	}
}
