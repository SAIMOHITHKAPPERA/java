package com.placementtraining;
import java.util.*;
public class printsequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String st=sc.nextLine();
		char arr[]=st.toCharArray();
		int len=arr.length;
		char val=' ';
		int count=0;
		int j=0;
		int i=0;
		while(i<len) {
			val=' ';
			count=0;
			
			if(arr[i]>='a' && arr[i]<='z') {
				val=arr[i];
				j=i+1;
				while(j<len) {
					int x=arr[j]-'0';
					if(arr[j]>='0' && arr[j]<='9') {
					count=count*10+x;
					j++;
					}
					else {
						break;
					}
				}
				
				for(int k=0;k<count;k++) {
					System.out.print(val);
					i=j;
				}
			}
			
			
		}

	}

}
