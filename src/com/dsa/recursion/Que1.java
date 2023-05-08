package com.dsa.recursion;

// Q1 : Given an integer, find out the sum of its digits using recursion.

import java.util.Scanner;

public class Que1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number: ");
		int n = sc.nextInt();
		System.out.println("The sum of digits of number " + n+ " is " +sum(n));
	}

	private static int sum(int n) {
		// TODO Auto-generated method stub
		if(n==0) return 0;
		return n%10+sum(n/10);
	}
}
