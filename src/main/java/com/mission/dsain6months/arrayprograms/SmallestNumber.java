package com.mission.dsain6months.arrayprograms;

public class SmallestNumber {

	public static void main(String[] args) {

		int[] a= {1,2,5,6,3,2,1};
		int temp=0;
		
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]>a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		
		System.out.println("Smallest number in the array is: "+a[0]);
	}

}
