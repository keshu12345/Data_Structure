package com.keshav.circularlinkedlist;

class Node{
	int data;
	Node next;
	Node(){
		data=0;
		next=null;
	}
	Node(int data,Node next){
		this.data=data;
		this.next=next;
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
	
}

class CircularList{
	private Node head,tail;
	private int size;
	CircularList(){
		head=null;
		tail=null;
		size=0;
	}
	public void insert(int x ) {
		Node newNode;
		newNode =new Node();
		newNode.setData(x);
		newNode.setNext(null);
		
		if(head==null) {
			tail=head=newNode;
			tail.next=newNode;
		}else {
			 tail.next=newNode;
			 tail=newNode;
		}
		tail.next=head;
		size++;
	}
	public void print() {
		// TODO Auto-generated method stub
	Node temp1;

	if(head==null) {
		System.out.println("Circular List Is Empty");
	}else {
		temp1=null;
		temp1=head;
		while(temp1.next!=head) {
			System.out.print(temp1.data+"->");
			temp1=temp1.next;
		}
		System.out.println(temp1.data+"->");
	}
		
	}
	public int size() {
		// TODO Auto-generated method stub
		return size;
	}
	
}
public class CircularLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CircularList cl=new CircularList();
		cl.insert(1);
		cl.insert(2);
		cl.insert(3);
		cl.insert(4);
		System.out.print("\n Print Circular List:");
		cl.print();
		System.out.print("\n Size is:"+cl.size());

	}

}
