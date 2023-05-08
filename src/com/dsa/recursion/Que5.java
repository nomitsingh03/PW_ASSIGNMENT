package com.dsa.recursion;

/*
Q5. Given a number n. Print if it is an armstrong number or not. An armstrong number is a number if the sum
of every digit in that number raised to the power of total digits in that number is equal to the number.
*/

import java.util.Scanner;

public class Que5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number: ");
		int n = sc.nextInt();
//		System.out.println(count(n));
		int m = sum(n, count(n));
		if(m==n) System.out.println("Number "+n+" is armstrong");
		else System.out.println("Given Number " +n +" is not Armstrong");
	}

	private static int count(int n) {
		if(n==0) return 0;
		return 1+count(n/10);
	}
	private static int sum(int n, int i) {
		// TODO Auto-generated method stub
		if(n==0) return 0;
		return (int)Math.pow(n%10,i)+sum(n/10,i);
	}
}
