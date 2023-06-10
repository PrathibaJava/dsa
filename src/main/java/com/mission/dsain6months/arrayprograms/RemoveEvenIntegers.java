package com.mission.dsain6months.arrayprograms;

public class RemoveEvenIntegers {

	public static void main(String[] args) {
		int[] arr = { 3, 2, 4, 7, 10, 6, 5 };
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 != 0) {
				count++;
			}
		}
		
		int[] output = new int[count];
		int idx=0;
		
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]%2!=0) {
				output[idx]=arr[i];
				idx++;
			}
		}
		
		for(int i=0;i<output.length;i++) {
			System.out.print(output[i]+" ");
		}
	}
}
