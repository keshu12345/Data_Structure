
//Time Complexity O(n) 
//Space Complexity O(h)//O(log n)


package BinaryTreeTreeBalanceWithOrderN;

class Node {
	int key;
	Node left;
	Node right;

	Node(int x) {
		key = x;
	}
}

public class BalanceTreeWithOrderN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node root = null;
		root = new Node(100);
		root.left = new Node(70);
		root.right = new Node(300);
		root.left.left = new Node(40);
		root.left.right = new Node(30);
		root.right.left = new Node(20);
		root.right.right = new Node(100);
		root.right.right.right = new Node(100);
		// root.right.right.right.right = new Node(100);

		BalanceTreeWithOrderN btw = new BalanceTreeWithOrderN();

		System.out.print("\nBalance Tree Height:" + btw.isBalance(root));
	}

	private int isBalance(Node root) {
		// Keshav Rajput
		if (root == null)
			return 0;

		int hl = isBalance(root.left);
		if (hl == -1)
			return -1;
		int hr = isBalance(root.right);
		if (hr == -1)
			return -1;
		if (Math.abs(hl - hr) > 1)
			return -1;

		else
			return Math.max(hl, hr) + 1;

	}

}
