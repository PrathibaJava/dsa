package com.mission.dsain6months.basicprograms;

public class FibonacciSeries {

	public static void main(String[] args) {

		int[] a= new int[11];
		a[0]=0;
		a[1]=1;
		System.out.print(a[0] + " " + a[1] + " ");
		for(int i=2;i<a.length;i++) {
			a[i]=a[i-1]+a[i-2];
			System.out.print(a[i] + " ");
		}
		System.out.println();
		
		//Without using array
		int n1=0; 
		int n2=1;
		System.out.print(n1+" "+n2+" ");
		int n3=0;
		int count=10;
		for(int i=2;i<=count;i++) {
			n3=n1+n2;
			System.out.print(n3+ " ");
			n1=n2;
			n2=n3;
		}
		
	}

}


