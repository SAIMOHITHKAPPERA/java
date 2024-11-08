package com.placementtraining;
import java.util.*;
public class getintsuminstring {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String st=sc.nextLine();
		char arr[]=st.toCharArray();
		int len=arr.length;
		int sum=0;
		for(int i=0;i<len;i++) {
			if(arr[i]>='0' && arr[i]<='9') {
				int num=arr[i]-'0';			
				sum+=num;
			}
		}
		System.out.println(sum);

	}

}
