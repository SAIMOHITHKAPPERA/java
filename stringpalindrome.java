package com.placementtraining;
import java.util.*;
public class stringpalindrome {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String st=sc.nextLine();
		int len=st.length();
		int flag=1;
		for(int i=0;i<len;i++) {
			if(st.charAt(i)!=st.charAt(len-1-i)) {
				flag=0;
				break;
			}
		}
		if(flag==1) {
			System.out.print("yes");
		}
		else {
			System.out.print("no");
		}

	}

}
