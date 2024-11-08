package com.placementtraining;
import java.util.*;
public class wordreverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String st=sc.nextLine();
		int len=st.length();
		String word[]=st.split(" ");
		
		for(int i=word.length-1;i>=0;i--) {
			System.out.print(word[i]+" ");
		
		}

	}

}
