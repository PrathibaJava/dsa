package com.mission.dsain6months.singlylinkedlists;

public class RemoveDuplicatesFromSortedList {

	private ListNode head;
	
	private static class ListNode {
		private int data;
		private ListNode next;
		
		public ListNode(int data) {
			this.data=data;
			this.next=null;
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
	
	public void removeDuplicates() {
		ListNode current=head;
	//	ListNode next=head;
		while(current.next!=null) {
			if(current.data==current.next.data) {
				//next=current.next;
				//current.next=next.next;
				//next.next=null;
				current.next=current.next.next;
			}else {
				current=current.next;
			}
		}
	}
	
	public static void main(String[] args) {
		RemoveDuplicatesFromSortedList sll=new RemoveDuplicatesFromSortedList();
		sll.head=new ListNode(11);
		ListNode second=new ListNode(11);
		ListNode third=new ListNode(13);
		ListNode fourth=new ListNode(12);
		ListNode fifth=new ListNode(12);
		sll.head.next=second;
		second.next=third;
		third.next=fourth;
		fourth.next=fifth;
		
		sll.display();
		sll.removeDuplicates();
		sll.display();
	}

}
