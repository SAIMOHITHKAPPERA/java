package com.tcspreperation;
import java.util.*;
public class ArrrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		ArrayList<Integer> num=new ArrayList<>(List.of(10,20,30,40,50));
		num.set(2, 100);//set function is used to place a value upon one required position
		int sum=0;
		for(int i:num) {
			sum+=i;
		}
		System.out.println(sum);

	}

}
