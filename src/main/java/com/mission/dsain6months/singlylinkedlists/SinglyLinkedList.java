package com.mission.dsain6months.singlylinkedlists;

public class SinglyLinkedList {

	private ListNode head;

	private static class ListNode {

		private int data;
		private ListNode next;

		public ListNode(int data) {
			this.data = data;
			this.next = null;
		}
	}
	
	public void display() {
		ListNode current=head;
		while(current!=null) {
			System.out.print(current.data+" --> ");
			current=current.next;
		}
		System.out.println("null");
	}
	
	public int length() {
		if(head==null) {
			return 0;
		}
		int count=0;
		ListNode current=head;
		while(current!=null) {
			count++;
			current=current.next;
		}
		return count;
	}
	
	public void insertFirst(int value) {
		ListNode newNode=new ListNode(value);
		newNode.next=head;
		head=newNode;
	}
	
	public void insertLast(int value) {
		ListNode newNode=new ListNode(value);
		if(head==null) {
			head=newNode;
			return;
		}
		
		ListNode current=head;
		while(current.next!=null) {
			current=current.next;
		}
		current.next=newNode;
	}
	
	public void insertAtPosition(int value, int position) {
		if(position<0 && position>length()) {
			System.out.println("Invalid position");
		}
		
		ListNode newNode=new ListNode(value);
		if(position == 1) {
			newNode.next=head;
			head=newNode;
		}else {
			ListNode previous=head;
			int count=1;
			while(count<position-1) {
				count++;
				previous=previous.next;
			}
			ListNode current=previous.next;
			previous.next=newNode;
			newNode.next=current;
		}
	}
	
	public ListNode deleteFirstNode() {
		if(head==null) {
			return null;
		}
		ListNode current=head;
		head=head.next;
		current.next=null;
		return current;
	}
	
	public static void main(String[] args) {
		SinglyLinkedList sll=new SinglyLinkedList();
		sll.head=new ListNode(10);
		ListNode second=new ListNode(1);
		ListNode third=new ListNode(8);
		ListNode fourth=new ListNode(11);
		
		sll.head.next=second;
		second.next=third;
		third.next=fourth;
		
		sll.display();
		System.out.println("The length of the singly linked list is: "+sll.length());
		sll.insertFirst(11);
		sll.insertFirst(8);
		sll.insertFirst(1);
		sll.display();
		
		sll.insertLast(11);
		sll.insertLast(8);
		sll.insertLast(1);
		
		sll.display();
		
		sll.insertAtPosition(3, 1);
		sll.insertAtPosition(5, 2);
		sll.insertAtPosition(2, 1);
		sll.display();
		
		System.out.println(sll.deleteFirstNode().data);
		sll.display();
	}
}
