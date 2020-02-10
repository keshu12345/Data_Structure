
// Time COmplexity O(n^2)
// Space Complexity O(height of the tree)


package BinaryTreeIsBalanceTree;

class Node {
	int key;
	Node left;
	Node right;

	Node(int x) {
		key = x;
	}
}

public class HeightBalanceTree {

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
		root.right.right.right.right = new Node(100);
		HeightBalanceTree hbt=new HeightBalanceTree();
		
		System.out.print("\nBalance Tree:"+hbt.isBalance(root));

	}

	private Boolean isBalance(Node root) {
		// TODO Auto-generated method stub
		if(root==null) return true;
		
		int lh=Height(root.left);
		int rh=Height(root.right);
		return Math.abs(lh-rh)<=1&&isBalance(root.left)&&isBalance(root.right);
		
	}

	private int Height(Node root) {
		// TODO Auto-generated method stub
		if(root==null) return 0;
		else {
			return 1+Math.max(Height(root.left), Height(root.right));
		}
		
	}

}
