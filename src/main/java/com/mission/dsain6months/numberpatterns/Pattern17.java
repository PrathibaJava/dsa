package com.mission.dsain6months.numberpatterns;

public class Pattern17 {

	public static void main(String[] args) {
		int n=9;
		for(int i=0; i<n; i++) {
			
			for(int j=1;j<=i;j++) {
				System.out.print("  ");
			}
			for(int j=i+1; j<=n;j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
		for(int i=n-1; i>0;i--) {
			for(int j=1;j<=i-1;j++) {
				System.out.print("  ");
			}
			for(int j=i;j<=n;j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
}
