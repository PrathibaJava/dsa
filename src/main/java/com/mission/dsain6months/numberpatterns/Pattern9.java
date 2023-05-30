package com.mission.dsain6months.numberpatterns;

public class Pattern9 {

	public static void main(String[] args) {
		int n=8;
		for(int i=0;i<=n;i++) {
			int num=1;
			for(int j=0;j<=i;j++) {
				System.out.print(num);
				num=num==1?0:1;
			}
			System.out.println();
		}
	}

}
