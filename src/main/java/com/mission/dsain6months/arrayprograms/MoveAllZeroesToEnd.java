package com.mission.dsain6months.arrayprograms;

public class MoveAllZeroesToEnd {

	public static void main(String[] args) {
		int[] a= {0,1,0,0,0,4,12,0,0,1,5};
		int[] result=new int[a.length];
		int idx=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]!=0) {
				result[idx]=a[i];
				idx++;
			}
		}
		
		for(int i=0;i<a.length;i++) {
			System.out.print(result[i]+" ");
		}
		System.out.println();
		moveZeroes(a);
	}
	
	public static void moveZeroes(int[] a) {
		int j=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]!=0 && a[j]==0) {
				a[j]=a[i];
				a[i]=0;
			}
			if(a[j]!=0) {
				j++;
			}
		}
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
	}
}
