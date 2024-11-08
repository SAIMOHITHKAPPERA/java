package com.placementtraining;
import java.util.*;
public class switchcase {

	public static void main(String[] args) {
		Scanner val=new Scanner(System.in);
		System.out.println("enter any of these operators  +,-,*,/");
		char c=val.next().charAt(0);
		int num1=val.nextInt();
		int num2=val.nextInt();
		switch(c)
		{
		case '+':
			System.out.println(num1+num2);
			break;
		case '-':
			System.out.println(num1-num2);
			break;
		case '*':
			System.out.println(num1*num2);
			break;
		case '/':
			System.out.println(num1/num2);
			break;
		default:
			System.out.println("invalid");
		}
		

	}

}
