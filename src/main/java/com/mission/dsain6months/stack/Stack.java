package com.mission.dsain6months.stack;

public class Stack {

	private ListNode top;
	private int length;
	
	private static class ListNode {
		private int data;
		private ListNode next;
		
		public ListNode(int data) {
			this.data=data;
			this.next=null;
		}
	}
	
	public Stack() {
		this.top=null;
		this.length=0;
	}
	
	public int length() {
		return length;
	}
	
	public boolean isEmpty() {
		return length==0;
	}
	
	public void push(int data) {
		ListNode temp=new ListNode(data);
		temp.next=top;
		top=temp;
		length++;
	}
	
	public int pop() {
		if(isEmpty()) {
			System.out.println("Stack is empty");
		}
		int result=top.data;
		top=top.next;
		length--;
		return result;
	}
	
	public int peek() {
		if(isEmpty()) {
			System.out.println("Stack is empty");
		}
		return top.data;
	}
	
	public static void main(String[] args) {
		Stack s=new Stack();
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
