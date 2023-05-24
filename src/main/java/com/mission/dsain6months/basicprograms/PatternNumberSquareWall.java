package com.mission.dsain6months.basicprograms;

public class PatternNumberSquareWall {

	public static void main(String[] args) {
		int n=4;
		int square=2*n;
		for(int i=0;i<=square;i++) {
			for(int j=0;j<=square;j++) {
				int value=n-Math.min(Math.min(square-i, square-j), Math.min(j, i));
				System.out.print(value+" ");
			}
			System.out.println();
		}
	}

}
