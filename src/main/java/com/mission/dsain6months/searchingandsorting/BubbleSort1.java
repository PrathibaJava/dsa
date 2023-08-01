package com.mission.dsain6months.searchingandsorting;

public class BubbleSort1 {

	public static void printArray(int[] arr) {
		for(int i=0; i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	
	public static void bubbleSort(int[] arr) {
		boolean isSwapped;
		for(int i=0;i<arr.length-1;i++) {
			isSwapped=false;
			for(int j=0;j<arr.length-1-i;j++) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					isSwapped=true;
				}
			}
			if(isSwapped == false) {
				break;
			}
		}
	}
	
	public static void main(String[] args) {
		int[] arr= {12, 5, 1, 2, 9, 10};
		printArray(arr);
		bubbleSort(arr);
		printArray(arr);
	}
}
