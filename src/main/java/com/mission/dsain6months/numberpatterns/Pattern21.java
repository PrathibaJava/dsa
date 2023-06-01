package com.mission.dsain6months.numberpatterns;

public class Pattern21 {

	public static void main(String[] args) {
		int n=7;
		for(int i=1;i<2*n;i++) {
			for(int j=1;j<2*n;j++) {
				int value=Math.min(Math.min(i, j), Math.min((2*n-i), (2*n-j)));
				System.out.print(n-value+1+" ");
			}
			System.out.println(" ");
		}
	}
}
