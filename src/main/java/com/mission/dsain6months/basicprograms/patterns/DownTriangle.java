package com.mission.dsain6months.basicprograms.patterns;

public class DownTriangle {

	public static void main(String[] args) {
		int n=10;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<2*n;j++) {
				if(i==1||(i-j)==0||(i+j)==2*n) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
