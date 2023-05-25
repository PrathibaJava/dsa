package com.mission.dsain6months.basicprograms.patterns;

public class LeftPascalTriangle {

	public static void main(String[] args) {
		int n=6;
		for(int i=1;i<=(2*n-1);i++) {
			int cols=(i<=n)?i:(2*n-i);
			for(int j=0;j<n-cols;j++) {
				System.out.print(" ");
			}
			for(int j=0;j<cols;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
