package com.mission.dsain6months.circularlinkedlist;

public class ImplementCircularLinkedList {

	private ListNode last;
	
	public ImplementCircularLinkedList() {
		this.last=null;
	}
	
	private static class ListNode {
		private int data;
		private ListNode next;
		
		public ListNode(int data) {
			this.data=data;
			this.next=null;
		}
	}
	
	public void createCircularLinkedList() {
		ListNode first=new ListNode(10);
		ListNode second=new ListNode(11);
		ListNode third=new ListNode(12);
		ListNode fourth=new ListNode(13);
		
		first.next=second;
		second.next=third;
		third.next=fourth;
		fourth.next=first;
		last=fourth;
	}
	
	public static void main(String[] args) {
		ImplementCircularLinkedList dll=new ImplementCircularLinkedList();
		dll.createCircularLinkedList();
	}
}
