package com.mission.dsain6months.singlylinkedlists;

public class InsertNodeAtBeginning {

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
	
	public void insertAtBeginning(int data) {
		ListNode newNode=new ListNode(data);
		newNode.next=head;
		head=newNode;
	}
	
	public static void main(String[] args) {
		InsertNodeAtBeginning sll=new InsertNodeAtBeginning();
		sll.head=new ListNode(10);
		ListNode second=new ListNode(11);
		ListNode third=new ListNode(12);
		ListNode fourth=new ListNode(13);
		sll.head.next=second;
		second.next=third;
		third.next=fourth;
		
		sll.display();
		sll.insertAtBeginning(14);
		sll.display();
	}

}
