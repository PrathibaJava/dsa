package com.mission.dsain6months.doublylinkedlists;

public class PrintElementsInDoublyLinkedLists {

	private ListNode head;
	private ListNode tail;
	
	private static class ListNode {
		private int data;
		private ListNode next;
		private ListNode previous;
		
		public ListNode(int data) {
			this.data=data;
			this.next=null;
			this.previous=null;
		}
	}
	
	public PrintElementsInDoublyLinkedLists() {
		this.head=null;
		this.tail=null;
	}
	
	public void forwardDisplay() {
		if(head==null) {
			return;
		}
		
		ListNode temp=head;
		while(temp!=null) {
			System.out.print(temp.data+" --> ");
			temp=temp.next;
		}
		System.out.println("null");
	}
	
	public void backwardDisplay() {
		if(tail==null) {
			return;
		}
		
		ListNode temp=tail;
		while(temp!=null) {
			System.out.print(temp.data+" <-- ");
			temp=temp.previous;
		}
		System.out.println("null");
	}
	
	public static void main(String[] args) {
		PrintElementsInDoublyLinkedLists dll=new PrintElementsInDoublyLinkedLists();
		dll.head=new ListNode(10);
		ListNode second=new ListNode(11);
		ListNode third=new ListNode(12);
		ListNode fourth=new ListNode(13);
		dll.tail=new ListNode(14);
		
		dll.head.next=second;
		
		second.next=third;
		second.previous=dll.head;
		
		third.next=fourth;
		third.previous=second;
		
		fourth.next=dll.tail;
		fourth.previous=third;
		
		dll.tail.previous=fourth;
		
		dll.forwardDisplay();
		dll.backwardDisplay();
	}
}
