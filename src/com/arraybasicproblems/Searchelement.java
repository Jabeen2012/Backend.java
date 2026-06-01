package com.arraybasicproblems;
import java.util.Scanner;

public class Searchelement {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number of elements");
		// print int statement
		int n = sc.nextInt();
		int [] arr = {8};
		int search = 4;
		boolean status = true;
	for(int i =0; i<arr.length; i++) {
		if(search == arr[i]) {
			System.out.println("serach the elements is found");
			sc.close();
			}
			
			
		}
	}
		
	}


