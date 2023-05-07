package com.dsa.numberSystem;

import java.util.Scanner;

//Problem 2: given a number ‘n’, predict whether it is a power of two or not.


public class Que2 {
	
	protected static boolean helper(int n) {
		if(n<=0) return false;
		if(n==1) return true;
		if(n%2==0) return helper(n/2);
		return false;
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number : ");
		int n = sc.nextInt();
		System.out.println(helper(n));
	}
}
