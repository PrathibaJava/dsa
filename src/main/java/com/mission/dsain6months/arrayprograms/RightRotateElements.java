package com.mission.dsain6months.arrayprograms;

public class RightRotateElements {

	public static void main(String[] args) {
		int n=2;
		int a[]= {5,4,3,2,1};
		for(int i=0;i<n;i++) {
			int temp=a[a.length-1];
			for(int j=a.length-1;j>0;j--) {
				a[j]=a[j-1];
			}
			a[0]=temp;
		}
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		
	}

}
