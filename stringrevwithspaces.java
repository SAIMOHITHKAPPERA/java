package com.placementtraining;
import java.util.*;
public class stringrevwithspaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String st=sc.nextLine();
		char arr[]=st.toCharArray();
		int len=st.length();
		int i=0;
		int j=len-1;
		while(i<j) {
			if(arr[i]==' ')
				i++;
			else if(arr[j]==' ')
				j--;
			else {
				char temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				i++;
				j--;
						
			}
		}
		for(int k=0;k<arr.length;System.out.print(arr[k++]));
		

		System.out.print(arr);
	}

}
