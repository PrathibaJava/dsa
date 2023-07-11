package com.mission.dsain6months.binarytree;

public class RecursivePostOrderTraversal {

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
	
	public void recursivePostOrder(TreeNode root) {
		if(root==null) {
			return;
		}
		
		recursivePostOrder(root.left);
		recursivePostOrder(root.right);
		System.out.print(root.data+" ");
	}
	
	
	public static void main(String[] args) {
		RecursivePostOrderTraversal q=new RecursivePostOrderTraversal();
		q.createBinaryTree();
		q.recursivePostOrder(q.root);
	}

}
