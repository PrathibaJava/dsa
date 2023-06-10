package com.mission.dsain6months.arrayprograms;

public class SecondMaximumNumber {

	public static void main(String[] args) {
		int[] arr= {13,34,14,34,33,1};
		int secondMax=secondMax(arr);
		System.out.println(secondMax);
	}
	
	public static int secondMax(int[] arr) {
		int max=0;
		int secondMax=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
			//	secondMax=max; Didn't understand the significance of this line
				max=arr[i];
			}else if(arr[i]>secondMax && arr[i]!=max) {
				secondMax=arr[i];
			}
		}
		return secondMax;
	}
}
