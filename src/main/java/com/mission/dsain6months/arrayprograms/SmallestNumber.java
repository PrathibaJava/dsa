package com.mission.dsain6months.arrayprograms;

public class SmallestNumber {

	public static void main(String[] args) {

		int[] a= {1,2,5,6,3,2,1,0};
		int temp=0;
		
		smallestNumber(a);
		
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

	public static void smallestNumber(int[] a) {
		int min=a[0];
		for(int i=1;i<a.length;i++) {
			if(a[i]<min)
				min=a[i];
		}
		System.out.println("Smallest element "+min);
	}
}
