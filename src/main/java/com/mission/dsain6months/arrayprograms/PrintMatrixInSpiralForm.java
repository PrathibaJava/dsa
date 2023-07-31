package com.mission.dsain6months.arrayprograms;

public class PrintMatrixInSpiralForm {

	public void spiralPrint(int[][] x, int r, int c) {
		int i, k = 0, l = 0;
		while (k < r && l < c) {
			for (i = l; i < c; i++) {
				System.out.print(x[k][i] + " ");
			}
			k++;
			for (i = k; i < r; i++) {
				System.out.print(x[i][c - 1] + " ");
			}
			c--;
			if (k < r) {
				for(i=c-1; i>=l;i--) {
					System.out.print(x[r-1][i]+" ");
				}
				r--;
			}
			if(l<c) {
				for(i=r-1; i>=k;i--) {
					System.out.print(x[i][l]+" ");
				}
				l++;
			}
		}
	}

	public static void main(String[] args) {

		int[][] x = { { 10, 20, 30, 40 }, { 15, 25, 35, 45 }, { 27, 29, 37, 48 }, { 32, 33, 39, 51 } };
		PrintMatrixInSpiralForm pm=new PrintMatrixInSpiralForm();
		pm.spiralPrint(x, 4, 4);
	}
}
