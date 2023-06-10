package com.mission.dsain6months.arrayprograms;

public class MissingNumberInArray {

	public static void main(String[] args) {
		int n=8;
		boolean b[]=new boolean[n];
		for(int i=0;i<n;i++)
			System.out.print(b[i]+" ");
		int[] a= {2,4,1,5,6,3,8};
		for(int i=1;i<=n;i++) {
			for(int j=0;j<a.length;j++) {
				if(i==a[j]) {
					b[i-1]=true;
					break;
				}
			}
		}
		
		for(int i=0;i<n;i++) {
			if(b[i]==false)
				System.out.println("Missing number is: "+ (i+1));
		}
		findMissingNumber(a);
	}
	
	public static void findMissingNumber(int[] a) {
		int n=a.length+1;
		int sum=n*(n+1)/2;
		for(int i:a) {
			sum-=i;
		}
		System.out.println("Missing number is: "+sum);
	}
}
