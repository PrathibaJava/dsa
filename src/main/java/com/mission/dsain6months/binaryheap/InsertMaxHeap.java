package com.mission.dsain6months.binaryheap;

public class InsertMaxHeap {

	Integer[] heap;
	int n;

	public InsertMaxHeap(int capacity) {
		heap = new Integer[capacity + 1];
		n = 0;
	}

	public boolean isEmpty() {
		return n == 0;
	}

	public int size() {
		return n;
	}

	public void resize(int capacity) {
		Integer[] temp = new Integer[capacity];
		for (int i = 0; i < heap.length; i++) {
			temp[i] = heap[i];
		}
		heap = temp;
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
		InsertMaxHeap mh = new InsertMaxHeap(3);
		System.out.println(mh.size());
		System.out.println(mh.isEmpty());
		mh.insert(10);
		mh.insert(1);
		mh.insert(8);
		mh.insert(18);
		mh.insert(16);
		mh.insert(4);
		mh.insert(13);
		mh.insert(15);
		mh.insert(100);
		mh.insert(101);
		mh.printArray();
		System.out.println();
		System.out.println(mh.size());
	}
}
