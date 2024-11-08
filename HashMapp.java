package com.tcspreperation;
import java.util.*;
public class HashMapp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,Integer> val=new HashMap<>();
		val.put("john",25);
		val.put("mohith", 24);
		val.put("king",30);
		System.out.println("age of john is"+val.get("john"));
		val.put("mohith", 21);
		System.out.println("age of mohith is"+val.get("mohith"));
		val.remove("king");
		System.out.println("king is present "+val.containsKey("king"));
		for(String key:val.keySet()) {
			System.out.println(key+":"+val.get(key));
		}
	}

}
