package com.mission.dsain6months.circularlinkedlist;

public class InsertNodeAtEndOfCircularLinkedList {

	private ListNode last;
	
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
	
	public void insertLast(int data) {
		ListNode node=new ListNode(data);
		if(last==null) {
			last=node;
			last.next=node;
		}else {
			node.next=last.next;
			last.next=node;
			last=node;
		}
	}
	
	public static void main(String[] args) {
		InsertNodeAtEndOfCircularLinkedList cll=new InsertNodeAtEndOfCircularLinkedList();
		cll.insertLast(10);
		cll.display();
		cll.insertLast(11);
		cll.display();
		cll.insertLast(12);
		cll.display();
	}

}
