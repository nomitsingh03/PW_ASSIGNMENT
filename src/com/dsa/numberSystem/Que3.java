package com.dsa.numberSystem;

import java.util.Scanner;

//Given a number. Using bit manipulation, check whether it is odd or even.

public class Que3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number : ");
		int n = sc.nextInt();
		if((n&1)==1) System.out.println("Odd number");
		if((n&1)==0) System.out.println("Even number");
	}
}
