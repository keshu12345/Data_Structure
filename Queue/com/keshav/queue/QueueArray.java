package com.keshav.queue;

public class QueueArray {
	
	private int rear;
	private int front;
	private int arr[];
	private int currSize;
	class Node{
		int data;
		Node next;
	}

	public QueueArray(int n) {
		// TODO Auto-generated constructor stub
		arr =new int[n];
		rear=-1;
		front=-1;
		currSize=0;
		}
	public void enqueue(int x) {
		if(rear==arr.length-1) {
			System.out.println("Queue is overflow");
		}
		else if(rear==-1 && front==-1) {
			front=0;
			rear=0;
			arr[rear]=x;
		}
		else {
			rear=rear+1;
			arr[rear]=x;
		}
		currSize++;
		
	}
	public void dequeue() {
		if(rear==-1 && front==-1) {
			System.out.println("Queue is empty");
		}
		else if(front==rear) {
			front=-1;
			rear=-1;
		}else {
			front++;
		}
		currSize--;
	}
	public int peek() {
		if(rear==-1 && front==-1) {
			System.out.println("Queue is empty");
		}
		else {
			return arr[front];
		}
		return -1;
	}
	public int size() {
		return currSize;
	}
	public boolean isEmpty() {
		return (currSize==0);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     QueueArray qa=new QueueArray(5);
     
     qa.enqueue(20);
     qa.enqueue(14);
     qa.enqueue(2);
     qa.enqueue(200);
     System.out.println("\n Queue with Array:");
     qa.printQueue();
     
     qa.dequeue();
     System.out.println("\n DeQueue with Array:");
     qa.printQueue();
     
     qa.dequeue();
     System.out.println("\n Queue with Array:");
     qa.printQueue();
     System.out.print("\nPeek with Queue:"+qa.peek());
     qa.dequeue();
     qa.dequeue();
     
     System.out.println("\nSize:"+qa.size());
     System.out.println("\nIsEmpty:"+qa.isEmpty());
		}
	
	
	public void printQueue() {
		int temp;
		if(rear==-1 && front==-1) {
			System.out.println("Queue is Empty");
		}
		for(temp=front;temp<=rear;temp++) {
			System.out.print(arr[temp]+"-");
			
		}
	}

}
