//Time complexity O(n)
// Space Complexity O(height of tree) //O(log n)



package BinaryTreeChildrenSumProperty;

class Node {
	int key;
	Node right;
	Node left;

	Node(int x) {
		key = x;
	}
}

public class ChildrenSum {

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
		ChildrenSum cs = new ChildrenSum();

		System.out.print("\nIs BinaryChildrenSum:" + cs.isChildSum(root));

	}

	private Boolean isChildSum(Node root) {
		// TODO Auto-generated method stub
		if (root == null)
			return true;

		if (root.left == null && root.right == null) {
			return true;
		}

		else {
			int sum = 0;
			if (root.left != null)
				sum += root.left.key;
			if (root.right != null)
				sum += root.right.key;
			return (root.key == sum && isChildSum(root.left) && isChildSum(root.right));
		}

	}

}
