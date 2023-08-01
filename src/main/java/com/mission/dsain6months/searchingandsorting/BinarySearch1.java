package com.mission.dsain6months.searchingandsorting;

import java.util.Arrays;

public class BinarySearch1 {

	public static void main(String[] args) {
		int[] a = { 12, 56, 14, 87, 32 };
		Arrays.sort(a);
		int key = 312;
		System.out.println("Key is found at " + binarySearch(a, key) + " position");
	}

	public static int binarySearch(int[] a, int key) {
		int first = 0;
		int last = a.length - 1;
		int mid = (first + last) / 2;
		while (first <= last) {
			if (a[mid] < key) {
				first = mid + 1;
			} else if (a[mid] == key) {
				return mid;
			} else {
				last = mid - 1;
			}
			mid = (first + last) / 2;
		}
		return -1;
	}
}