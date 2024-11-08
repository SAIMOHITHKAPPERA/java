package com.placementtraining;
import java.util.*;
public class diffofsummeddiagonals {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[][]=new int[n][n];
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;arr[i][j++]=sc.nextInt());
		}
		int left=0;
		int right=0;
		int diff=0;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(i==j) {
					left+=arr[i][j];
				}
				if((i+j)==(n-1)) {
					right+=arr[i][j];
					
				}
			}
		}
		diff=left-right;
		System.out.println(diff);
		
	}

}
