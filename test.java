package com.placementtraining;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        int []arr= {3,2,1,0};
        int x=arr[2];
        arr[2]=arr[3];
        arr[3]=x;
        for(int i:arr) {
        	System.out.println(arr[i]+ " "+i);       }
        
}
}
