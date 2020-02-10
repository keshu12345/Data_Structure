package com.keshav.createTree;

class Node {
	int data;
	Node right;
	Node left;

	Node(int data) {
		this.data = data;
	}

	public void inOrder(Node root) {
		// TODO Auto-generated method stub
		if (root != null) {
			inOrder(root.left);
			System.out.print(root.data + " ");
			inOrder(root.right);
		}

	}

	public void preOrder(Node root) {
		// TODO Auto-generated method stub
	
		if (root != null) {
			System.out.print(root.data + " ");
			preOrder(root.left);
			preOrder(root.right);
		}

	}

}

public class CreateTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node root = new Node(25);
		root.left = new Node(20);
		root.right = new Node(50);
		root.left.left = new Node(10);
		root.left.right = new Node(22);
		root.right.left = new Node(40);
		root.right.right = new Node(60);

		root.inOrder(root);
		System.out.print("\nPrint preOrder\n");
		root.preOrder(root);

	}

}
