package come.keshav.CreateTreeWithCore;
class Node{
	int data;
	Node right;
	Node left;
	
	Node(int x){
		data=x;
	}
}

class CreateTree{
	private Node root;
	private Node temp;
	
	CreateTree(){
		root=null;
		temp=null;
	}
	
	public void insert(int data) {
		
		if(root==null) {
			root=new Node(data);
			System.out.println("->Inserted:"+data);
		}
		
		insertNode(root,data);
		System.out.println("->Inserted:"+data+" ");
	}

	private Node insertNode(Node root, int data) {
		// TODO Auto-generated method stub
		System.out.print("->"+root.data);
		if(root.data>=data) {
			System.out.print("Left");
			if(root.left==null) {
				
				root.left=new Node(data);
				return root.left;
			}else {
				temp=root.left;
			}
		}else {
			System.out.print("right");
			if(root.right==null) {
				root.right=new Node(data);
				return root.right;
			}else {
				temp=root.right;
			}
		}
		return insertNode(temp,data);
		
		
	}
	
}

public class TreeCreateImp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CreateTree ct=new CreateTree();
		   ct.insert(17);
		   ct.insert(11);
		   ct.insert(50);
		   ct.insert(40);
		   ct.insert(10);
		   ct.insert(30);
		   ct.insert(150);
		   ct.insert(500);
		   

	}

}
