package com.mission.dsain6months.singlylinkedlists;

public class InsertNodeInSortedSinglyLinkedList {
	
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
	
	public void insertNode(int data) {
		ListNode current=head;
		ListNode previous=head;
		while(current.data<data && current!=null) {
			previous=current;
			current=current.next;
		}
		ListNode node=new ListNode(data);
		previous.next=node;
		node.next=current;
	}
	
	public static void main(String[] args) {
		InsertNodeInSortedSinglyLinkedList sll=new InsertNodeInSortedSinglyLinkedList();
		sll.head=new ListNode(10);
		ListNode second=new ListNode(11);
		ListNode third=new ListNode(13);
		ListNode fourth=new ListNode(14);
		sll.head.next=second;
		second.next=third;
		third.next=fourth;
		
		sll.display();
		sll.insertNode(11);
		sll.display();
	}

}
