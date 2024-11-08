package com.placementtraining;
import java.util.*;
public class printonlynonrepeatedelements {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no of elements");
		int n=sc.nextInt();
		boolean flag=false;
		int arr[]=new int[n];
		System.out.println("enter the  elements");
		for(int i=0;i<n;arr[i++]=sc.nextInt());
		int count[]=new int[n];
		for(int i=0;i<n-1;i++) 
		{
			flag=false;
			for(int j=i+1;j<n;j++)
			{
				if(arr[i]==arr[j]) {
					arr[j]=-1;
					flag=true;
				}
			}
			if(flag==false)
				arr[i]=-1;
		}
		for(int i=0;i<n;i++) {
			if(arr[i]!=-1)
				System.out.print(arr[i]+" ");		
			}
		
		
	}

}
