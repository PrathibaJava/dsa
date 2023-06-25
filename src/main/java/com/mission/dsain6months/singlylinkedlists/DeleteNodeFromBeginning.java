package com.mission.dsain6months.singlylinkedlists;

public class DeleteNodeFromBeginning {

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
		ListNode current = head;

		while (current != null) {
			System.out.print(current.data + " --> ");
			current = current.next;
		}

		System.out.println("null");
	}

	public ListNode deleteFirstNode() {
		if(head==null) {
			return head;
		}
		
		ListNode current=head;
		head=head.next;
		current.next=null;
		return current;
	}
	
	public static void main(String[] args) {
		DeleteNodeFromBeginning sll=new DeleteNodeFromBeginning();
		sll.head=new ListNode(10);
		ListNode second=new ListNode(11);
		ListNode third=new ListNode(12);
		ListNode fourth=new ListNode(13);
		sll.head.next=second;
		second.next=third;
		third.next=fourth;
		
		sll.display();
		sll.deleteFirstNode();
		sll.display();
		sll.deleteFirstNode();
		sll.display();
		sll.deleteFirstNode();
		sll.display();
		sll.deleteFirstNode();
		sll.display();
		sll.deleteFirstNode();
		sll.display();
	}
}
