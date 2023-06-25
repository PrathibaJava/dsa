package com.mission.dsain6months.singlylinkedlists;

public class LengthOfSinglyLinkedList {

	private ListNode head;
	
	private static class ListNode {
		private int data;
		private ListNode next;
		
		public ListNode(int data) {
			this.data=data;
			this.next=null;
		}
	}
	
	public int length() {
		if(head==null) {
			return 0;
		}
		
		ListNode current=head;
		int count=0;
		while(current!=null) {
			System.out.print(current.data+" --> ");
			count++;
			current=current.next;
		}
		System.out.println("null");
		return count;
	}
	
	public static void main(String[] args) {
		LengthOfSinglyLinkedList sll=new LengthOfSinglyLinkedList();
		sll.head=new ListNode(10);
		ListNode second=new ListNode(11);
		ListNode third=new ListNode(12);
		ListNode fourth=new ListNode(13);
		sll.head.next=second;
		second.next=third;
		third.next=fourth;
		
		System.out.println(sll.length());
	}
}
