package com.mission.dsain6months.basicprograms;

public class PrimeNumbers {

	public static void main(String[] args) {
		primeNumber(0, 20);
	}

	public static void isPrime(int n) {
		int m = n / 2;
		int flag = 0;
		if (n <= 1) {
			System.out.println(n + " is not a prime number");
		} else {
			for (int i = 2; i <= m; i++) {
				if (n % i == 0) {
					flag++;
					break;
				}
			}
			if (flag > 0) {
				System.out.println(n + " is not a prime number");
			} else {
				System.out.println(n + " is a prime number");
			}
		}

	}

	public static void primeNumber(int a, int b) {
		for (int i = a; i <= b; i++) {
			isPrime(i);
		}
	}
}
