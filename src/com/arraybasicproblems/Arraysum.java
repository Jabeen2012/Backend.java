package com.arraybasicproblems;

import java.util.Scanner;

public class Arraysum {

	public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();
         int [] arr = {10,20,30,40,50};
         int sum =0;
         System.out.println("Enter the number of elements");
         for(int i=0; i < arr.length; i++) {
        	 arr[i] = sc.nextInt();
        	 sum = sum+arr[i];
         }
         System.out.println("sum of the array");
         sc.close();
	}

}
