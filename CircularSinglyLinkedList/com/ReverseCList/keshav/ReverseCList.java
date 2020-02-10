package com.ReverseCList.keshav;

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
class LinkedList{
	private Node tail;
	private int size;
	LinkedList(){
		tail=null;
		size=0;
	}
 void insert(int x) {
	 Node newNode;
	 newNode=new Node();
	 newNode.setData(x);
	 newNode.setNext(null);
	 if(tail==null) {
		 tail=newNode;
		 tail.next=newNode;
	 }else {
		 newNode.next=tail.next;
		 tail.next=newNode;
		 tail=newNode;
	 }
	 
 }
 void reverse() {
	 Node current,prev,nextNode;
	 if(tail==null) {
		 System.out.println("Linked List is empty");
	 }
	 else {
		 current=tail.next;
		 nextNode=current.next;
		 while(current!=tail) {
			 prev=current;
			 current=nextNode;
			 nextNode=current.next;
			 current.next=prev;
			 
			  }
		 nextNode.next=tail;
		 tail=nextNode;
	 }
	
	 
	
 }
public void print() {
	// TODO Auto-generated method stub
	Node temp;
	temp=tail.next;
	while(temp.next!=tail.next) {
		System.out.print(temp.data+"->");
		temp=temp.next;
	}
	System.out.print(tail.data);
}
	
}

public class ReverseCList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList ll=new LinkedList();
		ll.insert(6);
		ll.insert(7);
		ll.insert(8);
		ll.insert(9);
		ll.insert(10);
		System.out.print("\nPrint CircularList :");
		ll.print();
		ll.reverse();
		System.out.print("\nPrint Reverse CircularList :");
		ll.print();

	}

}
