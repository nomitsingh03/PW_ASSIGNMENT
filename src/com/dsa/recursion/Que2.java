package com.dsa.recursion;

/*
Q2: Given a number n. Find the sum of natural numbers till n but with alternate signs.
That means if n = 5 then you have to return 1-2+3-4+5 = 3 as your answer. 
*/

import java.util.Scanner;

public class Que2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number: ");
		int n = sc.nextInt();
		System.out.println("The sum of digits of number " + n+ " is " +naturalSum(n));
	}

	private static int naturalSum(int n) {
		// TODO Auto-generated method stub
		if(n==1) return 1;
		return naturalSum(n-1)+(int)Math.pow(-1, n+1)*n;
	}
}
