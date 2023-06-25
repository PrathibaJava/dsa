package com.mission.dsain6months.singlylinkedlists;

public class PrintElementsOfSinglyLinkedList {

	private ListNode head;
	
	private static class ListNode{
		private int data;
		private ListNode next;
		
		public ListNode(int data) {
			this.data=data;
			this.next=null;
		}
	}
	
	public void printElements() {
		ListNode current=head;
		while(current!=null) {
			System.out.print(current.data+" --> ");
			current=current.next;
		}
		System.out.println("null");
	}
	
	public static void main(String[] args) {
		PrintElementsOfSinglyLinkedList sll=new PrintElementsOfSinglyLinkedList();
		sll.head=new ListNode(10);
		ListNode second=new ListNode(12);
		ListNode third=new ListNode(13);
		ListNode fourth=new ListNode(15);
		sll.head.next=second;
		second.next=third;
		third.next=fourth;
		
		sll.printElements();
	}

}
