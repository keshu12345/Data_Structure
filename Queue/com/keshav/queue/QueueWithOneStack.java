package com.keshav.queue;

import java.util.Stack;

public class QueueWithOneStack {

	Stack<Integer> s = new Stack<Integer>();

	public void enqueue(int x) {
		s.push(x);
	}

	public int dequeue() {
		if (s.size() == 0) {
			System.out.println("Queue is empty");
		} 
		else if (s.size() == 1) {
			return s.pop();
		} 
		else {
			int currData = s.pop();
			int result = dequeue();
			s.push(currData);
			

			return result;
		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		QueueWithOneStack qs = new QueueWithOneStack();

		qs.enqueue(50);
		qs.enqueue(6);
		qs.enqueue(60);
		qs.enqueue(16);
		System.out.print("\n Queue is printed:");
		qs.printQueue();
		System.out.print("\n Queue deleted no:" + qs.dequeue());
		System.out.print("\n Queue is printed:");
		qs.printQueue();

	}

	private void printQueue() {
		// TODO Auto-generated method stub
		for (int data : s) {
			System.out.print(data + "-");
		}

	}

}
