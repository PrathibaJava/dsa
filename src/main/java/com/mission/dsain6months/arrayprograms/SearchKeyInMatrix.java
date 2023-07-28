package com.mission.dsain6months.arrayprograms;

public class SearchKeyInMatrix {

	public void search(int[][] x, int n, int key) {
		int i=0;
		int j=n-1;
		
		while(i < n && j >= 0) {
			if(x[i][j]==key) {
				System.out.println("Key found at "+ i + "th position and " + j + "th position" );
				return;
			}
		
			if(key < x[i][j]) {
				j--;
			}else {
				i++;
			}
		}
		
		System.out.println("Value not found");
	}
	
	public static void main(String[] args) {
		int[][] x= {{10, 20, 30, 40}, {15, 25, 35, 45}, {27, 29, 37, 48}, {32, 33, 39, 51}};
		SearchKeyInMatrix sm=new SearchKeyInMatrix();
		sm.search(x, x.length, 32);
		sm.search(x, x.length, 100);
	}

}
