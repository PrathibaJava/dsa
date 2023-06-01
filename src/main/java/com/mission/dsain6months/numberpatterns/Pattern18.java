package com.mission.dsain6months.numberpatterns;

public class Pattern18 {

	public static void main(String[] args) {
		int n=8;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n-i;j++) {
				System.out.print("1");
			}
			for(int j=1;j<=i;j++) {
				System.out.print(i);
			}
			System.out.println();
		}
	}

}
