package com.mission.dsain6months.singlylinkedlists;

public class CreationOfSinglyLinkedList {
	
	private ListNode head;
	
	private static class ListNode {
		private int data;
		private ListNode next;
		
		public ListNode(int data) {
			this.data=data;
			this.next=null;
		}
	}
	
	public static void main(String[] args) {
		
		CreationOfSinglyLinkedList sll=new CreationOfSinglyLinkedList();
		sll.head=new ListNode(10);
		ListNode second=new ListNode(15);
		ListNode third=new ListNode(20);
		ListNode fourth=new ListNode(30);
		sll.head.next=second;
		second.next=third;
		third.next=fourth;	
		
	}

}
