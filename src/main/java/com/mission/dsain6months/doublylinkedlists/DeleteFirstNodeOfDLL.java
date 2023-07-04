package com.mission.dsain6months.doublylinkedlists;

public class DeleteFirstNodeOfDLL {

	private ListNode head;
	private ListNode tail;
	
	public DeleteFirstNodeOfDLL() {
		this.head=null;
		this.tail=null;
	}
	
	private static class ListNode {
		private int data;
		private ListNode previous;
		private ListNode next;
		
		public ListNode(int data) {
			this.data=data;
			this.previous=null;
			this.next=null;
		}
	}
	
	public void deleteFirstNode() {
		if(head==null) {
			return;
		}
		ListNode temp=head;
		if(head==tail) {
			tail=null;
		}else {
			head.next.previous=null;
		}
		head=head.next;
		temp.next=null;
	}
	
	public void display() {
		ListNode temp=head;
		while(temp!=null) {
			System.out.print(temp.data+" --> ");
			temp=temp.next;
		}
		System.out.println("null");
	}
	
	public static void main(String[] args) {
		DeleteFirstNodeOfDLL dll=new DeleteFirstNodeOfDLL();
		dll.head=new ListNode(10);
		ListNode second=new ListNode(11);
		ListNode third=new ListNode(12);
		dll.tail=new ListNode(13);
		
		dll.head.next=second;
		second.next=third;
		second.previous=dll.head;
		third.next=dll.tail;
		third.previous=second;
		dll.tail.previous=dll.head;
		dll.display();
		dll.deleteFirstNode();
		dll.display();
		dll.deleteFirstNode();
		dll.display();
		dll.deleteFirstNode();
		dll.display();
		dll.deleteFirstNode();
		dll.display();
		dll.deleteFirstNode();
		dll.display();
	}
}
