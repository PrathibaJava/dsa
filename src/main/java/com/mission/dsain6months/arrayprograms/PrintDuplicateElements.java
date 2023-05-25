package com.mission.dsain6months.arrayprograms;

public class PrintDuplicateElements {

	public static void main(String[] args) {
		int[] a={1, 2, 3, 4, 2, 2, 7, 8, 2, 8, 3, 2};
		
		for(int i=0;i<a.length;i++) {
			int count=1;
			for(int j=i+1;j<a.length;j++) {
				if(a[i]==a[j]) {
					count++;
				}
			}
			if(count==2) {
				System.out.println(a[i]+" is a duplicate element");
			}
		}
	}
}
