
//Time Complexity O(n)
//Space Complexity O(Breath of the tree)//O(n/2)//O(n)


package BinaryTreeMaximumBreathOfTree;

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

public class MaximumBreathOfTree {

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
		MaximumBreathOfTree mbt = new MaximumBreathOfTree();

		System.out.print("\n Print Maximum Breath:" + mbt.maximumBreath(root));

	}

	private int maximumBreath(Node root) {
		// TODO Auto-generated method stub
		if (root == null)
			return 0;

		Queue<Node> q = new LinkedList<Node>();
		q.add(root);
		int res = 0;

		while (q.isEmpty() == false) {
			int count = q.size();
			
			if(res<count) {
				res=count;
			}
			for (int i = 0; i < count; i++) {
				Node curr = q.poll();

				if (curr.left != null)
					q.add(curr.left);
				if (curr.right != null)
					q.add(curr.right);
			}
			
		}
		return res;

	}

	

}
