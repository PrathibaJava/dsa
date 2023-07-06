package com.mission.dsain6months.Queue;

public class QueueImplementation {

	private ListNode front;
	private ListNode rear;
	private int length;
	
	private static class ListNode {
		private int data;
		private ListNode next;
		
		public ListNode(int data) {
			this.data=data;
			this.next=null;
		}
	}
	
	public QueueImplementation() {
		this.front=null;
		this.rear=null;
		this.length=0;
	}
	
	public int length() {
		return length;
	}
	
	public boolean isEmpty() {
		return length==0;
	}
	
	public void enqueue(int data) {
		ListNode node=new ListNode(data);
		if(isEmpty()) {
			front=node;
		}else {
			rear.next=node;
		}
		rear=node;
		length++;
	}
	
	public int dequeue() {
		if(isEmpty()) {
			System.out.println("Queue is empty");
		}
		int result=front.data;
		front=front.next;
		if(front==null) {
			rear=null;
		}
		length--;
		return result;
	}
	
	public int first() {
		if(isEmpty()) {
			System.out.println("Queue is empty");
		}
		return front.data;
	}
	
	public int last() {
		if(isEmpty()) {
			System.out.println("Queue is empty");
		}
		return rear.data;
	}
	
	public void display() {
		if(isEmpty()) {
			System.out.println("Queue is empty");
		}
		ListNode current=front;
		while(current!=null) {
			System.out.print(current.data+" --> ");
			current=current.next;
		}
		System.out.println("null");
	}
	
	public static void main(String[] args) {
		QueueImplementation q=new QueueImplementation();
		q.enqueue(10);
		q.enqueue(20);
		q.enqueue(30);
		System.out.println(q.first());
		System.out.println(q.last());
		q.display();
		q.dequeue();
		q.display();
		q.dequeue();
		q.display();
		q.dequeue();
		q.display();
	}

}
