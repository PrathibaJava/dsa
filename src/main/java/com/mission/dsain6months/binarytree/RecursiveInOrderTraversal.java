package com.mission.dsain6months.binarytree;

public class RecursiveInOrderTraversal {

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
		first.left=second;
		first.right=third;
		second.left=fourth;
		second.right=fifth;
		third.left=sixth;
	}
	
	public void inOrderTraversal(TreeNode root) {
		if(root==null) {
			return;
		}
		inOrderTraversal(root.left);
		System.out.print(root.data+" ");
		inOrderTraversal(root.right);
	}
	
	public static void main(String[] args) {
		RecursiveInOrderTraversal r=new RecursiveInOrderTraversal();
		r.createBinaryTree();
		r.inOrderTraversal(r.root);
	}
}
