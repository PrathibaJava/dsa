package com.mission.dsain6months.arrayprograms;

public class LinearSearch {

	public static int linearSearch(int[] x, int n, int key) {
		for (int i = 0; i < n; i++) {
			if (x[i] == key) {
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int[] x = { 5, 1, 9, 2, 10, 15, 20 };
		System.out.println(linearSearch(x, x.length, 10));
	}
}
