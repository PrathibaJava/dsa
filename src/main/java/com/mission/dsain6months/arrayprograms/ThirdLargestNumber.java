package com.mission.dsain6months.arrayprograms;

public class ThirdLargestNumber {

	public static void main(String[] args) {

		int[] a= {12,312,89,15,2,34};
		System.out.println(findThirdLargestNumber(a));
	}

	public static int findThirdLargestNumber(int[] a) {
		int length=a.length;
		int temp=0;
		for(int i=0;i<length;i++) {
			for(int j=1;j<length;j++) {
				if(a[i]>a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		return a[length-3];
	}
}
