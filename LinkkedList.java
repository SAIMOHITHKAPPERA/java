package com.tcspreperation;
import java.util.*;
public class LinkkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> list1=new LinkedList<>();
		for(int i=1;i<=5;i++) {
			list1.add(i);
		}
		for(int i:list1) {
			System.out.println(i);
		}
		list1.removeFirst();
		list1.removeLast();
		System.out.println(list1.contains(3));
		System.out.println(list1);
		System.out.println("getfirst "+list1.getFirst());
		System.out.println("getlast "+list1.getLast());
		list1.clear();
		System.out.println(list1);

	}

}
