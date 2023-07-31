package com.mission.dsain6months.binaryheap;

public class ImplementationOfBinaryHeap {
	
	Integer[] m;
	int n;
	
	public ImplementationOfBinaryHeap(int capacity) {
		m=new Integer[capacity+1];
		n=0;
	}
	
	public boolean isEmpty() {
		return n==0;
	}
	
	public int size() {
		return n;
	}
	
	public static void main(String[] args) {
		ImplementationOfBinaryHeap bh=new ImplementationOfBinaryHeap(3);
		System.out.println(bh.isEmpty());
		System.out.println(bh.size());
	}
}
