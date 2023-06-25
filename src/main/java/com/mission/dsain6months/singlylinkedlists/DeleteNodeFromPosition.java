package com.mission.dsain6months.singlylinkedlists;

public class DeleteNodeFromPosition {

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
	
	public int length() {
		ListNode current=head;
		int count=0;
		while(current!=null) {
			count++;
			current=current.next;
		}
		return count;
	}
	
	public ListNode deleteFromGivenPosition(int pos) {
		if(pos<=0 || pos>length()) {
			System.out.println("Invalid position");
			return null;
		}
		
		ListNode current=head;
		if(pos==1) {
			head=head.next;
			current.next=null;
			return current;
		}
		
		int count=1;
		while(count<pos-1) {
			current=current.next;
			count++;
		}
		
		ListNode deleteNode=current.next;
		current.next=deleteNode.next;
		deleteNode.next=null;
		return deleteNode;
	}
	
	public static void main(String[] args) {
		DeleteNodeFromPosition sll=new DeleteNodeFromPosition();
		sll.head=new ListNode(10);
		ListNode second=new ListNode(11);
		ListNode third=new ListNode(12);
		ListNode fourth=new ListNode(13);
		sll.head.next=second;
		second.next=third;
		third.next=fourth;
		sll.display();
		
		sll.deleteFromGivenPosition(1);
		sll.display();
		sll.deleteFromGivenPosition(2);
		sll.display();
		sll.deleteFromGivenPosition(2);
		sll.display();
		sll.deleteFromGivenPosition(2);
		sll.display();
		sll.deleteFromGivenPosition(1);
		sll.display();
		sll.deleteFromGivenPosition(1);
		sll.display();
	}

}
