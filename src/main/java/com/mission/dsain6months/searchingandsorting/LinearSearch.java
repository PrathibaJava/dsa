package com.mission.dsain6months.searchingandsorting;

public class LinearSearch {

	public static void main(String[] args) {
		int[] a= {12,1,56,89,32};
		int num=9;
		System.out.println("Number "+num+" is found at "+linearSearch(a,num)+" index");
	}
	
	public static int linearSearch(int[] a, int num) {
		for(int i=0;i<a.length;i++) {
			if(num==a[i])
				return i;
		}
		return -1;
	}
}
