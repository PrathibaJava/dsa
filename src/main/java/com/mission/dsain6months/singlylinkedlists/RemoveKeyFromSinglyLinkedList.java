package com.mission.dsain6months.singlylinkedlists;

public class RemoveKeyFromSinglyLinkedList {

	private ListNode head;
	
	private static class ListNode {
		private int data;
		private ListNode next;
		
		public ListNode(int data) {
			this.data=data;
			this.next=null;
		}
	}
	
	public void removeKey(int data) {
		if(head != null && head.data==data) {
			head=head.next;
			return;
		}
		ListNode current=head;
		ListNode previous=null;
		while(current!=null) {
			if(current.data==data) {
				previous.next=current.next;
				return;
			}
			previous=current;
			current=current.next;
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
	
	public static void main(String[] args) {
		RemoveKeyFromSinglyLinkedList sll=new RemoveKeyFromSinglyLinkedList();
		sll.head=new ListNode(10);
		ListNode second=new ListNode(11);
		ListNode third=new ListNode(12);
		ListNode fourth=new ListNode(13);
		sll.head.next=second;
		second.next=third;
		third.next=fourth;
		
		sll.display();
		sll.removeKey(13);
		sll.display();
	}

}
