package com.keshav.stackWithArray;

public class StackWithArray {
private int top;
private int stack[];

StackWithArray(int n){
	stack=new int[n];
	top=-1;
}

void push(int x) {
	if(top==stack.length-1) {
		System.out.println("Stack is empty");
	}
	top++;
	stack[top]=x;
}

void pop() {
	if(top==-1) {
		System.out.println("Stack is underflow");
	}else {
		top--;
	}
}

int peek() {
	if(top==-1) {
		System.out.println("Stack is empty");
	}else {
		return stack[top];
	}
	return -2000;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       StackWithArray sa=new StackWithArray(5);
       
		sa.push(1);
		sa.push(2);
		sa.push(3);
		sa.push(4);
		sa.push(5);
	   System.out.print("\n Stack with Array:");
	   sa.printStack();
	   sa.pop();
	   System.out.print("\n Stack with Array:");
	   sa.printStack();
	   System.out.print("\n Peek:"+sa.peek());
	   System.out.print("\n Stack with Array after peek:");
	   sa.printStack();	
	}

	private void printStack() {
		// TODO Auto-generated method stub
		for(int i=top;i>=0;i--) {
			System.out.print(stack[i]+"-");
		}
		
	}

}
