package com.tcspreperation;
import java.util.*;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int[] num=new int[5];
		for(int i=0;i<5;i++) {
			num[i]=sc.nextInt();
		}
		num[3]=12;
		int summ=0;
		//System.out.println(num[4]);
		for(int n:num) {
			//System.out.println(n);
			summ+=n;
			
		}
		
		System.out.println(summ);

	}

}
