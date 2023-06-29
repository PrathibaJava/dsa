package com.mission.dsain6months.singlylinkedlists;

public class LoopDetectionInSinglyLinkedList {

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
			System.out.print(current.data + " --> ");
			current=current.next;
		}
		System.out.println("null");
	}
	
	public boolean detectLoop() {
		ListNode fastPtr=head;
		ListNode slowPtr=head;
		while(fastPtr!=null && fastPtr.next!=null) {
			slowPtr=slowPtr.next;
			fastPtr=fastPtr.next.next;
			if(slowPtr==fastPtr)
				return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
		LoopDetectionInSinglyLinkedList sll=new LoopDetectionInSinglyLinkedList();
		sll.head=new ListNode(10);
		ListNode second=new ListNode(11);
		ListNode third=new ListNode(12);
		ListNode fourth=new ListNode(13);
		ListNode fifth=new ListNode(14);
		sll.head.next=second;
		second.next=third;
		third.next=fourth;
		fourth.next=fifth;
		fifth.next=second;
		
		//sll.display();
		
		System.out.println(sll.detectLoop());
		
		
	}

}
