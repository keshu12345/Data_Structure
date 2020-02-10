package BinaryTreeConstruct;

class Node{
	int key;
	Node left;
	Node right;
	Node(int x){
		key=x;
	}
}

public class BinaryTreeConstruct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node root=null;
		BinaryTreeConstruct bt=new BinaryTreeConstruct();
		
		root=new Node(30);
		root.left=new Node(50);
		root.right=new Node(70);
		root.left.left=new Node(90);
		root.left.right=new Node(100);
		root.right.left=new Node(66);
		root.right.right=new Node(22);
		
		bt.inOrder(root);

	}

	private static void inOrder(Node root) {
		// TODO Auto-generated method stub
		if(root==null) {
			return;
		}
		else {
			inOrder(root.left);
			System.out.print(root.key+" ");
			inOrder(root.right);
		}
		
	}

}
