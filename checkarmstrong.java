package com.placementtraining;
import java.util.*;
public class checkarmstrong {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		if(isArmstrong(n)) {
			System.out.print("Yes");
		}
		else {
			System.out.print("No");
		}

	}
	public static int digitCount(int n) {
		int count=0;
		for( ;n>0;n/=10,count++);
		
		return count;
	}
	public static boolean isArmstrong(int n) {
		int temp=n;
		int count=digitCount(n);
		int sum=0;
		while(n>0) {
			int x=n%10;
			sum+=(int)Math.pow(x, count);
			n/=10;
		}
		if(compare(sum,temp))
			return true;
		else
			return false;
	}
	public static boolean compare(int sum,int n) {
		if(sum==n)
			return true;
		else
			return false;
	}

}
