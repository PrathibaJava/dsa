package com.mission.dsain6months.doublylinkedlists;

public class ImplementDoublyLinkedLists {

	private ListNode head;
	private ListNode tail;
	private int length;
	
	private static class ListNode {
		private int data;
		private ListNode next;
		private ListNode previous;
		
		public ListNode(int data) {
			this.data=data;
		}
	}
	
	public ImplementDoublyLinkedLists() {
		this.head=null;
		this.tail=null;
		this.length=0;
	}
	
	public boolean isEmpty() {
		return length==0;
	}
	
	public int length() {
		return length;
	}

}
