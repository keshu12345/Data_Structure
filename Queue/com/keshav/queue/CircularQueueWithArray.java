package com.keshav.queue;
public class CircularQueueWithArray {
	private int front;
	private int rear;
	private int arr[];
    public CircularQueueWithArray(int n) {
		// TODO Auto-generated constructor stub
		arr=new int[n];
		rear=-1;
		front=-1;
	}
	private void cQueue(int x) {
		if(rear==-1 && front==-1) {
			rear=0;
			front=0;
			arr[rear]=x;
		}
		else if((rear+1)%arr.length==front) {
			System.out.println("\nCircularQueue is full");
		}else if(rear==arr.length-1) {
			rear=0;
			arr[rear]=x;
		}
		else {
			rear++;
			arr[rear]=x;
		}
	}
	private void cDequeue() {
		if(rear==-1 && front==-1) {
			System.out.println("CircularQueue is empty");
		}
		else if(rear==front) {
			rear=-1;
		    front=-1;
			}
		else {
				   front++;
				   }
	}
  public static void main(String[] args) {
		CircularQueueWithArray cq=new CircularQueueWithArray(5);
		cq.cQueue(5);
		cq.cQueue(15);
		cq.cQueue(50);
		cq.cQueue(35);
		cq.cQueue(59);
		System.out.println("\nCircular Queue:");
		cq.printCQueue();
		cq.cDequeue();
		cq.cDequeue();
		cq.cDequeue();
		cq.cDequeue();
		cq.cQueue(100); 
		cq.cDequeue();
		
	    cq.cQueue(102); 
	    cq.cQueue(103); 
	    cq.cDequeue();
		
		
		System.out.println("\nCircular Queue:");
		cq.printCQueue();
		}
	private void printCQueue() {
		// TODO Auto-generated method stub
		int i=front;
		while(i!=rear) {
			System.out.print(arr[i]+" ");
			i=(i+1)%arr.length;
		}
		System.out.print(arr[rear]);
	}
}
