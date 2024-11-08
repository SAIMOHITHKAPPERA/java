package com.placementtraining;
import java.util.*;
public class matrixmultiplication {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the values of matrix1");
		int r1=sc.nextInt();
		int c1=sc.nextInt();
		int arr1[][]=new int[r1][c1];
		for(int i=0;i<r1;i++) {
			for(int j=0;j<c1;arr1[i][j++]=sc.nextInt());
		}
		System.out.println("enter the values of matrix2");
		int r2=sc.nextInt();
		int c2=sc.nextInt();
		int arr2[][]=new int[r2][c2];
		for(int i=0;i<r2;i++) {
			for(int j=0;j<c2;arr2[i][j++]=sc.nextInt());
		}
		int res[][]=new int[r1][c2];
		int sum=0;
		for(int i=0;i<r1;i++) {
			for(int j=0;j<c2;j++) {
				sum=0;
				for(int k=0;k<c1;k++) {
					sum+=arr1[i][k]*arr2[k][j];
				}
				res[i][j]=sum;
			}
		}
		for(int i=0;i<r1;i++) {
			for(int j=0;j<c2;System.out.print(res[i][j++]+" "));
			System.out.println();
		}
		
		

	}

}
