package com.mission.dsain6months.circularlinkedlist;

public class RemoveFirstNodeFromCLL {

	private ListNode last;
	
	private static class ListNode {
		private int data;
		private ListNode next;
		
		public ListNode(int data) {
			this.data=data;
			this.next=null;
		}
	}
	
	public void display() {
		if(last==null) {
			System.out.println("null");
			return;
		}
		
		if(last.next==null) {
			System.out.println(last.data);
			return;
		}
		
		ListNode first=last.next;
		while(first!=last) {
			System.out.print(first.data+" ");
			first=first.next;
		}
		System.out.println(first.data);
	}
	
	public int removeFirstNode() {
		if(last==null) {
			System.out.println("No node to remove");
		}
		ListNode first=last.next;
		int result=first.data;
		if(first==last) {
			last=null;
		}else {
			last.next=first.next;
		}
		first.next=null;
		return result;
	}
	
	public static void main(String[] args) {
		RemoveFirstNodeFromCLL cll=new RemoveFirstNodeFromCLL();
		ListNode first=new ListNode(10);
		ListNode second=new ListNode(11);
		ListNode third=new ListNode(12);
		first.next=second;
		second.next=third;
		third.next=first;
		cll.last=third;
		
		cll.display();
		System.out.println(cll.removeFirstNode());
		cll.display();
		System.out.println(cll.removeFirstNode());
		cll.display();
		System.out.println(cll.removeFirstNode());
		cll.display();
	}

}
