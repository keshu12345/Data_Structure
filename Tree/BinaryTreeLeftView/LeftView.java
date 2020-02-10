package BinaryTreeLeftView;



class Node{
	int key;
	Node left;
	Node right;
	
	Node(int x){
		key=x;
	}
}

public class LeftView {

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
		
		LeftView lv=new LeftView();
		
		lv.leftView( root,1);
		
	}
   int maxLevel=0;
	private void leftView(Node root,int level) {
		// TODO Auto-generated method stub
		
		if(root==null) return;
		
		if(maxLevel<level) {
			System.out.print(root.key+" ");
			maxLevel=level;
		}
		
		leftView(root.left,level+1);
		leftView(root.right,level+1);
		
		
		
	}

}
