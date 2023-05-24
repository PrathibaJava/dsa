package com.mission.dsain6months.basicprograms;

public class PatternNumberTriangle {

	public static void main(String[] args) {
		int n=5;
		for(int i=1;i<=n;i++) {
			int numOfSpaces=(n-i);
			for(int j=1;j<=numOfSpaces;j++) {
				System.out.print("  ");
			}
			for(int j=i;j>=1;j--) {
				System.out.print(j+" ");
			}
			
			for(int j=2;j<=i;j++) {
				System.out.print(j+" ");
			}	
			System.out.println();
		}
		
	}

}
