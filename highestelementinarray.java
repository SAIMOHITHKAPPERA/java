package com.placementtraining;
import java.util.Scanner;
public class highestelementinarray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;arr[i++]=sc.nextInt());
		int max=arr[0];
		int count=0;
		while(count!=(n)) {
			if(max<arr[count]) {
				max=arr[count];
				count++;
			}
			else {
				count++;
			}
		}
		System.out.println("max is "+max);

	}

}
