package com.dsa.recursion;

import java.util.Scanner;

public class Que4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Eneter number of elements in an array: ");
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Sum of numbers of given Array is : " +maxSum(arr, n-1));
	}

	private static int maxSum(int[] arr, int n) {
		// TODO Auto-generated method stub
		if(n==0) return arr[0];
		return arr[n]+maxSum(arr,n-1);
		
	}
}
