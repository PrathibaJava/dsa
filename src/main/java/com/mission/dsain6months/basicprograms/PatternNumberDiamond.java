package com.mission.dsain6months.basicprograms;

public class PatternNumberDiamond {

	public static void main(String[] args) {

		int n=5;
		for(int i=1;i<=2*n;i++) {
			int numOfColumns=(i>n)?(2*n-i):(i);
			int numOfSpaces=n-numOfColumns;
			for(int j=1;j<=numOfSpaces;j++) {
				System.out.print("  ");
			}
			for(int j=numOfColumns;j>=1;j--) {
				System.out.print(j+" ");
			}
			for(int j=2;j<=numOfColumns;j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}

}
