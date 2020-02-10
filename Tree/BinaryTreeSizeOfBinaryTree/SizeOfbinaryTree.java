package BinaryTreeSizeOfBinaryTree;

class Node {
	int key;
	Node left;
	Node right;

	Node(int x) {
		key = x;
	}

}

public class SizeOfbinaryTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node root = null;
		root = new Node(30);
		root.left = new Node(50);
		root.right = new Node(70);
		root.left.left = new Node(90);
		root.left.right = new Node(100);
		root.right.left = new Node(66);
		root.right.right = new Node(22);
		SizeOfbinaryTree sobt = new SizeOfbinaryTree();
		System.out.print("\nSize of Binary Tree:"+sobt.sizeOfBinaryTree(root));

	}

	private int sizeOfBinaryTree(Node root) {
		// TODO Auto-generated method stub
		if (root == null) {
			return 0;
		} else {
			return 1 + sizeOfBinaryTree(root.left) + sizeOfBinaryTree(root.right);
		}

	}

}
