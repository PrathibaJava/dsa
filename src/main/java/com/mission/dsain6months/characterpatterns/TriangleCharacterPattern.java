package com.mission.dsain6months.characterpatterns;

public class TriangleCharacterPattern {

	public static void main(String[] args) {
		int n=8;
		for(int i=0;i<=n;i++) {
			for(int j=0;j<=n-i;j++) {
				System.out.print(" ");
			}
			for(int j=0;j<=i;j++) {
				System.out.print((char)('A'+j)+" ");
			}
			System.out.println(" ");
		}
	}

}
