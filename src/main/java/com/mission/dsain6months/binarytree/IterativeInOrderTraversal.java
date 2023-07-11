package com.mission.dsain6months.binarytree;

import java.util.Stack;

public class IterativeInOrderTraversal {

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
		TreeNode first=new TreeNode(10);
		TreeNode second=new TreeNode(20);
		TreeNode third=new TreeNode(30);
		TreeNode fourth=new TreeNode(40);
		TreeNode fifth=new TreeNode(50);
		TreeNode sixth=new TreeNode(60);
		
		root=first;
		first.left=second;
		first.right=third;
		second.left=fourth;
		second.right=fifth;
		third.left=sixth;
	}
	
	public void iterativeInOrder(TreeNode root) {
		if(root==null) {
			return;
		}
		Stack<TreeNode> s=new Stack<>();
		TreeNode temp=root;
		while(!s.isEmpty() || temp!=null) {
			if(temp!=null) {
				s.push(temp);
				temp=temp.left;
			}else {
				temp=s.pop();
				System.out.print(temp.data+" ");
				temp=temp.right;
			}
		}
	}
	
	public static void main(String[] args) {
		IterativeInOrderTraversal q=new IterativeInOrderTraversal();
		q.createBinaryTree();
		q.iterativeInOrder(q.root);
	}

}
