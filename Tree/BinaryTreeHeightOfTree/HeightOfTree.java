package BinaryTreeHeightOfTree;



class Node{
	int key;
	Node left;
	Node right;
	Node(int x){
		key=x;
	}
	
}

public class HeightOfTree {

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
		root.right.right.right = new Node(122);
		
		HeightOfTree hot=new HeightOfTree();
		
		System.out.print("\nHeight of Tree:"+hot.heightOfTree(root));
		
		
	}

	private int heightOfTree(Node root) {
		// TODO Auto-generated method stub
		
		if(root==null) {
			return -1;
		}else {
			
			return 1+Math.max(heightOfTree(root.left), heightOfTree(root.right));
		}
		
	}

}
