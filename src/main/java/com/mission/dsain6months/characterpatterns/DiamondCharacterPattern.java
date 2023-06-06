package com.mission.dsain6months.characterpatterns;

public class DiamondCharacterPattern {

	public static void main(String[] args) {
		int n=16;
		int letter=64;
		for(int i=0;i<n;i++) {
			letter++;
			for(int j=1;j<2*n;j++) {
				if(j==n-i||j==n+i)
					System.out.print((char)letter);
				else
					System.out.print(" ");
			}
			
			System.out.println();
		}
		
		for(int i=n-2;i>=0;i--) {
			--letter;
			for(int j=1;j<2*n;j++) {
				if(j==n-i||j==n+i) {
					System.out.print((char)letter);
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
