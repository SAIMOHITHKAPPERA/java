package com.placement.oops;

class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

public class LinkedList1 {

    Node head = null;

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public void insertStart(int a) {
        Node newnode = new Node(a); 
        newnode.next = head;
        head = newnode;
        System.out.println("Inserted: " + a);
    }

    public static void main(String[] args) {
        LinkedList1 val = new LinkedList1();
        val.insertStart(10);
        val.insertStart(15);
        val.insertStart(11);

        val.display();  
    }
}
