package com.mission.dsain6months.circularlinkedlist;

public class InsertNodeAtStartOfLinkedList {

	private ListNode last;
	
	public InsertNodeAtStartOfLinkedList() {
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
		if(last==null) {
			System.out.println("null");;
			return;
		}
		
		if(last.next==null) {
			System.out.println(last.data);
			return;
		}
		
		ListNode first=last.next;
		while(first!=last) {
			System.out.print(first.data+" ");
			first=first.next;
		}
		System.out.println(first.data);
	}
	
	public void insertNodeAtStart(int data) {
		ListNode node=new ListNode(data);
		if(last==null) {
			last=node;
		}else {
			node.next=last.next;
		}
		last.next=node;
	}	
	
	public static void main(String[] args) {
		InsertNodeAtStartOfLinkedList sll=new InsertNodeAtStartOfLinkedList();
		sll.display();
		sll.insertNodeAtStart(9);
		sll.display();
		sll.insertNodeAtStart(8);
		sll.display();
		sll.insertNodeAtStart(7);
		sll.display();
	}

}
