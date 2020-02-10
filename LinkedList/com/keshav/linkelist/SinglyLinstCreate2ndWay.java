package com.keshav.linkelist;

class Node {
	int data;
	Node next;
	int size;

	Node() {
		data = 0;
		next = null;
		size = 0;
	}

	Node(int data, Node next) {
		this.data = data;
		this.next = next;

	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}

}

class SinglyLinkedList {
	private Node head;
	private Node temp;
	private int size;

	public SinglyLinkedList() {
		head = null;
		temp = null;
		size = 0;
	}

	public void insert(int x) {
		Node newNode;
		newNode = new Node();
		newNode.setData(x);
		newNode.setNext(null);

		if (head == null) {
			head = temp = newNode;
		} else {
			temp.next = newNode;
			temp = newNode;
		}
		size++;
	}

	public void insertAtStart(int x) {
		// TODO Auto-generated method stub
		Node newNode;
		newNode = new Node();
		newNode.setData(x);
		;
		newNode.setNext(null);
		if (head == null) {
			head = newNode;
			
		} else {
			newNode.setNext(head);// newNode.next=head
			head = newNode;
		}
		size++;
	}

	public void insertAtLast(int x) {
		Node temp;
		Node newNode;
		newNode = new Node();
		newNode.setData(x);
		newNode.setNext(null);
		if (head == null) {
			head = newNode;
			temp = newNode;
		} else {
			temp = head;
			while (temp.next != null) {
				temp = temp.next;
			}
			temp.next = newNode;
		}
		size++;
	}
	
	public void insertBeforePos(int x,int pos) {
		
		Node temp,newNode;
		temp=head;
		newNode=new Node();
		newNode.setData(x);
		newNode.setNext(null);
		if(head==null) {
			head=newNode;
			temp=newNode;
		}else {
			if(pos>size) {
				System.out.println(" Invalid Input Position");
			}else {
				int i=1;
				while(i<pos-1) {
					temp=temp.next;
					i++;
				}
				newNode.next=temp.next;
				temp.next=newNode;
				temp=newNode;
			}
			
		}
		
	}

	public void printList() {
		// TODO Auto-generated method stub
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.getData() + "->");
			temp = temp.getNext();
		}
	}

	public int size() {
		// TODO Auto-generated method stub
		return size;
	}


}

public class SinglyLinstCreate2ndWay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SinglyLinkedList sll = new SinglyLinkedList();

		sll.insert(8);
		sll.insert(9);
		sll.insert(18);
		System.out.print("\n Print LinkedList:");
		sll.printList();

		sll.insertAtStart(99);
		System.out.print("\n Print LinkedList After Inserting Front:");
		sll.printList();
		sll.insertAtLast(199);

		System.out.print("\n Print LinkedList After Inserting at End:");
		sll.printList();
		
		sll.insertBeforePos(200,3);
		System.out.print("\n Print LinkedList Insertine Before Postion:");
		sll.printList();
		System.out.println("\n Size of the LinkedList:"+sll.size());

	}

}
