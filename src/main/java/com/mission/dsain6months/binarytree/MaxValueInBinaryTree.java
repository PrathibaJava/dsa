package com.mission.dsain6months.binarytree;

public class MaxValueInBinaryTree {
	
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
		TreeNode first=new TreeNode(11);
		TreeNode second=new TreeNode(2);
		TreeNode third=new TreeNode(8);
		TreeNode fourth=new TreeNode(4);
		TreeNode fifth=new TreeNode(5);
		TreeNode sixth=new TreeNode(16);
		root=first;
		first.left=second;
		first.right=third;
		third.left=fourth;
		third.right=fifth;
		second.left=sixth;
	}
	
	public int maxValue(TreeNode root) {
		if(root==null) {
			return Integer.MIN_VALUE;
		}
		int result=root.data;
		int left=maxValue(root.left);
		int right=maxValue(root.right);
		if(left>result) {
			result=left;
		}
		if(right>result) {
			result=right;
		}
		return result;
	}
	
	public static void main(String[] args) {
		MaxValueInBinaryTree m=new MaxValueInBinaryTree();
		m.createBinaryTree();
		System.out.println(m.maxValue(m.root));
	}
}
