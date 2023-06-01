package com.mission.dsain6months.characterpatterns;

public class RepeatingAlphabet {

	public static void main(String[] args) {
		int n=9;
		for(int i=0;i<=n;i++) {
			int value='A'+i;
			for(int j=0;j<=i;j++) {
				System.out.print((char)value+" ");
			}
			System.out.println();
		}
	}

}
