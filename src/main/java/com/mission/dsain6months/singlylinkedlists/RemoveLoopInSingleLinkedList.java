package com.mission.dsain6months.singlylinkedlists;

public class RemoveLoopInSingleLinkedList {

	private ListNode head;
	
	private static class ListNode {
		private int data;
		private ListNode next;
		
		public ListNode(int data) {
			this.data=data;
			this.next=null;
		}
	}
	
	public void removeLoop() {
		ListNode slowPtr=head;
		ListNode fastPtr=head;
		ListNode current=head;
		ListNode metNode=null;
		while(fastPtr!=null && fastPtr.next!=null) {
			slowPtr=slowPtr.next;
			fastPtr=fastPtr.next.next;
			if(slowPtr==fastPtr) {
				metNode = slowPtr;
				break;
			}	
		}
		while(metNode.next!=current.next) {
			current=current.next;
			metNode=metNode.next;
		}
		metNode.next=null;
	}
	
	public void display() {
		ListNode current=head;
		while(current!=null) {
			System.out.print(current.data+" --> ");
			current=current.next;
		}
		System.out.println("null");
	}
	
	public static void main(String[] args) {
		RemoveLoopInSingleLinkedList sll=new RemoveLoopInSingleLinkedList();
		sll.head=new ListNode(10);
		ListNode second=new ListNode(11);
		ListNode third=new ListNode(12);
		ListNode fourth=new ListNode(13);
		ListNode fifth=new ListNode(14);
		sll.head.next=second;
		second.next=third;
		third.next=fourth;
		fourth.next=fifth;
		fifth.next=third;
		
		sll.removeLoop();
		sll.display();
	}

}
