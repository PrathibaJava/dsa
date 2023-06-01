package com.mission.dsain6months.numberpatterns;

public class Pattern20 {

	public static void main(String[] args) {
		int n=9;
		for(int i=1;i<=n;i++) {
			for(int j=i;j<=n;j++) {
				System.out.print(j+" ");
			}
			for(int j=1;j<=i-1;j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
}
