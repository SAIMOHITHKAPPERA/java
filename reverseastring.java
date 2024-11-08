package com.placementtraining;
import java.util.*;
public class reverseastring {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String st=sc.nextLine();
		int len=st.length();
		for(int i=0;i<len;i++) {
			System.out.print(st.charAt(len-1-i));
		}
	}

}
