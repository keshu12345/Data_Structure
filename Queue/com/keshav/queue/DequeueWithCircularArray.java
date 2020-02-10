package com.keshav.queue;

public class DequeueWithCircularArray {
	private int front;
	private int rear;
	private int arr[];

	public DequeueWithCircularArray(int n) {
		// TODO Auto-generated constructor stub
		front=-1;
		rear=-1;
		arr=new int [n];
	}
	private void enquefront(int x) {
		if((front==0 && rear==arr.length-1)||(front==rear+1)) {
			System.out.println("Dequeue is full");
		}else if(front==-1 && rear==-1) {
			front=0;
			rear=0;
			arr[front]=x;
		}else if(front==0) {
			front=arr.length-1;
			arr[front]=x;
		}else {
			front--;
			arr[front]=x;
		}
	}
	
	private void enquerear(int x) {
		if((rear+1)%arr.length==front) {
			System.out.println("Dequeue is full");
		}else if(front==-1 && rear==-1) {
			front=0;
			rear=0;
			arr[rear]=x;
		}else if(rear==arr.length-1) {
			rear=0;
			arr[rear]=x;
		}else {
			rear++;
			arr[rear]=x;
		}
	}
	
	private void dequefront() {
		if(rear==-1 && front==-1) {
			System.out.println("Dequeue is underflow");
		}else if(rear==front) {
			rear=-1;
			front=-1;
		}else if(front==arr.length-1) {
			front=0;
		}else {
			front++;
		}
	}
	
	private void dequerear() {
		if(rear==-1 && front==-1) {
			System.out.println("Dequeue is underflow");
		}else if(front==rear) {
			front=-1;
			rear=-1;
		}else if(rear==0) {
			rear=arr.length;
		}else {
			rear--;
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DequeueWithCircularArray dq=new DequeueWithCircularArray(10);
		dq.enquefront(2);
		dq.enquefront(5);
		dq.enquerear(-15);
		dq.enquerear(20);
		System.out.print("\n Dequeue is:");
		dq.printDeque();
		dq.dequefront();
		System.out.print("\n Dequeue after front deletion:");
		dq.printDeque();
		dq.dequerear();
		System.out.print("\n Dequeue after rear deletion:");
		dq.printDeque();
		
		}
	private void printDeque() {
		// TODO Auto-generated method stub
		int i=front;
		if(rear==-1 && front==-1) {
			System.out.println("Dequeue is empty");
		}else {
			while(i!=rear) {
				System.out.print(arr[i]+" ");
				i=(i+1)%arr.length;
			}
			System.out.print(arr[rear]);
		}
		
	}

}
