package com.placementtraining;
import java.util.*;
public class colsum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int colsum=0;
		int row=sc.nextInt();
		int col=sc.nextInt();
		int arr[][]=new int[row][col];
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;arr[i][j++]=sc.nextInt());
		}
		
		for(int j=0;j<col;j++) {
			for(int i=0;i<row;i++){
				colsum+=arr[i][j];
			}
			System.out.print(colsum+" ");
			colsum=0;
		}
		

	}

}
