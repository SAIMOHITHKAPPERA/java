package com.placement.oops;

public class LinkeListTotal {
	Node head;
	Node tail;
	class Node{
		int data;
		Node next;
		Node(int val){
			data=val;
		}
	}
	public void addFirst(int val) {
		Node obj=new Node(val);
		if(head==null && tail==null) {
			head=obj;
			tail=obj;
		}
		else {
			obj.next=head;
			head=obj;
		}
		
	}
	public void addLast(int val) {
		Node obj=new Node(val);
		if(head==null && tail==null) {
			head=obj;
			tail=obj;
		}
		else {
			Node temp=head;
			while(temp.next!=null) {
				temp=temp.next;
			}
			tail.next=obj;
			tail=obj;
		}
	}
	public void delete() {
		Node temp=head.next;
		head.next=null;
		head=temp;
	}
	public void deleteLast() {
		Node temp=head;
		while(temp.next.next!=null) {
			temp=temp.next;
		}
		temp.next=null;
	}
	/*public void deleteval(int a) {
		Node temp=head;
		if(temp)
		
	}*/
	public void printFromLast(Node head) {
		if(head==null) {
			return;
		}
			printFromLast(head.next);
			System.out.println(head.data);
	}
	public void display() {
		Node temp=head;
		while(temp.next!=null) {
			System.out.print(temp.data+"->");
			temp=temp.next;
		}
		System.out.print(temp.data);
	}

	public static void main(String[] args) {
		LinkeListTotal x=new LinkeListTotal();
		x.addFirst(5);
		x.addFirst(10);
		x.addFirst(15);
		x.addLast(20);
		x.display();
		System.out.println();
		x.printFromLast(x.head);
		

	}

}
