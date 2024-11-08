package com.tcspreperation;
import java.util.*;
public class Queuee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Integer> qe=new LinkedList<>();
		for(int i=21;i<28;i++) {
			qe.offer(i);
		}
		while(!qe.isEmpty()) {
			System.out.println(qe.poll());
		}
		

	}

}
