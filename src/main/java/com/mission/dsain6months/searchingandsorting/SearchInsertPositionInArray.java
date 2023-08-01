package com.mission.dsain6months.searchingandsorting;

public class SearchInsertPositionInArray {

	public static int searchInsertPosition(int[] x, int target) {
		int low = 0;
		int high = x.length - 1;
		while (low <= high) {
			int mid=low+(high-low)/2;
			if(x[mid]==target) {
				return mid;
			}
			if(target<x[mid]) {
				high=mid-1;
			}else {
				low=mid+1;
			}
		}
		return low;
	}

	public static void main(String[] args) {
		int[] x = { 1, 10, 20, 47, 59, 65, 75, 88, 99};
		System.out.println(searchInsertPosition(x, 100));

	}
}
