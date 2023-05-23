package com.mission.dsain6months.arrayprograms;

public class OddAndEvenNumbers {

	public static void main(String[] args) {
		int[] a= {1,2,5,6,3,2};
		System.out.print("Even numbers from the array: ");
		for(int i=0;i<a.length;i++) {
			if(a[i]%2==0) {
				System.out.print(a[i]+" ");
			}
		}
		System.out.println();
		System.out.print("Odd numbers from the array: ");
		for(int i=0;i<a.length;i++) {
			if(a[i]%2!=0) {
				System.out.print(a[i]+" ");
			}
		}
	}

}
