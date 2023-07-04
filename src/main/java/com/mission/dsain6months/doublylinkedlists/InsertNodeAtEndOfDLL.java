package com.mission.dsain6months.doublylinkedlists;

public class InsertNodeAtEndOfDLL {

	private ListNode head;
	private ListNode tail;
	private int length;
	
	public InsertNodeAtEndOfDLL() {
		this.head=null;
		this.tail=null;
		this.length=0;
	}
	
	private static class ListNode {
		private int data;
		private ListNode previous;
		private ListNode next;
		
		public ListNode(int data) {
			this.data=data;
			this.previous=null;
			this.next=null;
		}
	}
	
	
	  public void insertNodeAtEnd(int data) { 
		  ListNode node=new ListNode(data);
		  if(head==null) { 
			  head=node; 
			  return; 
		  } else {
			  tail.next=node;
			  node.previous=tail;
		  }
		  tail=node;
	  }
	 
	
	public void display() {
		ListNode temp=head;
		while(temp!=null) {
			System.out.print(temp.data+" --> ");
			temp=temp.next;
		}
		System.out.println("null");
	}
	
	public static void main(String[] args) {
		InsertNodeAtEndOfDLL dll=new InsertNodeAtEndOfDLL();
		dll.head=new ListNode(10);
		ListNode second=new ListNode(11);
		ListNode third=new ListNode(12);
		ListNode fourth=new ListNode(13);
		dll.tail=new ListNode(14);
		
		dll.head.next=second;
		second.next=third;
		second.previous=dll.head;
		third.next=fourth;
		third.previous=second;
		fourth.next=dll.tail;
		fourth.previous=third;
		dll.tail.previous=fourth;
		
		dll.display();
		dll.insertNodeAtEnd(15);
		dll.display();
		dll.insertNodeAtEnd(16);
		dll.display();
	}

}
