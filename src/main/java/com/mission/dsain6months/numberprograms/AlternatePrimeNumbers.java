package com.mission.dsain6months.numberprograms;

public class AlternatePrimeNumbers {

	public static void main(String[] args) {
		int n = 40;
		int temp=2;
		if (n <= 1) {
			System.out.println("No prime numbers in the range");
		} else {
			for (int i = 2; i <= n; i++) {
				if (isPrime(i)) {
					if(temp%2==0) {
						System.out.print(i+" ");
					}
					temp++;
				}
			}
		}
	}

	public static boolean isPrime(int n) {
		int flag = 0;
		for (int i = 2; i <= n/2; i++) {
			if (n % i == 0) {
				flag++;
				break;
			}
		}

		if (flag > 0) {
			return false;
		} else {
			return true;
		}
	}
}
