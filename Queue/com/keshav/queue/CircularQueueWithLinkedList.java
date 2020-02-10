package com.keshav.queue;

public class CircularQueueWithLinkedList {
	private Node front;
	private Node rear;
	
	public class Node{
		int data;
		Node next;
	}
	public CircularQueueWithLinkedList() {
		front=null;
		rear=null;
	}
	public void enqueue(int x) {
		Node newNode;
		newNode=new Node();
		newNode.data=x;
		newNode.next=null;
		if(front==null && rear==null) {
			rear=newNode;
			front=newNode;
			rear.next=front;
		}else {
			rear.next=newNode;
			rear=newNode;
			newNode.next=front;
		}
		
	}
	public void dequeue() {
		if(front==null && rear==null) {
			System.out.println("Queue is empty");
		}else if(rear==front) {
			front=null;
			rear=null;
		}else {
			front=front.next;
			rear.next=front;
		}
	}
	
 private int peek() {
	 if(front==null && rear==null) {
		 System.out.println("Circular Queue is empty");
	 }else {
		 return front.data;
	 }
	 return -100;
 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CircularQueueWithLinkedList cql=new CircularQueueWithLinkedList();
		cql.enqueue(5);
		cql.enqueue(15);
		cql.enqueue(50);
		cql.enqueue(156);
		cql.dequeue();
		System.out.print("\n Circular Queue:");
		cql.printQueue();
		System.out.print("\n Circular Queue with peek:"+cql.peek());
		System.out.print("\n Circular Queue:");
		cql.printQueue();
		
		
	}
	private void printQueue() {
		// TODO Auto-generated method stub
		Node temp;
		temp=front;
		if(front==null && rear==null) {
			System.out.println("Queue is empty");
		}else {
			while(temp.next!=front) {
				System.out.print(temp.data+" ");
				temp=temp.next;
			}
			System.out.print(temp.data);
		}
	}

}
