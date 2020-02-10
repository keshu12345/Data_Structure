package com.keshav.queue;

public class QueueWith2Stack {
	private int s1[];
	private int s2[];
	private int top1;
	private int top2;
	private int count;
	private int a,b;
public QueueWith2Stack(int n) {
		// TODO Auto-generated constructor stub
		s1=new int[n];
		s2=new int[n];
		top1=-1;
		top2=-1;
		count=0;
		}
	public void push1(int x) {
		if(top1==s1.length) {
			System.out.println("Queue is overflow");
		}else {
			top1++;
			s1[top1]=x;
		}
		
	}
	public void enqueue(int x) {
		if(top1==s1.length) {
			System.out.println("Queue is overflow");
		}else {
			push1(x);
			count++;
		}
	}
	
	public void dequeue() {
		if(top1==-1 && top2==-1) {
			System.out.println("Queue is empty");
		}
		else {
			for(int i=0;i<count;i++) {
				a=pop1();
				push2(a);
			}
			b=pop2();
			count--;
		}
		
		for(int i=0;i<count;i++) {
			a=pop2();
			push1(a);
		}
	}


	private int pop1() {
		// TODO Auto-generated method stub
		if(top1==-1) {
			System.out.println("Queue is empty");
		}else {
			return s1[top1--];
		}
		
		return -1;
		
	}
	
	
	private int pop2() {
		if(top2==-1) {
			System.out.println("Queue is empty");
		}else {
			return s2[top2--];
		}
		return -1;
	}
	public void push2(int x) {
		if(top2==s2.length) {
			System.out.println("Queue is full");
			
		}else {
			top2++;
			s2[top2]=x;
		}
	}
	private int peek() {
		if(top1==-1) {
			System.out.println("Queue is empty");
		}
		else {
			return s1[0];
		}
		return -1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		QueueWith2Stack qs=new QueueWith2Stack(5);
		
		qs.enqueue(6);
		qs.enqueue(9);
		qs.enqueue(5);
		qs.enqueue(3);
		qs.dequeue();
		System.out.println("\nQueue Using two stack:");
		qs.printQueue();
		System.out.print("\n Queue using peek:"+qs.peek());

	}
	private void printQueue() {
		// TODO Auto-generated method stub
		if(top1==-1 ) {
			System.out.println("Queue is empty");
		}else {
			
			for(int i=0;i<=top1;i++) {
				
				System.out.print(s1[i]+"-");
			}
		}
		
	}

}
