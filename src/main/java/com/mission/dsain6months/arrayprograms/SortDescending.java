package com.mission.dsain6months.arrayprograms;

public class SortDescending {

	public static void main(String[] args) {

		int[] a = { 1, 2, 8, 5, 7 };
		int temp = 0;

		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] < a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		
		for (int a1 : a) {
			System.out.print(a1 + " ");
		}
	}

}
