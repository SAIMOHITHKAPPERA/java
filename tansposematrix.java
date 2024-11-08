package com.placementtraining;
import java.util.*;
public class tansposematrix {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int row=sc.nextInt();
		int col=sc.nextInt();
		int arr[][]=new int[row][col];
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;arr[i][j++]=sc.nextInt());
		}
		int res[][]=new int[col][row];
		for(int i=0;i<col;i++) {
			for(int j=0;j<row;j++) {
				res[i][j]=arr[j][i];
			}
			
		}
		
		for(int i=0;i<col;i++) {
			for(int j=0;j<row;System.out.print(res[i][j++]+" "));
			System.out.println();
		}

	}

}
