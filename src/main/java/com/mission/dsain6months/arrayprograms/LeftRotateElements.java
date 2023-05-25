package com.mission.dsain6months.arrayprograms;

public class LeftRotateElements {

	public static void main(String[] args) {
		int[] a= {1, 2, 3, 4, 5};
		int temp=a[0];
		int n=3;
		
		for(int i=0;i<n;i++) {
			temp=a[0];
			for(int j=0;j<a.length-1;j++) {
				a[j]=a[j+1];
			}
			a[a.length-1]=temp;
		}
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
			
	}

}
