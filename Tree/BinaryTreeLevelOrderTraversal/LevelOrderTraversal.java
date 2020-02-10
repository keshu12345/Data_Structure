package BinaryTreeLevelOrderTraversal;

import java.util.LinkedList;
import java.util.Queue;



class Node{
	int key;
	Node left;
	Node right;
	Node(int x){
		key=x;
	}
}

public class LevelOrderTraversal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node root=null;
		root=new Node(30);
		root.left=new Node(50);
		root.right=new Node(70);
		root.left.left=new Node(90);
		root.left.right=new Node(100);
		root.right.left=new Node(66);
		root.right.right=new Node(22);
		LevelOrderTraversal lot=new LevelOrderTraversal();
		lot.levelOrderTraversal(root);
	}

	private void levelOrderTraversal(Node root) {
		// TODO Auto-generated method stub
		if(root==null) {
			return;
		}
		Queue<Node>q=new LinkedList<Node>();
		    
		q.add(root);
		
	while(q.isEmpty()==false) {
		Node curr=q.poll();
		System.out.print(curr.key+" ");
		if(curr.left!=null) {
			q.add(curr.left);
		}
		if(curr.right!=null) {
			q.add(curr.right);
		}
	}
		
	}

}
