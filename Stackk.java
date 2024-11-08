package com.tcspreperation;
import java.util.*;
public class Stackk {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> st=new Stack<>();
		for(int i=10;i<16;i++) {
			st.push(i);
		}
		st.pop();
		System.out.println(st.peek());
		System.out.println(st.isEmpty()+" "+st.size());
		

	}

}
