package com.mission.dsain6months.stack;

public class StackImplementationUsingArray {

	public int top;
	public int[] arr;
	
	public StackImplementationUsingArray(int capacity) {
		top=-1;
		arr=new int[capacity];
	}
	
	public StackImplementationUsingArray() {
		this(10);
	}
	
	public boolean isEmpty() {
		return top<0;
	}
	
	public int size() {
		return top+1;
	}
	
	public boolean isFull() {
		return arr.length==size();
	}
	
	public void push(int data) {
		if(isFull()) {
			System.out.println("Stack already full");
		}
		top++;
		arr[top]=data;
	}
	
	public int pop() {
		if(isEmpty()) {
			System.out.println("Stack already empty");
		}
		int result=arr[top];
		top--;
		return result;
	}
	
	public int peek() {
		if(isEmpty()) {
			System.out.println("Stack already empty");
		}
		return arr[top];
	}
	
	public static void main(String[] args) {
		StackImplementationUsingArray s=new StackImplementationUsingArray();
		s.push(10);
		s.push(15);
		s.push(20);
		
		System.out.println(s.peek());
		s.pop();
		System.out.println(s.peek());
		s.pop();
		System.out.println(s.peek());
		s.pop();
		
	}

}
