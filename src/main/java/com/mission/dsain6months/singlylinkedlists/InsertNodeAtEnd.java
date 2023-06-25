package com.mission.dsain6months.singlylinkedlists;

public class InsertNodeAtEnd {

	private ListNode head;

	private static class ListNode {
		private int data;
		private ListNode next;

		public ListNode(int data) {
			this.data = data;
			this.next = null;
		}
	}

	public void insertAtEnd(int data) {
		ListNode newNode = new ListNode(data);
		if (head == null) {
			head = newNode;
			return;
		} 
			
		ListNode current = head;

		while (current.next != null) {
			current = current.next;
		}
		current.next = newNode;
		
	}

	public void display() {
		ListNode current = head;
		while (current != null) {
			System.out.print(current.data + " --> ");
			current = current.next;
		}
		System.out.println("null");
	}

	public static void main(String[] args) {
		InsertNodeAtEnd sll = new InsertNodeAtEnd();

		sll.display();
		sll.insertAtEnd(10);
		sll.display();
		sll.insertAtEnd(11);
		sll.display();
		sll.insertAtEnd(12);
		sll.insertAtEnd(13);
		sll.insertAtEnd(14);
		sll.display();
	}

}
