package com.mission.dsain6months.numberpatterns;

public class Pattern19 {

	public static void main(String[] args) {
		int n=9;
		for(int i=1;i<=n;i++) {
			int num=i;
			for(int j=1;j<=i;j++) {
				System.out.print(num+" ");
				num=num+n-j;
			}
			System.out.println();
		}
	}

}
