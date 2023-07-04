package com.mission.dsain6months.circularlinkedlist;

public class PrintElementsOfCircularLinkedList {

	private ListNode last;
	
	public PrintElementsOfCircularLinkedList() {
		this.last=null;
	}
	
	private static class ListNode {
		private int data;
		private ListNode next;
		
		public ListNode(int data) {
			this.data=data;
			this.next=null;
		}
	}
	
	public void display() {
		ListNode first=last.next;
		while(first!=last) {
			System.out.print(first.data+" ");
			first=first.next;
		}
		System.out.println(first.data);
	}
	
	public static void main(String[] args) {
		PrintElementsOfCircularLinkedList dll=new PrintElementsOfCircularLinkedList();
		ListNode first=new ListNode(10);
		ListNode second=new ListNode(11);
		ListNode third=new ListNode(12);
		ListNode fourth=new ListNode(13);
		first.next=second;
		second.next=third;
		third.next=fourth;
		fourth.next=first;
		dll.last=fourth;
		
		dll.display();
	}
}
