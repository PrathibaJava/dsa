package com.mission.dsain6months.characterpatterns;

public class KShapeAlphabetPattern {

	public static void main(String[] args) {
		int n=9;
		for(int i=0;i<=2*n;i++) {
			int value='A';
			int cols=(i<=n)?n-i:i-n;
			for(int j=0;j<=cols;j++) {
				System.out.print((char)(value+j)+" ");
			}
			System.out.println();
		}
	}
}
