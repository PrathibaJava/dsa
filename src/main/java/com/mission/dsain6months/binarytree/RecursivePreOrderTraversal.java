package com.mission.dsain6months.binarytree;

public class RecursivePreOrderTraversal {

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
	
	public void preOrder(TreeNode root) {
		if(root==null) {
			return;
		}
		System.out.print(root.data+" ");
		preOrder(root.left);
		preOrder(root.right);
	}
	
	public static void main(String[] args) {
		RecursivePreOrderTraversal t=new RecursivePreOrderTraversal();
		t.createBinaryTree();
		t.preOrder(t.root);
	}

}
