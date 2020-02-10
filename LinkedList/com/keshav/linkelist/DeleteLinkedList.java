package com.keshav.linkelist;

class Node1 {
	int data;
	Node1 next;

	Node1() {
		data = 0;
		next = null;

	}

	Node1(int data, Node1 next) {
		this.data = data;
		this.next = next;

	}

	public void setData(int data) {
		this.data = data;
	}

	public int getData() {
		return data;
	}

	public void setNext(Node1 next) {
		this.next = next;
	}

	public Node1 getNext() {
		return next;
	}
}

class LinkedList {
	private Node1 head;
	private int size;
	private Node1 temp;

	public LinkedList() {
		head = null;
		temp = null;
		size = 0;
	}

	public void createList(int x) {
		Node1 newNode;
		newNode = new Node1();
		newNode.setData(x);
		newNode.setNext(null);
		if (head == null) {
			head = newNode;
			temp = newNode;
		} else {
			temp.setNext(newNode);
			temp = newNode;
		}
		size++;
	}

	public void deleteAtFront() {
		// TODO Auto-generated method stub
		if (head == null) {
			System.out.println("Linked List is empty");
		} else {
			head = head.next;
		}
		size--;
	}

	public void deleteAtEnd() {
		if (head == null) {
			System.out.println("Linked List is empty");
		} else {
			temp = head;
			int i = 1;
			while (temp.next.next != null) {
				temp = temp.next;
			}
			temp.next = null;
			size--;

		}
	}
	
	public void deleteAtPos(int pos) {
		Node1 curr;
		
		if(pos>size) {
			System.out.println("Invalid input");
		}else {
			int i=1;
			temp=head;
			while(i<pos-1) {
				temp=temp.next;
				i++;
			}
			curr=temp.next;
			temp.next=curr.next;
			
		}
	}

	public void printList() {
		// TODO Auto-generated method stub
		Node1 temp;
		temp = head;
		while (temp != null) {
			System.out.print(temp.data + "->");
			temp = temp.next;
		}

	}

	public int size() {
		// TODO Auto-generated method stub
		return size;
	}

}

public class DeleteLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList ll = new LinkedList();

		ll.createList(1);
		ll.createList(9);
		ll.createList(0);
		ll.createList(28);
		ll.createList(23);
		ll.createList(19);
		System.out.print("Print the LinkedList:");
		ll.printList();
		System.out.println("\n Size of the LinkedList:" + ll.size());
		ll.deleteAtFront();
		System.out.print("Print the DeleteList from FrontEnd:");
		ll.printList();
		System.out.println("\n Size of the LinkedList:" + ll.size());
		ll.deleteAtEnd();
		System.out.print("Print the DeleteList from End:");
		ll.printList();
		System.out.println("\n Size of the LinkedList:" + ll.size());
		ll.deleteAtPos(3);
		System.out.print("Print the DeleteList At Position:");
		ll.printList();
		System.out.println("\n Size of the LinkedList:" + ll.size());

	}

}
