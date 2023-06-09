package com.mission.dsain6months.singlylinkedlists;

public class MergeTwoSortedSinglyLinkedLists {

	private ListNode head;
	
	private static class ListNode {
		private int data;
		private ListNode next;
		
		public ListNode(int data) {
			this.data=data;
			this.next=null;
		}
	}
	
	private static MergeTwoSortedSinglyLinkedLists sll1=new MergeTwoSortedSinglyLinkedLists();
	private static MergeTwoSortedSinglyLinkedLists sll2=new MergeTwoSortedSinglyLinkedLists();
	
	public void display() {
		ListNode current=head;
		while(current!=null) {
			System.out.print(current.data+" --> ");
			current=current.next;
		}
		System.out.println("null");
	}
	
	public static ListNode mergeLists(ListNode a, ListNode b) {
		ListNode dummy=new ListNode(0);
		ListNode tail=dummy;
		
		while(a!=null && b!=null) {
			if(a.data <= b.data) {
				tail.next=a;
				a=a.next;
			}else {
				tail.next=b;
				b=b.next;
			}
			tail=tail.next;
		}
		
		if(a==null) {
			tail.next=b;
		}else {
			tail.next=a;
		}
		return dummy.next;
	}
	
	
	public static void main(String[] args) {
		
		sll1.head=new ListNode(1);
		ListNode second1=new ListNode(4);
		ListNode third1=new ListNode(8);
		ListNode fourth1=new ListNode(10);
		sll1.head.next=second1;
		second1.next=third1;
		third1.next=fourth1;
		
		sll2.head=new ListNode(3);
		ListNode second2=new ListNode(6);
		ListNode third2=new ListNode(7);
		sll2.head.next=second2;
		second2.next=third2;
		
		sll1.display();
		sll2.display();
		
		MergeTwoSortedSinglyLinkedLists result=new MergeTwoSortedSinglyLinkedLists();
		result.head=mergeLists(sll1.head, sll2.head);
		result.display();
	}

}
