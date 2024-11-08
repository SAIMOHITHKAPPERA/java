package com.placementtraining;
import java.util.*;
public class upptolowviceversa {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String st=sc.nextLine();
		int len=st.length();
		for(int i=0;i<len;i++) {
			char ch=st.charAt(i);
			if(ch>='a' && ch<='z') {
				char val=(char)(ch-' ');
				System.out.print(val);
			}
				
			else if(ch>='A' && ch<='Z')
			{
				char val=(char)(ch+' ');
				System.out.print(val);
			}
			else
				System.out.print(ch);

	}
	}
}
