package com.mission.dsain6months.binarytree;

import java.util.Stack;

public class IterativePreOrderTraversal {
	
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
		TreeNode second=new TreeNode(11);
		TreeNode third=new TreeNode(12);
		TreeNode fourth=new TreeNode(13);
		TreeNode fifth=new TreeNode(14);
		TreeNode sixth=new TreeNode(15);
		
		root=first;
		root.left=second;
		root.right=third;
		second.left=fourth;
		second.right=fifth;
		third.left=sixth;
	}
	
	public void iterativePreOrder() {
		if(root==null) {
			return;
		}
		Stack<TreeNode> s=new Stack<>();
		s.push(root);
		while(!s.isEmpty()) {
			TreeNode temp=s.pop();
			System.out.print(temp.data+" ");
			if(temp.right!=null) {
				s.push(temp.right);
			}
			if(temp.left!=null) {
				s.push(temp.left);
			}
		}
	}

	public static void main(String[] args) {
		IterativePreOrderTraversal it=new IterativePreOrderTraversal();
		it.createBinaryTree();
		it.iterativePreOrder();
	}

}
