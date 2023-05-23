package com.mission.dsain6months.arrayprograms;

public class RemoveDuplicates {

	public static void main(String[] args) {
		
		int[] a =  {10,20,20,30,30,40,50,50};
		
		int[] temp = new int[a.length];
		int j=0;
		for(int i=0;i<a.length-1;i++) {
			if (a[i] != a[i+1]) {
				temp[j++]=a[i];
			}
		}
		temp[j++] = a[a.length-1];
		
		for(int i=0;i<j;i++) {
			System.out.print(temp[i]+" ");
		}
		System.out.println();
		removeDuplicates(a);
			
	}
	
	public static void removeDuplicates(int[] a) {
		int j=0;
		for(int i=0;i<a.length-1;i++) {
			if(a[i]!=a[i+1]) {
				a[j++]=a[i];
			}
		}
		a[j++]=a[a.length-1];
		
		for(int i=0;i<j;i++) {
			System.out.print(a[i]+" ");
		}
	}

}
