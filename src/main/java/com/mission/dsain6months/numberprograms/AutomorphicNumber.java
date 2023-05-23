package com.mission.dsain6months.numberprograms;

import java.util.Scanner;

public class AutomorphicNumber {

	public static void main(String[] args) {
		System.out.println(isAutomorphic(76) ? "Automorphic" : "Not Automorphic");
		System.out.println(isAutomorphic(13) ? "Automorphic" : "Not Automorphic");
		System.out.println(isAutomorphic(625) ? "Automorphic" : "Not Automorphic");
		isAutomorphic();
	}

	public static boolean isAutomorphic(int num) {
		int square = num * num;

		while (num > 0) {
			if (num % 10 != square % 10) {
				return false;
			}
			num = num / 10;
			square = square / 10;
		}

		return true;
	}
	
	public static void isAutomorphic() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number to check");
		int num=sc.nextInt();
		int temp=num;
		int count=0;
		int square=num*num;
		while(num>0) {
			num=num/10;
			count++;
		}
		
		if(temp == square%(int) Math.pow(10, count)) {
			System.out.println(temp+" is an Automorphic number");
		}else {
			System.out.println(temp+" is not an Automorphic number");
		}
	}
}
