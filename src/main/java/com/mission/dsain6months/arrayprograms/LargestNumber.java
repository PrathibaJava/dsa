package com.mission.dsain6months.arrayprograms;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LargestNumber {

	public static void main(String[] args) {
		Integer[] array = { 96, 12, 56, 23, 180, 15, 1 };
		System.out.println("Largest element in the array is: " + findLargestNumber(array));
	}

	public static int findLargestNumber(Integer[] a) {
		int length = a.length;
		List<Integer> a1 = Arrays.asList(a);
		Collections.sort(a1);
		return a1.get(length - 1);
	}

}
