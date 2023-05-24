package com.mission.dsain6months.basicprograms;

public class PatternRightPascalTriangle {

	public static void main(String[] args) {
		int n=5;
		for(int i=0;i<2*n;i++) {
			int numOfColumns=(i>n)?2*n-i:i;
			for(int j=0;j<numOfColumns;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
