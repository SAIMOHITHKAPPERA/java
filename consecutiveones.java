package com.placementtraining;
import java.util.*;
public class consecutiveones {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;arr[i++]=sc.nextInt());
		int count=0;
		int max=0;
		for(int i=0;i<n;i++) {
			if(arr[i]==1) {
				count++;

			}
			else {
				if(max<count) {
				max=count;
				}
				count=0;
			}
		}
		if(max<count) {
			max=count;
			}
			count=0;
		System.out.println(max);

	}

}
