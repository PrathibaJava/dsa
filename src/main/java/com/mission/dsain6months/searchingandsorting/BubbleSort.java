package com.mission.dsain6months.searchingandsorting;

public class BubbleSort {

	public static void main(String[] args) {
		 int arr[] ={3,60,35,2,45,320,5};  
		 int temp;
		 for(int i=0;i<arr.length;i++) {
			 for(int j=i+1;j<arr.length;j++) {
				 if(arr[i]>arr[j]) {
					 temp=arr[i];
					 arr[i]=arr[j];
					 arr[j]=temp;
				 } 
			 }
		 }
		 System.out.print("Sorted array is: ");
		 for(int i=0;i<arr.length;i++) {
			 System.out.print(arr[i]+" ");
		 }
	}

}
