package com.mission.dsain6months.basicprograms.patterns;

public class MirroredRightTriangle {

	public static void main(String[] args) {
		int n=8;
		for(int i=0; i<n;i++) {
			for(int j=0;j<(n-i-1);j++) {
				System.out.print(" ");
			}
			for(int j=0;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
