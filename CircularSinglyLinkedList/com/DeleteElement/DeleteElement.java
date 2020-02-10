package com.DeleteElement;

class Node {
	Node next;
	int data;

	Node() {
		next = null;
		data = 0;
	}

	Node(int data, Node next) {
		this.data = data;
		this.next = next;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}
}

class CircularLinkedList {
	private Node tail;
	private int size;

	CircularLinkedList() {
		tail = null;
		size = 0;
	}

	void insert(int x) {
		Node newNode;
		newNode = new Node();
		newNode.setData(x);
		newNode.setNext(null);
		if (tail == null) {
			tail = newNode;
			tail.next = newNode;
		} else {
			newNode.next = tail.next;
			tail.next = newNode;
			tail = newNode;

		}
		size++;
	}

	void insertAtFront(int x) {
		Node newNode;
		newNode = new Node();
		newNode.setData(x);
		newNode.setNext(null);
		if (tail == null) {
			System.out.println("LinkedList Empty");
		} else {
			Node temp;
			temp = tail.next;
			newNode.next = temp;
			tail.next = newNode;
		}
		size++;
	}

	public void insertAtEnd(int x) {
		// TODO Auto-generated method stub
		Node newNode;
		newNode = new Node();
		newNode.setData(x);
		newNode.setNext(null);
		if (tail == null) {
			System.out.println("Linked List is Empty");
		} else {
			newNode.next = tail.next;
			tail.next = newNode;
			tail = newNode;
		}

		size++;
	}

	public void deleteAtFront() {
		// TODO Auto-generated method stub

		Node temp;
		temp = tail.next;
		tail.next = temp.next;
		temp.next = null;
		size--;

	}

	public void deletedAtEnd() {
		// TODO Auto-generated method stub
		Node temp;
		temp = tail.next;
		while (temp.next.next != tail.next) {
			temp = temp.next;

		}
		temp.next = tail.next;
		tail = temp;

		size--;

	}

	public void print() {
		// TODO Auto-generated method stub
		Node temp;
		temp = tail.next;
		while (temp.next != tail.next) {
			System.out.print(temp.data + "->");
			temp = temp.next;
		}
		System.out.print(tail.data);
		System.out.println("\nfirst Element:" + tail.next.data);
		System.out.println("\nLast Element Inserted:" + tail.data);

	}

	public int size() {
		// TODO Auto-generated method stub
		return size;
	}

}

public class DeleteElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CircularLinkedList cll = new CircularLinkedList();
		cll.insert(4);
		cll.insert(24);
		cll.insert(22);
		cll.insert(7);
		System.out.print("\nPrint CircularList With tail Pointer:");
		cll.print();
		cll.insertAtFront(3);
		System.out.print("\nPrint CircularList :");
		cll.print();
		cll.insertAtEnd(8);
		System.out.print("\nPrint CircularList :");
		cll.print();
		cll.deleteAtFront();
		System.out.print("\nPrint After Delete At Front CircularList :");
		cll.print();
		cll.deletedAtEnd();
		System.out.print("\nPrint After Delete At End CircularList :");
		cll.print();

		System.out.print("\nSize:" + cll.size());
		;

	}

}
