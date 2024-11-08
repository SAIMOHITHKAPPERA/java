package com.placementtraining;
import java.util.*;
public class maxeleinrow {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int max=Integer.MIN_VALUE;
		int row=sc.nextInt();
		int col=sc.nextInt();
		int arr[][]=new int[row][col];
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;arr[i][j++]=sc.nextInt());
		}
		
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				if(max<arr[i][j]) {
					max=arr[i][j];
				}
			}
			System.out.print(max+" ");
			max=Integer.MIN_VALUE;
		}
		

	}

}

