package com.placementtraining;
import java.util.*;
public class rowsum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int rowsum=0;
		int row=sc.nextInt();
		int col=sc.nextInt();
		int arr[][]=new int[row][col];
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;arr[i][j++]=sc.nextInt());
		}
		
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				rowsum+=arr[i][j];
			}
			System.out.print(rowsum+" ");
			rowsum=0;
		}
		

	}

}
