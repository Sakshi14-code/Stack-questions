package stack;


import java.util.*;
public class BasicStack {
	int top;
	int capacity;
	int []stack;
	BasicStack(){
		top=-1;
		capacity=10;
		stack = new int[capacity];
	};
	public 	boolean isEmpty() {
		return top==-1;
	}
	public 	boolean isFull() {
		return top==capacity;
	}
	public int push(int data) {
		if(isFull()) {
			System.out.println("Stack is Full");
		}
		return stack[++top]=data;
	}
	public int pop() {
		if(isEmpty()) {
			System.out.println("Stack is Empty");
		}
		return stack[top--];
	}
	public int peek() {
		return stack[top];
	}
	public static void main(String[] args) {
		Stack<Integer> st = new Stack<Integer>();
		st.push(23);
		st.push(24);
		st.push(25);
		st.push(26);
		st.push(27);
		System.out.println(st.isEmpty());

		System.out.println(st.peek());
		System.out.println(st.pop());
		System.out.println(st.pop());
		
	}
}
	


	

