package com.mission.dsain6months.basicprograms;

public class PatternDiamondShape {

	public static void main(String[] args) {
		int n=6;
		for(int i=0;i<2*n;i++) {
			int numOfStars=(i<=n)?(i):(2*n-i);
			//int numOfSpaces=(i<=n)?(n-i):(i-n);
			int numOfSpaces=n-numOfStars;
			for(int j=0;j<numOfSpaces;j++) {
				System.out.print(" ");
			}
			for(int j=0;j<numOfStars;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
