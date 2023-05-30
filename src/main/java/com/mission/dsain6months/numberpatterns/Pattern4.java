package com.mission.dsain6months.numberpatterns;

public class Pattern4 {

	public static void main(String[] args) {
		int n=5;
		for(int i=1;i<=2*n;i++) {
			int spaces=i<=n?n-i:i-n;
			int cols=i<=n?i:2*n-i;
			for(int j=1;j<=spaces;j++) {
				System.out.print("  ");
			}
			for(int j=cols;j>0;j--) {
				System.out.print(j+" ");
			}
			for(int j=2;j<=cols;j++) {
				System.out.print(j+" ");
				
			}
			System.out.println();
		}	
	}

}
