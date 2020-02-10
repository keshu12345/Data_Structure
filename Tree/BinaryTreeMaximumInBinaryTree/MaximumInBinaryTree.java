
//Time Complexity O(n)
//Space Complexity O(height of tree) O(log n)

package BinaryTreeMaximumInBinaryTree;

class Node {
	int key;
	Node left;
	Node right;

	Node(int x) {
		key = x;
	}
}

public class MaximumInBinaryTree {

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
		int x = root.key;
		MaximumInBinaryTree mbt = new MaximumInBinaryTree();
		System.out.print("\nMaximum Element in the Tree:" + mbt.MaximumSize(root));
	}

	private int MaximumSize(Node root) {
		// TODO Auto-generated method stub
		if (root == null) {
			return Integer.MIN_VALUE;
		} else {

			return Math.max(root.key, Math.max(MaximumSize(root.left), MaximumSize(root.right)));
		}

	}

}
