package com.mission.dsain6months.doublylinkedlists;

public class DeleteLastNodeOfDLL {

	private ListNode head;
	private ListNode tail;
	
	public DeleteLastNodeOfDLL() {
		this.head=null;
		this.tail=null;
	}
	
	private static class ListNode {
		private int data;
		private ListNode next;
		private ListNode previous;
		
		public ListNode(int data) {
			this.data=data;
			this.previous=null;
			this.next=null;
		}
	}
	
	public void deleteLastNode() {
		if(head==null) {
			return;
		}
		ListNode temp=tail;
		if(head==tail) {
			head=null;
		}else {
			tail.previous.next=null;
		}
		tail=tail.previous;
		temp.previous=null;
	}
	
	public void displayForward() {
		ListNode temp=head;
		while(temp!=null) {
			System.out.print(temp.data+" --> ");
			temp=temp.next;
		}
		System.out.println("null");
	}
	
	public void displayBackward() {
		ListNode temp=tail;
		while(temp!=null) {
			System.out.print(temp.data+" --> ");
			temp=temp.previous;
		}
		System.out.println("null");
	}
	
	public static void main(String[] args) {
		DeleteLastNodeOfDLL dll=new DeleteLastNodeOfDLL();
		dll.head=new ListNode(10);
		ListNode second=new ListNode(11);
		ListNode third=new ListNode(12);
		dll.tail=new ListNode(13);
		
		dll.head.next=second;
		second.next=third;
		second.previous=dll.head;
		third.next=dll.tail;
		third.previous=second;
		dll.tail.previous=third;
		
		dll.displayForward();
		dll.displayBackward();
		dll.deleteLastNode();
		dll.displayForward();
		dll.displayBackward();
		dll.deleteLastNode();
		dll.displayForward();
		dll.displayBackward();
		dll.deleteLastNode();
		dll.displayForward();
		dll.displayBackward();
		dll.deleteLastNode();
		dll.displayForward();
		dll.displayBackward();
		dll.deleteLastNode();
		dll.displayForward();
		dll.displayBackward();
	}

}
