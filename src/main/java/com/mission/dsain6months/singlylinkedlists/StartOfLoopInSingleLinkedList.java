package com.mission.dsain6months.singlylinkedlists;

public class StartOfLoopInSingleLinkedList {
	
	private ListNode head;
	
	private static class ListNode {
		private int data;
		private ListNode next;
		
		public ListNode(int data) {
			this.data=data;
			this.next=null;
		}
	}
	
	public ListNode detectLoop() {
		ListNode slowPtr=head;
		ListNode fastPtr=head;
		while(fastPtr!=null && fastPtr.next!=null) {
			slowPtr=slowPtr.next;
			fastPtr=fastPtr.next.next;
			if(slowPtr==fastPtr)
				return getStartingNode(fastPtr);
		}
		return null;
	}
	
	public ListNode getStartingNode(ListNode node) {
		ListNode temp=head;
		while(temp!=node) {
			temp=temp.next;
			node=node.next;
		}
		return temp;
	}
	
	public void createLoopInSinglyLinkedList() {
		ListNode first=new ListNode(10);
		ListNode second=new ListNode(11);
		ListNode third=new ListNode(12);
		ListNode fourth=new ListNode(13);
		ListNode fifth=new ListNode(14);
		
		head=first;
		first.next=second;
		second.next=third;
		third.next=fourth;
		fourth.next=fifth;
		fifth.next=second;
		
	}
	
	public static void main(String[] args) {
		StartOfLoopInSingleLinkedList sll=new StartOfLoopInSingleLinkedList();
		sll.createLoopInSinglyLinkedList();
		System.out.println(sll.detectLoop().data);
	}

}
