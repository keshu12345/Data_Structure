package com.keshav.queue;
public class QueueWithLinkedlist {
	private Node front=null,rear=null;
	private int currentSize;
class Node{
		int data;
		Node next;
	}
private void enqueue(int x)throws Exception {
		// TODO Auto-generated method stub
		Node newNode;
		newNode=new Node();
		newNode.data=x;
		newNode.next=null;
		if(front==null && rear==null) {
			front=newNode;
			rear=newNode;
		}else {
			rear.next=newNode;
			rear=newNode;
			}
		currentSize++;
		}
	public void dequeue() {
		if(front==null && rear==null) {
			System.out.println("Queue is empty");
		}else {
			front=front.next;
		}
		currentSize--;
	}
	public int peek() {
		return front.data;
		
	}
	
	public  int size() {
		return currentSize;
	}
	public boolean isEmpty() {
		return (currentSize==0);
	}
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		QueueWithLinkedlist qll=new QueueWithLinkedlist();
		qll.enqueue(5);
		qll.enqueue(15);
		System.out.print("Queue linkedlist:");
		qll.printQueue();
		qll.dequeue();
		System.out.print("\nQueue linkedlist:");
		qll.printQueue();
		System.out.print("\n Queue through peek :"+qll.peek());
		
		qll.dequeue();
		System.out.print("\nQueue linkedlist:");
		qll.printQueue();
		System.out.println("\n Is Empty:"+qll.isEmpty());
		
		System.out.println("\n Size:"+qll.size());
	}

	private void printQueue() {
		// TODO Auto-generated method stub
		Node temp;
		if(rear==null && front==null) {
			System.out.println("Queue is Empty");
		}else {
			temp=front;
			while(temp!=null) {
				System.out.print(temp.data+"->");
				temp=temp.next;
			}
		}
		
	}

	

}
