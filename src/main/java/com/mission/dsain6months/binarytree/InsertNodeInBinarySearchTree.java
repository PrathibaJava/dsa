package com.mission.dsain6months.binarytree;

public class InsertNodeInBinarySearchTree {

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
	
	/*
	 * public void levelOrder(TreeNode root) { if(root==null) { return; }
	 * 
	 * System.out.print(root.data+" ");
	 * 
	 * if(root.left!=null) { System.out.print(root.left.data+" "); }
	 * 
	 * if(root.right!=null) { System.out.print(root.right.data+" "); }
	 * 
	 * levelOrder(root.left); levelOrder(root.right); }
	 */
	
	public void inOrder(TreeNode root) {
		if(root==null) {
			return;
		}
		inOrder(root.left);
		System.out.print(root.data+" ");
		inOrder(root.right);
	}
	
	public static void main(String[] args) {
		InsertNodeInBinarySearchTree bt=new InsertNodeInBinarySearchTree();
		bt.root=bt.insertNode(bt.root, 5);
		bt.root=bt.insertNode(bt.root, 3);
		bt.root=bt.insertNode(bt.root, 7);
		bt.root=bt.insertNode(bt.root, 1);
		
		bt.inOrder(bt.root);
	}

}
