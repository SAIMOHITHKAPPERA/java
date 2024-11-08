package com.placementtraining;
import java.util.*;
public class printthehighestnumbycomparingnext {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;arr[i++]=sc.nextInt());
		for(int i=0;i<n;i++) {
			int ref=0;
			for(int j=i+1;j<n;j++) {
				if(arr[i]<arr[j]) {
					break;
				}
					ref=j;

				
			}
			if(ref==(n-1)) {
				System.out.println(arr[i]+ " "+arr[n-1]);
			}
		}

	}

}
