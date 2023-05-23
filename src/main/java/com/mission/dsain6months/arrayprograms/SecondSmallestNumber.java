package com.mission.dsain6months.arrayprograms;

public class SecondSmallestNumber {

	public static void main(String[] args) {
		
		int[] a= {44,66,99,77,33,22,55};
		int temp=0;
		int length=a.length;
		
		for(int i=0;i<length;i++) {
			for(int j=i+1;j<length;j++) {
				if(a[i]<a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		
		System.out.println("The second smallest number is "+a[length-2]);
	}

}
