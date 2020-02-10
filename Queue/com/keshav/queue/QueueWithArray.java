package com.keshav.queue;

public class QueueWithArray {
	
	private int maxSize;
	private static long[] queArray;
	private int front;
	private int rear;
	private int nItems;

	public QueueWithArray(int s) {
		// TODO Auto-generated constructor stub
		
		maxSize=s;
		queArray=new long[maxSize];
		front=-1;
		rear=-1;
		nItems=0;
	}
	
	public void enqueue(int x) {
		if(rear==maxSize-1) {
			System.out.println("Queue is Overflow");
		}
		else if(front==-1 && rear==-1) {
			front=0;
			rear=0;
			queArray[rear]=x;
		}
		else {
			rear=rear+1;
			queArray[rear]=x;
		}
		
		nItems++;
	}
	
	public long dequeue() {
		if(front==-1 && rear==-1) {
			System.out.println("Queue is underflow");
		}else if(rear==front) {
			front=-1;
			rear=-1;
		}else {
			front++;
		}
		return nItems--;
		
	}
	public long peek(long[] queArray) {
		if(rear==-1 && front==-1) {
			System.out.println("Queue is underflow");
		}
		return  queArray[front];
	}
	public boolean isEmpty() {
		return nItems==0;
	}
	
	
	public boolean isFull() 
	{
	return (nItems==maxSize);
	}
	
	public int size() 
	{
	return nItems;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		QueueWithArray aq=new QueueWithArray(5);
		aq.enqueue(5);
		aq.enqueue(19);
		aq.enqueue(7);
		aq.enqueue(9);
		aq.enqueue(0);
		aq.enqueue(15);
		System.out.println("\nEqueue Array ");
		aq.printQueueArray(queArray);
		aq.dequeue();
		System.out.println("\nDequeue Array ");
		aq.printQueueArray(queArray);
		System.out.println("\n Queue Array with Peek:"+aq.peek(queArray));
		System.out.println("\n Total Items:"+aq.size());
		System.out.println("\n Is Full:"+aq.isFull());
		
		
		while(!aq.isEmpty()) {
		long n=	aq.dequeue();
		
	System.out.println(n);
		}

	}

	private void printQueueArray(long[] queArray2) {
		// TODO Auto-generated method stub
		for(int i=front;i<rear+1;i++) {
			System.out.print(queArray[i]+" ");
		}
		
	}

}
