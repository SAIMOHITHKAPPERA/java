package com.placementtraining;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt();
		int s=0;
		if(a!=0) {
			s=a%8;
		}
		
		if(s==1||s==4) {
			System.out.println("LOWER");
		}
		else if(s==2||s==5) {
			System.out.println("MIDDLE");
		}
		else if(s==3||s==6) {
			System.out.println("UPPER");
		}
		else if(s==7) {
			System.out.println("SIDELOWER");
		}
		else if(s==0) {
			System.out.println("SIDEUPPER");
		}
		else{
			System.out.println("NO SEAT AVAILABLE");
		}
	}

}
