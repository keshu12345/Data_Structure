	class Node{
		int data;
		Node next;
		Node prev;
		
		Node(){
			data=0;
			next=null;
			prev=null;
		}
		Node(int data, Node next,Node prev){
			this.data=data;
			this.next=next;
			this.prev=prev;
					
		}
		public int getData() {
			return data;
		}
		public void setData(int data) {
			this.data = data;
		}
		public Node getNext() {
			return next;
		}
		public void setNext(Node next) {
			this.next = next;
		}
		public Node getPrev() {
			return prev;
		}
		public void setPrev(Node prev) {
			this.prev = prev;
		}
		
	}

class DoublyLinkedList{
	private Node head;
	private Node tail;
	private int size;
	
	DoublyLinkedList(){
		head=null;
		tail=null;
		size=0;
	}
	
	public void createList(int x) {
		Node newNode;
		newNode=new Node();
		newNode.setData(x);
		newNode.setNext(null);
		newNode.setPrev(null);
		
		if(head==null && tail==null) {
			head=tail=newNode;
		}else {
			tail.next=newNode;
			newNode.prev=tail;
			tail=newNode;
		}
		
		size++;
		
	}
	
	public void insertAtStart(int x) {
		Node newNode;
		newNode=new Node();
		newNode.setData(x);
		newNode.setNext(null);
		newNode.setPrev(null);
		
		if(head==null && tail==null) {
			head=tail=newNode;
		}else {
			head.prev=newNode;
			newNode.next=head;
			
			head=newNode;
		}
		size++;
	}

	public void insertAtLast(int x) {
		Node newNode;
		newNode=new Node();
		newNode.setData(x);
		newNode.setNext(null);
		newNode.setPrev(null);
	  if(head==null && tail==null) {
		  head=tail=newNode;
		   }else{
			   tail.next=newNode;
			   newNode.prev=tail;
			   tail=newNode;
		   }
	  size++;
	}
	
	public void insertAtPos(int x,int pos) {
		if(pos>size) {
			System.out.println("Enter Invalid Postion");
		}else {
			Node newNode,temp;
			int i=1;
			newNode=new Node();
			newNode.setData(x);
			newNode.setNext(null);
			newNode.setPrev(null);
			temp=head;
			if(head==null && tail==null) {
				head=tail=newNode;
			}else {
				while(i<pos-1) {
					temp=temp.next;
					i++;
				}
				
				newNode.next=temp.next;
				temp.next.prev=newNode;
				temp.next=newNode;
				newNode.prev=temp;
				
				
			}
			
		}
	}
	public void print() {
		// TODO Auto-generated method stub
		Node temp;
		temp=head;
		while(temp!=null) {
			System.out.print(temp.data+"->");
			temp=temp.next;
		}
		
	}

	public void printReverse() {
		// TODO Auto-generated method stub
		while(tail!=null) {
			System.out.print(tail.data+"->");
			tail=tail.prev;
		}
	}

	public int size() {
		// TODO Auto-generated method stub
		return size;
	}

	public boolean isEmpty() {
		// TODO Auto-generated method stub
		if(size==0) {
			return true;
		}else {
			return false;
		}
	}
}


public class CreateDoublyLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DoublyLinkedList dll=new DoublyLinkedList();
		dll.createList(23);
		dll.createList(2);
		dll.createList(20);
		System.out.print("\n Forward Doubly LinkedList:");
		dll.print();
		
	    dll.insertAtStart(1);
		System.out.print("\n Forward Add Node At Start:");
		dll.print();
		
		dll.insertAtLast(50);
		System.out.print("\n Forward Doubly LinkedList add node End:");
		dll.print();
		dll.insertAtPos(3, 3);
		System.out.print("\n Forward Doubly LinkedList add At 3rd Postiton:");
		dll.print();
		
		System.out.println("\n Size of DoublyLinkedList:"+dll.size());
		System.out.println("\nIs Empty:"+dll.isEmpty());
        
	}

}
