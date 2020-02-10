package BinaryTreeKthDistancePrintElement;


class Node{
	int key;
	Node left;
	Node right;
	
	Node(int x){
		key=x;
	}
}

public class KthDistanceElement {

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
		KthDistanceElement kde=new KthDistanceElement();
	
		kde.printKthDistanceElement(root,3);
		
		
		
	}

	private void printKthDistanceElement(Node root, int k) {
		// TODO Auto-generated method stub
		
		if(root==null) {
			return;
		}
		if(k==0) {
			System.out.print(root.key+" ");
		}else {
			
			printKthDistanceElement( root.left,k-1);
			printKthDistanceElement( root.right,k-1);
		}
		
	}

}
