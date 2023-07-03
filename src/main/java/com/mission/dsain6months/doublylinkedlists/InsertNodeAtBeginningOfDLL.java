package com.mission.dsain6months.doublylinkedlists;

public class InsertNodeAtBeginningOfDLL {

	private ListNode head;
	private ListNode tail;
	private int length;
	
	public InsertNodeAtBeginningOfDLL() {
		this.head=null;
		this.tail=null;
		this.length=0;
	}
	
	private static class ListNode {
		private int data;
		private ListNode next;
		private ListNode previous;
		
		public ListNode(int data) {
			this.data=data;
		}
	}
	
	public boolean isEmpty() {
		return length==0;
	}
	
	public void insertNodeAtBeginning(int data) {
		ListNode node=new ListNode(data);
		if(isEmpty()) {
			tail=node;
		}else {
			head.previous=node;
		}
		node.next=head;
		head=node;
		length++;
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
			System.out.print(temp.data+" <-- ");
			temp=temp.previous;
		}
		System.out.println("null");
	}
	
	public static void main(String[] args) {
		InsertNodeAtBeginningOfDLL dll=new InsertNodeAtBeginningOfDLL();
		dll.insertNodeAtBeginning(10);
		dll.insertNodeAtBeginning(11);
		dll.insertNodeAtBeginning(12);
		dll.displayForward();
		dll.displayBackward();
	}

}
