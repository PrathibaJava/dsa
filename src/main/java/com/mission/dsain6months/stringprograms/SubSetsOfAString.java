package com.mission.dsain6months.stringprograms;

public class SubSetsOfAString {

	public static void main(String[] args) {
		String str="hero";
		int n=str.length();
		int num=n*(n+1)/2;
		int temp=0;
		String arr[]=new String[num];
		
		for(int i=0;i<n;i++) {
			for(int j=i;j<n;j++) {
				arr[temp]=str.substring(i, j+1);
				temp++;
			}
		}
		for(int i=0;i<num;i++) {
			System.out.print(arr[i]+" ");
		}
	}
}
