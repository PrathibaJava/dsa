package com.mission.dsain6months.singlylinkedlists;

public class MiddleNodeInSinglyLinkedList {

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
	
	public int length() {
		ListNode current=head;
		int count=0;
		while(current!=null) {
			count++;
			current=current.next;
		}
		return count;
	}
	
	public ListNode middleNode() {
		if(head==null || head.next==null)
			return head;
		
		int length=length();
		int counter=0;
		if(length/2==0)
			counter=length/2;
		else
			counter=length/2+1;
		ListNode current=head;
		int count=1;
		while(count<counter) {
			count++;
			current=current.next;
		}
		return current;	
	}
	
	public ListNode middleNodeOtherWay() {
		ListNode slowPtr=head;
		ListNode fastPtr=head;
		while(fastPtr!=null && fastPtr.next!=null) {
			slowPtr=slowPtr.next;
			fastPtr=fastPtr.next.next;
		}
		return slowPtr;
	}
	
	public static void main(String[] args) {
		MiddleNodeInSinglyLinkedList sll=new MiddleNodeInSinglyLinkedList();
		sll.head=new ListNode(10);
		ListNode second=new ListNode(11);
		ListNode third=new ListNode(12);
		ListNode fourth=new ListNode(13);
		sll.head.next=second;
		second.next=third;
		third.next=fourth;
		sll.display();
		System.out.println(sll.middleNode().data);
		System.out.println(sll.middleNodeOtherWay().data);
	}

}
