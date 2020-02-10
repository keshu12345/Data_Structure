package com.keshav.cllDelete;

class Node {
	Node next;
	Node prev;
	int data;

	Node() {
		next = null;
		prev = null;
		data = 0;
	}

	Node(int data, Node next, Node prev) {
		this.data = data;
		this.next = next;
		this.prev = prev;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}

	public Node getPrev() {
		return prev;
	}

	public void setPrev(Node prev) {
		this.prev = prev;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}
}

class LinkedList {
	private Node head;
	private Node tail;
	private int size;

	LinkedList() {
		head = null;
		tail = null;
		size = 0;
	}

	void insert(int x) {
		Node newNode;

		newNode = new Node();
		newNode.setData(x);
		newNode.setNext(null);
		newNode.setPrev(null);

		if (head == null && tail == null) {
			head = tail = newNode;
			tail.next = head;
			head.next = head;
		} else {
			tail.next = newNode;
			newNode.prev = tail;
			head.prev = newNode;
			tail = newNode;
		}
		size++;
	}

	void insertAtFront(int x) {
		Node newNode;
		newNode = new Node();
		newNode.setData(x);

		if (head == null) {
			head = tail = newNode;
			tail.next = head;
			head.next = head;
		} else {
			newNode.next = head;
			head.prev = newNode;
			newNode.prev = tail;
			tail.next = newNode;
			head = newNode;
		}
		size++;

	}

	void insertAtEnd(int x) {
		Node newNode;
		newNode = new Node();
		newNode.setData(x);
		if (head == null && tail == null) {
			head = tail = newNode;
			head.prev = head;
			tail.next = head;
		} else {
			tail.next = newNode;
			newNode.prev = tail;
			newNode.next = head;
			tail = newNode;
		}
		size++;
	}

	void insertAtPos(int x, int pos) {
		Node newNode;
		newNode = new Node();

		if (pos > size) {
			System.out.println("Invalid Size");
		} else {
			Node temp;

			newNode.setData(x);
			temp = head;
			int i = 1;
			if (i < pos - 1) {
				temp = temp.next;
			}
			newNode.next = temp.next;
			newNode.next.prev = newNode;
			temp.next = newNode;
			newNode.prev = temp;
		}
		size++;
	}

	void deleteAtFront() {
		if (head == null) {
			System.out.println("LinkedList is Empty");
		} else if (head.next == null) {
			head = tail = null;
		} else {
			head = head.next;
			head.prev.next = null;
			head.prev = tail;
			tail.next = head;
		}
		size--;
	}

	void deleteAtEnd() {
		Node temp;
		temp = head;
		if (head == null) {
			System.out.println("LinkedList is empty");
		} else if (head.next == head) {
			head = tail = null;
		} else {
			while (temp.next != tail) {
				temp = temp.next;
			}
			temp.next = tail.next;
			head.prev = temp;
			tail.prev = null;
			tail = temp;

		}

		size--;

	}

	void deleteAtPos(int pos) {
		Node temp,nextNode;
		if(head==null) {
			System.out.println("Linked List is Empty");
		}else if(head.next==head) {
			head.next=null;
			tail.next=null;
			head=tail=null;
			
		}else {
			if (pos > size) {
				System.out.println("Invalid Entry");
			} else {
			
				if(pos==1) {
					deleteAtFront();
				}
				else if(pos==size) {
					deleteAtEnd();
				}
				else {
					temp = head;
					int i=1;
					while(i<pos-1) {
						temp=temp.next;
						i++;
					}
					nextNode=temp.next.next;
					nextNode.prev.next=null;
					nextNode.prev.prev=null;
					temp.next=nextNode;
					nextNode.prev=temp;
					}	
			}
		}
		size--;
		
	}

	public void print() {
		// TODO Auto-generated method stub
		Node temp;
		temp = head;
		while (temp != tail) {
			System.out.print(temp.data + "->");
			temp = temp.next;
		}
		System.out.print(tail.data);

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
		ll.insert(5);
		ll.insert(6);
		ll.insert(8);
		ll.insert(9);
		System.out.print("\n Print Doubly LinkedList:");
		ll.print();
		ll.insertAtFront(4);
		System.out.print("\n Print Doubly LinkedList InsertAtFront:");
		ll.print();
		ll.insertAtEnd(10);
		System.out.print("\n Print Doubly LinkedList InsertAtEnd:");
		ll.print();
		ll.insertAtPos(15, 3);
		System.out.print("\n Print Doubly LinkedList InsertAtPos3:");
		ll.print();
		ll.deleteAtFront();
		System.out.print("\n Print Doubly LinkedList DeleteAtFront:");
		ll.print();
		ll.deleteAtEnd();
		System.out.print("\n Print Doubly LinkedList DeleteAtEnd:");
		ll.print();
		ll.deleteAtPos(3);
		System.out.print("\n Print Doubly LinkedList DeleteAtAnyPostion:");
		ll.print();
		System.out.println("\n Size:" + ll.size());

	}

}
