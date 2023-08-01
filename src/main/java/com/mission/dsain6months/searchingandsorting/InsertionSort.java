package com.mission.dsain6months.searchingandsorting;

public class InsertionSort {

	public static void printArray(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	
	public static void insertionSort(int[] arr) {
		for(int i=1;i<arr.length;i++) {
			int j=i-1;
			int temp=arr[i];
			while (j>=0 && arr[j]>temp) {
				arr[j+1]=arr[j];
				j=j-1;
			}
			arr[j+1]=temp;
		}
	}
	
	public static void main(String[] args) {
		int[] arr= {5, 1, 2, 9, 10, 0, 3, 101};
		printArray(arr);
		insertionSort(arr);
		printArray(arr);
	}

}
