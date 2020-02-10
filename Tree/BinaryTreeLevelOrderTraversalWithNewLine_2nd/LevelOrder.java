//Time Complexity O(n)
//Space Complexity O(Breath Of tree)

package BinaryTreeLevelOrderTraversalWithNewLine_2nd;

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

public class LevelOrder {

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
		LevelOrder lo = new LevelOrder();

		lo.levelOrderIterative(root);

	}

	private void levelOrderIterative(Node root) {
		if (root == null) {
			return;
		}

		Queue<Node> q = new LinkedList<Node>();
		
		q.add(root);
		
		while(q.isEmpty()==false) {
			int count=q.size();
			for(int i=0;i<count;i++) {
				Node curr=q.poll();
				System.out.print(curr.key+" ");
				
				if(curr.left!=null) {
					q.add(curr.left);
				}
				if(curr.right!=null) {
					q.add(curr.right);
				}
			}
			System.out.println(" ");
		}

	}

}
