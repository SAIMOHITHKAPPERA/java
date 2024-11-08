package com.placementtraining;
import java.util.Scanner;
public class arrayspractice {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int sum=0;
		int product=1;
		int n=sc.nextInt();
		int arr[]= new int[n];
		for(int i=0;i<n;arr[i]=sc.nextInt(),i++);
		for(int i=0;i<n;System.out.println(10*arr[i]),i++);	
		for(int i=0;i<n;i++) {
			sum+=arr[i];
			product*=arr[i];
		}

	}

}
