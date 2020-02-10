
// time Complexity O(n)
//Space complexity O(Length of breath traversal)

package BinaryTreeLevelOrderWithNewLine;

import java.util.LinkedList;
import java.util.Queue;

class Node {
	int key;
	Node left;
	Node right;

	Node(int x) {
		key = x;
	}
}

public class LevelOrderTraversalWithNewLine {

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
		LevelOrderTraversalWithNewLine lotn = new LevelOrderTraversalWithNewLine();

		lotn.levelOrderWithNewLine(root);

	}

	private void levelOrderWithNewLine(Node root) {
		// TODO Auto-generated method stub
		if (root == null) {
			return;
		}
		Queue<Node> q = new LinkedList<Node>();

		q.add(root);
		q.add(null);
		while (q.size() > 1) {
			Node curr = q.poll();
			if (curr == null) {

				q.add(null);
				System.out.println(" ");
				continue;
			}
			System.out.print(curr.key + " ");

			if (curr.left != null) {
				q.add(curr.left);
			}
			if (curr.right != null) {
				q.add(curr.right);
			}
		}

	}

}
