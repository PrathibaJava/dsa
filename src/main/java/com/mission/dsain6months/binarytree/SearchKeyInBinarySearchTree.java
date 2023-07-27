package com.mission.dsain6months.binarytree;

public class SearchKeyInBinarySearchTree {

	private TreeNode root;

	private static class TreeNode {
		private int data;
		private TreeNode left;
		private TreeNode right;

		public TreeNode(int data) {
			this.data = data;
			this.left = null;
			this.right = null;
		}
	}

	public TreeNode searchKey(int key) {
		return search(root, key);
	}

	public TreeNode search(TreeNode root, int key) {
		if (root == null || root.data == key) {
			return root;
		}

		if (key < root.data) {
			return search(root.left, key);
		} else {
			return search(root.right, key);
		}
	}

	public TreeNode insertNode(TreeNode root, int data) {
		if (root == null) {
			root = new TreeNode(data);
			return root;
		}

		if (data < root.data) {
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

	public static void main(String[] args) {
		SearchKeyInBinarySearchTree bt = new SearchKeyInBinarySearchTree();
		bt.root=bt.insertNode(bt.root, 5);
		bt.root=bt.insertNode(bt.root, 3);
		bt.root=bt.insertNode(bt.root, 7);
		bt.root=bt.insertNode(bt.root, 1);
		
		bt.inOrder(bt.root);
		System.out.println();
		
		if(bt.searchKey(7)!=null) {
			System.out.println("Key found");
		}else {
			System.out.println("Key not found");
		}
	}
}
