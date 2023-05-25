package com.mission.dsain6months.arrayprograms;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LargestNumber {

	public static void main(String[] args) {
		Integer[] array = { 200, 96, 12, 56, 23, 180, 15, 1 };
		System.out.println("Largest element in the array is: " + findLargestNumber(array));
	}

	public static int findLargestNumber(Integer[] a) {
		int length = a.length;
		List<Integer> a1 = Arrays.asList(a);
		Collections.sort(a1);
		return a1.get(length - 1);
	}
	
	public static void largestNumber(int[] a) {
		int max=a[0];;
		for(int i=1;i<a.length;i++) {
			if(a[i]>max)
				max=a[i];
		}
		System.out.println("Largest number in the array is: "+max);
	}

}
