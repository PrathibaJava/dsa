package com.mission.dsain6months.singlylinkedlists;

public class SearchElementInSinglyLinkedList {

	private ListNode head;
	
	private static class ListNode {
		private int data;
		private ListNode next;
		
		public ListNode(int data) {
			this.data=data;
			this.next=null;
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
	
	public boolean search(int data) {
		if(head==null) {
			return false;
		}
		
		ListNode current=head;
		while(current!=null) {
			if(current.data==data) {
				return true;
			}
			current=current.next;
		}
		return false;
	}
	
	public static void main(String[] args) {

		SearchElementInSinglyLinkedList sll=new SearchElementInSinglyLinkedList();
		sll.head=new ListNode(10);
		ListNode second=new ListNode(11);
		ListNode third=new ListNode(12);
		ListNode fourth=new ListNode(13);
		sll.head.next=second;
		second.next=third;
		third.next=fourth;
		
		sll.display();
		System.out.println(sll.search(10));
		System.out.println(sll.search(11));
		System.out.println(sll.search(12));
		System.out.println(sll.search(13));
		System.out.println(sll.search(1));
	}

}
