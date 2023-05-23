package com.mission.dsain6months.arrayprograms;

import java.util.Arrays;

public class SecondLargestNumber {

	public static void main(String[] args) {
		int[] a = { 11, 56, 23, 89, 4, 2, 125 };
		System.out.println(findSecondLargestNumber(a));

	}

	public static int findSecondLargestNumber(int[] a) {
		int length = a.length;
		Arrays.sort(a);
		return a[length - 2];
	}

}
