package com.mission.dsain6months.singlylinkedlists;

public class SinglyLinkedList {

	private ListNode head;

	private static class ListNode {

		private int data;
		private ListNode next;

		public ListNode(int data) {
			this.data = data;
			this.next = null;
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
	
	public void display(ListNode head) {
		ListNode current=head;
		while(current!=null) {
			System.out.print(current.data+" --> ");
			current=current.next;
		}
		System.out.println("null");
	}
	
	public int length() {
		if(head==null) {
			return 0;
		}
		int count=0;
		ListNode current=head;
		while(current!=null) {
			count++;
			current=current.next;
		}
		return count;
	}
	
	public void insertFirst(int value) {
		ListNode newNode=new ListNode(value);
		newNode.next=head;
		head=newNode;
	}
	
	public void insertLast(int value) {
		ListNode newNode=new ListNode(value);
		if(head==null) {
			head=newNode;
			return;
		}
		
		ListNode current=head;
		while(current.next!=null) {
			current=current.next;
		}
		current.next=newNode;
	}
	
	public void insertAtPosition(int value, int position) {
		if(position<0 && position>length()) {
			System.out.println("Invalid position");
		}
		
		ListNode newNode=new ListNode(value);
		if(position == 1) {
			newNode.next=head;
			head=newNode;
		}else {
			ListNode previous=head;
			int count=1;
			while(count<position-1) {
				count++;
				previous=previous.next;
			}
			ListNode current=previous.next;
			previous.next=newNode;
			newNode.next=current;
		}
	}
	
	public ListNode deleteFirstNode() {
		if(head==null) {
			return null;
		}
		ListNode current=head;
		head=head.next;
		current.next=null;
		return current;
	}
	
	public ListNode deleteLastNode() {
		if(head==null||head.next==null)
			return head;
		ListNode previous=null;
		ListNode current=head;
		while(current.next!=null) {
			previous=current;
			current=current.next;
		}
		previous.next=null;
		return current;
	}
	
	public ListNode deleteNodeAtPosition(int position) {
		ListNode previous=head;
		if(position==1) {
			head=head.next;
			return previous;
		}else {
			int count=1;
			while(count<position-1) {
				count++;
				previous=previous.next;	
			}
			ListNode current=previous.next;
			previous.next=current.next;
			return current;
		}
	}
	
	public boolean searchNode(int data) {
		if(head==null) {
			return false;
		}
		
		ListNode current=head;
		while(current!=null) {
			if(current.data==data) {
				return true;
			}
			current=current.next;
		}
		return false;
	}
	
	public ListNode reverseSinglyLinkedList() {
		ListNode current=head;
		ListNode previous=null;
		ListNode next=null;
		while(current!=null) {
			next=current.next;
			current.next=previous;
			previous=current;
			current=next;
		}
		return previous;
	}
	
	public ListNode middleNode() {
		if(head==null) {
			return head;
		}
		
		ListNode slowPtr=head;
		ListNode fastPtr=head;
		while(fastPtr!=null && fastPtr.next!=null) {
			slowPtr=slowPtr.next;
			fastPtr=fastPtr.next.next;
		}
		return slowPtr;
	}
	
	public ListNode nthNodeFromEnd(int pos) {
		if(head==null) {
			return head;
		}
		
		if(pos<=0) {
			throw new IllegalArgumentException("Invalid position value: "+pos);
		}
		ListNode refNode=head;
		ListNode mainNode=head;
		int count=0;
		while(count<pos) {
			if(refNode==null) {
				throw new IllegalArgumentException("Position is greater than the length of list");
			}
			count++;
			refNode=refNode.next;
		}
		
		while(refNode!=null) {
			mainNode=mainNode.next;
			refNode=refNode.next;
		}
		return mainNode;
	}
	
	public void removeDuplicates() {
		if(head==null) {
			return;
		}
		ListNode current=head;
		while(current.next!=null) {
			if(current.data==current.next.data) {
				current.next=current.next.next;
			}else {
				current=current.next;
			}
		}
	}
	
	public void insertNodeInSortedLinkedList(ListNode node) {
		if(head==null) {
			return;
		}
		ListNode current=head;
		ListNode temp=null;
		while(current!=null && current.data<node.data) {
			temp=current;
			current=current.next;
		}
		temp.next=node;
		node.next=current;
	}
	
	public static void main(String[] args) {
		SinglyLinkedList sll=new SinglyLinkedList();
		sll.head=new ListNode(10);
		ListNode second=new ListNode(1);
		ListNode third=new ListNode(8);
		ListNode fourth=new ListNode(11);
		
		sll.head.next=second;
		second.next=third;
		third.next=fourth;
		
		sll.display();
		System.out.println("The length of the singly linked list is: "+sll.length());
		sll.insertFirst(11);
		sll.insertFirst(8);
		sll.insertFirst(1);
		sll.display();
		
		sll.insertLast(11);
		sll.insertLast(8);
		sll.insertLast(1);
		
		sll.display();
		
		sll.insertAtPosition(3, 1);
		sll.insertAtPosition(5, 2);
		sll.insertAtPosition(2, 1);
		sll.display();
		
		System.out.println(sll.deleteFirstNode().data);
		sll.display();
		
		System.out.println(sll.deleteLastNode().data);
		sll.display();
		
		System.out.println(sll.deleteLastNode().data);
		sll.display();
		
		System.out.println(sll.deleteNodeAtPosition(1).data);
		sll.display();
		
		System.out.println(sll.deleteNodeAtPosition(3).data);
		sll.display();
		
		System.out.println(sll.searchNode(10));
		System.out.println(sll.searchNode(12));
		
		/*
		 * ListNode reversed=sll.reverseSinglyLinkedList(); sll.display(reversed);
		 */
		
		sll.display();
		System.out.println(sll.middleNode().data);
		sll.insertFirst(24);
		sll.display();
		System.out.println(sll.middleNode().data);
		System.out.println(sll.nthNodeFromEnd(4).data);
		
		sll.deleteFirstNode();
		sll.deleteFirstNode();
		sll.deleteNodeAtPosition(2);
		sll.deleteNodeAtPosition(2);
		
		sll.display();
		
		sll.removeDuplicates();
		sll.display();
		
		sll.insertNodeInSortedLinkedList(new ListNode(10));
		sll.display();
	}
}
