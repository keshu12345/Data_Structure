
class Node2{
	int data;
	Node2 next;
	Node2 prev;
	Node2(){
		data=0;
		next=null;
		prev=null;
		}
	Node2(int data,Node2 next, Node2 prev){
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
	public Node2 getNext() {
		return next;
	}
	public void setNext(Node2 next) {
		this.next = next;
	}
	public Node2 getPrev() {
		return prev;
	}
	public void setPrev(Node2 prev) {
		this.prev = prev;
	}
	
}

class ReverseDLinkedList{
	private Node2 head,tail;
	private int size;
	
	ReverseDLinkedList(){
		head=null;
		tail=null;
		size=0;
		}
   void insert(int x) {
	Node2 newNode;
	newNode=new Node2();
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
	
	
}
   
   public void reverse() {
	  
	   
	   
	   if(head==null && tail==null) {
		   System.out.println("List is Empty");
	   }
	   else {
		   Node2 temp,tempNext;
		   temp=head;
		   tempNext=null;
		   
		   while(temp!=null) {
			 tempNext=temp.next;
			 temp.next=temp.prev;
			 temp.prev=tempNext;
			 temp=tempNext;
		   }
		   
		   Node2 swap;
		   swap=head;
		   head=tail;
		   tail=swap;
	   }
   }
public void print() {
	// TODO Auto-generated method stub
	Node2 temp;
	temp=head;
	if(head==null && tail==null) {
		System.out.println("LinkedList Is Empty");
	}else {
		while(temp!=null) {
			System.out.print(temp.data+"->");
			temp=temp.next;
		}
	}
	
}
	
}
public class ReverseDoublyLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ReverseDLinkedList rll=new ReverseDLinkedList();
		rll.insert(1);
		rll.insert(2);
		rll.insert(3);
		rll.insert(4);
		rll.insert(5);
		System.out.print("\n Printed List:");
		rll.print();
		rll.reverse();
		System.out.print("\n Printed Reverse List:");
		rll.print();

	}

}
