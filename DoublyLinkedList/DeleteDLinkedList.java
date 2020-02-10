
class Node1{
	int data;
	Node1 next;
	Node1 prev;
	Node1(){
		data=0;
		next=null;
		prev=null;
	}
	Node1(int data,Node1 next,Node1 prev){
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
	public Node1 getNext() {
		return next;
	}
	public void setNext(Node1 next) {
		this.next = next;
	}
	public Node1 getPrev() {
		return prev;
	}
	public void setPrev(Node1 prev) {
		this.prev = prev;
	}
	
}

class DLinkedList{
	private Node1 head,tail;
	private int size;
	DLinkedList(){
		head=null;
		tail=null;
		size=0;
		}
	
	public void insert(int x) {
		Node1 newNode;
		
	  newNode=new Node1();
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
public void deleteAtFront() {
	if(head==null && tail==null) {
		System.out.println("DLinked List is Empty");
	}else {
		head=head.next;
		head.prev.next=null;
		head.prev=null;
	}
	size--;
}
public void deleteAtLast() {
	// TODO Auto-generated method stub
	if(head==null && tail==null) {
		System.out.println("DLinked List is empty");
	}else{
		tail=tail.prev;
		tail.next.prev=null;
		tail.next=null;
	}
	size--;
	
}
public void deleteAtPos(int pos) {
	Node1 temp;
	if(pos>size) {
		System.out.println("Enter Position Invalid");
	}else {
		temp=head;
		if(head==null && tail== null) {
			System.out.println("Linked List is Empty");
		}else {
			temp=head;
			int i=1;
			while(i<=pos-1) {
				temp=temp.next;
				i++;
			}
			temp.prev.next=temp.next;
			temp.next=temp.prev;
			temp.next=null;
			temp.prev=null;
		}
	}
	size--;
}
	public void print() {
		// TODO Auto-generated method stub
	  Node1 temp;
	  temp=head;
	  while(temp!=null) {
		  System.out.print(temp.data+"->");
		  temp=temp.next;
	  }
		
	}

	public int size() {
		// TODO Auto-generated method stub
		return size;
	}

	public boolean isEmpty() {
		// TODO Auto-generated method stub
		if(size==0) 
			return true;
		else
			return false;
			
	}

	
}
public class DeleteDLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DLinkedList dll=new DLinkedList();
		dll.insert(1);
		dll.insert(2);
		dll.insert(3);
		dll.insert(4);
		dll.insert(5);
		System.out.print("\nPrint DLinkedList:");
		dll.print();
		dll.deleteAtFront();
		System.out.print("\nPrint DLinkedList Deleted from front:");
		dll.print();
		dll.deleteAtLast();
		System.out.print("\nPrint DLinkedList Deleted from End:");
		dll.print();
		dll.deleteAtPos(2);
		System.out.print("\nPrint DLinkedList Deleted At Position:");
		dll.print();
		System.out.print("\nPrint the Size:"+dll.size());
		System.out.print("\nIs Empty:"+dll.isEmpty());
		

	}

}
