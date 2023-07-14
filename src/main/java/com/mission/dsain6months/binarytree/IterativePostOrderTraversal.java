package com.mission.dsain6months.binarytree;

import java.util.Stack;

public class IterativePostOrderTraversal {
	
	private TreeNode root;
	
	private static class TreeNode {
		private int data;
		private TreeNode left;
		private TreeNode right;
		
		public TreeNode(int data) {
			this.data=data;
			this.left=null;
			this.right=null;
		}
	}
	
	public void createBinaryTree() {
		TreeNode first=new TreeNode(1);
		TreeNode second=new TreeNode(2);
		TreeNode third=new TreeNode(3);
		TreeNode fourth=new TreeNode(4);
		TreeNode fifth=new TreeNode(5);
		TreeNode sixth=new TreeNode(6);
		
		root=first;
		first.left=second;
		first.right=third;
		second.left=fourth;
		second.right=fifth;
		third.left=sixth;
	}
	
	public void iterativePostOrderTraversal() {
		TreeNode current=root;
		Stack<TreeNode> s=new Stack<>();
		while(!s.isEmpty() || current!=null) {
			if(current!=null) {
			s.push(current);
			current=current.left;
			}else {
				TreeNode temp=s.peek().right;
				if(temp==null) {
					temp=s.pop();
					System.out.print(temp.data+" ");
					while(!s.isEmpty()&& temp==s.peek().right) {
						temp=s.pop();
						System.out.print(temp.data+" ");
					}	
				} else {
					current=temp;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		IterativePostOrderTraversal i=new IterativePostOrderTraversal();
		i.createBinaryTree();
		i.iterativePostOrderTraversal();
	}
}
