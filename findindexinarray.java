package com.placementtraining;
import java.util.Scanner;
public class findindexinarray {
	public static void main(String []args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;arr[i++]=sc.nextInt());
		System.out.println("enter the target");
		int target=sc.nextInt();
		for(int i=0;i<n;i++) {
			if(target==arr[i]) {
				System.out.println("index found at "+i);
			}
			if(i==(n-1)&target!=arr[i])
				System.out.println("target not found");
			
		}
	}

}
