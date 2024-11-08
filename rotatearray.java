package com.placementtraining;
import java.util.*;
public class rotatearray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;arr[i++]=sc.nextInt());
		int temp=arr[n-1];
		int index=n-1;
		for(int i=0;i<n;i++) {
			if(i<(n-1)) {
			arr[n-1-i]=arr[n-2-i];
			
			}
			}
		arr[0]=temp;
		for(int i=0;i<n;System.out.print(arr[i++]+" "));
		}
		

	}

