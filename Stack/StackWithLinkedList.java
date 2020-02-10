
public class StackWithLinkedList {
	
	private static Node top;
	public class Node{
		int data;
		public Node next;
	}

	public void push(int data) {
		Node temp=new Node();
		temp.data=data;
		temp.next=top;
		top=temp;
	}
	public int pop() throws Exception {
		if(top==null) {
			isEmpty();
		}
	    int newData=top.data;
		top=top.next;
		return newData;
		
	}
	public int peek() throws Exception {
		if(top==null) {
			isEmpty();
		}
		int newData=top.data;
		return newData;
		
	}
	static boolean isEmpty() {
		if (top==null) {
			return true;
		}
		else {
			return false;
		}
	}
	
	
	public void printStack() {
		Node temp=top;
		while(temp!=null) {
			System.out.print(temp.data+"->");
			temp=temp.next;
		}
		
	}
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		StackWithLinkedList ssl=new StackWithLinkedList();
		ssl.push(5);
		ssl.push(6); 
		ssl.push(24);
		ssl.push(56);
		ssl.printStack();
		System.out.println("\nDeleted Element through pop:"+ssl.pop());
		ssl.printStack();
		System.out.println("\nDeleted Element through pop:"+ssl.pop());
		ssl.printStack();
		System.out.println("\nDeleted Element through peek:"+ssl.peek());
		ssl.printStack();
		System.out.println("\nDeleted Element through pop:"+ssl.pop());
		ssl.printStack();
		System.out.println("\nDeleted Element through pop:"+ssl.pop());
		ssl.printStack();
		System.out.println("\nDeleted Element through peek:"+ssl.peek());
		ssl.printStack();
		System.out.println("\n Is Empty Status:"+isEmpty());
		

	}

}
