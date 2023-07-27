package com.mission.dsain6months.binarytree;

public class ValidateBinarySearchTree {

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
	
	public TreeNode insertNode(TreeNode root, int data) {
		if(root==null) {
			root=new TreeNode(data);
			return root;
		}
		
		if(data < root.data) {
			root.left=insertNode(root.left, data);
		}else {
			root.right=insertNode(root.right, data);
		}
		return root;
	}
	
	public void inOrder(TreeNode root) {
		if(root==null) {
			return;
		}
		
		inOrder(root.left);
		System.out.print(root.data+" ");
		inOrder(root.right);
	}
	
	public boolean validTree(TreeNode root, long min, long max) {
		if(root==null) {
			return true;
		}
		
		if(root.data<=min || root.data>=max) {
			return false;
		}
		
		boolean left=validTree(root.left, min, root.data);
		if(left) {
			boolean right=validTree(root.right, root.data, max);
			return right;
		}
		return false;
	}
	
	public static void main(String[] args) {
		ValidateBinarySearchTree v=new ValidateBinarySearchTree();
		v.root=v.insertNode(v.root, 10);
		v.root=v.insertNode(v.root, 11);
		v.root=v.insertNode(v.root, 5);
		v.root=v.insertNode(v.root, 2);
		
		v.inOrder(v.root);
		
		System.out.println(v.validTree(v.root, Long.MIN_VALUE, Long.MAX_VALUE));
	}

}
