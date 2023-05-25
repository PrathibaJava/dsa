package com.mission.dsain6months.basicprograms.patterns;

public class RightPascalTriangle {

	public static void main(String[] args) {
		int n=6;
		for(int i=1;i<=2*n-1;i++) {
			int numOfColumns=(i>n)?2*n-i:i;
			for(int j=0;j<numOfColumns;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
