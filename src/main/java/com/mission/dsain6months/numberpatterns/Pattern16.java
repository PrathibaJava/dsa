package com.mission.dsain6months.numberpatterns;

public class Pattern16 {

	public static void main(String[] args) {
		int n=9;
		for(int i=0;i<n;i++) {
			for(int j=1;j<=n-i;j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		for(int i=1;i<n;i++) {
			for(int j=1;j<=i+1;j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
}
