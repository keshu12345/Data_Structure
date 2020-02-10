package com.keshav.bst;

class Node{
	Node left;
	Node right;
	int key;
	
	Node(int key){
		this.key=key;
		right=left=null;
	}
	
}

class BinarySearchTree{
private Node root;
	
	BinarySearchTree(){
		root=null;
	}

	public void insert( int x) {
		// TODO Auto-generated method stub
		
		recurInsert(root,x);
		
		
	}

	private Node recurInsert(Node root, int x) {
		// TODO Auto-generated method stub
		if(root==null) {
			root=new Node(x);
			return root;
		}
		if(root.key<x) 
			root.right=recurInsert(root.right,x);
		
		else if(root.key>x) 
			root.left=recurInsert(root.left,x);
		
		return root;
		
	}

	public void inorder() {
		// TODO Auto-generated method stub
		inoderRec(root);
		
	}

	private void inoderRec(Node root) {
		// TODO Auto-generated method stub
		if(root!=null) {
			inoderRec(root.left);
			System.out.print("\nInorder:"+root.key);
			inoderRec(root.right);
			
		}
		
	}
	
}

public class BSTConstruct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BinarySearchTree tree=new BinarySearchTree(); 
		    tree.insert(50); 
	        tree.insert(30); 
	        tree.insert(20); 
	        tree.insert(40); 
	        tree.insert(70); 
	        tree.insert(60); 
	        tree.insert(80); 
	        tree.inorder();

	}

}
