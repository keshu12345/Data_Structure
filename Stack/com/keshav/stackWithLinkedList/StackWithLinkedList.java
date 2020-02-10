package com.keshav.stackWithLinkedList;
class Node{
    Node next;
    int data;
    Node(){
    	next=null;
    	data=0;
    }
    Node(int data,Node next){
    	this.data=data;
    	this.next=next;
    }
	public Node getNext() {
		return next;
	}
	public void setNext(Node next) {
		this.next = next;
	}
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
}
class StackLinkedList{
	private Node top;
	private int size;
	StackLinkedList(){
		top=null;
		size=0;
		}
	void push(int x) {
		Node newNode;
		newNode=new Node();
		newNode.setData(x);
		newNode.next=top;
		top=newNode;
	}
	
	void pop() {
		if(top==null) {
			System.out.println("Stack is empty");
		}
		else {
			Node temp;
			temp=top;
			top=top.next;
			temp.next=null;
			
		}
	}
	public int peek() {
		// TODO Auto-generated method stub
		if(top==null) {
			System.out.println("Stack is empty");
		}else {
			return top.data;
		}
		return -1000;
	}
	
	public void printStack() {
		// TODO Auto-generated method stub
		Node temp;
		temp=top;
		while(temp!=null) {
			System.out.print(temp.data+"->");
			temp=temp.next;
		}
		
	}
	
	
}

public class StackWithLinkedList {
	public static void main(String args[]) {
		StackLinkedList sl=new StackLinkedList();
		sl.push(10);
		sl.push(15);
		sl.push(12);
		sl.push(9);
		sl.push(18);
		System.out.print("\nPrint Stack with LinkeList:");
		sl.printStack();
		sl.pop();
		System.out.print("\nPrint Stack with LinkeList Pop:");
		sl.printStack();
		System.out.print("\nPeek:"+sl.peek());
		System.out.print("\nPrint Stack with LinkeList after peek:");
		sl.printStack();
	}
	
     
	

}
