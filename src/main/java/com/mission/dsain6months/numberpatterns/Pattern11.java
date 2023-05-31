package com.mission.dsain6months.numberpatterns;

public class Pattern11 {

	public static void main(String[] args) {
		int n = 8;
		for (int i = 1; i < 2 * n; i++) {
			int cols=(i<=n)?i:2*n-i;
			for (int j = 1; j <= cols; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}

}
