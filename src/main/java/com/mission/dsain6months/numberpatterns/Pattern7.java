package com.mission.dsain6months.numberpatterns;

public class Pattern7 {

	public static void main(String[] args) {
		int n=8;
		for(int i=1;i<=n;i++) {
			for(int j=i;j>=1;j--) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}

}
