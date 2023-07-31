package com.mission.dsain6months.arrayprograms;

public class BinarySearch {

	public static int binarySearch(int[] x, int n, int key) {
		int low = 0;
		int high = n - 1;
		while (low <= high) {
			int mid = (low + high) / 2;
			if (x[mid] == key) {
				return mid;
			}
			if (key < x[mid]) {
				high = mid - 1;
			} else {
				low = mid + 1;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int[] x = { 5, 1, 9, 2, 10, 15, 20 };
		System.out.println(binarySearch(x, x.length, 40));
	}

}
