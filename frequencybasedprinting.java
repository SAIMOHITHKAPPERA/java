package com.placementtraining;

import java.util.*;
public class frequencybasedprinting {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;arr[i++]=sc.nextInt());
		for(int i=0;i<n;i++) {
			int count=1;
				for(int j=i+1;j<n;j++) {
					if(arr[i]==arr[j]) {
						count++;
						arr[j]=-1;
					}
				}
			if(arr[i]!=-1)
				System.out.println(arr[i]+" "+count+"");
		}
	}
}
