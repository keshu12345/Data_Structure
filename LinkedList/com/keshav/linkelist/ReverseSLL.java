package com.keshav.linkelist;
class Node3{
	int data;
	Node3 next;
	public Node3() {
		data=0;
		next=null;
	}
	
	public Node3(int data,Node3 next) {
		this.data=data;
		this.next=next;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public Node3 getNext() {
		return next;
	}

	public void setNext(Node3 next) {
		this.next = next;
	}
	
}
class ReverseList{
	private Node3 head,temp;
	private int size;
	public ReverseList() {
		head=null;
		temp=null;
		size=0;
	}
	public void createList(int x) {
		Node3 newNode;
		newNode = new Node3();
		newNode.setData(x);
		newNode.setNext(null);
		if (head == null) {
			head = newNode;
			temp = newNode;
		} else {
			temp.setNext(newNode);//temp.next=newNode;
			temp = newNode;
		}
		size++;
	}
	
	public void reverseList() {
		// TODO Auto-generated method stub
		Node3 curr,currPre = null,currNext;
		
		      curr=currNext=head;
		      
		      while(currNext!=null) {
		    	  currNext=currNext.next;
		    	  curr.next=currPre;
		    	  currPre=curr;
		    	  curr=currNext;
		      }
		      head=currPre;
		
	}
	public void printList() {
		// TODO Auto-generated method stub
		Node3 temp;
		temp = head;
		while (temp != null) {
			System.out.print(temp.data + "->");
			temp = temp.next;
		}

	}
	

	
}

public class ReverseSLL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReverseList rll=new ReverseList();
		rll.createList(1);
		rll.createList(2);
		rll.createList(3);
		rll.createList(4);
		rll.createList(5);
		rll.createList(6);
		System.out.print("Print the LinkedList:");
		rll.printList();
		rll.reverseList();
		System.out.print("\nPrint Reverse LinkedList:");
		rll.printList();

	}

}
