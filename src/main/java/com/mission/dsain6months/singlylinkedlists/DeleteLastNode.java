package com.mission.dsain6months.singlylinkedlists;

public class DeleteLastNode {

	ListNode head;
	
	private static class ListNode {
		private int data;
		private ListNode next;
		
		public ListNode(int data) {
			this.data=data;
			this.next=null;
		}
	}
	
	public ListNode deleteLastNode() {
		if(head==null) {
			return head;
		}
		
		ListNode current=head;
		ListNode previous=head;
		while(current.next!=null) {
			previous=current;
			current=current.next;
		}
		
		previous.next=null;
		return current;
		
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

		DeleteLastNode sll=new DeleteLastNode();
		sll.head=new ListNode(10);
		ListNode second=new ListNode(11);
		ListNode third=new ListNode(12);
		ListNode fourth=new ListNode(13);
		sll.head.next=second;
		second.next=third;
		third.next=fourth;
		
		sll.display();
		sll.deleteLastNode();
		sll.display();
		sll.deleteLastNode();
		sll.display();
		sll.deleteLastNode();
		sll.display();
	}

}
