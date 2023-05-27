package com.mission.dsain6months.basicprograms.patterns;

public class TriangleStar {

	public static void main(String[] args) {
		int n=8;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<2*n;j++) {
				if(i==n||(i+j)==n+1||(j-i)==n-1) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
