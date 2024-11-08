package com.tcspreperation;
import java.util.*;
public class HashSett {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> val=new HashSet<>();
		val.add("apple");
		val.add("banana");
		val.add("roses");
		val.add("grapes");
		val.remove("roses");
		System.out.println(val);
		System.out.println(val.contains("apple"));
		System.out.println(val.isEmpty());
		System.out.println(val.size());

	}

}
