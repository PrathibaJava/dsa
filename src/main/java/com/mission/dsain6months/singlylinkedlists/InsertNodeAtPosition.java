package com.mission.dsain6months.singlylinkedlists;

public class InsertNodeAtPosition {

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
		ListNode current = head;
		while (current != null) {
			System.out.print(current.data + " --> ");
			current = current.next;
		}
		System.out.println("null");
	}

	public int length() {
		int count = 0;
		ListNode current = head;
		while (current != null) {
			count++;
			current = current.next;
		}
		return count;
	}

	public void insertAtPosition(int pos, int data) {
		ListNode newNode = new ListNode(data);

		if (pos <= 0 || pos > length() + 1) {
			System.out.println("Invalid position value");
			return;
		}

		if (pos == 1) {
			newNode.next = head;
			head = newNode;
			return;
		}

		ListNode current = head;
		int counter = 1;
		while (counter < pos - 1) {
			counter++;
			current = current.next;
		}

		ListNode temp = current.next;
		current.next = newNode;
		newNode.next = temp;

	}

	public static void main(String[] args) {
		InsertNodeAtPosition sll = new InsertNodeAtPosition();
		sll.display();
		sll.head = new ListNode(10);
		sll.display();
		sll.insertAtPosition(1, 11);
		sll.display();
		sll.insertAtPosition(1, 12);
		sll.display();
		sll.insertAtPosition(2, 13);
		sll.display();
		sll.insertAtPosition(3, 14);
		sll.display();
		sll.insertAtPosition(6, 15);
		sll.display();
	}

}
