package keshav.linklist;

public class StackWithLinkedList {
	private Node head;
	
	private class Node{
		int data;
		Node next;
	}
	public void push(int data) {
		Node temp=new Node();
		temp.data=data;
		temp.next=head;
		head=temp;
	}
	public int pop() throws Exception{
		if(head==null) {
			System.err.println("Stack is empty");
			throw new Exception("Stack is Empty");
		}
		int newData=head.data;
		head=head.next;
		return newData;
	}
	
	public int peek() throws Exception {
		if(head==null) {
			System.err.println("Stack is empty");
			throw new Exception("Stack is Empty");
		}
		return head.data;
		
	}
	
	public boolean isEmpty() {
		return head==null;
	}
	public void printStack() {
		Node temp=head;
		while(temp!=null) {
			System.out.print(temp.data+"->");
			temp=temp.next;
		}
		
	}

	public static void main(String[] args) throws Exception {
		
		StackWithLinkedList sl=new StackWithLinkedList();
		
		sl.push(24);
		sl.push(26);
		sl.push(98);
		sl.push(0);
		sl.push(101);
		sl.printStack();
		System.out.print("\n Deleted Element through pop:"+sl.pop());
		System.out.println("\n Deleted Element through peek:"+sl.peek());
		sl.printStack();
		
		
	

	}

}
