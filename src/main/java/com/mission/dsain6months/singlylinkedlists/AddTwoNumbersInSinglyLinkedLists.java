package com.mission.dsain6months.singlylinkedlists;

public class AddTwoNumbersInSinglyLinkedLists {
	
	private ListNode head;
	
	private static class ListNode {
		private int data;
		private ListNode next;
		
		public ListNode(int data) {
			this.data=data;
			this.next=null;
		}
	}
	
	private static AddTwoNumbersInSinglyLinkedLists sll1=new AddTwoNumbersInSinglyLinkedLists();
	private static AddTwoNumbersInSinglyLinkedLists sll2=new AddTwoNumbersInSinglyLinkedLists();
	
	public void display() {
		ListNode current=head;
		while(current!=null) {
			System.out.print(current.data+" --> ");
			current=current.next;
		}
		System.out.println("null");
	}
	
	public static ListNode addNumbers(ListNode a, ListNode b) {
		ListNode dummy=new ListNode(0);
		ListNode tail=dummy;
		int carry=0;
		while(a!=null || b!=null) {
			int x=(a!=null)?a.data:0;
			int y=(b!=null)?b.data:0;
			int sum=x+y+carry;
			carry=sum/10;
			tail.next=new ListNode(sum%10);
			tail=tail.next;
			if(a!=null) a=a.next;
			if(b!=null) b=b.next;
		}
		if(carry>0) {
			tail.next=new ListNode(carry);
		}
		return dummy.next;
	}

	public static void main(String[] args) {

		sll1.head=new ListNode(7);
		ListNode second1=new ListNode(4);
		ListNode third1=new ListNode(8);
		sll1.head.next=second1;
		second1.next=third1;
		
		sll2.head=new ListNode(5);
		ListNode second2=new ListNode(6);
		ListNode third2=new ListNode(4);
		sll2.head.next=second2;
		second2.next=third2;
		
		sll1.display();
		sll2.display();
		
		AddTwoNumbersInSinglyLinkedLists result=new AddTwoNumbersInSinglyLinkedLists();
		result.head=addNumbers(sll1.head, sll2.head);
		result.display();
	}
}
