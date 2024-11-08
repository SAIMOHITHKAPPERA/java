package com.placement.oops;

public class LinkedList{
	Node head;
	Node tail;
	class Node{
		int data;
		Node next;
		public Node(int i) {
			data=i;
		}
	}
}
/*
class Node{
	  int data;
	  Node next;
	}
	public class LinkedList{
	  public static void main(String args[]){
	    Node a=new Node();
	    a.data=100;
	    Node b=new Node();
	    b.data=200;
	    Node c=new Node();
	    c.data=300;
	    a.next=b;
	    b.next=c;
	    System.out.println(a.next.data);
	    System.out.println(b.data);
	  }
	}*/
/*class Node{
	  int data;
	  Node next;
	  public Node(int i){
	    data=i;
	  }
	}
	public class Main{
	  public static void main(String args[]){
	    Node a=new Node(100);
	    Node b=new Node(200);
	    Node c=new Node(300);
	    a.next=b;
	    b.next=c;
	  }
	}*/
	
	