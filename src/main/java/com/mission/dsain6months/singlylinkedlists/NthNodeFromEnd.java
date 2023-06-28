package com.mission.dsain6months.singlylinkedlists;

public class NthNodeFromEnd {

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
	
	public ListNode nodeFromEnd(int pos) {
		int length=length();
		int count=length-pos;
		int counter=0;
		ListNode current=head;
		while(counter<count) {
			counter++;
			current=current.next;
		}
		return current;
	}
	
	public ListNode nthNodeFromEnd(int pos) {
		ListNode mainPtr=head;
		ListNode refPtr=head;
		int count=0;
		while(count<pos) {
			count++;
			refPtr=refPtr.next;
		}
		
		while(refPtr!=null) {
			mainPtr=mainPtr.next;
			refPtr=refPtr.next;
		}
		
		return mainPtr;
	}
	
	public static void main(String[] args) {
		NthNodeFromEnd sll=new NthNodeFromEnd();
		sll.head=new ListNode(10);
		ListNode second=new ListNode(11);
		ListNode third=new ListNode(12);
		ListNode fourth=new ListNode(13);
		sll.head.next=second;
		second.next=third;
		third.next=fourth;
		
		sll.display();
		ListNode node=sll.nodeFromEnd(3);
		System.out.println(node.data);
		
		ListNode nthNodeFromEnd=sll.nthNodeFromEnd(2);
		System.out.println(nthNodeFromEnd.data);
	}

}
