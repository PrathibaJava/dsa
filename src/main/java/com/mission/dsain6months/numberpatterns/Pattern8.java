package com.mission.dsain6months.numberpatterns;

public class Pattern8 {

	public static void main(String[] args) {
		int n=9;
		int num=1;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				System.out.print(num);
				num=num==0?1:0;
			}
			System.out.println();
		}
	}

}
