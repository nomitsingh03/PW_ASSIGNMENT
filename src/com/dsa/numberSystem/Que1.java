package com.dsa.numberSystem;
import java.util.Scanner;

/*
Problem 1: given a number, print its binary representation. [easy]
Input 1: number = 5
Output 1: 101
Input 2: number = 10
Output 2: 1010 
*/

public class Que1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number : ");
		int n = sc.nextInt();
		System.out.println(Integer.toBinaryString(n));
	}
}
