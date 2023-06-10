package com.mission.dsain6months.arrayprograms;

public class ResizeArray {

	public static void main(String[] args) {
		int[] a= {1,2,5,9,10};
		printArray(a);
		System.out.println("Length of original array is: "+a.length);
		a=resize(a,a.length*2);
		System.out.println("Length of resized array is: "+a.length);
		printArray(a);
	}
	
	public static int[] resize(int[] a, int capacity) {
		int[] temp=new int[capacity];
		for(int i=0;i<a.length;i++) {
			temp[i]=a[i];
		}
		return temp;
	}
	
	public static void printArray(int[] a) {
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}

}
