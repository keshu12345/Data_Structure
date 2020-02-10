package com.keshav.linkelist;

public class CreateSinglyLinkedList {
	
    Node head;
    Node temp;
	
	class Node{
		int data;
		Node next;
		
		}
	public CreateSinglyLinkedList() {
		head=null;
		temp=null;
	}
	
	
	private void createList(int x) {
		Node newNode;
		newNode=new Node();
		newNode.data=x;
		newNode.next=null;
		if(head==null) {
			head=newNode;
			temp=newNode;
		}else {
		
				temp.next=newNode;
				temp=newNode;
			}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CreateSinglyLinkedList csll=new CreateSinglyLinkedList();
		csll.createList(3);
		csll.createList(15);
		csll.createList(30);
		csll.createList(13);
		csll.createList(1);
		System.out.println("\n Singly Linked List:");
		csll.printLinkedList();
		
	}

	private void printLinkedList() {
		// TODO Auto-generated method stub
		Node temp=head;
		
		while(temp!=null) {
			System.out.print(temp.data+"->");
			temp=temp.next;
		}
		
	}

}
