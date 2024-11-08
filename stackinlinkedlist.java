package com.placement.oops;
class Node{
	int data;
	Node next;
	Node(int d) {
		this.data=d;
		this.next=null;
	}
}
class Stack{
	Node top=null;
	void push(int d) {
		Node n=new Node(d);
		if(this.top==null) {
			this.top=n;
		}
		else {
			n.next=this.top;
			this.top=n;
		}
		System.out.println("push was succesful");
	}
	void pop() {
		if(this.top!=null) {
			top=this.top.next;
		}
	}
	void display() {
		Node current=this.top;
		for(int i=0;current.next!=null;i++) {
			System.out.print(current.data);
			current=current.next;
		}
		System.out.print(current.data);
	}
}
public class stackinlinkedlist {

	public static void main(String[] args) {
		Stack s=new Stack();
		s.push(5);
		s.push(10);
		s.push(15);
		s.display();
		
		

	}

}
