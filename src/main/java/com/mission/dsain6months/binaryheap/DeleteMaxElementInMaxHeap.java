package com.mission.dsain6months.binaryheap;

public class DeleteMaxElementInMaxHeap {

	Integer[] heap;
	int n;

	public DeleteMaxElementInMaxHeap(int capacity) {
		heap = new Integer[capacity + 1];
		n = 0;
	}

	public int size() {
		return n;
	}

	public void resize(int capacity) {
		Integer[] temp = new Integer[capacity];
		for (int i = 0; i <= n; i++) {
			temp[i] = heap[i];
		}
		heap = temp;
	}

	public int deleteMax() {
		int max = heap[1];
		swap(1, n);
		n--;
		sink(1);
		heap[n+1]=null;
		if(n>0 && n==(heap.length-1)/4) {
			resize(heap.length/2);
		}
		return max;
	}

	public void sink(int k) {
		while(2*k <= n) {
			int j=2*k;
			if (j < n && heap[j] < heap[j+1]) {
				j++;
			}
			if(heap[k] >= heap[j]) {
				break;
			}
			swap(k, j);
			k=j;
		}
	}

	public void swap(int a, int b) {
		int temp = heap[a];
		heap[a] = heap[b];
		heap[b] = temp;
	}
	
	public void insert(int x) {
		if (n == heap.length-1) {
			resize(2*heap.length);
		}
		n++;
		heap[n] = x;
		swim(n);
	}

	public void swim(int n) {
		while (n > 1 && heap[n / 2] < heap[n]) {
			int temp = heap[n];
			heap[n] = heap[n / 2];
			heap[n / 2] = temp;
			n = n / 2;
		}
	}
	
	public void printArray() {
		for (int i = 1; i <= n; i++) {
			System.out.print(heap[i] + " ");
		}
	}

	public static void main(String[] args) {
		DeleteMaxElementInMaxHeap mh=new DeleteMaxElementInMaxHeap(10);
		mh.insert(10);
		mh.insert(1);
		mh.insert(8);
		mh.insert(18);
		mh.insert(16);
		mh.insert(15);
		mh.printArray();
		System.out.println();
		System.out.println(mh.size());
		mh.deleteMax();
		mh.printArray();
		System.out.println();
		mh.deleteMax();
		mh.printArray();
		System.out.println();
		mh.deleteMax();
		mh.printArray();
		System.out.println();
		mh.deleteMax();
		mh.printArray();
		System.out.println();
		System.out.println(mh.size());
	//	System.out.println(mh.heap.length); => Need to check this
	}

}
